<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee update page</h1>
	<form action="./update" method="post">
		<table>
			<tr>
				<td>id</td>
				<td><input type="text" name="id" value="${dp.id}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" value="${dp.name}"></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td><input type="text" name="designation" value="${dp.designation}"></td>

			</tr>
			<tr>
				<td>Experience</td>
				<td><input type="text" name="exp" value="${dp.exp}"></td>

			</tr>
			<tr>
				<td>Department</td>
				<td><input type="text" name="dept" value="${dp.dept}"></td>

			</tr>
			<tr>

				<td><input type="submit" value="update">
			</tr>

		</table>


	</form>


</body>
</html>