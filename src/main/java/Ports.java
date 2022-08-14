import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ports {

    private List<Port> ports;

    public Ports() {
        //Port Distribution
        this.ports = Arrays.stream(PortNumber.values()).map(
            Port::new
        ).collect(Collectors.toList());
    }

    public Port getPort(PortNumber portNumber) {
        return ports.get(portNumber.getPortNumber() - 1);
    }


}
