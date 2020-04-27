<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" align="center" width="50%">
        <tr>
            <th>Name</th>
            <th>Sex</th>
            <th>Age</th>
        </tr>

        <#list list as user>
            <tr>
                <td>${user.username}</td>
                <td>${user.usersex}</td>
                <td>${user.userage}</td>
            </tr>
        </#list>
    </table>
</body>
</html>