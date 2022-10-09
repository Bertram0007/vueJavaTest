package com.backend.chain.dao;

import com.backend.chain.entity.Transaction;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TransationDao  {
    @Insert("insert into request(from,to,type,amount,price,status,createTime,updateTime)" +
            "values (#{from},#{to},#{type},#{amount},#{price},#{status}, #{createTime}, #{updateTime})")
    int addTransation(Transaction req);
    @Select("select id,from,to,type,amount,price,status,createTime,updateTime from request where from=#{user} or to = #{user}")
    List<Transaction> getAllByUser(String user);
    @Update("update request set status = #{status} where id = #{id}")
    int updateTransaction(int id, int status);
    @Delete("delete from request where id = #{id}")
    int deleteTransaction(int id);
}
