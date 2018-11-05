
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<style>
    input{
        margin: 1em;
    }
</style>
<body>
<h2>添加宠物</h2>
<form action="/pet/add" method="post">
    <input type="text" name="p_Category" placeholder="种类" /><br/>
    <input type="text" name="p_Name" placeholder="名称" /><br/>
    图片<input type="file" name="p_PhotoUrls" /><br/>
    <input type="text" name="p_Tags" placeholder="标签" /><br/>
    <input type="text" name="p_Status" placeholder="状态" /><br/>
    <input type="submit" value="添加"/>
</form>
</body>
</html>
