<%@page import="common.Connector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Connection con = Connector.getConnection();
String sql ="select num, title, content, credat, creusr from board ";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
%>
<form action="/board/board_insert.jsp">
<button>메인으로</button>
<table border="1">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>내용</th>
		<th>작성일</th>
		<th>작성자</th>
	</tr>
<%
while(rs.next()){
%>
	<tr>
		<td><%=rs.getInt("num") %></td>
		<td><%=rs.getString("title") %></td>
		<td><%=rs.getString("content") %></td>
		<td><%=rs.getString("credat") %></td>
		<td><%=rs.getString("creusr") %></td>
	</tr>
<%
}
Connector.close();
%>
</table>
</form>
</body>
</html>
