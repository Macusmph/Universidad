import java.util.Scanner;
public class Loan_system{
    public static Scanner s=new Scanner(System.in);

    public static void main(String[]args){
        Person[] clients=new Person[12];
        Bicycle[] bikes=new Bicycle[10];
        Loan[] loans=new Loan[bikes.length];
        int decision;
            do{
                decision=printOptions();
                switch(decision){
                    case 1: loans=registerLoan(loans,clients,bikes);
                    break;
                }
            }while(decision!=5);
    }

    public static int printOptions(){
        System.out.println("=================");
        System.out.println("LOAN SYSTEM");
        System.out.println("-----------------");
        System.out.println("Loans");
        System.out.println("1) Register loan");
        System.out.println("2) Show loans");
        System.out.println("-----------------");
        System.out.println("Clients");
        System.out.println("3) Register client");
        System.out.println("4) Show clients information");
        System.out.println("-----------------");
        System.out.println("5) QUIT");
        System.out.println("=================");
        return s.nextInt();
    }

    public static Loan[] registerLoan(Loan[]l,Person[]p,Bicycle[]b){
        System.out.println("Number of loan (1-10): ");
        int loan=s.nextInt()-1;
        System.out.println("Person id (1-12): ");
        l[loan].person=p[s.nextInt()-1];
        System.out.println("Bicycle serial: ");
        int serial=s.nextInt();
        for(int i=0;i<=b.length;i++){
            if(i==b.length){
                System.out.println("This serial isn't registered, please try another");
                serial=s.nextInt();
                i=0;
            }
            if(serial==b[i].serial){
                l[loan].bicycle=b[i];
                break;
            }
        }
        System.out.println("Date of the loan(dd/mm/yyyy): ");
        l[loan].date_of_loan=s.nextLine();
        System.out.println("Time of the loan(hh:mm):");
        l[loan].time_of_loan=s.nextLine();
        System.out.println("Date of return(dd/mm/yyyy): ");
        l[loan].date_of_return=s.nextLine();
        System.out.println("Time of return(hh:mm):");
        l[loan].time_of_return=s.nextLine();

        return l;
    }
}