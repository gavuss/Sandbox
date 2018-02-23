package gavus.addressbook.tests.group;

import gavus.BaseTest;
import gavus.addressbook.model.group.IGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static gavus.addressbook.app_manager.navigation.NavigationHelper.Items.groups;
import static gavus.addressbook.model.group.Group.TESTERS;
import static gavus.addressbook.model.user.User.ADMIN;

/**
 * Created by Aleksander on 18.08.2016.
 */
@RunWith(value = Parameterized.class)
public class DeleteGroup extends BaseTest {

    private IGroup group;

    public DeleteGroup(IGroup group) {
        this.group = group;
    }

    @Parameters()
    public static List<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {TESTERS}
        });
    }

    @Test
    public void deleteGroupTest() {
        app.getSessionHelper().authorization(ADMIN);
        app.getNavigationHelper().openMenuItem(groups);
        app.getGroupHelper().chooseAllGroupByName(group);
        app.getGroupHelper().deleteGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
