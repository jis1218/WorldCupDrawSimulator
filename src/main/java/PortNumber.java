public enum PortNumber {
    ONE(1), TWO(2), THREE(3), FOUR(4);

    private int portNumber;

    PortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public int getPortNumber() {
        return portNumber;
    }
}