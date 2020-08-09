<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<c:set var="korea" value="대한민국" />
<c:set var="num1" value="100" />
<c:set var="num2" value="200" />

<%@ include file="/WEB-INF/views/include/include-head.jspf"%>
<style>
section {
	margin: 10px;
}

#buttons {
	padding: 10px;
	text-align: right;
}

#drake_input {
	background-color: blue;
	color: white;
	padding: 5px;
	border: 0;
	border-bottom: 2px solid blue;
}

/* 어떤 tag에 마우스를 올렸을때의 효과 지정 */
#drake_input:hover {
	background-color: gray;
	color: black;
	border-bottom: 2px solid yellow;
}

td a {
	color: black;
	cursor: pointer;
}
</style>


</head>
<body>
	<%@ include file="/WEB-INF/views/include/include-header.jspf"%>
	<%@ include file="/WEB-INF/views/include/include-nav.jspf"%>

	<section>
		<table>
			<thead>
				<tr>
					            
				
					
					<th>NO</th>
					<th>노래제목</th>
					<th>신곡제목</th>
					<th>피쳐링</th>


				</tr>
			</thead>
			<tbody>

				<c:forEach items="${DRAKES}" var="vo" varStatus="index">
					<tr>
						<td>${index.count}</td>
						
					    
	            
					
						<td><a href="drake?seq=${vo.d_seq}"> </a></td>
						<td>${vo.d_title}</td>
						<td>${vo.d_newtitle}</td>
						<td>${vo.d_feat}</td>



					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
	<hr />
	<section id="buttons">
		<button id="drake_input">
			<a href="input">뮤직</a>
		</button>
	</section>


	<%@ include file="/WEB-INF/views/include/include-footer.jspf"%>


</body>
</html>