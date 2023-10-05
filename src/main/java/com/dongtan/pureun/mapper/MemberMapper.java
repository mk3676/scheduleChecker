package com.dongtan.pureun.mapper;

import com.dongtan.pureun.vo.MemberVO;

public interface MemberMapper {
	// 아이디 중복 확인
	public MemberVO checkId(String id);
	
	// 회원 가입
	public void insertMember(MemberVO vo);
}
