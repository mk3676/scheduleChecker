package com.dongtan.pureun.mapper;

import com.dongtan.pureun.vo.MemberVO;

public interface MemberMapper {
	// ���̵� �ߺ� Ȯ��
	public MemberVO checkId(String id);
	
	// ȸ�� ����
	public void insertMember(MemberVO vo);
}
