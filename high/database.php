<?php

$hostName = "localhost";
$dbUser = "root";
$dbPassword = "";
$dbName = "my_db";
$conn = mysqli_connect('localhost', 'root', '', 'my_db');
if (!$conn) {
    die("Something went wrong;");
}

?>