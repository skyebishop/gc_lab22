<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="/confirmation">
	Name: 
	<input type="text" name="name"/><br />
	<br />
	
	Ranking: 
	<INPUT TYPE="radio" NAME="ranking" VALUE="1"/>1
	<INPUT TYPE="radio" name="ranking" VALUE="2"/>2
	<INPUT TYPE="radio" name="ranking" VALUE="3"/>3
	<INPUT TYPE="radio" name="ranking" VALUE="4"/>4
	<INPUT TYPE="radio" name="ranking" VALUE="5"/>5<br />
	<br />
	
	Comments or suggestions:<br /> 
	<textarea name="feedback" style="width:250px;height:150px;"></textarea>

<input type="submit" />
</form>


</body>
</html>