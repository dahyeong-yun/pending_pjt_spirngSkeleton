package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.domain.MemberVO;
import com.example.demo.mapper.MemberMapper;

public class MemberMapperTest extends ReadersApplicationTests{

	@Autowired
	private MemberMapper mapper;
	
/*	@Test
	public void testInsert() throws Exception {
		MemberVO vo = new MemberVO();
		
		vo.setMem_id("test1234");
		vo.setMem_pw("1234");
		vo.setMem_email("tester@gmail.com");
		
		mapper.create(vo);
	}*/
}
