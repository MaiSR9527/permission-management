package com.msr.study.permission.dao;

import com.msr.study.permission.model.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:25
 * @version: v1.0
 */
public interface SysRoleMapper {
    /**
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @param record
     * @return
     */
    int insert(SysRole record);

    /**
     * @param record
     * @return
     */
    int insertSelective(SysRole record);

    /**
     * @param id
     * @return
     */
    SysRole selectByPrimaryKey(Integer id);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysRole record);

    /**
     * @return
     */
    List<SysRole> getAll();

    /**
     * @param name
     * @param id
     * @return
     */
    int countByName(@Param("name") String name, @Param("id") Integer id);

    /**
     * @param idList
     * @return
     */
    List<SysRole> getByIdList(@Param("idList") List<Integer> idList);
}
