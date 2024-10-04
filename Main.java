public class Main {
    public static void main(String[] args) {
        Cyborg basicCyborg = new Cyborg("Basic-01", "CyborgCorp");
        Cyborg visionCyborg = new EnhancedVisionCyborg("VisionX", "OptiTech", "Night Vision");

        basicCyborg.displayInfo();
        basicCyborg.performTask();

        System.out.println();

        visionCyborg.displayInfo();
        visionCyborg.performTask();
    }
}
