
@import org.example.hexlet.dto.UsersPage
@param UsersPage page

@template.layout.page(

    content = @`
    <h1><a href="/users">Пользователи:</a>></h1>
@if(page.getUsers().isEmpty())
    <p>Пока не добавлено ни одного пользователя</p>
@else
    @for(var user : page.getUsers())
        <ul>
            <li>${user.getId()} ${user.getFirstName()} ${user.getLastName()}</li>
        </ul>
    @endfor
@endif

`
)