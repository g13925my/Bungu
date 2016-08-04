package jp.tuyano;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@SuppressWarnings("serial")

public class UserInfo extends HttpServlet {
	public void service(
		    HttpServletRequest request,
		    HttpServletResponse response)
		    throws IOException, ServletException {
		        response.setContentType("text/html");
		        request.setCharacterEncoding("utf8");
		        response.setCharacterEncoding("utf8");

		        // セッション・オブジェクトから復元
		        HttpSession session = request.getSession(true);
		        String userid = (String)session.getValue("userid");
		        String password = (String)session.getValue("password");
		        // ブラウザに画面（HTML）を送信
		        PrintWriter out = response.getWriter();
		        out.println("<HTML><BODY>");
		        out.println("<H1>パスワードの表示</H1><BR>");
		        out.println("<TABLE><TR><TD>ユーザID</TD>");
		        out.println("<TD>"+userid+"</TD></TR>");
		        out.println("<TR><TD>パスワード</TD>");
		        out.println("<TD>"+password+"</TD></TR></TABLE>");
		        out.println("</BODY></HTML>");
		    }

}
