package com.msr.study.permission.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:07
 * @version: v1.0
 */

@Getter
@Setter
@ToString
public class SearchLogParam {

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
    private String fromTime;

    private String toTime;
}
