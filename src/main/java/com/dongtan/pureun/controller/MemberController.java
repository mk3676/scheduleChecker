package com.dongtan.pureun.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dongtan.pureun.mapper.MemberMapper;
import com.dongtan.pureun.vo.MemberVO;

import lombok.Setter;

@RestController
@RequestMapping("/regist")
public class MemberController {
	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;
	
	// �� �� �� ��
	// @RequestBody: http ��û�� �ٵ� �ڹ� ��ü�� ��ȯ�Ͽ� ���ε� �޼ҵ��� �Ķ���ͷ� �����Ѵ�.
	// GET ���� @PathVariable, @RequestParam ���
	// @ModelAttribute: �ش� ������̼��� ���� ��ü�� �����ϰ�, http ��û�� �ٵ� ���ε��Ѵ�.
	
	// �ߺ� ���̵� Ȯ��
	@PostMapping("/checkId")
	public ResponseEntity<HashMap<String, String>> checkId(@RequestBody HashMap<String, String> idMap) {
		System.out.println("���̵� Ȯ��: " + idMap.get("id"));
		
		MemberVO checkDbId = mapper.checkId(idMap.get("id"));
		System.out.println("��? " +checkDbId.getId());
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		if (checkDbId.getId().equals("")) {
			map.put("status", "0");
			map.put("announce", "�ߺ����� �ʴ� ���̵��Դϴ�.");
		}
		else {
			map.put("status", "1");
			map.put("announce", "�ߺ��Ǵ� ���̵��Դϴ�.");
		}
		
		return new ResponseEntity<HashMap<String, String>>(map, HttpStatus.OK);
	}
	
	// ȸ�� ����
	@PostMapping("/insert")
	public ModelAndView insertMember(MemberVO vo) {
		mapper.insertMember(vo);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("main");
		model.addObject("info", vo);
		
		return model;
	}
}
