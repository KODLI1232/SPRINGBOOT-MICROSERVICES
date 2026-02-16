<!DOCTYPE html>
<html>
<head>
    <title>User SignIn</title>
</head>

<body>

<form action="/instagram/sign-in" method="POST">
    <div class="container">
        <h1>Sign In</h1>
        <p>Please enter the details</p>

        <label><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" id="email" required>

        <label><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

        <input type="submit" value="Sign In"/>
    </div>
</form>

</body>
</html>
