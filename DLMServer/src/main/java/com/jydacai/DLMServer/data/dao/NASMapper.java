package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.NAS;
import com.jydacai.DLMServer.data.model.NASExample;
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

public interface NASMapper {
    @SelectProvider(type=NASSqlProvider.class, method="countByExample")
    long countByExample(NASExample example);

    @DeleteProvider(type=NASSqlProvider.class, method="deleteByExample")
    int deleteByExample(NASExample example);

    @Insert({
        "insert into NAS (time_index, milli_mul, ",
        "milli_index, avg_amp, ",
        "max_amp, min_amp)",
        "values (#{timeIndex,jdbcType=TIMESTAMP}, #{milliMul,jdbcType=INTEGER}, ",
        "#{milliIndex,jdbcType=INTEGER}, #{avgAmp,jdbcType=DOUBLE}, ",
        "#{maxAmp,jdbcType=DOUBLE}, #{minAmp,jdbcType=DOUBLE})"
    })
    int insert(NAS record);

    @InsertProvider(type=NASSqlProvider.class, method="insertSelective")
    int insertSelective(NAS record);

    @SelectProvider(type=NASSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="time_index", property="timeIndex", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="milli_mul", property="milliMul", jdbcType=JdbcType.INTEGER),
        @Result(column="milli_index", property="milliIndex", jdbcType=JdbcType.INTEGER),
        @Result(column="avg_amp", property="avgAmp", jdbcType=JdbcType.DOUBLE),
        @Result(column="max_amp", property="maxAmp", jdbcType=JdbcType.DOUBLE),
        @Result(column="min_amp", property="minAmp", jdbcType=JdbcType.DOUBLE)
    })
    List<NAS> selectByExample(NASExample example);

    @UpdateProvider(type=NASSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") NAS record, @Param("example") NASExample example);

    @UpdateProvider(type=NASSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") NAS record, @Param("example") NASExample example);
}