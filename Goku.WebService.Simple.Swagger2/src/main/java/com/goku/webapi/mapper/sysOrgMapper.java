package com.goku.webapi.mapper;

import com.goku.webapi.model.sysOrg;

public interface sysOrgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int insert(sysOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int insertSelective(sysOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    sysOrg selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(sysOrg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(sysOrg record);
}