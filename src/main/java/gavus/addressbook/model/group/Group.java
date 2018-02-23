package gavus.addressbook.model.group;

/**
 * Created by Alexander Silaev on 23.02.2018.
 */
public enum Group implements IGroup {

    TESTERS(new GroupBuilder()
            .setGroupName("testers")
            .setGroupHeader("testersHeaders")
            .setGroupFooter("testersFooter")),

    GROUP_WITHOT_HEADER(new GroupBuilder()
            .setGroupName("testers")
            .setGroupHeader("#NULL")
            .setGroupFooter("testersFooter")),

    JAVA_DEVELOPERS(new GroupBuilder()
            .setGroupName("javaDeveloper")
            .setGroupHeader("javaDeveloperHeaders")
            .setGroupFooter("javaDeveloperFooter")),

    DEVELOPERS(new GroupBuilder()
            .setGroupName("developers")
            .setGroupHeader("developersHeaders")
            .setGroupFooter("developersFooter"));

    private GroupBuilder groupBuilder;

    Group(GroupBuilder groupBuilder) {
        this.groupBuilder = groupBuilder;
    }

    public String getGroupName() {
        return groupBuilder.getGroupName();
    }

    public String getGroupHeader() {
        return groupBuilder.getGroupHeader();
    }

    public String getGroupFooter() {
        return groupBuilder.getGroupFooter();
    }

}
