import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Simulator {
    public static void main(String[] args) {

        //Port Distribution
        List<Port> ports = Arrays.stream(PortNumber.values()).map(
                Port::new
        ).collect(Collectors.toList());

        Groups groups = new Groups();

        ports.get(1).printContinentCount();

        //A TO H round robin

        //카타르를 A조에 넣고 1번 포트 컨테이너에서 제외
        groups.putQatarIntoGroupA();
        ports.get(0).getNations().remove(Nation.QATAR);

        for(Port port : ports) {
            while(port.isNationRemain()) {
                Nation nation = port.popNation();
                groups.putNationIntoGroup(nation, port);
            }
        }

        groups.printGroups();

    }
}
