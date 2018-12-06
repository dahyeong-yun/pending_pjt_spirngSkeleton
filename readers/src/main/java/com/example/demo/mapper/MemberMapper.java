package com.example.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.MemberVO;

public interface MemberMapper {

	@Insert("insert into member (mem_id, mem_pw, mem_email) values (#{mem_id}, #{mem_pw}, #{mem_email})")
	public void create(MemberVO vo) throws Exception;
	
	@Select("select * from member where mem_id = #{mem_id}")
	public MemberVO read(String mem_id) throws Exception;
	
	@Update("update member set mem_pw = #{mem_pw}, mem_email = #{mem_email}")
	public void update(MemberVO vo) throws Exception;
	
	@Delete("delete from member where mem_id = #{mem_id}")
	public void delete(String mem_id) throws Exception;
}
