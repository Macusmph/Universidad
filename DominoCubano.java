import java.util.Scanner;
public class DominoCubano {
    
    public static Scanner sc = new Scanner(System.in);
    public static int ronda = 12;
    
    public static void main(String[] args) {
        //preparar juego ……………………………………………………………………………………………………………………………………………………
        String [] rondas = new String[15];
        for (int i = 0; i <= 12; i++) {
            rondas[i]=" ronda "+(12-i)+" |";
        }
        rondas [14]=" Total";
        int game = menu1();
        int num_jugadores = 0;
            if (game == 1 || game == 2){
                num_jugadores = 5;
            }

            else if (game == 3){
                System.out.println("¿Cuántos jugadores serán?");
                num_jugadores = sc.nextInt();
            }
            
            String [] jugadores = new String [num_jugadores];
            
            if (game == 1){
                jugadores [0]="Anaid";
                jugadores [1]="Diana";
                jugadores [2]="Astrid";
                jugadores [3]="Heriberto";
                jugadores [4]="Marco";
            }
            else if (game == 2 || game == 3){
                for (int i = 0; i < jugadores.length; i++) {
                    jugadores [i] = "jugador"+(i+1);
                }
            }
            
            int[][]puntos = new int[num_jugadores][rondas.length];
            int[]total = new int[num_jugadores];
            //preparar juego ……………………………………………………………………………………………………………………………………………………
            
            int decision = 0;
        while (ronda>=0 && decision!=4){
            tabla(jugadores, rondas, puntos, total); // se imprime la tablita
            System.out.println("…………………………………………………………………………………………………………………………………………");
            decision = menuPrincipal(); // se imprime el menú principal
            switch (decision) {
                case 1:
                    puntos = nuevaRonda(jugadores,puntos);
                    ronda = ronda - 1;
                    break;
                case 2:
                    puntos = cambiarPuntaje(jugadores,puntos);
                    break;
                case 3:
                    jugadores = cambiarNombre(jugadores);
                    break;
            }
       }
        tabla(jugadores, rondas, puntos, total);
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        System.out.println("");
        
        ganador(jugadores,total);
        
        System.out.println("¡Felicidades!");
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println("End");//que imprima quién ganó
    }//main
    
    public static int menu1(){
        System.out.println("DOMINÓ CUBANO");
        System.out.println("////////////////////////////////////////////");
        System.out.println("1) Personalizado 1");
        System.out.println("2) Default (5 jugadores)");
        System.out.println("3) Default con otra cantidad de jugadores");
        System.out.println("////////////////////////////////////////////");
        return sc.nextInt();
    }//menu1
    
    public static int menuPrincipal(){
        System.out.println("1) Siguiente ronda");
        System.out.println("2) Cambiar puntaje");
        System.out.println("3) Cambiar nombre de jugador");
        System.out.println("4) Salir");
        return sc.nextInt();
    }//menuPrincipal
    
    public static void tabla(String[] j,String[] r,int[][]p, int[] tot){
        // ................................................................
        int biggest = j[0].length();
        int x = 12-ronda;
        
        for (int i = 1; i < j.length; i++) {
            if (j[i].length()<=j[i-1].length()) {
                biggest = j[i-1].length();
            }
        }
        // ................................................................ definir biggest
        for (int i = 0; i < tot.length; i++) {
                tot[i]=0;
        }
        for (int i = 0; i < tot.length; i++) {
            for (int k = 0; k < p[0].length; k++) {
                tot[i]+=p[i][k];
            }
        }
        int tam = biggest;
        for (int i = 0; i < x; i++) {
            tam+=r[i].length();
        }
        tam+=r[11].length()+2;
                for (int i = 0; i < tam; i++) {
                    System.out.print("=");
                }
                System.out.println("");

                for (int i = 0; i < biggest+2; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < x; i++) {
                    System.out.print(r[i]);
                }
                System.out.print(r[r.length-1]);
                System.out.println("");
                for (int i = 0; i < tam; i++) {
                    System.out.print("-");
                }
                System.out.println("");
                for (int i = 0; i < j.length; i++) {
                    System.out.print(j[i]);
                    for (int k = 0; k < biggest-j[i].length(); k++) {
                        System.out.print(" ");
                    }
                    System.out.print(": ");
                    for (int k = 0; k < x; k++) {
                        //tot[i]+=p[i][k];
                        System.out.print(p[i][k]);
                        for (int l = 0; l < r[k].length()-(""+p[i][k]).length()-1; l++) {
                            System.out.print(" ");
                        }
                        System.out.print("|");
                    }
                    System.out.print(tot[i]);
                    System.out.println("");
                }
    }//tabla
    
    public static int[][] nuevaRonda(String[] j,int[][]p){
        System.out.println("---PUNTOS---RONDA "+ronda);
        for (int i = 0; i < j.length; i++) {
            System.out.print(j[i]+": ");
            p[i][12-ronda]=sc.nextInt();
        }
        return p;
    } // nueva ronda
    
    public static int[][] cambiarPuntaje(String[] jug,int[][]punt){
        System.out.println("¿De qué jugador desea cambiar el puntaje?");
        for (int i = 0; i < jug.length; i++) {
            System.out.println((i+1)+" "+jug[i]);
        }
        int jugador = sc.nextInt()-1;
        System.out.println("¿De qué ronda desea cambiar el puntaje?");
        int rond = 12-sc.nextInt();
        System.out.println("Introduzca el nuevo puntaje:");
        punt[jugador][rond] = sc.nextInt();
        return punt;
    }
    
    public static String [] cambiarNombre(String[] j){
        System.out.println("¿De qué jugador quiere cambiar el nombre?");
        for (int i = 0; i < j.length; i++) {
            System.out.println((i+1)+") "+j[i]);
        }
        int jugador_a_cambiar = sc.nextInt();
        System.out.println("Nuevo nombre:");
        j[jugador_a_cambiar-1] = sc.next();
        return j;
    }//cambiar nombre
    
    public static void ganador(String[]jugadores,int[]tot){
       int ganador = 0;
       int numero_de_ganadores = 1;
       boolean [] array_ganadores = new boolean[jugadores.length];
       String gano_o_ganaron="Ganó:";
       
       for(int i=0;i<tot.length;i++){
                if(tot[i]<tot[ganador]){
                    ganador = i;
                }
        }
       
       array_ganadores[ganador]=true;
       
        for (int i = 0; i<tot.length; i++) {
            if(i!=ganador && tot[ganador]==tot[i]){
                    numero_de_ganadores++;
                    array_ganadores[i]=true;
                }
       }
        
        if (numero_de_ganadores!=1) {
            gano_o_ganaron="Ganaron:";
        }
        
        System.out.print(" ");
        System.out.println("");
        System.out.println(gano_o_ganaron);
        System.out.println("");
        
        for (int i = 0; i < jugadores.length; i++) {
            if (array_ganadores[i]==true) {
                System.out.println(jugadores[i]);
            }
        }
        System.out.println("");
    }//ganador
    
}//public class
