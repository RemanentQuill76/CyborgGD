public class Main {
<<<<<<< HEAD
  public static void main(String[] args) {
    Cyborg basicCyborg = new Cyborg("Basic-01", "CyborgCorp");
    Cyborg visionCyborg = new EnhancedVisionCyborg("VisionX", "OptiTech", "Night Vision");
=======
    public static void main(String[] args) {
        Cyborg basicCyborg = new Cyborg("Basic-01", "CyborgCorp");
        Cyborg visionCyborg = new EnhancedVisionCyborg("VisionX", "OptiTech", "Night Vision");
        Cyborg strongCyborg = new SuperStrengthCyborg("StrengthX", "OptiTech", "Increased Durability", "Heavy Lifting");
>>>>>>> 349845b272103a47ef0ae52a04368d9b481c03b6

    basicCyborg.displayInfo();
    basicCyborg.performTask();

    System.out.println();

<<<<<<< HEAD
    visionCyborg.displayInfo();
    visionCyborg.performTask();
  }
=======
        visionCyborg.displayInfo();

        visionCyborg.performTask();

        strongCyborg.displayInfo();
        strongCyborg.performTask();
    }
>>>>>>> 349845b272103a47ef0ae52a04368d9b481c03b6
}
