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
	
	// ★ 복 습 ★
	// @RequestBody: http 요청의 바디를 자바 객체로 변환하여 매핑된 메소드의 파라미터로 전달한다.
	// GET 사용시 @PathVariable, @RequestParam 사용
	// @ModelAttribute: 해당 어노테이션이 붙은 객체를 생성하고, http 요청의 바디를 바인딩한다.
	
	// 중복 아이디 확인
	@PostMapping("/checkId")
	public ResponseEntity<HashMap<String, String>> checkId(@RequestBody HashMap<String, String> idMap) {
		System.out.println("아이디 확인: " + idMap.get("id"));
		
		MemberVO checkDbId = mapper.checkId(idMap.get("id"));
		System.out.println("뭐? " +checkDbId.getId());
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		if (checkDbId.getId().equals("")) {
			map.put("status", "0");
			map.put("announce", "중복되지 않는 아이디입니다.");
		}
		else {
			map.put("status", "1");
			map.put("announce", "중복되는 아이디입니다.");
		}
		
		return new ResponseEntity<HashMap<String, String>>(map, HttpStatus.OK);
	}
	
	// 회원 가입
	@PostMapping("/insert")
	public ModelAndView insertMember(MemberVO vo) {
		mapper.insertMember(vo);
		
		ModelAndView model = new ModelAndView();
		model.setViewName("main");
		model.addObject("info", vo);
		
		return model;
	}
}
