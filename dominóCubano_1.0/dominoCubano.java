import java.util.Scanner;

class dominoCubano{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		/*System.out.println("¿Cuántos jugadores van a jugar? (Máximo 6)");
		int jugadores=sc.nextInt();
		
		if (jugadores>6 && jugadores<2)
			{System.out.println("Lo sentimos, solo se pueden de 2 a 6 jugadores :(");}

		else
		{
			while (int i=2;( i<=(jugadores*2) )&&( i%2==0;i++) )
				{
				int jug = 1;
				System.out.println("Nombre el jugador "+jug+":");
				String jugador=sc.nextstring();
				jug++;
				}

			if (i==3)
				{String jugador1=jugador;}
				else if (i==5)
				{String jugador2=jugador;}
				else if (i==7)
				{String jugador3=jugador;}
				else if (i==9)
				{String jugador4=jugador;}
				else if (i==11)
				{String jugador5=jugador;}
				else if (i==13)
				{String jugador6=jugador;}
		}
		*/ 

		int heriberto=0;
		int anaid=0;
		int diana=0;
		int astrid=0;
		int marco=0;

		for (int i=12;i>=0 ;i--) {
		System.out.println("---------------------------");
		System.out.println("Ronda: "+i);

		//System.out.println("Para regresar presiona B");


		System.out.println("=================");
		System.out.println("Puntos:");
		System.out.println("=================");

		System.out.println("Anaid: ");
		anaid=sc.nextInt()+anaid;
		System.out.println("Diana: ");
		diana=sc.nextInt()+diana;
		System.out.println("Astrid: ");
		astrid=sc.nextInt()+astrid;
		System.out.println("Heriberto: ");
		heriberto=sc.nextInt()+heriberto;
		System.out.println("Marco: ");
		marco=sc.nextInt()+marco;

		System.out.println("Anaid lleva "+anaid+" puntos");
		System.out.println("Diana lleva "+diana+" puntos ");
		System.out.println("Astrid lleva "+astrid+" puntos");
		System.out.println("Heriberto lleva "+heriberto+" puntos ");
		System.out.println("Marco lleva "+marco+" puntos ");
		}

		if (anaid<heriberto && anaid<diana && anaid<marco && anaid<astrid)
		{
			System.out.println("¡Anaid ganó!");
		}

		else if (heriberto<anaid && heriberto<diana && heriberto<marco && heriberto<astrid)
		{
			System.out.println("¡Heriberto ganó!");
		}

		else if (diana<anaid && diana<heriberto && diana<marco && diana<astrid)
		{
			System.out.println("¡Diana ganó!");
		}

		else if (astrid<anaid && astrid<heriberto && astrid<marco && astrid<diana)
		{
			System.out.println("¡Astrid ganó!");
		}

		else if (marco<anaid && marco<heriberto && marco<astrid && marco<diana)
		{
			System.out.println("¡Marco ganó!");
		}

		else
		{
			System.out.println("Hay más de un ganador.");
		}
		/*System.out.println("Cuántos jugadores: ");
		num= sc.nextInt();*/

	}
}