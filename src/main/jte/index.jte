@import org.example.hexlet.dto.UsersPage
@param UsersPage page

@template.layout.page(

    content = @`
    <h1><a href="${org.example.hexlet.NamedRoutes.usersPath()}">Пользователи:</a></h1>
@if(page.getUsers().isEmpty())
    <p>Пока не добавлено ни одного пользователя</p>
@else
    @for(var user : page.getUsers())
        <ul>
            <a href="users/${user.getId()}">
                <li>${user.getId()} ${user.getFirstName()} ${user.getLastName()}</li>
            </a>
        </ul>
    @endfor
@endif

`
)