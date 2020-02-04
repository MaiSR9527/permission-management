package com.msr.study.permission.controller;

import com.msr.study.permission.common.JsonData;
import com.msr.study.permission.dto.DeptLevelDto;
import com.msr.study.permission.param.DeptParam;
import com.msr.study.permission.service.SysDeptService;
import com.msr.study.permission.service.SysTreeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @description: 部门模块controller层
 * @author: MaiShuRen
 * @date: 2020/2/3 22:26
 * @version: v1.0
 */
@Controller
@RequestMapping("/sys/dept")
@Slf4j
public class SysDeptController {

    private final SysDeptService sysDeptService;
    private final SysTreeService sysTreeService;

    public SysDeptController(SysDeptService sysDeptService, SysTreeService sysTreeService) {
        this.sysDeptService = sysDeptService;
        this.sysTreeService = sysTreeService;
    }

    /**
     * 转向部门列表页面
     *
     * @return 页面
     */
    @RequestMapping("/dept.page")
    public ModelAndView page() {
        return new ModelAndView("dept");
    }

    /**
     * 保存部门
     *
     * @param param 部门参数
     * @return 返回保存的部门
     */
    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(DeptParam param) {
        sysDeptService.save(param);
        return JsonData.success();
    }

    /**
     * 树型结构
     * @return 部门的树型结构
     */
    @RequestMapping("/tree.json")
    @ResponseBody
    public JsonData tree() {
        List<DeptLevelDto> dtoList = sysTreeService.deptTree();
        return JsonData.success(dtoList);
    }

    @RequestMapping("/update.json")
    @ResponseBody
    public JsonData updateDept(DeptParam param) {
        sysDeptService.update(param);
        return JsonData.success();
    }

    @RequestMapping("/delete.json")
    @ResponseBody
    public JsonData delete(@RequestParam("id") int id) {
        sysDeptService.delete(id);
        return JsonData.success();
    }
}
