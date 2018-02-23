package gavus.addressbook.model.contact;

import gavus.addressbook.model.group.Group;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public interface IContact {

    String getFirstName();

    String getLastName();

    Group getGroup();

    String getNickName();
}
