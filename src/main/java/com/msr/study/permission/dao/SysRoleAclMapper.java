package com.msr.study.permission.dao;

import com.msr.study.permission.model.SysRoleAcl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:25
 * @version: v1.0
 */
public interface SysRoleAclMapper {

    /**
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int insert(SysRoleAcl record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(SysRoleAcl record);

    /**
     *
     * @param id
     * @return
     */
    SysRoleAcl selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysRoleAcl record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysRoleAcl record);

    /**
     *
     * @param roleIdList
     * @return
     */
    List<Integer> getAclIdListByRoleIdList(@Param("roleIdList") List<Integer> roleIdList);

    /**
     *
     * @param roleId
     */
    void deleteByRoleId(@Param("roleId") int roleId);

    /**
     *
     * @param roleAclList
     */
    void batchInsert(@Param("roleAclList") List<SysRoleAcl> roleAclList);

    /**
     *
     * @param aclId
     * @return
     */
    List<Integer> getRoleIdListByAclId(@Param("aclId") int aclId);
}
