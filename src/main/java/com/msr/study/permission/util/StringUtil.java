package com.msr.study.permission.util;

import com.google.common.base.Splitter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 21:56
 * @version: v1.0
 */

public class StringUtil {
    public static List<Integer> splitToListInt(String str) {
        List<String> strList = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(str);
        return strList.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}
