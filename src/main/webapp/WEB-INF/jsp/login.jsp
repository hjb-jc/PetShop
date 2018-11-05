<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="" method="post">
    <input type="text" name="u_LastName" placeholder="用户名"><br/>
    <input type="password" name="u_password" placeholder="密码"><br/>
    <input type="button" id="btn_submit" value="login"/>
</form>

<script src="../js/jquery.js"></script>
<script>
    $("#btn_submit").click(function () {
        alert("ok");
        $.post("/user/login",
            {
                u_LastName: $("input[name='u_LastName']").val(),
                u_password: $("input[name='u_password']").val()
            },
            function (data) {
                alert(data);
            });
    });
</script>

</body>
</html>
