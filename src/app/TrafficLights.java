package app;

public enum TrafficLights {
    RED("STOP!"),
    YELLOW("PREPARE!"),
    GREEN("GO!");
    private final String light;

    TrafficLights(String light) {
        this.light = light;
    }

    public String getLight() {
        return this.light;
    }
}
