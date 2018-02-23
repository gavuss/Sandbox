package gavus.addressbook.app_manager;

import gavus.addressbook.model.group.Group;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aleksander on 18.08.2016.
 */
public class GroupHelper extends BaseHelper {

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void saveGroupCreation() {
        click(By.name("submit"));
    }

    public void fillCreateGroupForm(Group groupData) {
        enter(By.name("group_name"), groupData.getGroupName());
        enter(By.name("group_header"), groupData.getGroupHeader());
        enter(By.name("group_footer"), groupData.getGroupFooter());
    }

    public void openCreationGroupPage() {
        click(By.name("new"));
    }

    public void deleteGroup() {
        click(By.name("delete"));
    }

    public void selectGroupByName(Group group) {
        click(By.cssSelector("input[title='Select (" + group.getGroupName() + ")']"));
    }

    public void selectGroupByName(String name) {
        click(By.cssSelector("input[title='Select (" + name + ")']"));
    }

    public void updateGroup() {
        click(By.name("update"));
    }

    public void initChangeGroup() {
        click(By.xpath("(//input[@name='edit'])[1]"));
    }
}
