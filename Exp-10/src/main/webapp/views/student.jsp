<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Student Registration</title>
</head>

<body>
<h2>Student Registration Form</h2>
<form action="${pageContext.request.contextPath}/addStudent"
      method="post">

    Name:
    <input type="text" name="studentName">
    <br>

    <span style="color:red">
        ${errors.studentName}
    </span>

    <br><br>


    Contact:
    <input type="text" name="studentContact">
    <br>

    <span style="color:red">
        ${errors.studentContact}
    </span>
    <br><br>

    Gender:

    <input type="radio" name="studentGender" value="male">
    Male

    <input type="radio" name="studentGender" value="female">
    Female
    <br>

    <span style="color:red">
        ${errors.studentGender}
    </span>
    <br><br>

    Hobbies:

    <input type="checkbox" name="hobbies" value="Reading">
    Reading

    <input type="checkbox" name="hobbies" value="Music">
    Music

    <input type="checkbox" name="hobbies" value="Sports">
    Sports
    <br>

    <span style="color:red">
        ${errors.hobbies}
    </span>
    <br><br>

    Pincode:
    <input type="number" name="studentPincode">
    <br>

    <span style="color:red">
        ${errors.studentPincode}
    </span>

    <br><br>
    <input type="submit" value="Register">
</form>
</body>
</html>