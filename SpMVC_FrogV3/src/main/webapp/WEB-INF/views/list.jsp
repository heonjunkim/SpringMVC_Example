<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/include/include-head.jspf"%>
<style>
 #main {
 	background-image: url("${rootPath}/static/images/youngboss.jpg.png");
  }
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf"%>

	<section id="main">
		<article id="button">
			<button>
				<a href="${rootPath}/frog/input">블로그작성</a>
			</button>
		</article>
		<article id="frog_body">
			<c:forEach items="${FROGS}" var="FROG">
				<section class="frog_title">
					<h3>${FROG.title} - <span>${FROG.user}</span></h3>
				</section>
				<section class="frog_text">
					<h5>${FROG.content}</h5>
				</section>
			</c:forEach>
		</article>
	</section>
	<%@ include file="/WEB-INF/views/include/include-footer.jspf"%>
</body>
</html>