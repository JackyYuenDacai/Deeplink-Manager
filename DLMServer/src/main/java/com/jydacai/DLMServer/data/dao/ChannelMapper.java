package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.Channel;
import com.jydacai.DLMServer.data.model.ChannelExample;
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

public interface ChannelMapper {
    @SelectProvider(type=ChannelSqlProvider.class, method="countByExample")
    long countByExample(ChannelExample example);

    @DeleteProvider(type=ChannelSqlProvider.class, method="deleteByExample")
    int deleteByExample(ChannelExample example);

    @Delete({
        "delete from Channel",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into Channel (id, name)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR})"
    })
    int insert(Channel record);

    @InsertProvider(type=ChannelSqlProvider.class, method="insertSelective")
    int insertSelective(Channel record);

    @SelectProvider(type=ChannelSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<Channel> selectByExample(ChannelExample example);

    @Select({
        "select",
        "id, name",
        "from Channel",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    Channel selectByPrimaryKey(String id);

    @UpdateProvider(type=ChannelSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Channel record, @Param("example") ChannelExample example);

    @UpdateProvider(type=ChannelSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Channel record, @Param("example") ChannelExample example);

    @UpdateProvider(type=ChannelSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Channel record);

    @Update({
        "update Channel",
        "set name = #{name,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Channel record);
}