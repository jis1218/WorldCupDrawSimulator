import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public enum Nation {
    QATAR(Continent.ASIA, Port.ONE),
    BRAZIL(Continent.SOUTH_AMERICA, Port.ONE),
    BELGIUM(Continent.EUROPE, Port.ONE),
    FRANCE(Continent.EUROPE, Port.ONE),
    ARGENTINA(Continent.SOUTH_AMERICA, Port.ONE),
    ENGLAND(Continent.EUROPE, Port.ONE),
    SPAIN(Continent.EUROPE, Port.ONE),
    PORTUGAL(Continent.EUROPE, Port.ONE),
    NETHERLANDS(Continent.EUROPE, Port.TWO),
    DENMARK(Continent.EUROPE, Port.TWO),
    USA(Continent.NORTH_AMERICA, Port.TWO),
    GERMANY(Continent.EUROPE, Port.TWO),
    MEXICO(Continent.NORTH_AMERICA, Port.TWO),
    SWISS(Continent.EUROPE, Port.TWO),
    URUGUAY(Continent.SOUTH_AMERICA, Port.TWO),
    CROATIA(Continent.EUROPE, Port.TWO),
    SENEGAL(Continent.AFRICA, Port.THREE),
    IRAN(Continent.ASIA, Port.THREE),
    JAPAN(Continent.ASIA, Port.THREE),
    MOROCCO(Continent.AFRICA, Port.THREE),
    SERBIA(Continent.EUROPE, Port.THREE),
    POLAND(Continent.EUROPE, Port.THREE),
    KOREA(Continent.ASIA, Port.THREE),
    TUNISIA(Continent.AFRICA, Port.THREE),
    CANADA(Continent.NORTH_AMERICA, Port.FOUR),
    CAMEROON(Continent.AFRICA, Port.FOUR),
    ECUADOR(Continent.SOUTH_AMERICA, Port.FOUR),
    SAUDI_ARABIA(Continent.ASIA, Port.FOUR),
    GHANA(Continent.AFRICA, Port.FOUR),
    EUROPE_PLAYOFF(Continent.EUROPE, Port.FOUR),
    ASIA_SA_PLAYOFF(Continent.ASIA_SA, Port.FOUR),
    OCE_NA_PLAYOFF(Continent.OCE_NA, Port.FOUR);

    private Continent continent;
    private Port port;

    Nation(Continent continent, Port port) {
        this.continent = continent;
        this.port = port;
    }

    public Continent getContinent() {
        return continent;
    }

    public Port getPort() {
        return this.port;
    }

    public int getPortNumber() {
        return this.port.getPortNumber();
    }

    public boolean isSamePort(Port port) {
        return this.port == port;
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
        AtomicInteger nationsPerPort = new AtomicInteger(values().length / Port.values().length);

        return Arrays.stream(Port.values()).allMatch(
                port1 -> nationsPerPort.get() == (int) Arrays.stream(Nation.values())
                        .filter(nation -> nation.port == port1).count()
        );
    }
}
