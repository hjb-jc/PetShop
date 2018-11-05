
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>注册</title>
    <link rel="stylesheet" href="/css/style.css" />

</head>
<body>

<div class="register-container">
    <h1>ShareLink</h1>

    <div class="connect">
        <p>Link the world. Share to world.</p>
    </div>

    <form action="/user/add" method="post" id="registerForm">
        <div>
            <input type="text" name="u_Name" class="username" placeholder="您的用户名" autocomplete="off"/>
        </div>
        <div>
            <input type="password" name="u_password" class="password" placeholder="输入密码" oncontextmenu="return false" onpaste="return false" />
        </div>
        <div>
            <input type="text" name="u_Phone" class="phone_number" placeholder="输入手机号码" autocomplete="off" id="number"/>
        </div>
        <div>
            <input type="email" name="u_Email" class="email" placeholder="输入邮箱地址" oncontextmenu="return false" onpaste="return false" />
        </div>
        <div>
            <input type="text" name="u_UserSatus" class="username" placeholder="状态" autocomplete="off"/>
        </div>

        <button id="submit" type="submit">注 册</button>
    </form>
    <a href="/user">
        <button type="button" class="register-tis">已经有账号？</button>
    </a>

</div>


<script src="/js/jquery.min.js"></script>
<script src="/js/common.js"></script>
<!--背景图片自动更换-->
<script src="/js/supersized.3.2.7.min.js"></script>
<script src="/js/supersized-init.js"></script>
<!--表单验证-->
<script src="/js/jquery.validate.min.js?var1.14.0"></script>


</body>
</html>
