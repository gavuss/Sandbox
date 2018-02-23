package gavus.addressbook.model.user;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public class UserBuilder implements IUser {

    private String login;
    private String password;

    public UserBuilder setLogin(String login) {
        this.login = login;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
