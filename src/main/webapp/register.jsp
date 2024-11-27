<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>my-page</title>
<%@ include file="component/All-CSS.jsp"%>
</head>
<body>
	<br>
	<br>
	<h1 class="text-center text-success">Codezy Technologies</h1>

	<br>
	<br>

	<div align="center" style="border: medium">
		<form action="savestudent" method="post">
			
			<div class="form-group row">
				<label for="colFormLabel"
					class="col-sm-2 col-form-label col-form-label col-form-label-lg">Name</label>
				<div class="col-sm-10">
					<input type="name" class="form-control form-control-lg"
						id="colFormLabel" placeholder="Enter ur Name" name="sname">
				</div>
			</div>
			<div class="form-group row">
				<label for="colFormLabel"
					class="col-sm-2 col-form-label col-form-label-lg">Email</label>
				<div class="col-sm-10">
					<input type="email" class="form-control form-control-lg"
						id="colFormLabel" placeholder="Enter ur Email" name="semail">
				</div>
			</div>
			<div class="form-group row">
				<label for="colFormLabel"
					class="col-sm-2 col-form-label col-form-label-lg">Age</label>
				<div class="col-sm-10">
					<input type="number" class="form-control form-control-lg"
						id="colFormLabel" placeholder="Enter ur Age" name="sage">
				</div>
			</div>
			<div class="form-group row">
				<label for="colFormLabel"
					class="col-sm-2 col-form-label col-form-label-lg">Phone</label>
				<div class="col-sm-10">
					<input type="number" class="form-control form-control-lg"
						id="colFormLabel" placeholder="Enter ur Phone" name="sphone">
				</div>
			</div>

			<div class="col-sm-2">
				<input type="submit" class="form-control form-control-lg"
					id="colFormLabel" value="Register">
			</div>


		</form>
	</div>
</body>
</html>
