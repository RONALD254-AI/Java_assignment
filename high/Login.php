<?php
session_start();
if (isset($_SESSION["user"])) {
   header("Location: index.php");
}
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="styles.css"> 
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
</head>
<body>
    <div id="loginForm" class="form-container active">
        <h1><b>HighRon Tech Company</b></h1>
        <h3>Enter Your Credentials</h3>
        <?php
        if (isset($_POST["login"])) {
           $Email = $_POST["email"];
           $UserName = $_POST["username"];
           $password = $_POST["password"];
            require_once "database.php";
            $sql = "SELECT * FROM users WHERE email = '$Email'";
            $sql = "SELECT * FROM users WHERE username = '$UserName'";
            $sql = "SELECT * FROM users WHERE password = '$password'";
            $result = mysqli_query($conn, $sql);
            $user = mysqli_fetch_array($result, MYSQLI_ASSOC);
            if ($user) {
                if (password_verify($password, $user["password"])) {
                    session_start();
                    $_SESSION["user"] = "yes";
                    header("Location: index.php");
                    die();
                }else{
                    echo "<div class='alert alert-danger'>Password does not match</div>";
                }
            }else{
                echo "<div class='alert alert-danger'>Email does not match</div>";
            }
        }
        ?>
        <form action="">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" placeholder="Enter your Email" required>

            <label for="username">UserName</label>
            <input type="text" id="first" name="first" placeholder="Enter your UserName" required>
    
            <label for="password">password</label>
            <input type="password" id="password" name="password" placeholder="Enter Your password"required>
    
            <div class="wrap">
                <button type="submit">Login</button>
            </div>
        </form>
        <p>Not Registered?<a href="regiser.php">Create an Account</a></p>
    </div>
</body>
</html>