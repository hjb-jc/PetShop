<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table,th ,td{
            margin: 20px;
            padding: 1em;
        }
    </style>
</head>
<body>
<h2 style="text-align: center">宠物商店(天犬)</h2>
<div style="margin: auto">
    <form>
        <input type="text" placeholder="按名字搜索" />
        <input type="submit" value="搜索"/>
    </form>
    <div>
        <a href="/user" >登录</a>
    </div>
</div>
<form>
    <table>
        <tr>
            <th>编号</th>
            <th>种类</th>
            <th>名称</th>
            <th>图片</th>
            <th>标签</th>
            <th>状态</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pPets}" var="p">
        <tr>
            <td>${p.p_Id}</td>
            <td>${p.p_Category}</td>
            <td>${p.p_Name}</td>
            <td><img width="90" src="/image/${p.p_PhotoUrls}"></td>
            <td>${p.p_Tags}</td>
            <td>${p.p_Status}</td>
            <td><a href="/pet/del/${p.p_Id}" >删除</a> </td>
        </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
