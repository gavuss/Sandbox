package gavus.addressbook.tests.contact;

import gavus.BaseTest;
import gavus.addressbook.app_manager.ContactHelper;
import gavus.addressbook.model.contact.IContact;
import org.junit.Test;

import static gavus.addressbook.app_manager.navigation.NavigationHelper.Items.addNew;
import static gavus.addressbook.model.contact.Contact.ALEKSANDR_SILAEV;
import static gavus.addressbook.model.user.User.ADMIN;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public class Create extends BaseTest {

    @Test
    public void createUser() {
        app.getSessionHelper().authorization(ADMIN);
        app.getNavigationHelper().openMenuItem(addNew);
        createContact(ALEKSANDR_SILAEV);
    }

    private void createContact(IContact contact) {
        ContactHelper form = app.getContactHelper();
        form.fillFirstName(contact);
        form.fillLastName(contact);
        form.fillNickName(contact);
        form.fillGroup(contact);
        form.submit();
    }
}
