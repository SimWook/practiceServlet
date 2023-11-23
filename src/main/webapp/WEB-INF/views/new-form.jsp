<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!-- 相対パスの使用、[現在のURLが属する階層パス + /save] -->
<form action="save" method="post">
    username: <input type="text" name="username"/> age: <input type="text" name="age"/>
    <button type="submit">転送</button>
</form>
</body>
</html>