
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
</head>
<style>
.error {
      color:red;
      font-weight:blod;
}
</style>
<body>
<form:form method="post" action="adduser" modelAttribute="user" >
        <table>
        <tr>
            <td><form:label path="userId"> Id:</form:label></td>
            <td><form:input path="userId" /></td>
            <td><form:errors path="userId" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="userName">  Name:</form:label></td>
            <td><form:input path="userName" /></td>
            <td><form:errors path="userName" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="userEmail">Email:</form:label></td>
            <td><form:input path="userEmail" /></td>
            <td><form:errors path="userEmail" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="userMobileNo">Mobileno:</form:label></td>
            <td><form:input path="userMobileNo" /></td>
            <td><form:errors path="userMobileNo" cssClass="error"/></td>
        </tr>
        
        <tr>
                   <td>
                <input type="submit" value="submit"/>
            </td>
        </tr>
    </table> 
    </form:form>

</body>
</html>