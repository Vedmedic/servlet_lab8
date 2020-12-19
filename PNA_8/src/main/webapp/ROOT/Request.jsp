<%@ page contentType="text/html;    charset=UTF-8" language="java" %>
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
<h1 font = "Verdana">Получи случайную картинку!</h1>
<hr>
<form action = "response" method = "POST">
    <label for="topics">Выбери тему:</label>
    <select name="topics" id="topics">
        <option value="nature">Природа</option>
        <option value="naruto">Наруто</option>
        <option value="wish">Поздравление</option>
        <option value="gif">Гифка</option>
    </select>
    <input type = "submit" value = "Получить картинку" />

</form>

</body>
</html>