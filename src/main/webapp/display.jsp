<%@page import="com.gct.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="component/All-CSS.jsp"%>

</head>
<body>
	<%@ include file="register.jsp"%>
	<br>
	<br>
	<div class="container">

		<%
		List<Student> list = (List<Student>) request.getAttribute("students");
		%>

		<table class="table table-striped" border="1px">
			<thead class="bg-success text-white">

				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Age</th>
					<th>Phone</th>
				
				</tr>
			</thead>
			<tbody>
				<%
				for (Student student : list) {
				%>
				<tr>
					<td><%=student.getId()%></td>
					<td><%=student.getName()%></td>
					<td><%=student.getEmail()%></td>
					<td><%=student.getAge()%></td>
					<td><%=student.getPhone()%></td>
					</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>