package views.learning;

public class SkillView {

    public void display(String id, String name, int level, int hours) {
        System.out.println("");
    }

    public void showLevel(int level, int hours) {
        System.out.println("\n=== Level ===");
        System.out.println("Level: " + level);
    }

    public void showProgress(int level, int hours) {
        System.out.println("\n=== Progress ===");
        System.out.println("Level: " + level + ", Hours: " + hours);
    }

    public void showMilestone() {

    }
}
