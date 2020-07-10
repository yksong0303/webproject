package servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	static Map<String,String> mapToMap(Map<String,String[]> map){
		Map<String,String> rMap = new HashMap<>();
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
		String key = iterator.next();
		String[] values = map.get(key);
		rMap.put(key, values[0]);
		
	}
		return rMap;
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		Map<String,String> map =  mapToMap(request.getParameterMap());
		System.out.println(map);
		doGet(request, response);
	}

}
