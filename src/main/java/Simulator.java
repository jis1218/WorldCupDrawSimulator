import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Simulator {

    public static void main(String[] args) {

        //Port Distribution
        List<Port> ports = Arrays.stream(PortNumber.values()).map(
            Port::new
        ).collect(Collectors.toList());

        List<Group> groups = Arrays.stream(GroupName.values()).map(
            Group::new
        ).collect(Collectors.toList());

        ports.get(1).printContinentCount();

        //A TO H round robin

        //카타르를 A조에 넣고 1번 포트 컨테이너에서 제외
//        groups.get(0).putNationIntoGroup(Nation.QATAR);
//        ports.get(0).getNations().remove(Nation.QATAR);

        for (Port port : ports) {
            boolean []isOccupied = new boolean[groups.size()];
            while (port.isNationRemain()) {
                Nation nation = port.popNation();
                port.minusContinentNumber(nation);
                if(PortNumber.FOUR == port.getPortNumber()) {
                    System.out.println(nation.toString());
                }
                for (int groupNumber = 0; groupNumber < groups.size(); groupNumber++) {
                    Group group = groups.get(groupNumber);

                    if (!isOccupied[groupNumber]) {
                        isOccupied[groupNumber] = true;
                        ContinentNumber remainContinentNumber = getRemainContinentNumber(isOccupied, groups);
                        System.out.println("remain");
                        remainContinentNumber.printNumber();
                        System.out.println("port");
                        port.getContinentNumber().printNumber();
                        if (group.validatePutPossible(nation) && remainContinentNumber.compare(port.getContinentNumber())) {
                            group.putNationIntoGroup(nation);
                            groups.forEach(group1 -> group1.printGroup());
                            break;
                        }
                        groups.forEach(group2 -> group2.printGroup());
                        isOccupied[groupNumber] = false;
                    }
                }

            }
        }



    }

    public static ContinentNumber getRemainContinentNumber(boolean isOccupied[], List<Group> groups) {
        ContinentNumber remainContinentNumber = new ContinentNumber();
        for (Group group : groups) {
            if (!isOccupied[group.getGroupNumber()]) {
                remainContinentNumber = remainContinentNumber.plusContinentNumber(group.getContinentNumber());
            }
        }

        return remainContinentNumber;
    }
}
