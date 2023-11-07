package chapter_05_part_1;

import chapter_05_part_1.abstracts.Instrument;
import chapter_05_part_1.abstracts.InstrumentSpec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List inventory;

    public Inventory() {
        inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec guitarSpec) {
            instrument = new Guitar(serialNumber, price, guitarSpec);
        } else if (spec instanceof MandolinSpec mandolinSpec) {
            instrument = new Mandolin(serialNumber, price, mandolinSpec);
        }
        this.inventory.add(instrument);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarSpec = (GuitarSpec) guitar.getSpec();
            if (!guitarSpec.matches(searchSpec)) continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

    public List search(MandolinSpec searchSpec) {
        List matchingMandolins = new LinkedList();
        for (Iterator i = inventory.iterator(); i.hasNext(); ) {
            Mandolin guitar = (Mandolin) i.next();
            MandolinSpec guitarSpec = (MandolinSpec) guitar.getSpec();
            if (!guitarSpec.matches(searchSpec)) continue;
            matchingMandolins.add(guitar);
        }
        return matchingMandolins;
    }
}
