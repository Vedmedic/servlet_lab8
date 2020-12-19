<%@ page import="bsuir.Main" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Img Random</title>
    <style>
        h1 {
            font-family: 'Verdana';
        }
        p {
            font-family: 'Verdana';
        }
    </style>
</head>
<body>
    <% String key = request.getParameter("topics"); %>
    <h1>Вот ваша картинка!</h1>
    <hr>
    <%
        String res = Main.getImageURL(key);
        if(res == null) res = "Такая тема не найдена: " + key;
    %>
    <img src="<%=res%>" width="740" height="480">
</body>
</html>
