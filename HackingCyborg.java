public class HackingCyborg extends Cyborg {
  private String hackType;

  public HackingCyborg(String model, String manufacturer, String stuxNet) {
    super(model, manufacturer);
    this.hackType = hackType;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Hacking Type: " + hackType);
  }

  @Override
  public void performTask() {
    System.out.println(model + " is using " + hackType +
        " to perform a task.");
  }

}
