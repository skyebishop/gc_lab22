<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>build your own pizza</h1>

<form method="post" action="/customconfirmation">
	<h2>size:</h2>
	<select name="size">
	    <option value="small">small</option>
	    <option value="medium">medium</option>
	    <option value="large">large</option>
  </select>
  <br />
  <h2>toppings:</h2>
  <select name="toppings">
		<option value="1">1</option>
	    <option value="2">2</option>
	    <option value="3">3</option>
	    <option value="4">4</option>
	    <option value="5">5</option>
	    <option value="6">6</option>
  </select><br />
  <br />
  gluten-free crust? ($2.00 extra):<br /><input type="checkbox" name="gf"/><br />
  <br />
  special instructions:<br /> 
	<textarea name="special" style="width:250px;height:150px;"></textarea>
	<br />
  
  
  
  
  <input type="submit">


</form>



	<a href="/homepage">return to homepage</a><br />


</body>
</html>