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
import static gavus.addressbook.model.group.Group.TESTERS;
import static gavus.addressbook.model.user.User.ADMIN;

/**
 * Created by Aleksander on 18.08.2016.
 */
@RunWith(value = Parameterized.class)
public class DeleteGroup extends BaseTest {

    private Group group;

    public DeleteGroup(Group group) {
        this.group = group;
    }

    @Parameters()
    public static List<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {TESTERS}, {DEVELOPERS}
        });
    }

    @Test
    public void deleteGroupTest() {
        app.getSessionHelper().authorization(ADMIN);
        app.getNavigationHelper().openGroupPage();
        app.getGroupHelper().selectGroupByName(group);
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
