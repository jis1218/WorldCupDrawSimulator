import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public enum Nation {
    QATAR(Continent.ASIA, PortNumber.ONE),
    BRAZIL(Continent.SOUTH_AMERICA, PortNumber.ONE),
    BELGIUM(Continent.EUROPE, PortNumber.ONE),
    FRANCE(Continent.EUROPE, PortNumber.ONE),
    ARGENTINA(Continent.SOUTH_AMERICA, PortNumber.ONE),
    ENGLAND(Continent.EUROPE, PortNumber.ONE),
    SPAIN(Continent.EUROPE, PortNumber.ONE),
    PORTUGAL(Continent.EUROPE, PortNumber.ONE),
    NETHERLANDS(Continent.EUROPE, PortNumber.TWO),
    DENMARK(Continent.EUROPE, PortNumber.TWO),
    USA(Continent.NORTH_AMERICA, PortNumber.TWO),
    GERMANY(Continent.EUROPE, PortNumber.TWO),
    MEXICO(Continent.NORTH_AMERICA, PortNumber.TWO),
    SWISS(Continent.EUROPE, PortNumber.TWO),
    URUGUAY(Continent.SOUTH_AMERICA, PortNumber.TWO),
    CROATIA(Continent.EUROPE, PortNumber.TWO),
    SENEGAL(Continent.AFRICA, PortNumber.THREE),
    IRAN(Continent.ASIA, PortNumber.THREE),
    JAPAN(Continent.ASIA, PortNumber.THREE),
    MOROCCO(Continent.AFRICA, PortNumber.THREE),
    SERBIA(Continent.EUROPE, PortNumber.THREE),
    POLAND(Continent.EUROPE, PortNumber.THREE),
    KOREA(Continent.ASIA, PortNumber.THREE),
    TUNISIA(Continent.AFRICA, PortNumber.THREE),
    CANADA(Continent.NORTH_AMERICA, PortNumber.FOUR),
    CAMEROON(Continent.AFRICA, PortNumber.FOUR),
    ECUADOR(Continent.SOUTH_AMERICA, PortNumber.FOUR),
    SAUDI_ARABIA(Continent.ASIA, PortNumber.FOUR),
    GHANA(Continent.AFRICA, PortNumber.FOUR),
    EUROPE_PLAYOFF(Continent.EUROPE, PortNumber.FOUR),
    ASIA_SA_PLAYOFF(Continent.ASIA_SA, PortNumber.FOUR),
    OCE_NA_PLAYOFF(Continent.OCE_NA, PortNumber.FOUR);

    private Continent continent;
    private PortNumber portNumber;

    Nation(Continent continent, PortNumber portNumber) {
        this.continent = continent;
        this.portNumber = portNumber;
    }

    public Continent getContinent() {
        return continent;
    }

    public PortNumber getPort() {
        return this.portNumber;
    }

    public int getPortNumber() {
        return this.portNumber.getPortNumber();
    }

    public boolean isSamePort(PortNumber portNumber) {
        return this.portNumber == portNumber;
    }

    public boolean isSameContinent(Nation nation) {
        if(
                (this.continent == Continent.ASIA && nation.getContinent() == Continent.ASIA_SA)
                || (this.continent == Continent.SOUTH_AMERICA && nation.getContinent() == Continent.ASIA_SA)
                || (this.continent == Continent.NORTH_AMERICA && nation.getContinent() == Continent.OCE_NA)
        ) {
            return true;
        }
        return this.continent == nation.getContinent();
    }

    public boolean isEurope(Nation nation) {
        return this.continent == Continent.EUROPE;
    }

    public static boolean validatePort() {
        AtomicInteger nationsPerPort = new AtomicInteger(values().length / PortNumber.values().length);

        return Arrays.stream(PortNumber.values()).allMatch(
                portNumber1 -> nationsPerPort.get() == (int) Arrays.stream(Nation.values())
                        .filter(nation -> nation.portNumber == portNumber1).count()
        );
    }
}
