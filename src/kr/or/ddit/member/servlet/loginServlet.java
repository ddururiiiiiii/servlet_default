package kr.or.ddit.member.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.member.vo.MemberVO;

@WebServlet("/loginServlet")

public class loginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>로그인</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<form action='/servlet_default/loginServlet' method='post'>");
		out.println("id : <input type='text' name='memId'><br>");
		out.println("pw : <input type='password' name='memPass'><br>");
		out.println("<input type='submit' value='로그인'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();

		String memId = req.getParameter("memId");
		String memPass = req.getParameter("memPass");
		
		IMemberService service = MemberServiceImpl.getInstance();

		MemberVO mv = new MemberVO();
		mv.setMemId(memId);
		mv.setMemPass(memPass);

		int cnt = service.LoginMember(mv);

		if (cnt > 0) {
			MemberVO member = service.getMember(memId);

			if (member != null) {
				out.println("<script>alert('로그인 성공!');</script>");
				out.close();
				return;
			} else {
				out.println("<script>alert('아이디 또는 비밀번호가 존재하 지 않습니다.');</script>");
				out.close();
				doGet(req, resp);
				return;
			}

		}
	}
}
