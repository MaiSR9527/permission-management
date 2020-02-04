package com.msr.study.permission.model;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:03
 * @version: v1.0
 */

public class SysLogWithBLOBs extends SysLog {

    private String oldValue;

    private String newValue;

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue == null ? null : oldValue.trim();
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue == null ? null : newValue.trim();
    }
}
