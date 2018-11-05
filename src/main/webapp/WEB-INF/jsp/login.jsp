<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="color: red">
    ${err}
</div>
<div>
    ${msg}
</div>
<form action="/user/login1" method="post">
    <input type="text" name="u_LastName" placeholder="用户名"><br/>
    <input type="password" name="u_password" placeholder="密码"><br/>
    <input type="submit"  value="login"/>
</form>
<a href="/user/re">注册</a>

<script src="../js/jquery.js"></script>
<%--<script>--%>
    <%--$("#btn_submit").click(function () {--%>
        <%--$.post("/user/login1",--%>
            <%--{--%>
                <%--u_LastName: $("input[name='u_LastName']").val(),--%>
                <%--u_password: $("input[name='u_password']").val()--%>
            <%--},--%>
            <%--function (data) {--%>
                <%--alert(data);--%>
            <%--});--%>
    <%--});--%>

    <%--$("#btn_re").click(function () {--%>

    <%--})--%>
<%--</script>--%>

</body>
</html>
