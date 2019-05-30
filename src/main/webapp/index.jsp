<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>WorkPay</title>
    <link rel="stylesheet" href="style/WorkPayStyle.css">
    <link rel="shortcut icon" href="images/bakl.jpg" type="image/x-icon">

</head>
<body>
<div class="top-bar">
    <h1>Добро пожаловать на <b>WorkPay</b></h1>
    <div class="clr"></div>
</div>

<section class="container">
    <div class="login">
        <h1>Войдите в свой личный кабинет</h1>
        <form method="post" action="index.jsp">
            <p><input type="text" name="login" value="" placeholder="Логин"></p>
            <p><input type="password" name="password" value="" placeholder="Пароль"></p>
            <div class="Error">
            </div>
            <p class="remember_me">
                <label>
                    <input type="checkbox" name="remember_me" id="remember_me">
                    Запомнить меня
                </label>
            </p>
            <p class="submit"><input onclick="location.href='/administrator'" type="submit" name="commit" value="Войти"></p>
        </form>
    </div>
</section>
</body>
</html>
