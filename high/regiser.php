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
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="reg.css">
</head>
<body>
    <div class="container">
        <!-- Left Section -->
        <div class="left-section">
            <div class="arrow">▼</div>
            <h2>Join Us</h2>
            <p>Press the Button bellow to know about HighRon Tech</p>
            <a href="About.php"><button><h1>About us</h1></button></a>
        </div>
        <?php
        if (isset($_POST["submit"])) {
           $Name = $_POST["name"];
           $UserName = $_POST["username"];
           $Email = $_POST["email"];
           $password = $_POST["password"];
           
           $passwordHash = password_hash($password, PASSWORD_DEFAULT);

           $errors = array();
           
           if (empty($Name) OR empty($UserName) OR empty($Email) OR empty($password)) {
            array_push($errors,"All fields are required");
           }
           if (!filter_var($UserName, FILTER_VALIDATE_USERNAME)) {
            array_push($errors, "Username is not valid");
           }
           if (strlen($password)<8) {
            array_push($errors,"Password must be at least 8 charactes long");
           }
           require_once "database.php";
           $sql = "SELECT * FROM users WHERE username = '$UserName'";
           $result = mysqli_query($conn, $sql);
           $rowCount = mysqli_num_rows($result);
           if ($rowCount>0) {
            array_push($errors,"Hey that username already exists!");
           }
           if (count($errors)>0) {
            foreach ($errors as  $error) {
                echo "<div class='alert alert-danger'>$error</div>";
            }
           }else{
            
            $sql = "INSERT INTO users (name, username, email, password) VALUES ( ?, ?, ?, ? )";
            $stmt = mysqli_stmt_init($conn);
            $prepareStmt = mysqli_stmt_prepare($stmt,$sql);
            if ($prepareStmt) {
                mysqli_stmt_bind_param($stmt,"ssss",$Name, $UserName, $Email, $passwordHash);
                mysqli_stmt_execute($stmt);
                echo "<div class='alert alert-success'>You are registered successfully to HighRon Tech Company.</div>";
            }else{
                die("Something went wrong");
            }
           }
          

        }
        ?>
        <!-- Right Section - Registration Form -->
        <div class="right-section">
            <h2>Register Here With HighRon Tech</h2>
            <form>
                <input type="text" placeholder="Name" required>
                <input type="text" placeholder="Username" required>
                <input type="email" placeholder="Email" required>
                <input type="password" placeholder="Password" required>
                <button type="submit" class="register-btn">Register</button>
            </form>
            <p>Already have an account? <a href="login.php">Login here</a></p>
        </div>
    </div>
</body>
</html>
