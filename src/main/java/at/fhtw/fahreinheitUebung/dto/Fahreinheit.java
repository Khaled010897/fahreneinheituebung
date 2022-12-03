package at.fhtw.fahreinheitUebung.dto;

public class Fahreinheit {
    private double convert = 0;

    public double getConvert() {return convert;}

    public void fahreinheitberechnen(double zahl) { convert = ((zahl - 32) * 5/9); }

}

