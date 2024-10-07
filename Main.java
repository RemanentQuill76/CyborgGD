public class Main {
  public static void main(String[] args) {
    Cyborg basicCyborg = new Cyborg("Basic-01", "CyborgCorp");
    Cyborg visionCyborg = new EnhancedVisionCyborg("VisionX", "OptiTech", "Night Vision");
    Cyborg strongCyborg = new SuperStrengthCyborg("StrengthX", "OptiTech", "Increased Durability", "Heavy Lifting");

    basicCyborg.displayInfo();
    basicCyborg.performTask();

    visionCyborg.displayInfo();
    visionCyborg.performTask();
    visionCyborg.displayInfo();
    visionCyborg.performTask();

    strongCyborg.displayInfo();
    strongCyborg.performTask();
  }
}
