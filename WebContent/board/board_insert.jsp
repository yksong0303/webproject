<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/board/board_insert_ok.jsp">
제목 : <input type="text" name="title"><br>
내용 : <textarea name="content"></textarea><br>
작성자 : <input type="text" name="creusr"><br>
<button>작성</button>
</form>
</body>
</html>