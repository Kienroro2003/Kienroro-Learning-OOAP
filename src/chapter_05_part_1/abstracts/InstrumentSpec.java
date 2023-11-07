package chapter_05_part_1.abstracts;

import chapter_05_part_1.enumeration.Builder;
import chapter_05_part_1.enumeration.Type;
import chapter_05_part_1.enumeration.Wood;

public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec otherSpec){
        if (this.getBuilder() != otherSpec.getBuilder()) {
            return false;
        }
        String model = otherSpec.getModel().toLowerCase();
        if (!model.equals("") && !model.equals(this.getModel().toLowerCase())) {
            return false;
        }
        if (otherSpec.getType() != this.getType())
            return false;
        if (otherSpec.getBackWood() != this.getBackWood())
            return false;
        if (otherSpec.getTopWood() != this.getTopWood())
            return false;
        return true;
    }
}
