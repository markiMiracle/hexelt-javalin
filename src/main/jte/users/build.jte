

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8" />
    <title>Регистрация</title>
</head>
<body>
<form action="/users" method="post">
<div>
    <label>Имя</label>
    <input type="text" name="first_name" />
</div>
<div>
    <label>Фамилия</label>
    <input type="text" name="last_name" />
</div>
<div>
    <label>Почта</label>
    <input type="email" required name="email" />
</div>
<input type="submit" value="Зарегистрировать"/>
</form>
</body>
</html>
