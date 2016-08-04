package jp.tuyano;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
@SuppressWarnings("serial")

public class OrderServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf8");
		response.getWriter().println("入力されていません。");
	}

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf8");

		// ブラウザに画面（HTML）を送信
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		String goukei = request.getParameter("goukei");
		String value;
		if ( goukei.length() != 0 && !(goukei.equals("0　円")) ) {
			out.println("<p>");
			value = request.getParameter("えんぴつ");
			if (value != null)
				out.println("えんぴつ "+value+"円<br>");
			value = request.getParameter("消しゴム");
			if (value != null)
				out.println("消しゴム "+value+"円<br>");
			value = request.getParameter("ボールペン");
			if (value != null)
				out.println("ボールペン "+value+"円<br>");
			value = request.getParameter("定規セット");
			if (value != null)
				out.println("定規セット "+value+"円<br>");
			value = request.getParameter("コンパス");
			if (value != null)
				out.println("コンパス "+value+"円<br>");
			out.println("合計　"+goukei+"のお買い上げです。</p>");
		}
		out.println("<p>またのご来店をお待ちしております。</p>");
		out.println("</body></html>");
	}
}
