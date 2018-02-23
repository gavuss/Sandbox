package gavus.addressbook.model.contact;

import gavus.addressbook.model.group.Group;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public class ContactBuilder implements IContact {

    private String firstName;
    private String lastName;
    private Group group;
    private String nickName;

    public String getFirstName() {
        return firstName;
    }

    public ContactBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public ContactBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Group getGroup() {
        return group;
    }

    public ContactBuilder setGroup(Group group) {
        this.group = group;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public ContactBuilder setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
}
