package com.msr.study.permission.dao;

import com.msr.study.permission.beans.PageQuery;
import com.msr.study.permission.model.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:25
 * @version: v1.0
 */
public interface SysUserMapper {

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
    int insert(SysUser record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(SysUser record);

    /**
     *
     * @param id
     * @return
     */
    SysUser selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysUser record);

    /**
     *
     * @param keyword
     * @return
     */
    SysUser findByKeyword(@Param("keyword") String keyword);

    /**
     *
     * @param mail
     * @param id
     * @return
     */
    int countByMail(@Param("mail") String mail, @Param("id") Integer id);

    /**
     *
     * @param telephone
     * @param id
     * @return
     */
    int countByTelephone(@Param("telephone") String telephone, @Param("id") Integer id);

    /**
     *
     * @param deptId
     * @return
     */
    int countByDeptId(@Param("deptId") int deptId);

    /**
     *
     * @param deptId
     * @param page
     * @return
     */
    List<SysUser> getPageByDeptId(@Param("deptId") int deptId, @Param("page") PageQuery page);

    /**
     *
     * @param idList
     * @return
     */
    List<SysUser> getByIdList(@Param("idList") List<Integer> idList);

    /**
     *
     * @return
     */
    List<SysUser> getAll();
}
