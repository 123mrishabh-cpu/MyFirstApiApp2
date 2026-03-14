<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.container{
		width: 100%;
		height: 100vh;
		display: flex;
		justify-content: center;
		align-items: center;
	}
	
	form{
		width: 500px;
		padding: 1rem;
		box-shadow: 3px 3px 10px 0;
	}
	
	.form-control{
		width: 100%;
		height: 3rem;
				
	}
	
</style>
</head>
<body>
	<div class="container">
		<form action="RegUser" method="post">
			<h1>Register Here</h1>
			<div class="form-control">
				<input type="text" name="name" placeholder="Your Name"/>
				<span class="form-error"></span>
			</div>
			<div class="form-control">
				<input type="text" name="email" placeholder="Your email"/>
				<span class="form-error"></span>
			</div>
			<div class="form-control">
				<input type="number" name="age" placeholder="Your age"/>
				<span class="form-error"></span>
			</div>
			<div class="form-control">
				<input type="text" name="phoneNo" placeholder="Your phone No"/>
				<span class="form-error"></span>
			</div>
			
			<Button type="submit">Register</Button>
		</form>
	</div>
</body>
</html>