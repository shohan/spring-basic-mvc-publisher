<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add book</title>
</head>
<body>
<h1> Add Book</h1>
<form:form modelAttribute="book">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add Book"></td>
        </tr>
    </table>
</form:form>
</body>
</html>