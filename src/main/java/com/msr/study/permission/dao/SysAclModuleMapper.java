package com.msr.study.permission.dao;

import com.msr.study.permission.model.SysAclModule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:24
 * @version: v1.0
 */
public interface SysAclModuleMapper {

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
    int insert(SysAclModule record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(SysAclModule record);

    /**
     *
     * @param id
     * @return
     */
    SysAclModule selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysAclModule record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysAclModule record);

    /**
     *
     * @param parentId
     * @param name
     * @param id
     * @return
     */
    int countByNameAndParentId(@Param("parentId") Integer parentId, @Param("name") String name, @Param("id") Integer id);

    /**
     *
     * @param level
     * @return
     */
    List<SysAclModule> getChildAclModuleListByLevel(@Param("level") String level);

    /**
     *
     * @param sysAclModuleList
     */
    void batchUpdateLevel(@Param("sysAclModuleList") List<SysAclModule> sysAclModuleList);

    /**
     *
     * @return
     */
    List<SysAclModule> getAllAclModule();

    /**
     *
     * @param aclModuleId
     * @return
     */
    int countByParentId(@Param("aclModuleId") int aclModuleId);

}
