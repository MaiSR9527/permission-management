package com.msr.study.permission.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 21:21
 * @version: v1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Mail {

    private String subject;

    private String message;

    private Set<String> receivers;
}
