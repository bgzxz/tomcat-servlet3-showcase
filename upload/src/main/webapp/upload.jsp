<%--
  Created by IntelliJ IDEA.
  User: zhangxiang
  Date: 16/5/9
  Time: 下午7:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">

    name:<input type="text" name="name"><br/>

    file1: <input type="file" name="file1"><br/>

    file2: <input type="file" name="file2"><br/>
    file2: <input type="file" name="file2"><br/>

    <input type="submit" value="上传">

</form>
</body>
</html>