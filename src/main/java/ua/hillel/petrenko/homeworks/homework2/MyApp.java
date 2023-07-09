package ua.hillel.petrenko.homeworks.homework2;

public class MyApp {
    public static void main(String[] args) {

        double latitude = 41.403706;
        double longitude = 2.173504;
        char specSymbol = '\u00B0';

        byte lat1 = 41;
        byte lat2 = 24;
        float lat3 = 13.3416f;
        char lat4 = 'N';

        byte long1 = 2;
        byte long2 = 10;
        float long3 = 24.6144f;
        char long4 = 'E';

        System.out.println("Нижче представлені координати розташування Храма Святого Сімейства (Саграда Фамілія).");
        System.out.println("Широта: " + latitude + ", " + "довгота: " + longitude + ";");
        System.out.println("DMS Lat: " + lat1 + specSymbol + " " + lat2 + "' " + lat3 + "'' " + lat4 + "\n" +
                           "DMS Long: " + long1 + specSymbol + " " + long2 + "' " + long3 + "'' " + long4);
    }
}
