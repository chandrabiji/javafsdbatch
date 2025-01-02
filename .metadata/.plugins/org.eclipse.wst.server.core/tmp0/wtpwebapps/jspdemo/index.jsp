<%@page import="java.util.Date" contentType="text/html; charset=ISO-8859-1" language="java"%>
<%!
    int a = 10;
%>

<% 
   int b = 20;
   Date d = new Date();
   out.println("Result : "+(a+b));
   out.println("Date: "+d);
%>