package com.msr.study.permission.dao;

import com.msr.study.permission.beans.PageQuery;
import com.msr.study.permission.dto.SearchLogDto;
import com.msr.study.permission.model.SysLog;
import com.msr.study.permission.model.SysLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:25
 * @version: v1.0
 */
public interface SysLogMapper {

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
    int insert(SysLogWithBLOBs record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(SysLogWithBLOBs record);

    /**
     *
     * @param id
     * @return
     */
    SysLogWithBLOBs selectByPrimaryKey(Integer id);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysLog record);

    /**
     *
     * @param dto
     * @return
     */
    int countBySearchDto(@Param("dto") SearchLogDto dto);

    /**
     *
     * @param dto
     * @param page
     * @return
     */
    List<SysLogWithBLOBs> getPageListBySearchDto(@Param("dto") SearchLogDto dto, @Param("page") PageQuery page);

}
