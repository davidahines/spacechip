<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1″>
<title>Login Page</title>
</head>
<body>
   <form name="f" action="<c:url value=’/j_spring_security_check’/>" method="POST">
      <table align="center">
        <tr><td colspan=’2′>
        <h1 align="center">Login</h1>

        <c:if test="${not empty param.login_error}">
            <font color="red">
                Username and Password do not match. Try again.<br/><br/>
            </font>
        </c:if>
        </td></tr>
        <tr><td>User:</td><td><input type=’text’ name=’j_username’ value='<c:if test="${not empty param.login_error}"><c:out value="${SPRING_SECURITY_LAST_USERNAME}"/></c:if>’/></td></tr>
        <tr><td>Password:</td><td><input type=’password’ name=’j_password’></td></tr>
        <tr><td><input type="checkbox" name="_spring_security_remember_me"></td><td>Don’t ask for my password for two weeks</td></tr>

        <tr><td colspan=’2′><input name="submit" type="submit" value="Login"><input name="reset" type="reset"></td></tr>
      </table>

    </form>
</body>
</html>