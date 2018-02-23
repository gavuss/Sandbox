package gavus.addressbook.model.group;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public class GroupBuilder implements IGroup {

    private String groupName;
    private String groupHeader;
    private String groupFooter;


    public GroupBuilder setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public GroupBuilder setGroupHeader(String groupHeader) {
        this.groupHeader = groupHeader;
        return this;
    }

    public GroupBuilder setGroupFooter(String groupFooter) {
        this.groupFooter = groupFooter;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupHeader() {
        return groupHeader;
    }

    public String getGroupFooter() {
        return groupFooter;
    }
}
