package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.Filter;
import com.jydacai.DLMServer.data.model.FilterExample;
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

public interface FilterMapper {
    @SelectProvider(type=FilterSqlProvider.class, method="countByExample")
    long countByExample(FilterExample example);

    @DeleteProvider(type=FilterSqlProvider.class, method="deleteByExample")
    int deleteByExample(FilterExample example);

    @Insert({
        "insert into Filter (deeplinkId, channelId, ",
        "name, filterField, ",
        "filterType, filterInverse, ",
        "filterMustHave, valueType, ",
        "value, extValue, ",
        "dvalue, extDValue, ",
        "ivalue, extIValue)",
        "values (#{deeplinkid,jdbcType=VARCHAR}, #{channelid,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{filterfield,jdbcType=VARCHAR}, ",
        "#{filtertype,jdbcType=INTEGER}, #{filterinverse,jdbcType=BIT}, ",
        "#{filtermusthave,jdbcType=BIT}, #{valuetype,jdbcType=INTEGER}, ",
        "#{value,jdbcType=VARCHAR}, #{extvalue,jdbcType=VARCHAR}, ",
        "#{dvalue,jdbcType=DOUBLE}, #{extdvalue,jdbcType=DOUBLE}, ",
        "#{ivalue,jdbcType=INTEGER}, #{extivalue,jdbcType=INTEGER})"
    })
    int insert(Filter record);

    @InsertProvider(type=FilterSqlProvider.class, method="insertSelective")
    int insertSelective(Filter record);

    @SelectProvider(type=FilterSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="deeplinkId", property="deeplinkid", jdbcType=JdbcType.VARCHAR),
        @Result(column="channelId", property="channelid", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="filterField", property="filterfield", jdbcType=JdbcType.VARCHAR),
        @Result(column="filterType", property="filtertype", jdbcType=JdbcType.INTEGER),
        @Result(column="filterInverse", property="filterinverse", jdbcType=JdbcType.BIT),
        @Result(column="filterMustHave", property="filtermusthave", jdbcType=JdbcType.BIT),
        @Result(column="valueType", property="valuetype", jdbcType=JdbcType.INTEGER),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="extValue", property="extvalue", jdbcType=JdbcType.VARCHAR),
        @Result(column="dvalue", property="dvalue", jdbcType=JdbcType.DOUBLE),
        @Result(column="extDValue", property="extdvalue", jdbcType=JdbcType.DOUBLE),
        @Result(column="ivalue", property="ivalue", jdbcType=JdbcType.INTEGER),
        @Result(column="extIValue", property="extivalue", jdbcType=JdbcType.INTEGER)
    })
    List<Filter> selectByExample(FilterExample example);

    @UpdateProvider(type=FilterSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Filter record, @Param("example") FilterExample example);

    @UpdateProvider(type=FilterSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Filter record, @Param("example") FilterExample example);
}