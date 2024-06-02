@import org.example.hexlet.dto.MainPage
@param MainPage page


@template.layout.page (
    content = @`
    @if(page.getCurrentUser() != null)
        <h3>
        Добро пожаловать, ${page.getCurrentUser()}.
        Чтобы разлогиниться, удалите куку JSESSIONID из браузера
        </h3>

    @else
        <h3>вы не зарегестрированы</h3>
    @endif
`
)