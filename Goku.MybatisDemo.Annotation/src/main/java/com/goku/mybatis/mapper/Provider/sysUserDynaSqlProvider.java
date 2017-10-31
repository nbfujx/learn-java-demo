package com.goku.mybatis.mapper.Provider;

import com.goku.mybatis.model.sysUser;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by nbfujx on 2017/10/30.
 */
public class sysUserDynaSqlProvider {

    public String findUserByIdSql(final String id)
    {
        return new SQL()
        {
            {
                SELECT("*");
                FROM("sys_user");
                WHERE("id='"+id+"'");
            }
        } .toString();
    }

    public String findUserByIdSql2(Map<String, Object> map)
    {
        return new SQL()
        {
            {
                SELECT("*");
                FROM("sys_user");
                WHERE("id=#{param1} and username=#{param2}");
            }
        } .toString();
    }

    public String insertUser(final sysUser sys_user)
    {
        return new SQL()
        {
            {
                INSERT_INTO("sys_user");
                if (sys_user.getId()!=null)
                {
                    VALUES("id", "#{id}");
                }
                if (sys_user.getName() != null)
                {
                    VALUES("name", "#{name}");
                }
            }
        } .toString();
    }

    public String updateUser(final sysUser sys_user)
    {
        return new SQL()
        {
            {
                UPDATE("sys_user");
                if (sys_user.getName() != null)
                {
                    SET("name = #{name}");
                }
                WHERE("id = #{id}");
            }
        } .toString();
    }

    public String deleteUser()
    {
        return new SQL()
        {
            {
                DELETE_FROM("sys_user");
                WHERE("id = #{id}");
            }
        } .toString();
    }

    public String findUserinfoByIdSql()
    {
        return new SQL()
        {
            {
                SELECT("u.id, username, password, name, sex, status, org_id, email, idcard, is_admin, sort," +
                        "        mobile,address, post_code, height, weight, birthday, blood, culture, finish_school_date," +
                        "        folk, government, homepage, householder, marriage, msn, nativity_address, qq, speciality," +
                        "        description, version");
                FROM("sys_user u");
                LEFT_OUTER_JOIN("sys_user_info t on u.id=t.id");
                WHERE("u.id=#{id}");
            }
        } .toString();
    }

}
