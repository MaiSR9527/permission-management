package com.msr.study.permission.beans;

import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 21:22
 * @version: v1.0
 */
@Data
@Builder
public class PageResult<T> {

    private List<T> data;

    private int total = 0;
}
