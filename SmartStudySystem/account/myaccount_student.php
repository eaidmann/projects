<?php

session_start();

require_once('../mysqli_connect/mysqliconnect.php');

$matricno = $_SESSION['smatricno'];

$query = "Select sMatricNo, FirstName, LastName, Programme from student where sMatricNo = '$matricno'";
$retval = mysqli_query($dbc,$query);

$row=mysqli_fetch_array($retval);

?>

<!DOCTYPE HTML>

<html>
    
    <head lang="en">
        <meta charset="utf-8">
        <title>Smart Study System - Student Page</title>
        <link rel="stylesheet" href="../style/style.css" />
    </head>
    
    <body id="studentmain">
        
        <ul>
            <li><a href="../student_index.php">Home</a></li>
            <li><a href="../courses/mycourse.php">My Courses</a></li>
			<li><a href="../appointment/myappointment.php">My Appointment</a></li>
            <li><a href="../courses/viewcourses.php">View Courses</a></li>
            <li><a class="active" href="myaccount_student.php">My Account</a></li>
            <li class="logoutbtn"><a href="../logout/logout.php">Logout</a></li>
        </ul>
        
        <div class="studentpage">
		
			<p align="center"><h1><b><i>My Account</i></b></h1></p>
            
            <table class="accountdetail" align="center" cellpadding="10px" cellspacing="4px" >
            
                <tr>
                    <th>Matric Number :</th>
                <?php
                    echo "<td>" .$row['sMatricNo']. "</td>";
                ?>
                </tr>
				
				<tr>
                    <th>First Name :</th>
                <?php
                    echo "<td>" .$row['FirstName']. "</td>";
                ?>
                </tr>
				
				<tr>
                    <th>Last Name :</th>
                <?php
                    echo "<td>" .$row['LastName']. "</td>";
                ?>
                </tr>
				
				<tr>
                    <th>Programme :</th>
                <?php
				switch ($row['Programme']) {
				
					case "RY40" :
						echo "<td>RY40 - Electronic System</td>";
						break;
					case "RY41" :
						echo "<td>RY41 - Telecommunication System</td>";
						break;
					case "RY43" :
						echo "<td>RY43 - Electronic Network Design</td>";
						break;
					case "RY44" :
						echo "<td>RY44 - Embedded System Electronic</td>";
						break;
					default :
						echo "<td>No Programme Registered.</td>";
				}
					
                ?>
                </tr>
				
				<tr>
					<th>Action :</th>
				<?php
					echo "<td><p align='right'><a class='editbttn' href=../clear/clear_enroll.php?id=" .$row['sMatricNo']. " >Clear My Enrollment</a>
					<a class='editbttn' href=../clear/clear_appointment.php?id=" .$row['sMatricNo']. " >Clear My Appointment</a>
					<a class='editbttn' href=../clear/clear_course.php?id=" .$row['sMatricNo']. " >Clear My Course</a></p></td>";
				?>
				</tr>
					
				<tr>
					<th></th>
				<?php	
					echo "<td><p align='right'><a class='editbttn' href=edit_myaccountS.php?id=" .$row['sMatricNo']. " >Edit</a></p></td>";
				?>
				</tr>
            </table>
            
        </div>
    </body>
</html>