public class Droid{

    String name;
    int batteryLevel;
    
    //constructor
    public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
    }
    //method
    public String toString(){
      return "Hi! my name is " + name ;
    }

    public void energyReport(){
        System.out.println( "energy report: my battery life is: " + batteryLevel + "%");
    }

    public void performtask(String task){
    System.out.println(name + " is performing a task: " + task);
    batteryLevel -= 10;

    }

    //Main
    public static void main(String[] args){
    Droid R2D2 = new Droid("R2D2");
    System.out.println(R2D2);
    R2D2.performtask("chill");
    R2D2.energyReport();
    }
  }