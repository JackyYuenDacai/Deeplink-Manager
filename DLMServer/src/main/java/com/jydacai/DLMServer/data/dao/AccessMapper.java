package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.Access;
import com.jydacai.DLMServer.data.model.AccessExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AccessMapper {
    @SelectProvider(type=AccessSqlProvider.class, method="countByExample")
    long countByExample(AccessExample example);

    @DeleteProvider(type=AccessSqlProvider.class, method="deleteByExample")
    int deleteByExample(AccessExample example);

    @Insert({
        "insert into Access (deeplinkId, channelId, ",
        "ipAddr, accessDate, ",
        "accessTime, accessTimezone, ",
        "extraInfo, denied, ip)",
        "values (#{deeplinkid,jdbcType=VARCHAR}, #{channelid,jdbcType=VARCHAR}, ",
        "#{ipaddr,jdbcType=VARCHAR}, #{accessdate,jdbcType=DATE}, ",
        "#{accesstime,jdbcType=TIME}, #{accesstimezone,jdbcType=INTEGER}, ",
        "#{extrainfo,jdbcType=VARCHAR}, #{denied,jdbcType=BIT}, #{ip,jdbcType=VARBINARY})"
    })
    int insert(Access record);

    @InsertProvider(type=AccessSqlProvider.class, method="insertSelective")
    int insertSelective(Access record);

    @SelectProvider(type=AccessSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="deeplinkId", property="deeplinkid", jdbcType=JdbcType.VARCHAR),
        @Result(column="channelId", property="channelid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ipAddr", property="ipaddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="accessDate", property="accessdate", jdbcType=JdbcType.DATE),
        @Result(column="accessTime", property="accesstime", jdbcType=JdbcType.TIME),
        @Result(column="accessTimezone", property="accesstimezone", jdbcType=JdbcType.INTEGER),
        @Result(column="extraInfo", property="extrainfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="denied", property="denied", jdbcType=JdbcType.BIT),
        @Result(column="ip", property="ip", jdbcType=JdbcType.VARBINARY)
    })
    List<Access> selectByExampleWithBLOBs(AccessExample example);

    @SelectProvider(type=AccessSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="deeplinkId", property="deeplinkid", jdbcType=JdbcType.VARCHAR),
        @Result(column="channelId", property="channelid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ipAddr", property="ipaddr", jdbcType=JdbcType.VARCHAR),
        @Result(column="accessDate", property="accessdate", jdbcType=JdbcType.DATE),
        @Result(column="accessTime", property="accesstime", jdbcType=JdbcType.TIME),
        @Result(column="accessTimezone", property="accesstimezone", jdbcType=JdbcType.INTEGER),
        @Result(column="extraInfo", property="extrainfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="denied", property="denied", jdbcType=JdbcType.BIT)
    })
    List<Access> selectByExample(AccessExample example);

    @UpdateProvider(type=AccessSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Access record, @Param("example") AccessExample example);

    @UpdateProvider(type=AccessSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Access record, @Param("example") AccessExample example);

    @UpdateProvider(type=AccessSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Access record, @Param("example") AccessExample example);
}