<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"; prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles"; prefix="tiles"%>
<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jstl/core"; prefix="c"%>
<HTML>
<HEAD>
        <TITLE>Welcome : Spring Struts Tutorial</TITLE>
</HEAD>
<BODY>
<h4 align="center">Welcome page | Spring security with  Struts 1.3 </h4>
        <%
            String message = (String)request.getAttribute("message");
        %>
        <br>
        <div align="center">
            Welcome <%= message %>
        </div>

        <br>
        <br>
        <div align="center">
        <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
        </div>
</BODY>
</HTML>