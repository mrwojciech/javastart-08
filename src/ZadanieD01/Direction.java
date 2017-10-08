package ZadanieD01;

public enum Direction {
    NORTH("Północ"), SOUTH("Południe"), EAST("Wschód"), WEST("Zachód");

    private final String directionName;

    private Direction(String directionName) {
        this.directionName = directionName;
    }

    public String getDirectionName() {

        return directionName;
    }


    public static String convert(int i) {

        if (i == Direction.NORTH.ordinal()) {
            return Direction.NORTH.name();
        }
        if (i == Direction.SOUTH.ordinal()) {
            return Direction.SOUTH.name();
        }
        if (i == Direction.EAST.ordinal()) {
            return Direction.EAST.name();
        }
        if (i == Direction.WEST.ordinal()) {
            return Direction.WEST.name();
        }

        return "UNDEFINIED";
    }
}
