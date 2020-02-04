package com.msr.study.permission.dao;

import com.msr.study.permission.model.SysDept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: MaiShuRen
 * @date: 2020/2/3 22:24
 * @version: v1.0
 */
public interface SysDeptMapper {
    /**
     * 检查新增的部门是否存在
     *
     * @param parentId 父级id
     * @param deptName 部门名称
     * @param deptId   部门id
     * @return 返回存在的记录数
     */
    int countByNameAndParentId(@Param("parentId") Integer parentId, @Param("name") String name, @Param("id") Integer id);

    /**
     * 根据主键获取记录
     *
     * @param deptId 部门id
     * @return 返回部门数据
     */
    SysDept selectByPrimaryKey(@Param("id") Integer deptId);

    /**
     * 根据等级获取部门
     *
     * @param level 等级
     * @return 返回查询结果
     */
    List<SysDept> getChildDeptListByLevel(@Param("level") String level);

    /**
     * 批量更新部门等级
     *
     * @param sysDeptList 部门列表
     */
    void batchUpdateLevel(@Param("sysDeptList") List<SysDept> sysDeptList);

    /**
     * 根据主键id删除记录
     *
     * @param id id
     * @return 删除条数
     */
    int deleteByPrimaryKey(@Param("id") Integer id);

    /**
     * 插入记录
     *
     * @param record 部门
     * @return 返回插入记录数
     */
    int insert(SysDept record);

    /**
     * 动态插入
     *
     * @param record 部门
     * @return 返回插入记录数
     */
    int insertSelective(SysDept record);

    /**
     * 根据主键id动态更新
     *
     * @param record 部门
     * @return 返回插入的记录数
     */
    int updateByPrimaryKeySelective(SysDept record);

    /**
     * 根据主键更新
     *
     * @param record 部门
     * @return 返回插入的记录数
     */
    int updateByPrimaryKey(SysDept record);

    /**
     * 获取所有部门
     *
     * @return 返回结果
     */
    List<SysDept> getAllDept();

    /**
     * 查询不同父级id的总条数
     *
     * @param deptId 部门id
     * @return 返回记录数
     */
    int countByParentId(@Param("deptId") int deptId);
}
