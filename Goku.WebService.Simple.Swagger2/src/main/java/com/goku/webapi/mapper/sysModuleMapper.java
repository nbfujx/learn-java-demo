package com.goku.webapi.mapper;

import com.goku.webapi.model.sysModule;

public interface sysModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_module
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_module
     *
     * @mbg.generated
     */
    int insert(sysModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_module
     *
     * @mbg.generated
     */
    int insertSelective(sysModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_module
     *
     * @mbg.generated
     */
    sysModule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_module
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(sysModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_module
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(sysModule record);
}