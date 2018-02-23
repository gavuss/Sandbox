package gavus.addressbook.model.contact;

import gavus.addressbook.model.group.Group;

import static gavus.addressbook.model.group.Group.TESTERS;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public enum Contact implements IContact {

    ALEKSANDR_SILAEV(new ContactBuilder()
            .setFirstName("Aleksandr")
            .setLastName("Silaev")
            .setNickName("gavus")
            .setGroup(TESTERS)
    );

    private ContactBuilder contactBuilder;

    Contact(ContactBuilder contactBuilder) {
        this.contactBuilder = contactBuilder;
    }

    public String getFirstName() {
        return contactBuilder.getFirstName();
    }

    public String getLastName() {
        return contactBuilder.getLastName();
    }

    public Group getGroup() {
        return contactBuilder.getGroup();
    }

    public String getNickName() {
        return contactBuilder.getNickName();
    }
}
