package kr.or.ddit.member.service;

import kr.or.ddit.member.vo.MemberVO;

public interface IMemberService {
	
	/**
	 * 한 유저 정보 메서드
	 * @param smc
	 * @param userId
	 * @return
	 * @throws SQLException
	 */
	public MemberVO getMember(String memId);
	
	/**
	 * 로그인 
	 * @param mv
	 * @return
	 */
	public int LoginMember(MemberVO mv);
	
}
