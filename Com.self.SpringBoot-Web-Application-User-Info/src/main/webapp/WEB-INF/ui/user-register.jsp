<!DOCTYPE html>
<html>
<head>
    <title>User SignUp</title>
</head>

<body>

<form action="/instagram/account/sign-up" method="POST">
    <div class="container">
        <h1>Register</h1>
        <p>Please fill the details</p>

        <label><b>Full Name</b></label>
        <input type="text" placeholder="Enter Name" name="fullName" id="fullName" required>

        <label><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" id="email" required>

        <label><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

        <input type="submit" value="Sign Up"/>
    </div>
</form>

<br><br>

<!-- Login link -->
<a href="/instagram/sign-in">
    <button type="button">Already have an account? Login</button>
</a>

</body>
</html>
