public class ContinentNumber {
    private int europeNumber;
    private int africaNumber;
    private int asiaNumber;
    private int northAmericaNumber;
    private int southAmericaNumber;
    private int oceaniaNumber;

    public ContinentNumber() {
    }

    public ContinentNumber(int europeNumber, int africaNumber, int asiaNumber, int northAmericaNumber, int southAmericaNumber, int oceaniaNumber) {
        this.europeNumber = europeNumber;
        this.africaNumber = africaNumber;
        this.asiaNumber = asiaNumber;
        this.northAmericaNumber = northAmericaNumber;
        this.southAmericaNumber = southAmericaNumber;
        this.oceaniaNumber = oceaniaNumber;
    }

    public void numberIncrease(Continent continent) {
        if(continent.equals(Continent.EUROPE)) {
            europeNumber++;
        }
        if(continent.equals(Continent.AFRICA)) {
            africaNumber++;
        }
        if(continent.equals(Continent.ASIA)) {
            asiaNumber++;
        }
        if(continent.equals(Continent.NORTH_AMERICA)) {
            northAmericaNumber++;
        }
        if(continent.equals(Continent.SOUTH_AMERICA)) {
            southAmericaNumber++;
        }
        if(continent.equals(Continent.OCEANIA)) {
            oceaniaNumber++;
        }
    }

    public void numberDecrease(Continent continent) {
        if(continent.equals(Continent.EUROPE)) {
            europeNumber--;
        }
        if(continent.equals(Continent.AFRICA)) {
            africaNumber--;
        }
        if(continent.equals(Continent.ASIA)) {
            asiaNumber--;
        }
        if(continent.equals(Continent.NORTH_AMERICA)) {
            northAmericaNumber--;
        }
        if(continent.equals(Continent.SOUTH_AMERICA)) {
            southAmericaNumber--;
        }
        if(continent.equals(Continent.OCEANIA)) {
            oceaniaNumber--;
        }
    }

    public void validate(ContinentNumber groupContinentNumber) {
    }

    public void printNumber() {
        System.out.println("europeNumber = " + europeNumber);
        System.out.println("africaNumber = " + africaNumber);
        System.out.println("asiaNumber = " + asiaNumber);
        System.out.println("northAmericaNumber = " + northAmericaNumber);
        System.out.println("southAmericaNumber = " + southAmericaNumber);
        System.out.println("oceaniaNumber = " + oceaniaNumber);
    }

    public int getEuropeNumber() {
        return europeNumber;
    }

    public int getAfricaNumber() {
        return africaNumber;
    }

    public int getAsiaNumber() {
        return asiaNumber;
    }

    public int getNorthAmericaNumber() {
        return northAmericaNumber;
    }

    public int getSouthAmericaNumber() {
        return southAmericaNumber;
    }

    public int getOceaniaNumber() {
        return oceaniaNumber;
    }
}
