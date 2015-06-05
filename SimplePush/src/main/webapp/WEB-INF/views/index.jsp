<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<title>Simple GCM push server</title>
</head>
<body>
	<form action="/SimplePush/send.do">
		<input type="text" name="regid" id="regid"> <br>
		<textarea rows="3" cols="50" id="msg" name="msg"></textarea>
		<br> <input type="submit" value="푸시 보내기">
	</form>
</body>
</html>
