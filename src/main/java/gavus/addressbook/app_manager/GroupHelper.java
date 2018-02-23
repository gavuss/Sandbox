package gavus.addressbook.app_manager;

import gavus.addressbook.model.group.IGroup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    public void fillCreateGroupForm(IGroup groupData) {
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

    public void chooseGroupByName(IGroup group) {
        click(By.cssSelector("input[title='Select (" + group.getGroupName() + ")']"));
    }

    public void chooseGroupByNameAndIndex(IGroup group, int index) {
        click(By.cssSelector("input[title='Select (" + group.getGroupName() + ")']:nth-of-type(" + index + ")"));
    }

    public void chooseAllGroupByName(IGroup group) {
        List<WebElement> elements = driver.findElements(By.cssSelector("input[title='Select (" + group.getGroupName() + ")']"));
        for (WebElement element : elements) {
            element.click();
        }
    }

    public void updateGroup() {
        click(By.name("update"));
    }

    public void initChangeGroup() {
        click(By.xpath("(//input[@name='edit'])[1]"));
    }

    public int getGroupCount() {
        List<WebElement> groups = driver.findElements(By.cssSelector(".group"));
        return groups.size();
    }

    public List<String> getGroupList() {
        List<String> groups = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector(".group"));
        for (WebElement element : elements) {
            String name = element.getText();
            groups.add(name);
        }
        return groups;
    }
}
