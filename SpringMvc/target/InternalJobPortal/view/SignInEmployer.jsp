
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employer SignIn</title>
<link href="../css/SignInEmployer.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="main">
<div class="signin">
<h2>Employer SignIn</h2>
</div>
</div>
<form id="signin" action="../employerController" method="POST">
   <input type="hidden" name="option" value="signIn" />
   <input type="hidden" name="user" value="employer" />
         <label>Email : </label> 
         <br>
         <input type="text" name="Email" id="similar" placeholder="Enter your Mail-Id">
         <br><br>
         <label>Password : </label> 
         <br>
         <input type="text" name="Password" id="similar" placeholder="Enter your Password">
         <br><br>
         <input type="submit" value="SignIn" name="submit" id="submit">
   </form>
</body>
</html>