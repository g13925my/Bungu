package jp.tuyano;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")

public class Login extends HttpServlet{
	 public void service(
			    HttpServletRequest request,
			    HttpServletResponse response)
			    throws IOException, ServletException {
		 			response.setContentType("text/html");
		 			request.setCharacterEncoding("utf8");
		 			response.setCharacterEncoding("utf8");

		 			// ブラウザからの情報の読み取り
			        String userid = request.getParameter("userid");
			        String password = request.getParameter("password");
			        // セッション・オブジェクトに保管
			        HttpSession session = request.getSession(true);
			        session.putValue("userid", userid);
			        session.putValue("password", password);
			        // ブラウザに画面（HTML）を送信
			        PrintWriter out = response.getWriter();
			        out.println("<html><body>");
			        out.println("<h1>"+userid+"さん、ようこそ！</h1><p>");
			        out.println("<a href='/order.html'>注文</a><br>");
			        out.println("<a href='/UserInfo'>ユーザ情報</a>");
			        out.println("</p></body></html>");
			    }
}
