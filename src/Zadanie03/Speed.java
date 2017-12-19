package Zadanie03;

public enum Speed {
    SLOW(30), NORMAL(90), FAST(150);

    private final int speed;


    public int getSpeed() {
        return speed;
    }

    private Speed(int speed) {
        this.speed = speed;
    }

    public static Speed convertToEnum(int speed) {
        switch (speed) {
            case 30:
                return SLOW;
            case 90:
                return NORMAL;
            case 150:
                return FAST;
        }
        return null;
    }

}
