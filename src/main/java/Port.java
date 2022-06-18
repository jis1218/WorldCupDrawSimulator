import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Port {
    private PortNumber portNumber;
    private List<Nation> nations;
    private Random random = new Random();
    private ContinentNumber continentNumber;

    public Port(PortNumber portNumber) {
        this.portNumber = portNumber;
        this.continentNumber = new ContinentNumber();
        nations = Arrays.stream(Nation.values())
                .filter(
                        nation -> nation.isSamePort(portNumber)
                ).collect(Collectors.toList());

        nations.forEach(nation -> this.continentNumber.numberIncrease(nation.getContinent()));
    }

    public List<Nation> getNations() {
        return nations;
    }

    public Nation popNation() {
        int number = random.nextInt(this.nations.size());

        return this.nations.remove(number);
    }

    public boolean isNationRemain() {
        return !this.nations.isEmpty();
    }

    public void printContinentCount() {
        this.continentNumber.printNumber();
    }

    public void validateGroup(Group group) {
    }
}
