package gavus.addressbook.tests.group;

import gavus.addressbook.model.group.Group;
import org.junit.Test;
import gavus.BaseTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.List;

import static gavus.addressbook.model.group.Group.DEVELOPERS;
import static gavus.addressbook.model.group.Group.GROUP_WITHOT_HEADER;
import static gavus.addressbook.model.group.Group.TESTERS;
import static gavus.addressbook.model.user.User.ADMIN;

/**
 * Created by Aleksander on 17.08.2016.
 */
@RunWith(value = Parameterized.class)
public class CreateGroup extends BaseTest {

    private Group group;

    public CreateGroup(Group group) {
        this.group = group;
    }

    @Parameters()
    public static List<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {TESTERS}, {DEVELOPERS}, {GROUP_WITHOT_HEADER}
        });
    }

    @Test
    public void testGroupCreation() {
        app.getSessionHelper().authorization(ADMIN);
        app.getNavigationHelper().openGroupPage();
        app.getGroupHelper().openCreationGroupPage();
        app.getGroupHelper().fillCreateGroupForm(group);
        app.getGroupHelper().saveGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }
}