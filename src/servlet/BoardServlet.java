package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardServlet extends HttpServlet{
	private static final long serialVersionUID = 1L; //유효아이디
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
			response.setContentType("text/html;charset = utf-8");
			PrintWriter pw = response.getWriter();
			String str = "GET으로 오셨군요";
			str +="name = "+name;
			pw.print(str);
			
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset = utf-8");
		request.setCharacterEncoding("utf-8"); //이렇게 써줘야 포스트 안깨짐
		String name = request.getParameter("name");
		PrintWriter pw = response.getWriter();
		String str = "POST로 오셨군요";
		str +="name = "+name;
		pw.print(str);
		
}

}
