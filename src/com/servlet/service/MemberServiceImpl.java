package com.servlet.service;

import java.sql.SQLException;

import com.servlet.dao.MemberDAO;
import com.servlet.dto.MemberVO;
import com.servlet.exception.InvalidPasswordException;
import com.servlet.exception.NotFoundIDException;

public class MemberServiceImpl implements MemberService {

	private MemberDAO memberDAO; 
	// = MemberDAOImpl.getInstance();
	
	@Override
	public MemberVO login(String id, String pwd) throws NotFoundIDException, InvalidPasswordException, SQLException {

		MemberVO member = null;
		
		try {
			member = memberDAO.selectMemberByID(id);
			
		}catch(SQLException e) {
			//Exception에 대한 처리구문 필요
			e.printStackTrace();
			throw e;
		}
		
		if(member!=null) {
			if(pwd.equals(member.getPwd())) { // 로그인 성공
				return member;
			} else {
				throw new InvalidPasswordException();
			}
		} else { //아이디 불일치
			throw new NotFoundIDException();
		}
		
	}

}
