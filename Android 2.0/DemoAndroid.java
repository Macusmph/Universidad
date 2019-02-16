import java.util.Scanner;
public class DemoAndroid{
    public static Scanner sc=new Scanner(System.in);
    private static int x;
    private static int y;
    public static void main(String[]args){
        Android c3po=new Android();
        System.out.println("***********"+"\nInitial Status:\n"+c3po.displayEverything()+"\n_______________");
        while(c3po.sensorsState[0]==true&&c3po.sensorsState[1]==true){
            System.out.println("Give me the final x coordinate: ");
            x=sc.nextInt();
            System.out.println("Give me the final y coordinate: ");
            y=sc.nextInt();
            c3po.move(x,y);
            System.out.println(c3po.displayEverything());
        }
    }
}