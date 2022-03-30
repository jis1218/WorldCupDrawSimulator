import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PortContainer {
    private Port port;
    private List<Nation> nations;

    public PortContainer(Port port) {
        this.port = port;
        nations = Arrays.stream(Nation.values())
                .filter(
                        nation -> nation.isSamePort(port)
                ).collect(Collectors.toList());
    }
}
