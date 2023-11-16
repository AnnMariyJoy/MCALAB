<?php
$db=new mysqli("localhost","root","","db_data");
if($db->connect_error)
{
	die("Connection failed:".$db->connect_error);
}
$result=$db->query("SELECT * FROM user");
while($row=$result->fetch_assoc())
{
	echo "Name:".$row['name']."<br>";
}

$db->close();
?>
