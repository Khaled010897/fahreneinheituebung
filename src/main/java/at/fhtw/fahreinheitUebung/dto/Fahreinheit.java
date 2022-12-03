package at.fhtw.fahreinheitUebung.dto;

public class Fahreinheit {
    private double zahl = 0;

    public double getConvert() {return zahl;}

    public static double fahreinheitberechnen(double zahl) { zahl = ((zahl - 32) * 5/9);
        return zahl;
    }

}

