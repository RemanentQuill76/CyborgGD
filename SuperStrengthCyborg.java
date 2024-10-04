public class SuperStrengthCyborg extends Cyborg { 
    private String liftingType;
    private String durability;

    public SuperStrengthCyborg(String model, String manufacturer, String durability, String liftingType){
        super(model, manufacturer);
        this.liftingType = liftingType;
        this.durability = durability;
    }

    @Override 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Your durability level is: " + durability);
        System.out.println("Your lifing type is: " + liftingType);
    }

    @Override 
    public void performTask() {
        System.out.println(model + " is using " + liftingType + " to perform a task");
    }
    

}
