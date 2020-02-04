package com.msr.study.permission.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 21:23
 * @version: v1.0
 */
@Component("applicationContextHelper")
public class ApplicationContextHelper implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    /**
     * 根据类型获取bean
     * @param clazz bean的class
     * @param <T> 泛型
     * @return 返回容器中的bean
     */
    public static <T> T popBean(Class<T> clazz) {
        if (ObjectUtils.isEmpty(applicationContext)) {
            return null;
        }
        return applicationContext.getBean(clazz);
    }

    /**
     * 根据类型和名称获取bean
     * @param beanName bean的名称
     * @param clazz bean的class
     * @param <T> 泛型
     * @return 返回容器中的bean
     */
    public static <T> T popBean(String beanName, Class<T> clazz) {
        if (ObjectUtils.isEmpty(applicationContext)) {
            return null;
        }
        return applicationContext.getBean(beanName, clazz);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

}
