package kr.or.ddit.member.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.member.vo.MemberVO;

public interface IMemberDao {

	/**
	 * 로그인 통과 or 실패
	 * @param uv
	 * @return
	 */
	public int loginMember(SqlMapClient smc, MemberVO mv) throws SQLException;


/**
 * 한 유저 정보 메서드
 * @param smc
 * @param userId
 * @return
 * @throws SQLException
 */
public MemberVO getMember(SqlMapClient smc, String memId) throws SQLException;

}