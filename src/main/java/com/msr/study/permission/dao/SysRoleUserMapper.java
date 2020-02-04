package com.msr.study.permission.dao;

import com.msr.study.permission.model.SysRoleUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:25
 * @version: v1.0
 */
public interface SysRoleUserMapper {
    /**
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @param record
     * @return
     */
    int insert(SysRoleUser record);

    /**
     * @param record
     * @return
     */
    int insertSelective(SysRoleUser record);

    /**
     * @param id
     * @return
     */
    SysRoleUser selectByPrimaryKey(Integer id);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysRoleUser record);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysRoleUser record);

    /**
     * @param userId
     * @return
     */
    List<Integer> getRoleIdListByUserId(@Param("userId") int userId);

    /**
     * @param roleId
     * @return
     */
    List<Integer> getUserIdListByRoleId(@Param("roleId") int roleId);

    /**
     * @param roleId
     */
    void deleteByRoleId(@Param("roleId") int roleId);

    /**
     * @param roleUserList
     */
    void batchInsert(@Param("roleUserList") List<SysRoleUser> roleUserList);

    /**
     * @param roleIdList
     * @return
     */
    List<Integer> getUserIdListByRoleIdList(@Param("roleIdList") List<Integer> roleIdList);
}
