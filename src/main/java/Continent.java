import java.util.Arrays;

public enum Continent {
    ASIA(0), NORTH_AMERICA(0), SOUTH_AMERICA(0),
    AFRICA(0), EUROPE(0), OCEANIA(0), ASIA_SA(0), OCE_NA(0);

    private int count;

    Continent(int count) {
        this.count = count;
    }

    void increaseCount(Continent continent) {
        for (Continent thisContinent : values()) {
            if(thisContinent.equals(continent)) {
                thisContinent.plusOne();
            }
        }
    }

    void plusOne() {
        this.count += 1;
    }

    void printCount() {
        for (Continent value : values()) {
            System.out.println(value.toString() + " = " + value.count);
        }
    }
}
