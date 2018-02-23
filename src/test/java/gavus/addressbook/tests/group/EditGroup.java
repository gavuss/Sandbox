package gavus.addressbook.tests.group;

import gavus.addressbook.model.group.Group;
import org.junit.Test;
import gavus.BaseTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.List;

import static gavus.addressbook.model.group.Group.JAVA_DEVELOPERS;
import static gavus.addressbook.model.user.User.ADMIN;

@RunWith(value = Parameterized.class)
public class EditGroup extends BaseTest {

    private Group group;

    public EditGroup(Group group) {
        this.group = group;
    }

    @Parameters()
    public static List<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {JAVA_DEVELOPERS},
        });
    }

    @Test
    public void editGroupTest() {
        app.getSessionHelper().authorization(ADMIN);
        app.getNavigationHelper().openGroupPage();
        app.getGroupHelper().selectGroupByName("developers");
        app.getGroupHelper().initChangeGroup();
        app.getGroupHelper().fillCreateGroupForm(group);
        app.getGroupHelper().updateGroup();
        app.getGroupHelper().returnToGroupPage();
    }
}
