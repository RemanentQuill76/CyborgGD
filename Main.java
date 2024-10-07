/**
 * This program defines and displays the
 * features given by each Cyborg upgrade.
 * 
 * Date Last Modified: 10/7/2024
 * 
 * @author Max Burgdorf, Tyler Ormstad,
 *         Gregor Baird
 *         CS1131, Fall 2024
 *         Lab Section L01
 */
public class Main {
  public static void main(String[] args) {
    Cyborg basicCyborg = new Cyborg("Basic-01", "CyborgCorp");
    Cyborg visionCyborg = new EnhancedVisionCyborg("VisionX", "OptiTech", "Night Vision");
    Cyborg strongCyborg = new SuperStrengthCyborg("StrengthX", "OptiTech", "Increased Durability", "Heavy Lifting");

    basicCyborg.displayInfo();
    basicCyborg.performTask();

    visionCyborg.displayInfo();
    visionCyborg.performTask();

    strongCyborg.displayInfo();
    strongCyborg.performTask();
  }
}
