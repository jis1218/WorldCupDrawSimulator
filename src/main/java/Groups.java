import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Groups {

    List<Group> groups = new ArrayList<>();

    public Groups() {
        Arrays.stream(GroupName.values()).forEach(
            groupName -> groups.add(new Group(groupName))
        );
    }

    public void putQatarIntoGroupA() {
        Group groupA = groups.get(0);
        groupA.putNationIntoGroup(Nation.QATAR);
    }

    public void putNationIntoGroup(Nation nation, Port port) {
        for (int i = 0; i < groups.size(); i++) {
            Group group = groups.get(i);

//            for(int j = i; j < groups.size(); j++) {
//                port
//            }

            if (group.putNationIntoGroup(nation)) {
                break;
            }
        }
    }


    public void printGroups() {
        this.groups.forEach(group -> group.printGroup());
    }
}
