package com.msr.study.permission.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:17
 * @version: v1.0
 */

@Getter
@Setter
@ToString
public class SearchLogDto {

    /**
     * LogType
     */
    private Integer type;

    private String beforeSeg;

    private String afterSeg;

    private String operator;

    /**
     * yyyy-MM-dd HH:mm:ss
     */
    private Date fromTime;

    /**
     * yyyy-MM-dd HH:mm:ss
     */
    private Date toTime;
}
