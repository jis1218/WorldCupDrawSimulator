import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Simulator {
    public static void main(String[] args) {

        //Port Distribution
        List<PortContainer> portContainers = Arrays.stream(Port.values()).map(
                PortContainer::new
        ).collect(Collectors.toList());

        Groups groups = new Groups();

        //A TO H round robin

        portContainers.get(0).getNations().remove(Nation.QATAR);
        groups.putQatarIntoGroupA();

        for(PortContainer portContainer : portContainers) {
            while(portContainer.isNationRemain()) {
                Nation nation = portContainer.popNation();
                groups.putNationIntoGroup(nation);
            }
        }

        groups.printGroups();

    }
}
