public class Android{
    public int steps, x, y;
    public String orientation;
    private Sensor[] sensors;
    public Android(){
        orientation="north";
        sensors=new Sensor[2];
        sensors[0]=new BatterySensor(100,0,100,3);
        sensors[1]=new TemperatureSensor(50,21,5);            
    }
    public void move(int x, int y){
        int deltaX, deltaY;
        deltaX=x-this.x;
        deltaY=y-this.y;

        if(deltaX>0)
            while(orientation.equals("east")==false)
                turnClockwise();
        else
            while(orientation.equals("west")==false)
                turnCounterClockwise();
        walk(Math.abs(deltaX));
        if(deltaY>0)
            while(orientation.equals("north")==false)
                turnClockwise();
        else
            while(orientation.equals("south")==false)
                turnCounterClockwise();
        walk(Math.abs(deltaY));
        
    }
    public void walk(int steps){
        for(int i=0;i<steps;i++){
            this.steps++;
            switch(orientation){
                case "north":y++;break;
                case "east":x++;break;
                case "south":x--;break;
                case "west":x--;break;
            }
            for(int j=0;j<sensors.length;j++){
                sensors[j].addStep();
            if(sensors[j].checkup()==false) break;
            }
        }
    }
    public void turnClockwise(){
        switch(orientation){
            case "north": orientation="east"; break;
            case "east": orientation="south"; break;
            case "south": orientation="west"; break;
            case "west": orientation="north"; break;

        }
    }
    public void turnCounterClockwise(){
        switch(orientation){
            case "north": orientation="west"; break;
            case "west": orientation="south"; break;
            case "south": orientation="east"; break;
            case "east": orientation="north"; break;

        }
    }
    public String displayEverything(){
        return sensors[0].displayStatus()+"\n"+sensors[1].displayStatus();
    }
}