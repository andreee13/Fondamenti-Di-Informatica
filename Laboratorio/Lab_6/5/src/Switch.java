public class Switch {

    static boolean bulbStatus;
    private boolean switchStatus;

    public boolean getSwitchStatus() {
        return switchStatus;
    }

    public boolean isBulbOn() {
        return bulbStatus;
    }

    public void changeStatus() {
        switchStatus = !switchStatus;
        bulbStatus = !bulbStatus;
    }

    @Override
    public String toString() {
        return String.format("Switch: %s", switchStatus ? "up" : "down");
    }

}