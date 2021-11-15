package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.Deeplink;
import com.jydacai.DLMServer.data.model.DeeplinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DeeplinkMapper {
    @SelectProvider(type=DeeplinkSqlProvider.class, method="countByExample")
    long countByExample(DeeplinkExample example);

    @DeleteProvider(type=DeeplinkSqlProvider.class, method="deleteByExample")
    int deleteByExample(DeeplinkExample example);

    @Delete({
        "delete from Deeplink",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into Deeplink (id, code, ",
        "target, channelId, ",
        "embbedInfo, deniedTarget, ",
        "filterType)",
        "values (#{id,jdbcType=VARCHAR}, #{code,jdbcType=VARCHAR}, ",
        "#{target,jdbcType=VARCHAR}, #{channelid,jdbcType=VARCHAR}, ",
        "#{embbedinfo,jdbcType=VARCHAR}, #{deniedtarget,jdbcType=VARCHAR}, ",
        "#{filtertype,jdbcType=INTEGER})"
    })
    int insert(Deeplink record);

    @InsertProvider(type=DeeplinkSqlProvider.class, method="insertSelective")
    int insertSelective(Deeplink record);

    @SelectProvider(type=DeeplinkSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="target", property="target", jdbcType=JdbcType.VARCHAR),
        @Result(column="channelId", property="channelid", jdbcType=JdbcType.VARCHAR),
        @Result(column="embbedInfo", property="embbedinfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="deniedTarget", property="deniedtarget", jdbcType=JdbcType.VARCHAR),
        @Result(column="filterType", property="filtertype", jdbcType=JdbcType.INTEGER)
    })
    List<Deeplink> selectByExample(DeeplinkExample example);

    @Select({
        "select",
        "id, code, target, channelId, embbedInfo, deniedTarget, filterType",
        "from Deeplink",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="target", property="target", jdbcType=JdbcType.VARCHAR),
        @Result(column="channelId", property="channelid", jdbcType=JdbcType.VARCHAR),
        @Result(column="embbedInfo", property="embbedinfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="deniedTarget", property="deniedtarget", jdbcType=JdbcType.VARCHAR),
        @Result(column="filterType", property="filtertype", jdbcType=JdbcType.INTEGER)
    })
    Deeplink selectByPrimaryKey(String id);

    @UpdateProvider(type=DeeplinkSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Deeplink record, @Param("example") DeeplinkExample example);

    @UpdateProvider(type=DeeplinkSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Deeplink record, @Param("example") DeeplinkExample example);

    @UpdateProvider(type=DeeplinkSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Deeplink record);

    @Update({
        "update Deeplink",
        "set code = #{code,jdbcType=VARCHAR},",
          "target = #{target,jdbcType=VARCHAR},",
          "channelId = #{channelid,jdbcType=VARCHAR},",
          "embbedInfo = #{embbedinfo,jdbcType=VARCHAR},",
          "deniedTarget = #{deniedtarget,jdbcType=VARCHAR},",
          "filterType = #{filtertype,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Deeplink record);
}