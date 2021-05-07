package kr.or.ddit.member.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.util.SqlMapClientUtil;

public class MemberServiceImpl implements IMemberService{

	private IMemberDao memberDao;
	private SqlMapClient smc;
	
	private static IMemberService Service;
	
	public MemberServiceImpl() {
		memberDao = MemberDaoImpl.getInstance();
		smc = SqlMapClientUtil.getInstance();
	}
	
	public static IMemberService getInstance() {
		if(Service == null) {
			Service = new MemberServiceImpl();
		}
		return Service;
	}
	
	@Override
	public int LoginMember(MemberVO mv) {
		int cnt = 0;
		try {
			cnt = memberDao.loginMember(smc, mv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public MemberVO getMember(String memId) {
		MemberVO mv = null;
		try {
			mv = memberDao.getMember(smc, memId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mv;
	}

}
