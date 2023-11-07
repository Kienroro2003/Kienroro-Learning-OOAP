package chapter_05_part_1.enumeration;

public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch (this) {
            case ACOUSTIC -> {
                return "acoustic";
            }
            case ELECTRIC -> {
                return "electric";
            }
            default -> {
                return "";
            }
        }
    }
}
