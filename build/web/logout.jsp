<%-- 
    Document   : logout
    Created on : Mar 23, 2023, 10:38:25 AM
    Author     : Rukshana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if(session.getAttribute("UN") != null){
        session.invalidate();
        response.sendRedirect("login.jsp");
    }

%>
