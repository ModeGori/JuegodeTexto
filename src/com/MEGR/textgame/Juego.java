package com.MEGR.textgame;

import java.util.Scanner;
import java.util.Random;

public class Juego extends Variables {
	
	Random rand = new Random ();
	static boolean mapborder = false;
	static int Dias = 0;
	
	public static void main(String args[]){
		
		Mapa mainMap = new Mapa(10, 10);
		Jugador hero = new Jugador (mainMap);
		Main.start();
		
		boolean listo = false;
		while (!listo) { 
			
			Jugador.Movimiento();
			Dias += 1;
			System.out.println("Dia"+Dias+":");
			if (!mapborder) {
				Mapa.Ambiente();
			}
			
			mapborder = false;
				
			if (Jugador.getVida() <=0) { //Lista de las condiciones de fin del juego
			    listo = true;
			Main.endVida();
			}
			
			else if (Jugador.getHambre() <=0) {
			    listo = true;
			Main.endHambre();
			}
			
			else if (Jugador.getSed() <=0) {
			    listo = true;
			Main.endSed();
			}
			
			else if (Jugador.getEnergia() <=0) {
			    listo = true;
			Main.endEnergia();
			}
			
			else if (Jugador.getSaludMental() <=0) {
				listo = true;
			Main.endSaludMental();
			}
			
			else if (Jugador.victorycondition()) {
			    listo = true;
			Main.win();
			}
			
			
		}
	}
	
	@SuppressWarnings("static-access")
	public static void printmap(Jugador a, Mapa b) {                 //Muestra el mapa con el jugador
		b.mapArray[a.y][a.x] = "*";
		for (int i = 0; i < b.mapArray.length; i++){
			
			System.out.print("|");
			
			for (int j = 0; j < b.mapArray[i].length; j++){
				System.out.print(b.mapArray[i][j]);
				System.out.print("  ");
			}
			
			System.out.println("|\n");
		}
	}
	
	public static int returnDias () {
		return Dias;
	}
	
	public static void aldea () {
		int temp = (int)(Math.random()*100);
		
		if (temp < 20) {
			
			Jugador.incrementarHambre(10);
			Jugador.incrementarVida(10);
			Jugador.incrementarSed(10);
			Jugador.incrementarEnergia(10);
			Jugador.incrementarSaludMental(20);
			
			System.out.println("\nEncuentras uan idea llena de personas.");
			System.out.println("Apenas llegas a la aldea y caminas por la calle principal todos te comienzan a observar, algo asi como si fueras un heroe.");
			System.out.println("Un hombre, que dice que es el alcalde se acerca a ti y dice: "+ Nombre +", no?");
			System.out.println("Porque no te quedas en la taverna y tomas una descanso? La casa invita. Continua tu travesia mañana.");
			System.out.println("");
			System.out.println("Dormiste como un bebe. Tu energia es "+Jugador.getEnergia()+".");
			System.out.println("El desayuno fue increible. Estas lleno. Tu hambre es "+Jugador.getHambre()+"y tu sed es:"+Jugador.getSed()+", y tu salud mental es: "+Jugador.getSaludMental()+".");
			
		} else if (temp < 40) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirSaludMental(20);
			Jugador.incrementarEnergia(10);
			
			System.out.println("\nLlegas a una aldea abandonada,y solo veias a la lejanias los techos de las casas que rondaban la zona");
			System.out.println("pensaste que encontrarias un buen refugio y quizas algo para comer, pero todo era una ilusion.");
			System.out.println("Despues de inspeccionar algunas casas encuentras una que es apta para por lo menos pasar la noche.");
			System.out.println("Buscas comida pero no encuentras nada. La situacion aqui parece insolita y te preguntas que le habra pasado a todas las personas que vivian en esta aldea...");
			System.out.println("Nueva energia: "+Jugador.getEnergia()+"\nNueva salud mental: "+Jugador.getSaludMental()+"\nNuevo nivel de sed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 60) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(40);
			Jugador.reducirVida(10);
			
			System.out.println("\nEntras a una aldea y ves que esta cubierta de niebla. Decides entrar a ver que es lo que esta sucediendo...");
			System.out.println("Un hombre se te acerca deseando saber desde donde vienes.");
			System.out.println("De repente algo se aproxima montado en un caballo, un hombre con una calabza en fuego como cabeza, toma su espada y le arranca la cabeza al hombre que hablaba contigo y en el proceso te hiere a ti tambien.");
			System.out.println("Corres lleno de miedo y huyes lo mas lejos posible.");
			System.out.println("Pierdes 10 de vida. Nueva vida: "+Jugador.getVida()+".");
			System.out.println("Nueva energia: "+Jugador.getEnergia()+"\nNuevo nivel de salud mental: "+Jugador.getSaludMental()+"\nNuevo nivel de sed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 80) {
			
			System.out.println("\nEncuentras una ida llena de Orcos. Estan comiendo jabali asado y tu tienes muuuucha hambre.");
			System.out.println("Que vas a hacer?");
			System.out.println("1. Tratar de robar el jabali asado y huir de los Orcos");
			System.out.println("2. El riesgo no lo vale");
			
			boolean corr = true;
			while (corr) {
			
				@SuppressWarnings("resource")
				Scanner temp2 = new Scanner(System.in);
				String b = temp2.next().toLowerCase();
				
			if (b.equals("1")){
			
				corr = false;
				Jugador.reducirEnergia(20);
				Jugador.reducirVida(40);
				Jugador.reducirSed(10);
				Jugador.reducirHambre(10);
				Jugador.reducirSaludMental(10);
									
				System.out.println("\nComo todo un idiota corres a la aldea, tomas el jabali asado y tratas de huir.");
				System.out.println("Tratando de escapar un Orco te agarra desde la cabeza y el jabali cae en el suelo.");
				System.out.println("Logras escapar de pura suerte, pero un Orco dispara una flecha y te la clava en la espalda y sales muy mal herido.");
				System.out.println("Perdiste 40 de vida. Tu nuevo nivel de vida es: "+Jugador.getVida()+".");
				System.out.println("Tu hambre baja a: "+Jugador.getHambre()+" tu sed, tu energia y tu salud mental bajan tambien a: "+Jugador.getSed()+" , "+Jugador.getEnergia()+", "+Jugador.getSaludMental()+" respectivamente.");
			
			} else if (b.equals("2")){
				
				corr = false;
				Jugador.reducirEnergia(10);
				Jugador.reducirHambre(10);
				Jugador.reducirSed(10);
									
				System.out.println("\nEvitas problemas y continuas tu camino. Sientes que HICISTE lo correcto");
				System.out.println("Nueva energia: "+Jugador.getEnergia()+"\nNueva salud mental: "+Jugador.getSaludMental()+"\nNuevo nivel de sed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
				
			} else {
				System.out.println("\nPor favor responde con '1' o '2'.");
			}		
			}
			
		} else if (temp < 100){
			
			System.out.println("\nEncuentras una aldea en el medio de un valle. Que haces?");
			System.out.println("1. Te adentras a investigar.");
			System.out.println("2. Continuas tu viaje.");
			
			
			boolean corr = true;
			while (corr) {
			
				@SuppressWarnings("resource")
				Scanner temp2 = new Scanner(System.in);
				String b = temp2.next().toLowerCase();
				
			if (b.equals("1")){
			
				corr = false;
				Jugador.reducirEnergia(10);
				Jugador.reducirVida(30);
				Jugador.reducirHambre(10);
			    Jugador.reducirSed(10);
				Jugador.reducirSaludMental(10);
									
				System.out.println("\nJusto al llegar a la aldea cae una avalancha gigantesca desde las montañas y destruye toda la aldea y sus alrededores.");
				System.out.println("Milagrosamente sobrevivos al desastre pero quedas gravemente herido.");
				System.out.println("Pierdes 30 de vida. Nuevo nivel de vida: "+Jugador.getVida()+".");
				System.out.println("Tu hambre, tu sed, tu salud mental y tu energia decaen: "+Jugador.getHambre()+", "+Jugador.getSed()+", "+Jugador.getSaludMental()+", "+Jugador.getEnergia()+".");
			
			} else if (b.equals("2")){
				
				corr = false;
				Jugador.reducirEnergia(10);
				Jugador.reducirHambre(10);
				Jugador.reducirSed(10);
									
				System.out.println("\nDecides continuar.");
				System.out.println("DEspues de un tiempo escuchas una explosion a lo lejos y te subes en la copa de un arbol a investigar.");
				System.out.println("Te das cuenta que la aldea que acabas de ignorar ha sido enterrada en una avalancha gigantesca que surgio en la montañas de los alrededores!");
				System.out.println("Si hubieras pensado diferente, probablemente estarias muerto. Felicitaciones!");
				System.out.println("Nueva energia: "+Jugador.getEnergia()+"\nNueva salud mental: "+Jugador.getSaludMental()+"\nNuevo nivel de agua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
				
			} else {
				System.out.println("\nPor favor responde con '1' o '2'.");
			}		
			}
		}	
}
	
	public static void bosque () {
	}
	
	public static void rio () {
	}
	
	public static void cueva () {
	}
	
	public static void castillo () {
	}
	
	public static void llanura () {
	}
	
	public static void montaña () {
	}
	
	public static void pantano () {
	}
	
	public static void cripta () {
	}
	
	public static void campo () {
	}
	
	}
