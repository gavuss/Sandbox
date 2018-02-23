package gavus.addressbook.model.user;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public enum User implements IUser {

    ADMIN(new UserBuilder()
            .setLogin("admin")
            .setPassword("secret"));

    private UserBuilder userBuilder;

    User(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public String getLogin() {
        return userBuilder.getLogin();
    }

    public String getPassword() {
        return userBuilder.getPassword();
    }
}
