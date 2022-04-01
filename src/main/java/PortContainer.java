import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class PortContainer {
    private Port port;
    private List<Nation> nations;
    private Random random = new Random();

    public PortContainer(Port port) {
        this.port = port;
        nations = Arrays.stream(Nation.values())
                .filter(
                        nation -> nation.isSamePort(port)
                ).collect(Collectors.toList());
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
}
