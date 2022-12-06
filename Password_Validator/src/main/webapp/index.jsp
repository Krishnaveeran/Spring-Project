<html>
<head>
	<title> Password Validator </title>
	<style>
	*{
	margin:0;
	padding:0;
	background-color: #d9d9d9; 
	
	}
	        
*{
text-align:center;
}
h2{
color:#0000ff;
}	
form
{
color:red;
}
div{

color:blue;

}

section {
margin:auto;
padding:20px;
border:10px solid violet;
width:500px;
height=300px;

}

</style>
</head>
<body>
<section>
<h2>Password Validator </h2> <br>
<form action="/addInfo">
<h4>Enter the Password <input type="text"  name="password"></h4> <br>
<div> 
 
a minimum of 1 lower case letter [a-z] and  <br>
a minimum of 1 upper case letter [A-Z] and  <br>
a minimum of 1 numeric character [0-9] and  <br>
a minimum of 1 special character: @ # $ % & *  <br>
a password length between 8 and 15 

</div>


<br>

<input type="submit" value="validate">
</form>
</section>
</body>
</html>



