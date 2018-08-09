<%--
  Created by IntelliJ IDEA.
  User: lixix
  Date: 2018/7/21
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<a href="/hello.do">连接到HelloController中hello方法</a>
<h3>RequestMapping注解 添加</h3>
<a href="/account/save.do">添加</a>
<h3>RequestMapping注解 修改</h3>
<a href="/account/update.do?id=100">修改</a>
<h3>RequestMapping注解 删除</h3>
<a href="/account/delete.do">get请求删除</a>
<form action="/account/delete.do" method="post">
    <input type="submit" value="提交">
</form>
<h3>获取请求参数:获取简单类型参数</h3>
<a href="/user/save.do?id=100&name=jack">保存</a>
<a href="/user/update.do?id=100&name=jack">修改</a>
<h3>获取请求参数:把请求参数封装为对象类型</h3>
<a href="/user/update2.do?id=100&name=jack">save</a>
<h3>获取请求参数:把请求参数封装到对象的集合中</h3>
<form action="/user/update3.do" method="post">
    用户id:<input type="text" name="id"><br>
    用户名称:<input type="text" name="name"><br>
    省份:<input type="text" name="address.province"><br>
    城市:<input type="text" name="address.city"><br>
    省份list:<input type="text" name="list[0].province"><br>
    城市list:<input type="text" name="list[0].city"><br>
    城市list:<input type="text" name="list[1].province"><br>
    城市list:<input type="text" name="list[1].city"><br>
    省份map:<input type="text" name="map['one'].province">   <br>
    省份map:<input type="text" name="map['one'].city">   <br>
    省份map:<input type="text" name="map['two'].province">   <br>
    省份map:<input type="text" name="map['two'].city">   <br>
    <input type="submit" value="post提交">
</form>
<hr>
<h3>请求参数乱码问题</h3>
<a href="/user/update4.do?name=演员">乱码问题</a>
<h3>@RequestParams注解： 保存2</h3>
<a href="/user/save2.do?id=100&name=jack">保存2</a>
<a href="user/save3.do?id=100&username=jack">请求参数与控制器的形参名称不一致</a>
<a href="/user/searchByDate.do?data=2010-09-08">日期一</a>
<a href="/user/searchByDate2.do?date=2010-09-08">日期二</a><<br>
<h3>serviceApi作为参数</h3>
<a href="/user/service.do">serviceApi</a>
</body>
</html>
