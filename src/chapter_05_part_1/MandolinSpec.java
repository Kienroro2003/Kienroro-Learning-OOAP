package chapter_05_part_1;

import chapter_05_part_1.abstracts.InstrumentSpec;
import chapter_05_part_1.enumeration.Builder;
import chapter_05_part_1.enumeration.Style;
import chapter_05_part_1.enumeration.Type;
import chapter_05_part_1.enumeration.Wood;

public class MandolinSpec extends InstrumentSpec {
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Style style, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) return false;
        if (!(otherSpec instanceof MandolinSpec)) return false;
        MandolinSpec spec = (MandolinSpec) otherSpec;
        if (this.style != spec.style) return false;
        return true;
    }
}
