package chapter_05_part_1;

import chapter_05_part_1.abstracts.InstrumentSpec;
import chapter_05_part_1.enumeration.Builder;
import chapter_05_part_1.enumeration.Type;
import chapter_05_part_1.enumeration.Wood;

public class GuitarSpec  extends InstrumentSpec {

    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood topWood, Wood backWood) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if(!super.matches(otherSpec))return false;
        if(!(otherSpec instanceof GuitarSpec))return false;
        GuitarSpec spec = (GuitarSpec) otherSpec;
        if(this.numStrings != spec.numStrings)return false;
        return true;
    }
}