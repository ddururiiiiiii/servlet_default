package kr.or.ddit.member.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.util.SqlMapClientUtil;

public class MemberDaoImpl implements IMemberDao{

private static IMemberDao imd;
	
	public MemberDaoImpl() {
		SqlMapClientUtil.getInstance();
	}
	
	public static IMemberDao getInstance() {
		if(imd == null) {
			imd = new MemberDaoImpl();
		}
		return imd;
}

	@Override
	public int loginMember(SqlMapClient smc, MemberVO mv) throws SQLException {
		return (int) smc.queryForObject("member.loginMember", mv);
	}

	@Override
	public MemberVO getMember(SqlMapClient smc, String memId) throws SQLException {
		return (MemberVO) smc.queryForObject("member.getMember", memId);
	}
	
}
