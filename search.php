<html>
<head>
  <title>Book Details</title>
</head>
<body>
  <h1>Book Search</h1>
  <form method="GET">
   <input type="text" name="search_item" class="search_item" placeholder="Search your book...">
   <input type="submit" value="Search">
  </form>
  <table border="1">
  <?php 
    // database details
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "tdss";

    // creating a connection
    $con = mysqli_connect($servername, $username, $password, $dbname);
    
    $search = $_GET['search_item'];
    
    // to ensure that the connection is made
    if (!$con)
    {
        die("Connection failed!" . mysqli_connect_error());
    }
    
    $sql = "SELECT * FROM book WHERE bookname='$search'";
    
    $result = mysqli_query($con, $sql);
    
    if($result->num_rows > 0){
      echo "<tr><th>Book Id</th><th>Book Name</th><th>Author Name</th><th>Publisher Name</th><th>Price</th></tr>";
      while($row = $result->fetch_assoc()){
            echo "<tr><td>".$row['bookid']."</td><td>".$row['bookname']."</td><td>".$row['authorname']."</td><td>".$row['publishername']."</td><td>".$row['bookprice']."</td></tr>";
      } 
    }
    $con->close();
  ?>
  </table>
</body>
</html>
