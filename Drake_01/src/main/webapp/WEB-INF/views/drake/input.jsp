<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<%@ include file="/WEB-INF/views/include/include-head.jspf"%>
<style>
section {
	margin: 10px;
}
</style>



</head>
<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf"%>
	<%@ include file="/WEB-INF/views/include/include-nav.jspf"%>

	<section>
		<h3>음악 입력화면</h3>
		<form method="POST">
			<input name="d_title" placeholder="음악제목을 입력하세요"><br /> 
			<input name="d_newtitle" placeholder="신곡 제목을 입력하세요"><br /> 
			<input name="d_feat" placeholder="피쳐링가수를 입력하세요"><br />
			<button>보내기</button>

		</form>
	</section>
	<%@ include file="/WEB-INF/views/include/include-footer.jspf"%>


</body>
</html>