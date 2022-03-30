import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Simulator {
    public static void main(String[] args) {

        //Port Distribution
        List<PortContainer> portContainers = Arrays.stream(Port.values()).map(
                PortContainer::new
        ).collect(Collectors.toList());

    }
}
