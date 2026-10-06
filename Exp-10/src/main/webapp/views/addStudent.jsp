<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Registration Status</title>
</head>

<body>

<h2>Registration Successful</h2>

<p>Name: ${student.studentName}</p>

<p>Contact: ${student.studentContact}</p>

<p>Gender: ${student.studentGender}</p>

<p>Pincode: ${student.studentPincode}</p>

<p>Hobbies:</p>

<p>${student.hobbies[0]}</p>
<p>${student.hobbies[1]}</p>
<p>${student.hobbies[2]}</p>

</body>
</html>