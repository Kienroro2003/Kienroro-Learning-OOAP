package chapter_05_part_1;

import chapter_05_part_1.abstracts.Instrument;

public class Guitar extends Instrument {

    public Guitar() {
    }

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec);
    }
}
