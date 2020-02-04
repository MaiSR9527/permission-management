package com.msr.study.permission.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 21:50
 * @version: v1.0
 */

public class LevelUtil {

    public final static String SEPARATOR = ".";

    public final static String ROOT = "0";

    /**
     * 计算部门等级
     * 0   0.1   0.1.2    0.1.3   0.4
     *
     * @param parentLevel 父级等级
     * @param parentId    父级id
     * @return 返回计算后的等级
     */
    public static String calculateLevel(String parentLevel, int parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return ROOT;
        } else {
            return StringUtils.join(parentLevel, SEPARATOR, parentId);
        }
    }
}
