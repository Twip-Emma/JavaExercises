package data;

public class UserRole {
    private String level;
    private double counts;

    public UserRole(int pay) {
        if (pay < 200) {
            level = "normal";
            counts = 1;
        } else if (pay < 400) {
            level = "iron";
            counts = 0.9;
        } else if (pay < 800) {
            level = "silver";
            counts = 0.8;
        } else {
            level = "gold";
            counts = 0.6;
        }
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getCounts() {
        return counts;
    }

    @Override
    public String toString() {
        return "level: " + level + ";counts: " + counts;
    }
}
