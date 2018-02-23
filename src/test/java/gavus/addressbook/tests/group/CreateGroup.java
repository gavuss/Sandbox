package gavus.addressbook.tests.group;

import gavus.BaseTest;
import gavus.addressbook.model.group.IGroup;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static gavus.addressbook.app_manager.navigation.NavigationHelper.Items.groups;
import static gavus.addressbook.model.group.Group.*;
import static gavus.addressbook.model.user.User.ADMIN;

/**
 * Created by Aleksander on 17.08.2016.
 */
@RunWith(value = Parameterized.class)
public class CreateGroup extends BaseTest {

    private IGroup group;
    private int startGroupCount;

    public CreateGroup(IGroup group) {
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
        app.getNavigationHelper().openMenuItem(groups);
        startGroupCount = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().openCreationGroupPage();
        app.getGroupHelper().fillCreateGroupForm(group);
        app.getGroupHelper().saveGroupCreation();
        app.getGroupHelper().returnToGroupPage();
        assertGroupCount(startGroupCount + 1);
    }

    private void assertGroupCount(int expectedValue) {
        int actualValue = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(expectedValue, actualValue);
    }
}
