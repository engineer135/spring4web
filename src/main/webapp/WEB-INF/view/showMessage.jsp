<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

	</head> 
	<body>
		<h2>${message}</h2>
		
		<a href="javascript:ajaxTest();">ajax 테스트!</a>
	</body>
	<script>
		function ajaxTest(){
			$.getJSON("/ajaxTest.do", null, function(data){
				alert(data.test);
			});
		}
	</script>
</html>
