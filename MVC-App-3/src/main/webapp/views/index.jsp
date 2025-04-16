<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Enquiry Form</title>
</head>
<body>
    <h2>Student Enquiry Form</h2>
      
    <!-- Spring Form Binding with Model Attribute 'student' -->
    <form:form action="save" modelAttribute="student" method="post">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" /></td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td>
                    <form:radiobutton path="gender" value="Male" /> Male
                    <form:radiobutton path="gender" value="Female" /> Female
                </td>
            </tr>
            <tr>
                 <td>Course:</td>
                <td>
                    <form:select path="course">
                        <form:option value="" label="Select a Course" />
                        <form:options items="${courseOptions}" />
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Preferred Timings:</td>
                <td>
                    <form:checkboxes path="timings" items="${timingOptions}" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit">Submit</button>
                </td>
            </tr>
        </table>
        ${success}
    </form:form>
</body>
</html>
