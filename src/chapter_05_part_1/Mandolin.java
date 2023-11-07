package chapter_05_part_1;

import chapter_05_part_1.abstracts.Instrument;

public class Mandolin extends Instrument {

    public Mandolin() {
    }

    public Mandolin(String serialNumber, double price, MandolinSpec spec) {
        super(serialNumber, price, spec);
    }
}
