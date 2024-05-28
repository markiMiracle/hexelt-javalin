@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.dto.BuildUserPage
@param BuildUserPage page


@template.layout.page (

    content = @`

    @if(page.getErrors() != null)
        <ul>
            @for(var validator: page.getErrors().values())
                @for(var error: validator)
                    <li>
                        <div class="alert alert-primary" role="alert">
                            ${error.getMessage()}
                        </div>
                    </li>
                @endfor
            @endfor
        </ul>
    @endif


    <form class="row g-3 needs-validation" action="/users" method="post">
        <div class="col-md-4">
            <label for="validationCustom01" class="form-label">First name</label>
            <input type="text" class="form-control" id="validationCustom01" value="${page.getFirstName()}" required name="firstName">
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="col-md-4">
            <label for="validationCustom02" class="form-label">Last name</label>
            <input type="text" class="form-control" id="validationCustom02" value="${page.getLastName()}" required name="lastName">
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="col-md-4">
            <label for="validationCustom02" class="form-label">Email</label>
            <input type="email" class="form-control" id="validationCustom02" value="${page.getEmail()}" required name="email">
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="col-md-4">
            <label for="validationCustom02" class="form-label">Password</label>
            <input type="password" class="form-control" id="validationCustom02" required name="password">
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="col-md-4">
            <label for="validationCustom02" class="form-label">Confirm Password</label>
            <input type="password" class="form-control" id="validationCustom02" value="${page.getEmail()}" required name="passwordConfirmation">
            <div class="valid-feedback">
                Looks good!
            </div>
        </div>
        <div class="col-12">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required>
                <label class="form-check-label" for="invalidCheck">
                    Agree to terms and conditions
                </label>
                <div class="invalid-feedback">
                    You must agree before submitting.
                </div>
            </div>
        </div>
        <div class="col-12">
            <button class="btn btn-primary" type="submit">Submit form</button>
        </div>
    </form>
`
)