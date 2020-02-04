package com.msr.study.permission.dao;

import com.msr.study.permission.beans.PageQuery;
import com.msr.study.permission.model.SysAcl;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:24
 * @version: v1.0
 */
public interface SysAclMapper {

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
    int insert(SysAcl record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(SysAcl record);

    /**
     *
     * @param id
     * @return
     */
    SysAcl selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysAcl record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysAcl record);

    /**
     *
     * @param aclModuleId
     * @return
     */
    int countByAclModuleId(@Param("aclModuleId") int aclModuleId);

    /**
     *
     * @param aclModuleId
     * @param page
     * @return
     */
    List<SysAcl> getPageByAclModuleId(@Param("aclModuleId") int aclModuleId, @Param("page") PageQuery page);

    /**
     *
     * @param aclModuleId
     * @param name
     * @param id
     * @return
     */
    int countByNameAndAclModuleId(@Param("aclModuleId") int aclModuleId, @Param("name") String name, @Param("id") Integer id);

    /**
     *
     * @return
     */
    List<SysAcl> getAll();

    /**
     *
     * @param idList
     * @return
     */
    List<SysAcl> getByIdList(@Param("idList") List<Integer> idList);

    /**
     *
     * @param url
     * @return
     */
    List<SysAcl> getByUrl(@Param("url") String url);
}
