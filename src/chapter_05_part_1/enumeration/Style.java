package chapter_05_part_1.enumeration;

public enum Style {
    A, F;

    @Override
    public String toString() {
        return switch (this) {
            case A -> "A";
            case F -> "F";
            default -> "";
        };
    }
}
