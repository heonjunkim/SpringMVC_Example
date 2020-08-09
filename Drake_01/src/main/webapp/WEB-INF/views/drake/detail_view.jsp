<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
	<c:set var="korea" value="대한민국" />
	<c:set var="num1" value="100" />
	<c:set var="num2" value="200" />
	
	<%@ include file="/WEB-INF/views/include/include-head.jspf" %>
	<style>
		section {
			margin: 10px;
		}
		
		#buttons {
			padding:10px;
			text-align: right;
		}
		
		#drake_input {
			background-color: blue;
			color:white;
			padding:5px;
			border:0;
			border-bottom:2px solid blue;
		}
		
		/* 어떤 tag에 마우스를 올렸을때의 효과 지정 */
		#drake_input:hover {
			background-color: gray;
			color:black;
			border-bottom:2px solid yellow;
		}
		
		td a {
			color : black;
			cursor: pointer;
		}
		
	</style>
	

</head>
<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf" %>
	<%@ include file="/WEB-INF/views/include/include-nav.jspf" %>
	
	<section>
		<h3>드레이크</h3>
		<p>SEQ : ${DRAKE.d_seq}</p>
		<p>노래제목 : ${DRAKE.d_title}</p>
		<p>새제목 : ${DRAKE.d_newtitle}</p>
		<p>피쳐링가수 : ${DRAKE.d_feat}</p>
		
		
	</section>
	<hr/>
	<section id="buttons">
		<button id="drake_input">
		<a href="delete?seq=${DRAKE.d_seq}">플레이리스트 삭제</a>
		</button>
	</section>
	<%@ include file="/WEB-INF/views/include/include-footer.jspf" %>



</body>
</html>