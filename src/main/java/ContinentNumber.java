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
        if (continent.equals(Continent.EUROPE)) {
            europeNumber++;
        }
        if (continent.equals(Continent.AFRICA)) {
            africaNumber++;
        }
        if (continent.equals(Continent.ASIA) || continent.equals(Continent.ASIA_SA)) {
            asiaNumber++;
        }
        if (continent.equals(Continent.NORTH_AMERICA) || continent.equals(Continent.OCE_NA)) {
            northAmericaNumber++;
        }
        if (continent.equals(Continent.SOUTH_AMERICA) || continent.equals(Continent.ASIA_SA)) {
            southAmericaNumber++;
        }
        if (continent.equals(Continent.OCEANIA) || continent.equals(Continent.OCE_NA)) {
            oceaniaNumber++;
        }
    }

    public void numberDecrease(Continent continent) {
        if (continent.equals(Continent.EUROPE)) {
            europeNumber--;
        }
        if (continent.equals(Continent.AFRICA)) {
            africaNumber--;
        }
        if (continent.equals(Continent.ASIA) || continent.equals(Continent.ASIA_SA)) {
            asiaNumber--;
        }
        if (continent.equals(Continent.NORTH_AMERICA) || continent.equals(Continent.OCE_NA)) {
            northAmericaNumber--;
        }
        if (continent.equals(Continent.SOUTH_AMERICA) || continent.equals(Continent.ASIA_SA)) {
            southAmericaNumber--;
        }
        if (continent.equals(Continent.OCEANIA) || continent.equals(Continent.OCE_NA)) {
            oceaniaNumber--;
        }
    }

    public boolean validate(Continent continent) {
        if (continent.equals(Continent.EUROPE)) {
            return europeNumber > 0;
        }
        if (continent.equals(Continent.AFRICA)) {
            return africaNumber > 0;
        }
        if (continent.equals(Continent.ASIA)) {
            return asiaNumber > 0;
        }
        if (continent.equals(Continent.NORTH_AMERICA)) {
            return northAmericaNumber > 0;
        }
        if (continent.equals(Continent.SOUTH_AMERICA)) {
            return southAmericaNumber > 0;
        }
        if (continent.equals(Continent.OCEANIA)) {
            return oceaniaNumber > 0;
        }
        if (continent.equals(Continent.ASIA_SA)) {
            return asiaNumber > 0 && southAmericaNumber > 0;
        }
        if (continent.equals(Continent.OCE_NA)) {
            return oceaniaNumber > 0 && northAmericaNumber > 0;
        }

        return false;
    }

    public ContinentNumber plusContinentNumber(ContinentNumber continentNumber) {
        return new ContinentNumber(
            this.europeNumber + continentNumber.getEuropeNumber(),
            this.africaNumber + continentNumber.getAfricaNumber(),
            this.asiaNumber + continentNumber.getAsiaNumber(),
            this.northAmericaNumber + continentNumber.getNorthAmericaNumber(),
            this.southAmericaNumber + continentNumber.getSouthAmericaNumber(),
            this.oceaniaNumber + continentNumber.getOceaniaNumber()
        );
    }

    public boolean compare(ContinentNumber continentNumber) {
        return this.oceaniaNumber >= continentNumber.getOceaniaNumber() &&
            this.europeNumber >= continentNumber.getEuropeNumber() &&
            this.africaNumber >= continentNumber.getAfricaNumber() &&
            this.asiaNumber >= continentNumber.getAsiaNumber() &&
            this.southAmericaNumber >= continentNumber.getSouthAmericaNumber() &&
            this.northAmericaNumber >= continentNumber.getNorthAmericaNumber();

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
