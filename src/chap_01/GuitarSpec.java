package chap_01;

public class GuitarSpec {
    private Builder builder;
    private String model;
    private Type type;
    private int numStrings;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
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

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec otherSpec){
        if (this.getBuilder() != otherSpec.getBuilder()) {
            return false;
        }

        String model = otherSpec.getModel().toLowerCase();
        if (model != null && !model.equals("") && !model.equals(this.getModel().toLowerCase())) {
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