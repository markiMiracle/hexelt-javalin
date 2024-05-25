
@import org.example.hexlet.dto.UsersPage
@param UsersPage page

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>my site</title>
</head>
<body>
<div class="navbar">
    <div class="logo">
        <div>Miracle</div>
    </div>
    <div class="menu">
        <a href="/">Главная</a>
    </div>
    <div class="menu">
        <a href="/users">Users</a>
    </div>
    <div class="menu">
        <a href="/users/build">Регистрация</a>
    </div>
</div>
<div class="content">
    <h1>Пользователи:</h1>
</div>
@if(page.getUsers().isEmpty())
    <p>Пока не добавлено ни одного пользователя</p>
@else
    @for(var user : page.getUsers())
        <ul>
            <li>${user.getId()} ${user.getFirstName()} ${user.getLastName()}</li>
        </ul>
    @endfor
@endif
</body>
</html>