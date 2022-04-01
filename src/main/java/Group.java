import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Group {
    private GroupName groupName;
    private List<Nation> nations;
    private int europeNumber;

    public Group(GroupName groupName) {
        this.groupName = groupName;
        this.nations = new ArrayList<>();
        this.europeNumber = 0;
    }

    public boolean putNationIntoGroup(Nation nation) {
        if(!validatePutPossible(nation)) {
            return false;
        }

        if(nation.getContinent().equals(Continent.EUROPE)) {
            this.europeNumber++;
        }

        this.nations.add(nation);
        return true;
    }

    private boolean validatePutPossible(Nation nation) {
        if (nations.size() != nation.getPortNumber()-1) {
            return false;
        }
        for (Nation occupiedNation : nations) {

            if(nation.getContinent() == Continent.EUROPE && europeNumber<2) {
                return true;
            }

            if(occupiedNation.isSameContinent(nation)) {
                return false;
            }
        }

        return true;
    }

    public void printGroup() {
        String nationStringList = this.nations.stream().map(Objects::toString).collect(Collectors.joining(", "));
        System.out.println("Group " + groupName + " : " + nationStringList);
    }
}