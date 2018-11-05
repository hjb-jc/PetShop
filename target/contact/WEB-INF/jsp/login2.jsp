<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>登录页面</title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <link rel="stylesheet" href="/css/style.css"/>

</head>
<body>

<div class="login-container">
    <h1>用户登录</h1>

    <div class="connect">
        <p>${err}</p>
    </div>

    <form action="/user/login1" method="post" id="loginForm">
        <div>
            <input type="text" name="u_Name" class="username" placeholder="用户名" autocomplete="off"/>
        </div>
        <div>
            <input type="password" name="u_password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
        </div>
        <button id="submit" type="submit">登 录</button>
    </form>

    <a href="/user/re">
        <button type="button" class="register-tis">还有没有账号？</button>
    </a>

</div>

<script src="/js/jquery.min.js"></script>
<script src="/js/common.js"></script>

<!--背景图片自动更换-->
<script src="/js/supersized.3.2.7.min.js"></script>
<script src="/js/supersized-init.js"></script>

<!--表单验证-->
<script src="/js/jquery.validate.min.js?var1.14.0"></script>

</div>
</body>
</html>
