<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    
</head>
<body>
    <h2>Create a New Account</h2>
    
    
    <form action="/register" method="POST">
        <!-- User fields like username, password, etc. -->
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        
        
        <button type="submit">Sign Up</button>
    </form>
    
    
    <br>
    <a href="/login">
        <button type="button">Login</button>
    </a>

</body>
</html>
