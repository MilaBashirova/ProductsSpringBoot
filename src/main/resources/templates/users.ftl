<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<table>
    <tr>
        <th>login</th>
        <th>email</th>
    </tr>
    <#list usersFromServer as user>
        <tr>
            <td>${user.login}</td>
            <td>${user.email}</td>
        </tr>
    </#list>
</table>
</body>
</html>