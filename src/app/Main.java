package app;

public class Main {
    public static void main(String[] args) {
        getOutput(getColor(getData()));

    }

    private static TrafficLights getData() {
         return TrafficLights.RED;
       // return TrafficLights.YELLOW;
        // return TrafficLights.GREEN;

    }

    private static String getColor(TrafficLights color) {

        return switch (color) {
            case RED, YELLOW, GREEN -> color.getLight();
        };

    }

    private static void getOutput(String output) {
        System.out.println(output);
    }


}
