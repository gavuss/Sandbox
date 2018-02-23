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
import static gavus.addressbook.model.group.Group.JAVA_DEVELOPERS;
import static gavus.addressbook.model.user.User.ADMIN;

@RunWith(value = Parameterized.class)
public class EditGroup extends BaseTest {

//    private IGroup group;
//
//    public EditGroup(IGroup group) {
//        this.group = group;
//    }
//
//    @Parameters()
//    public static List<Object[]> dataForTest() {
//        return Arrays.asList(new Object[][]{
//                {JAVA_DEVELOPERS},
//        });
//    }

    @Test
    public void editGroupTest() {
        app.getSessionHelper().authorization(ADMIN);
        app.getNavigationHelper().openMenuItem(groups);
        app.getGroupHelper().chooseGroupByName(JAVA_DEVELOPERS);
        app.getGroupHelper().initChangeGroup();
        app.getGroupHelper().fillCreateGroupForm(JAVA_DEVELOPERS);
        app.getGroupHelper().updateGroup();
        app.getGroupHelper().returnToGroupPage();
    }
}
