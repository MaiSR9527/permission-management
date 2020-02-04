package com.msr.study.permission.controller;

import com.google.common.collect.Maps;
import com.msr.study.permission.beans.PageQuery;
import com.msr.study.permission.common.JsonData;
import com.msr.study.permission.model.SysRole;
import com.msr.study.permission.param.AclParam;
import com.msr.study.permission.service.SysAclService;
import com.msr.study.permission.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @description: 权限控制类
 * @author: MaiShuRen
 * @date: 2020/2/3 22:26
 * @version: v1.0
 */
@Controller
@RequestMapping("/sys/acl")
@Slf4j
public class SysAclController {

    private final SysAclService sysAclService;
    private final SysRoleService sysRoleService;

    public SysAclController(SysAclService sysAclService, SysRoleService sysRoleService) {
        this.sysAclService = sysAclService;
        this.sysRoleService = sysRoleService;
    }

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveAclModule(AclParam param) {
        sysAclService.save(param);
        return JsonData.success();
    }

    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData updateAclModule(AclParam param) {
        sysAclService.update(param);
        return JsonData.success();
    }

    @RequestMapping("/page.json")
    @ResponseBody
    public JsonData list(@RequestParam("aclModuleId") Integer aclModuleId, PageQuery pageQuery) {
        return JsonData.success(sysAclService.getPageByAclModuleId(aclModuleId, pageQuery));
    }

    @RequestMapping("acls.json")
    @ResponseBody
    public JsonData acls(@RequestParam("aclId") int aclId) {
        Map<String, Object> map = Maps.newHashMap();
        List<SysRole> roleList = sysRoleService.getRoleListByAclId(aclId);
        map.put("roles", roleList);
        map.put("users", sysRoleService.getUserListByRoleList(roleList));
        return JsonData.success(map);
    }
}
