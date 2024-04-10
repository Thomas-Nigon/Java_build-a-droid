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

    public void energyTransfer(){
      int missingBat = 100 - batteryLevel;
System.out.println(name + " is transfering energy from backupDroid");
System.out.println(name + " need " + missingBat +"% of battery");
batteryLevel += missingBat;
System.out.println(name + " is fully recharged");

    }

    public void performtask(String task){
    System.out.println(name + " is performing a task: " + task);
    batteryLevel -= 10;

    }

    //Main
    public static void main(String[] args){
    Droid R2D2 = new Droid("R2D2");
    Droid BackupBat = new Droid("BackupBat");
    System.out.println(R2D2);
    System.out.println(BackupBat);
    R2D2.performtask("chill");
    R2D2.energyReport();
    R2D2.energyTransfer();
    R2D2.energyReport();
    }
  }