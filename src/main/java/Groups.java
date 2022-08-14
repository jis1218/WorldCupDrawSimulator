import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Groups {

    List<Group> groups = new ArrayList<>();
    boolean isGroupDraw[];

    public Groups() {
        Arrays.stream(GroupName.values()).forEach(
            groupName -> groups.add(new Group(groupName))
        );
        isGroupDraw = new boolean[groups.size()];
    }

    public void putQatarIntoGroupA() {
        Group groupA = groups.get(0);
        groupA.putNationIntoGroup(Nation.QATAR);
    }

    public ContinentNumber getAllContinentNumber() {
        ContinentNumber continentNumber = new ContinentNumber();
        for (Group group : groups) {
            continentNumber.plusContinentNumber(group.getContinentNumber());
        }

        return continentNumber;
    }


    public void printGroups() {
        this.groups.forEach(group -> group.printGroup());
    }
}
