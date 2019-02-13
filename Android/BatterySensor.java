public class BatterySensor extends Sensor{
    public int maxCapacity;
    public int currentCapacity;
    public int stepsToDecrease1;
    public int minCapacity;
    public int initialCapacity;

    public BatterySensor(int maxCapacity, int minCapacity, int initialCapacity, int stepsToDecrease1){
        this.maxCapacity=maxCapacity;
        this.minCapacity=minCapacity;
        this.initialCapacity=initialCapacity;
        this.stepsToDecrease1=stepsToDecrease1;
        this.currentCapacity=initialCapacity;
    }

    public void dininishCapacity(){
        currentCapacity--;
    }
    public void recharge(){
        currentCapacity=maxCapacity;
    }
    public boolean checkup(){
        return currentCapacity>=minCapacity;
    }
    public String displayStatus(){
        return super.displayStatus()+"\nCurrent capacity: "+currentCapacity;//with "super.", you call parent class
    }
    public void addStep(){
        super.addStep();
        if(steps%stepsToDecrease1==0){
            dininishCapacity();
        }
    }
}