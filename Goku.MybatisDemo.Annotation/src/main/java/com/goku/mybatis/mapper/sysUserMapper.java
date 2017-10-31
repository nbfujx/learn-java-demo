package com.goku.mybatis.mapper;

import com.goku.mybatis.mapper.Provider.sysUserDynaSqlProvider;
import com.goku.mybatis.model.sysOrg;
import com.goku.mybatis.model.sysUser;
import com.goku.mybatis.model.sysUserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface sysUserMapper {

    @Select("SELECT * FROM sys_user WHERE username = #{username}")
    @Results(
    {
        @Result(id = true, column = "id", property = "id"),
        @Result(column = "password", property = "password"),
        @Result(column = "name", property = "name"),
        @Result(column = "sex", property = "sex")
    })
    sysUser findByUsername(@Param("username") String username);


    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    sysUser findById(String id);


    @Insert(" insert into sys_user (id, username, password, " +
            "      name, sex, status, org_id, " +
            "      email, idcard, is_admin, " +
            "      sort, mobile, stationid" +
            "      )" +
            "    values (#{id}, #{username}, #{password}," +
            "      #{name}, #{sex}, #{status}, #{orgId}, " +
            "      #{email}, #{idcard}, #{isAdmin}, " +
            "      #{sort}, #{mobile}, #{stationid}" +
            "      )")
    int insertUser(sysUser sysuser);

    @Insert(" insert into sys_user ( username, password, " +
            "      name, sex, status, org_id, " +
            "      email, idcard, is_admin, " +
            "      sort, mobile, stationid" +
            "      )" +
            "    values ( #{username}, #{password}," +
            "      #{name}, #{sex}, #{status}, #{orgId}, " +
            "      #{email}, #{idcard}, #{isAdmin}, " +
            "      #{sort}, #{mobile}, #{stationid}" +
            "      )")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertUser2(sysUser sysuser);

    @Insert(" insert into sys_user ( username, password, " +
            "      name, sex, status, org_id, " +
            "      email, idcard, is_admin, " +
            "      sort, mobile, stationid" +
            "      )" +
            "    values ( #{username}, #{password}," +
            "      #{name}, #{sex}, #{status}, #{orgId}, " +
            "      #{email}, #{idcard}, #{isAdmin}, " +
            "      #{sort}, #{mobile}, #{stationid}" +
            "      )")
    @SelectKey(statement=" SELECT replace(uuid(),'-','')  AS id",
            keyProperty="id", resultType=String.class, before=true)
    int insertUser3(sysUser sysuser);


    @Update("update sys_user" +
            "    set username = #{username}," +
            "      password = #{password}," +
            "      name = #{name}," +
            "      sex = #{sex}," +
            "      status = #{status}," +
            "      org_id = #{orgId}," +
            "      email = #{email}," +
            "      idcard = #{idcard}," +
            "      is_admin = #{isAdmin}," +
            "      sort = #{sort}," +
            "      mobile = #{mobile}," +
            "      stationid = #{stationid}" +
            "    where id = #{id}")
    int updateUser(sysUser sysuser);

    @Delete("delete from sys_user WHERE id=#{id}")
    int deleteUser(String id);


    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    @Results(
     {
        @Result(id = true,column = "id", property = "id"),
        @Result(column = "password", property = "password"),
        @Result(column = "name", property = "name"),
        @Result(column = "sex", property = "sex"),
        @Result(property = "sysuserinfo", column = "id",
           one = @One(select = "com.goku.mybatis.mapper.sysUserMapper.findsysUserInfo"))
     })
    sysUser findsysUser(@Param("id") String id);

    @Select("select * from sys_user_info where id=#{id}")
    sysUserInfo findsysUserInfo(String id);


    @Select("SELECT * FROM sys_org WHERE id = #{id}")
    @Results(
    {
            @Result(id = true,column = "id", property = "id"),
            @Result(column = "version", property = "version"),
            @Result(column = "level", property = "level"),
            @Result(column = "type", property = "type"),
            @Result(property = "sysuser", column = "id",
                    many = @Many(select = "com.goku.mybatis.mapper.sysUserMapper.findByOrgId"))
    })
    sysOrg findsysOrg(@Param("id") String id);

    @Select("SELECT * FROM sys_user WHERE org_id = #{id}")
    sysUser findByOrgId(String id);

    @SelectProvider(type=sysUserDynaSqlProvider.class, method="findUserByIdSql")
    sysUser findUserByIdSql(String id);

    @SelectProvider(type=sysUserDynaSqlProvider.class, method="findUserByIdSql2")
    sysUser findUserByIdSql2(String id, String name);

    @InsertProvider(type = sysUserDynaSqlProvider.class, method = "insertUser")
    int insertUser4(sysUser sysuser);

    @InsertProvider(type = sysUserDynaSqlProvider.class, method = "updateUser")
    int updateUser2(sysUser sysuser);

    @DeleteProvider(type = sysUserDynaSqlProvider.class, method = "deleteUser")
    int deleteUser2(@Param("id") String id);

    @SelectProvider(type=sysUserDynaSqlProvider.class, method="findUserinfoByIdSql")
    List<Map<String, String>> findUserinfoByIdSql(@Param("id") String id);


    @Select(" #set( $pattern = $_parameter.username + '%' ) " +
            "    SELECT * FROM sys_user WHERE username LIKE @{pattern}")
    @Lang(org.mybatis.scripting.velocity.Driver.class)
    List<sysUser> findsysUserbyvelocity(@Param("username") String username);

    @Select("SELECT * FROM sys_user " +
            "#trim('WHERE' 'AND|OR')" +
            "#if($_parameter.username)" +
            "    #set($_username = '%'+$_parameter.username +'%')" +
            "        AND username LIKE @{_username}" +
            "    #end" +
            "#end")
    @Lang(org.mybatis.scripting.velocity.Driver.class)
    List<sysUser> findsysUserbyvelocity2(@Param("username") String username);

    @Select("SELECT * FROM sys_user #where()" +
            "        #if($_parameter.username)" +
            "            #set($_username = '%'+$_parameter.username+'%')" +
            "            AND username LIKE @{_username}" +
            "        #end" +
            "    #end")
    @Lang(org.mybatis.scripting.velocity.Driver.class)
    List<sysUser> findsysUserbyvelocity3(@Param("username") String username);


    @Insert(" insert into sys_user (id, username, password, " +
            "      name, sex, status, org_id, " +
            "      email, idcard, is_admin, " +
            "      sort, mobile, stationid" +
            "      )" +
            "    values (@{id}, @{username}, @{password}," +
            "      @{name},@{sex}, @{status}, @{orgId}, " +
            "      @{email}, @{idcard}, @{isAdmin}, " +
            "      @{sort}, @{mobile}, @{stationid}" +
            "      )")
    @Lang(org.mybatis.scripting.velocity.Driver.class)
    int insertUser5(sysUser sysuser);


    @Update("update sys_user  " +
            "#mset() " +
            "  #if(!$name)  name=@{name},#end " +
            "#end  " +
            "WHERE id = @{id}")
    @Lang(org.mybatis.scripting.velocity.Driver.class)
    int updateUser3(sysUser sysuser);

    @Select("SELECT * FROM sys_user #where() " +
            "     #repeat( $_parameter.ids $id  ','  'id IN ('  ')' )" +
            "     @{id}" +
            "     #end" +
            "#end")
    @Lang(org.mybatis.scripting.velocity.Driver.class)
    List<sysUser> findsysUserbyvelocity4(@Param("ids") List<String> ids);

    @Select("SELECT *FROM sys_user " +
            "#where() " +
            "    #in( $_parameter.ids  $id  'id') " +
            "    @{id} " +
            "   #end" +
            "#end")
    @Lang(org.mybatis.scripting.velocity.Driver.class)
    List<sysUser> findsysUserbyvelocity5(@Param("ids") List<String> ids);

}