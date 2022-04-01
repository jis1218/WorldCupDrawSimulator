import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Groups {
    Map<GroupName, Group> groups = new HashMap<>();

    public Groups() {
        Arrays.stream(GroupName.values()).forEach(
                groupName -> groups.put(groupName, new Group(groupName))
        );
    }

    public void putQatarIntoGroupA() {
        Group groupA = groups.get(GroupName.A);
        groupA.putNationIntoGroup(Nation.QATAR);
    }

    public void putNationIntoGroup(Nation nation) {
        for(GroupName groupName : GroupName.values()) {
            Group group = groups.get(groupName);

            if(group.putNationIntoGroup(nation)) {
                break;
            }
        }
    }

    public void printGroups() {
        this.groups.keySet().stream().sorted().forEach(
                groupName -> this.groups.get(groupName).printGroup()
        );
    }
}
