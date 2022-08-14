import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Group {
    private GroupName groupName;
    private List<Nation> nations;
    private ContinentNumber continentNumber;

    public Group(GroupName groupName) {
        this.groupName = groupName;
        this.nations = new ArrayList<>();
        this.continentNumber = new ContinentNumber(2, 1, 1, 1, 1, 1);
    }

    public boolean putNationIntoGroup(Nation nation) {
        if(!validatePutPossible(nation)) {
            return false;
        }

        continentNumber.numberDecrease(nation.getContinent());

        this.nations.add(nation);
        return true;
    }

    public boolean validatePutPossible(Nation nation) {
        if (nations.size() != nation.getPortNumber()-1) {
            return false;
        }

        return continentNumber.validate(nation.getContinent());
    }

    public void printGroup() {
        String nationStringList = this.nations.stream().map(Objects::toString).collect(Collectors.joining(", "));
        System.out.println("Group " + groupName + " : " + nationStringList + " (" + this.nations.size() + ")");
    }

    public ContinentNumber getContinentNumber() {
        return this.continentNumber;
    }

    public int getGroupNumber() {
        return this.groupName.number;
    }
}