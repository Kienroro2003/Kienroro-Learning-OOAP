package chapter_05_part_1.abstracts;

import chapter_05_part_1.GuitarSpec;

public abstract class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec spec;

    public Instrument() {
    }

    public Instrument(String serialNumber, double price, InstrumentSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public double getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public InstrumentSpec getSpec() {
        return spec;
    }
}
