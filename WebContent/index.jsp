<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "/board.do"> 
<button>GET전송</button>
<input type="text" name="name"><br>
</form>

<form action = "/board.do" method="post"> <!--메소드를 적어줌으로서 post메소드를 불러온다  -->
<button>POST전송</button>
<input type="text" name="name">


</form>
</body>
</html>