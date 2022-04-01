public enum Port {
    ONE(1), TWO(2), THREE(3), FOUR(4);

    private int portNumber;

    Port(int portNumber) {
        this.portNumber = portNumber;
    }

    public int getPortNumber() {
        return portNumber;
    }
}