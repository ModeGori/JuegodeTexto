package com.MEGR.textgame;

import java.util.Scanner;
import java.util.Random;

public class Juego extends Variables {
	
	Random rand = new Random ();
	static boolean mapborder = false;
	static int Dias = 0;
	
	public static void main(String args[]){
		

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
		double temp = Math.random()*100;
		if (temp < 20) {
			
			Jugador.incrementarHambre(10);
			Jugador.incrementarVida(10);
			Jugador.incrementarSed(10);
			Jugador.incrementarEnergia(10);
			Jugador.incrementarSaludMental(10);
			
			System.out.println("\nTe encuentras en un bosque fascinante.");
			System.out.println("Tomas cobijo debajo de un arbol gigante y consigues agua y algunas frutas.");
			System.out.println("Terminas pasando la noche en el bosque sin ningun problema. Te levantas y contiunas tu viaje!");
			System.out.println("Nueva energia: "+Jugador.getEnergia()+"\nNueva salud mental: "+Jugador.getSaludMental()+"\nNuevo nivel de sed y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
			
		} else if (temp < 40) {
			
			System.out.println("\nEncontraste unos hongos en el camino.");
			System.out.println("Que vas a hacer? 1. Te los comes\t2. Los ignoras.");
			
				
				boolean corr = true;
				while (corr) {
				
					@SuppressWarnings("resource")
					Scanner temp2 = new Scanner(System.in);
					String b = temp2.next().toLowerCase();
					
				if (b.equals("1")){
				
					corr = false;
					Jugador.reducirVida(10);
					Jugador.reducirSed(5);
					Jugador.reducirEnergia(10);
					Jugador.incrementarHambre(10);
										
					System.out.println("\nTe comes los hongos. Te sientes sastisfecho pero al pasar el tiempo un poco e comienza a doler el estomago.");
					System.out.println("Tu hambre es "+Jugador.getHambre()+" y tu vida se redujo a "+Jugador.getVida()+".");
				
				} else if (b.equals("2")){
					
					corr = false;
					Jugador.reducirHambre(10);
					Jugador.reducirSed(10);
					Jugador.reducirEnergia(10);
										
					System.out.println("\nLos ignoras y sigues tu camino.");
					System.out.println("Nueva energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nNivel de sed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
					
					
				} else {
					System.out.println("\nElije '1' o '2'.");
				}
				
			
		}
			
		} else if (temp < 60) {
			
			System.out.println("\nDespues de unas horas caminando en una colina empinada te encuentras un bosque completamente quemado, Probablemente un incendio le destrozo hace pocos dias.");
			System.out.println("No te puedes devolver, te tomaria un dia completo regresar al punto donde empezaste.");
			System.out.println("Decide. Tienes dos opciones:");
			System.out.println("1. Entrar al bosque quemado.");
			System.out.println("2. Rodear el perimetro, pero no entrar al bosque y perder mucho tiempo y energia.");
			
			boolean corr = true;
			
			while (corr) {
			
				@SuppressWarnings("resource")
				Scanner temp2 = new Scanner(System.in);
				String b = temp2.next().toLowerCase();
				
			if (b.equals("1")){
			
				corr = false;
				Jugador.reducirVida(10);
				Jugador.incrementarHambre(30);
				Jugador.reducirSed(10);
				Jugador.reducirEnergia(10);
				Jugador.reducirSaludMental(30);
									
				System.out.println("\nDecides cruzar el bosque por todo el medio, sientes que es la mejor decision.");
				System.out.println("Te tardas una hora caminando por nada mas que arboles muertos. Pero la diosa de la fortuna te sonrie:");
				System.out.println("En el viaje encuentras un reno muerto pero cocinado increiblemente y decides comertelo. Tu nuevo nivel de hambre es "+Jugador.getHambre()+".");
				System.out.println("Sin embargo tu vida se redujo por todo el humo que inhalaste estando en el bosque "+Jugador.getVida()+".");
				System.out.println("Tu salud mental se redujo a "+Jugador.getSaludMental()+".");
				
			} else if (b.equals("2")){
				
				corr = false;
				Jugador.reducirHambre(10);
				Jugador.reducirSed(10);
				Jugador.reducirEnergia(30);
				Jugador.incrementarSaludMental(10);
									
				System.out.println("\nDecides tomar el camino largo, rodeando el bosque en ves de entrar por el.");
				System.out.println("Despues de MUCHO tiempo logras atravesarlo. Desafortunadamente no encontraste comida o agua y gastaste demasiada energia.");
				System.out.println("Nueva energia: "+Jugador.getEnergia()+"\n:Tu salud mental "+Jugador.getSaludMental()+"\nNuevo nivel de sed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
				
			} else {
				System.out.println("\nResponde con '1' o '2'.");
			}
			}
		} else if (temp < 80) {
			
			Jugador.incrementarHambre(30);
			Jugador.incrementarVida(30);
			Jugador.incrementarSed(30);
			Jugador.incrementarEnergia(30);
			Jugador.incrementarSaludMental(30);
			
			System.out.println("\nDurante el amanecer sigues una luz brillante que miras por el horizonte.");
			System.out.println("Cuando llegas, te encuentras en un bosque majestuoso que emana una gran luz de color verde que se puede ver en todo el cielo estrellado.");
			System.out.println("No recuerdas nada al despertar, pero te encuentras en el otro lado del bosque... Que habra pasado?");
			System.out.println("Te sientes lleno en todos los aspectos. Agradeces tu suerte y continuas tu viaje.");
			System.out.println("Nueva vida y energia: "+Jugador.getVida()+", "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 100){
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nTe encuentras en medio de un bosque muy tenebroso.");
			System.out.println("La atmosfera es muy pesada, LOs arboles se ven como muertos vivientes y te comienzas a marear.");
			System.out.println("No encuentras ningun camino que te saque de aqui, comienzas a alucinar cosas y corres en panico.");
			System.out.println("LOgras escapar. Luego de unas horas comienzas a sentirte normal. Sigues en shock por las circunstancias en las que te encontraste.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		}
	}
	
	public static void rio () {
		double temp = Math.random()*100;
	
		if (temp < 20) {
		
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
			Jugador.reducirHambre(10);
			Jugador.incrementarSed(20);
		
		System.out.println("\nHay un rio que te bloquea el camino, decides caminar un poco mas y atraversalo con un puente natural que esta cerca.");
		System.out.println("En el proceso caes pero logras atravesarlo.");
		System.out.println("Pierdes salud mental y energia.\tSalud mental: "+Jugador.getSaludMental()+"\tEnergia: "+Jugador.getEnergia()+".");
		System.out.println("Bebes un poco de agua, Sed: "+Jugador.getSed()+".");
		
	} else if (temp < 40) {
		
		Jugador.incrementarHambre(10);
		Jugador.incrementarSed(10);
		Jugador.incrementarEnergia(10);
		
		System.out.println("\nEstas en un rio y decides atrapar algun pez.");
		System.out.println("Luego de un tiempo intentandolo, consigues un buen pez, lo cocinas, lo comes y te quedas a descansar. Te despiertas el dia siguiente.");
		System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
		
	} else if (temp < 60) {
		
		Jugador.incrementarHambre(20);
		Jugador.incrementarVida(30);
		Jugador.incrementarSed(20);
		Jugador.incrementarEnergia(30);
		Jugador.incrementarSaludMental(30);
		
		System.out.println("\nEncuentras una cascada y decidas inspeccionar la zona. Hay un lago cristalino donde tomas un poco de agua.");
		System.out.println("Detras de le cascada encuentras una pequeña cueva. De ella emana una fuerte luz que parece un arcoiris.");
		System.out.println("Dentro de la cueva encuentras un amueleto incustrado en un altar. Tomas el auleto y te sientes lleno de energia.");
		System.out.println("Al tomarlo el amuleto desaparece. Decides irte y continuar tu aventura.");
		System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
		
	} else if (temp < 80) {
		
		System.out.println("\nEstas en frente de un rio congelado. Quieres cruzarlo pero notas que la capa es demasiado fina y posiblemente no aguante tu peso.");
		System.out.println("Tienes dos opciones:");
		System.out.println("1. Tratar de caminar sobre el rio para llegar al otro lado.");
		System.out.println("2. Buscar otro camino, aunque pueda estar muy lejos.");
		
		boolean corr = true;
		while (corr) {
		
			@SuppressWarnings("resource")
			Scanner temp2 = new Scanner(System.in);
			String b = temp2.next().toLowerCase();
			
		if (b.equals("1")){
		
			corr = false;
			Jugador.reducirVida(30);
			Jugador.reducirHambre(10);
			Jugador.reducirEnergia(30);
			Jugador.reducirSaludMental(30);
								
			System.out.println("\nTratas de caminar sobre el rio congelado, todo beoen, logras llegar a la mitad del camino.");
			System.out.println("Faltando unos pocos metros para llegar el hielo se rompe justo debajo de tus pies y caes en el agua congelada.");
			System.out.println("Tratas de subir pero el hielo se sigue rompiendo. Al final logras llegar a tierra");
			System.out.println("Te estas congelando del frio, pero agradeces a Dios estar aun vivo.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (b.equals("2")){
			
			corr = false;
			Jugador.reducirEnergia(20);
			Jugador.reducirHambre(10);
								
			System.out.println("\nDespeus de casi un dia caminando encuentras un puente que te permite atravesar.");
			System.out.println("Estas muy cansado pero al menos estas seguro. Tomaste una buena decision.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
			
		} else {
			System.out.println("\nResponde con '1' o '2'.");
		}
		}
		
	} else if (temp < 100){
		
		System.out.println("\nEncuentras un puente que te permitira cruzar el rio que tienes en frente. Pero justo en la entrada del puente hay un monstruo grande y verde, posiblemente un Orco bloqueando el camino.");
		System.out.println("Te comienza a hablar: 'Ven. No te hare daño, no tienes porque preocuparte. Puedes cruzar el puente y continuar'");
		System.out.println("El Orco es espeluznante. No parece sospecho, pero no sabes si confiar en el.");
		System.out.println("Tienes dos opciones:");
		System.out.println("1. Confiar en el orco y cruzar el puente.");
		System.out.println("2. Darte la vuelta y encontrar otro camino.");
		
		boolean corr = true;
		while (corr) {
		
			@SuppressWarnings("resource")
			Scanner temp2 = new Scanner(System.in);
			String b = temp2.next().toLowerCase();
			
		if (b.equals("1")){
		
			corr = false;
			Jugador.reducirVida(50);
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(30);
								
			System.out.println("\nComienzas a cruzar el puente, deseando que el Orco no haga nada estupido.");
			System.out.println("Cuando estas a mitad de camino, el Orco comienza a gritar:");
			System.out.println("'EN VERDAD PENSASTE QUE NO TE IBA A ATACAR? MORIRAS!. HOY SERAS MI CENA'");
			System.out.println("Entras en panico y comienzas a correr lo mas rapido posible.");
			System.out.println("Te pegan 2 veces antes de escapar.Estas muy herido, pudiste decidir algo mejor.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (b.equals("2")){
			
			corr = false;
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
								
			System.out.println("\nEliges irte y no pasar por el puente, comienzas a correr inmediatamente.");
			System.out.println("El Orco apenas te vio corre se puso a perseguirte pero nunca te pudo alcanzar!. Buena decision!");
			System.out.println("Desafortunadamente gastaste muchas energias buscando otro camino...");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
			
		} else {
			System.out.println("\nElije '1' o '2'.");
		}
		}
		
	}
	}
	
	public static void cueva () {
		double temp = Math.random()*100;
		
		if (temp < 20) {
			
			Jugador.reducirVida(20);
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(5);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nEn tu camino encuentras una cueva aparentemente comoda.");
			System.out.println("Entras y te hechas a dormir, esperando que pase el terrible clima.");
			System.out.println("Al pasar una hora, escuchas unos ruidos desde lo rpofundo de una cueva. Un oso aaparece y te ataca haciendo 20 de daño.");
			System.out.println("Huyes despavorido de la cueva.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\tSalud mental: "+Jugador.getSaludMental()+"\tSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			System.out.println("Tu vida baja 20 puntos. Vida: "+Jugador.getVida()+".");
			
		} else if (temp < 40) {
			
			Jugador.incrementarEnergia(10);
			Jugador.reducirHambre(10);
			Jugador.incrementarSed(20);
			Jugador.incrementarSaludMental(20);
			
			System.out.println("\nEn frente de ti, escondida entre los arboles, encuentras una cueva para pasar la noche.");
			System.out.println("Tomas agua de un pozo de agua clara que esta dentro de la cueva.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\tSalud mental: "+Jugador.getSaludMental()+"\tSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
			
		} else if (temp < 60) {
			
			Jugador.incrementarHambre(10);
			Jugador.incrementarSed(10);
			Jugador.incrementarEnergia(10);
			Jugador.incrementarSaludMental(10);
			
			System.out.println("\nEl sol esta al caer y necesito encontrar una cueva para pasar la noche.");
			System.out.println("Veo una caverna a la distancia, el lugar perfecto para descansar y dormir.");
			System.out.println("Me acerco y busco en los alrededores por si hay alguna amenaza.");
			System.out.println("Hay mucha tranquilidad y decido ir a la cueva y dormirme.");
			System.out.println("La noche pasa y dormi perfectamente. Estaba lloviendo, pero ahora no.");
			System.out.println("Atrapas un cnejo y lo cocinas para el desayuno.");
			System.out.println("Continuas la aventura.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 80) {
			
			Jugador.incrementarHambre(20);
			Jugador.incrementarSed(10);
			Jugador.incrementarEnergia(10);
			Jugador.incrementarSaludMental(10);
			
			System.out.println("\nConsigues atrapar una buena presa y tomas refugio en una cueva de hielo que encuentras cerca.");
			System.out.println("Prendes una fogata y comes tu comida. Estas bien protegido en la cueva y duermes al lado de la fogata.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 100){
			
			System.out.println("\nEstas caminando y consigues una roca con una entrada extraña.");
			System.out.println("Te acercas y encima de la roca esta algo grabado 'Los mortales no han de entrar.'. Que haces?");
			System.out.println("1. Entrar.");
			System.out.println("2. Ignorarla y seguir tu camino.");
			boolean corr = true;
			while (corr) {
			
				@SuppressWarnings("resource")
				Scanner temp2 = new Scanner(System.in);
				String b = temp2.next().toLowerCase();
				
			if (b.equals("1")){
			
				corr = false;
				Jugador.reducirVida(40);
				Jugador.reducirHambre(10);
				Jugador.reducirSed(10);
				Jugador.reducirEnergia(20);
				Jugador.reducirSaludMental(30);
									
				System.out.println("\nDecides entrar. Algo oa alguien te habla desde las profundidades de la caverna:");
				System.out.println("'Porque entrassssssste? Pagarassssss por esssssssso.' Te apuñalan en la espalda.");
				System.out.println("Te despiertas fuera de la caverna, gravemente herido. Aunque mas lento, continuas tu travesia.");
				System.out.println("Perdiste 40 de vida. Tu vida es: "+Jugador.getVida()+".");
				System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
			} else if (b.equals("2")){
				
				corr = false;
				Jugador.reducirHambre(10);
				Jugador.reducirSed(10);
				Jugador.reducirEnergia(10);
									
				System.out.println("\nDecides ignorarla y proseguir.");
				System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
				
			} else {
				System.out.println("\nPor favor responde '1' o '2'.");
			}
			}
			
		}
	}
	
	public static void castillo () {
		double temp = Math.random()*100;
		if (temp < 20) {
			
			System.out.println("\nA las lejanias visualizas unas torres con banderas, y al acercarte te das cuenta que es un castillo gigante hecho con piedra.\n");
			System.out.println("Te posicionas en frente del gran porton, se abre, y un hombre con pelo engro se acerca a ti y te dice:");
			System.out.println("'Este es el castillo de Lorden. Somos un dominio pacifico. Vienes en son de paz?'");
			System.out.println("1. 'Si' ");
			System.out.println("2. 'No' ");
			
			
			boolean corr = true;
			while (corr) {
			
				@SuppressWarnings("resource")
				Scanner temp2 = new Scanner(System.in);
				String b = temp2.next().toLowerCase();
				
			if (b.equals("1")){
			
				corr = false;
				Jugador.incrementarVida(20);
				Jugador.incrementarHambre(10);
				Jugador.incrementarSed(10);
				Jugador.incrementarEnergia(20);
				Jugador.incrementarSaludMental(30);
									
				System.out.println("\nEl hombre abre completamente el porton y te deja entrar. La ciudad dentro del castillo esta llena de personas, tiendas y tavernas.");
				System.out.println("Comienzas a preguntar a vaias personas que es este lugar y porque apareciste magicamente en este mundo pero sin respuestas. Algunas personas hasta se molestan de tu insistencia.");
				System.out.println("Comes, bebes y duermes dentro de la ciudad, y en la mañana siguiente te sientes muy bien pero tienes que seguir y decides partir.");
				System.out.println("Tu via se incremento en 20. Tu nuevo nivel de vida es: "+Jugador.getVida()+".");
				System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
			} else if (b.equals("2")){
				
				corr = false;
				Jugador.reducirVida(10);
				Jugador.reducirHambre(10);
				Jugador.reducirSed(10);
				Jugador.reducirEnergia(10);
				Jugador.reducirSaludMental(10);
									
				System.out.println("\nEl hombre cierra la puerta. No te dirije ni la palabra. Decides continuar sin la ayuda de esas pateticas personas encerradas en sus paredes.");
				System.out.println("Tu vida bajo en 10 puntos. Vida: "+Jugador.getVida()+".");
				System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
				
			} else {
				
				System.out.println("\nResponde con '1' o '2'.");
				
			}
			}
			
			
		} else if (temp < 40) {
			
			Jugador.reducirVida(20);
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nTe das cuenta de un castillo a lo lejos, el porton esta abierto asi que decides entrar y encontrar refugio.");
			System.out.println("En la noche eres atacado por una figura fantasmal, te hiere pero logras escapar por el bien de tu vida.");
			System.out.println("Las heridas infligidas por el ente te costaron 20 de vida. Tu nueva vida es: "+Jugador.getVida()+".");
			System.out.println("Energia: "+Jugador.getEnergia()+"\tSalud mental: "+Jugador.getSaludMental()+"\tAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
			
		} else if (temp < 60) {
			
			System.out.println("\nEncuentras un gran castillo y deicdes entrar a investigar.");
			System.out.println("Ya dentro no encuentras ninguna salida, sientes que estas caminando en circuos cuando encuentras una sala extremadamente grande.");
			System.out.println("Ya quieres irte. Pero en la sala hay dos puertas y tu tienes que elegir alguna: La izquierda o la derecha?");
			System.out.println("1. Puerta izquierda.");
			System.out.println("2. Puerta derecha.");
			
			boolean corr = true;
			while (corr) {
			
				@SuppressWarnings("resource")
				Scanner temp2 = new Scanner(System.in);
				String b = temp2.next().toLowerCase();
				
			if (b.equals("1")){
			
				corr = false;
				Jugador.reducirVida(20);
				Jugador.reducirHambre(20);
				Jugador.reducirSed(20);
				Jugador.reducirEnergia(30);
				Jugador.reducirSaludMental(30);
									
				System.out.println("\nDecides ir por la puerta de la izquierda.");
				System.out.println("Al entrar, la puerta se cierra y no te puedes devolver. Te das cuenta que el laberinto continua.");
				System.out.println("Encuentras la salida, pero sientes que estuviste dias o semanas dentro del castillo.");
				System.out.println("Acabas de salir, pero estas herido y muy cansado.");
				System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				System.out.println("Tu vida bajo en 20. Vida: "+Jugador.getVida()+".");
									
				
			} else if (b.equals("2")){
				
				corr = false;
				Jugador.reducirHambre(10);
				Jugador.reducirSed(10);
				Jugador.reducirEnergia(10);
				
				System.out.println("\nCaminas hacia la puerta derecha y la abres.");
				System.out.println("Inmediatamente te encuentras en las afueras del castillo.");
				System.out.println("Te preguntas que hubiera pasado si elegias la otra puerta.");
				System.out.println("Dejas de pensar en eso y continuas con tu aventura.");
				System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
				
			} else {
				System.out.println("\nResponde con '1' o '2'.");
			}
			}
		} else if (temp < 80) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.incrementarEnergia(10);
			Jugador.incrementarSaludMental(10);
			
			System.out.println("\nDespues de un dia caminando, encuentras un castillo abandonado y decides descansar.");
			System.out.println("No hay agua ni comida, pero pudiste dormir sin ninguna preocupacion.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 100){
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nDecides pedir ayuda a un castillo que tienes cerca arriba de una colina.");
			System.out.println("Apenas te acercas los guardias dentro del castillo comienzan a gritarte que te vayas.");
			System.out.println("Intentas explicar, gritando, que eres un simple viajero que necesita un poco de ayuda.");
			System.out.println("Los soldados te disparan unas flechas preventivas y tu decides irte.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		}
	}
	
	public static void llanura () {
		double temp = Math.random()*100;
		
		if (temp < 20) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nEl horizonte se extiende hasta dodne tus ojos te permiten ver, no ves nada mas que una infinita llanura.\n");
			System.out.println("Sigues caminando a ver si encuentras algo interesante, pero no tienes suerte.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\tSalud mental: "+Jugador.getSaludMental()+"\tAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 40) {
			
			Jugador.incrementarHambre(10);
			Jugador.incrementarSed(10);
			Jugador.incrementarEnergia(10);
			Jugador.incrementarSaludMental(10);
			
			System.out.println("\nCaminando por una increible llanura encuentras una fogata abandonada.");
			System.out.println("Sigue encendida, y hay un poco de comida y agua, posiblemente alguien haya acampado aqui hace poco. Pasare aqui la noche.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\tSalud mental: "+Jugador.getSaludMental()+"\tAgua y sed: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
							
		} else if (temp < 60) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nTodo se comienza a poner arenoso mientras mas caminas.");
			System.out.println("De repente te das cuenta que estas en un desierto, ya no hay vuelta atras, tienes que seguir caminando.");
			System.out.println("Luego de una gran caminata logras salir  del desierte, pero has quedado muy sediento y hambriento.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSAlud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 80) {
			
			Jugador.reducirVida(20);
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(20);
			
			System.out.println("\nEstas caminando y sientes una brisa extraordinaria en tu rostro, comienzas a caminar con los ojos cerrados. Te tropiezas con una raiz y caes de cabeza en una piedra.");
			System.out.println("Te levantas 1 hora despues confundido y con un fuerte dolor de cabeza.");
			System.out.println("Pierdes 20 de vida. Vida: "+Jugador.getVida()+".");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 100){
			
			Jugador.reducirHambre(20);
			Jugador.reducirSed(20);
			Jugador.reducirEnergia(20);
			
			System.out.println("\nCuando vas caminando en la llanura, a la lejanias logras ver cientos de estandartes.");
			System.out.println("Al acercate lo suficiente te das cuenta que son un ejercito de Orcos. Por suerte estas tan lejos que no te pueden ver.");
			System.out.println("Quizas te cuesta un poco de tiempo pero es la unica opcion. Decides encontrar otro camino.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		}

	}
	
	public static void montaña () {
		double temp = Math.random()*100;
		
		if (temp < 20) {
			
			Jugador.reducirVida(10);
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(20);
			
			System.out.println("\nDurante una viaje en una montaña muy empinada, te ecuentras en medio de una tormenta de nieve");
			System.out.println("Eres forzado a detenerte y casi te congelas. Pierdes 10 de vida, 20 de energia y 20 de salud mental.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\tSalud mental: "+Jugador.getSaludMental()+"\tAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			System.out.println("Tu vida bajo en 10. Vida: "+Jugador.getVida()+".");
			
			
		} else if (temp < 40) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(40);
			
			System.out.println("\nVas caminando por el paso de una montaña y te das cuenta de una entidad extraña.");
			System.out.println("La entidad comienza a perseguirte, tu tratas de huir de ella pero todos tus esfuerzos son en vano.");
			System.out.println("Pasas toda la noche en panico, hasta que en la mañana la entidad desaparece, justo cuando ya dejas la montaña atras.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 60) {
			
			Jugador.incrementarHambre(10);
			Jugador.incrementarSed(10);
			Jugador.incrementarEnergia(10);
			
			System.out.println("\nViajas por una montaña, se hace de noche y te ves forzado a acampar.");
			System.out.println("Logras cazar a un ciervo, creas una fogata, lo cocinas y descanzas toda la noche. En la mañana comienzas a descender.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 80) {
			
			Jugador.incrementarHambre(10);
			Jugador.incrementarSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nCaminando por una montaña, te encuentras a un hombre extraño que se te acerca y te dice que es el 'Hermitaño de la montaña sagrada'.");
			System.out.println("Le preguntas si te puede ayudar con comida o algo por el estilo, el asiente con su cabeza, y te guia hacia un bosque de pinos.");
			System.out.println("El hermitaño te guia hacia su humilde morada y te ofrece un buen caldo.");
			System.out.println("Apenas terminas, el te dice que te vayas rapido, que ningun aventurero deberia de estar cerca de estas montañas en horas de la noche.");
			System.out.println("Llegas con el al otro lado de la montaña antes de que caiga la noche, en este punto se separan y cada quien va po su camino.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 100){
			
			Jugador.reducirHambre(20);
			Jugador.reducirSed(20);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nNo puedes continuar tu viaje sino escalas una gran montaña que tienes en frente.");
			System.out.println("Te costara mucho tiempo y energia, pero no tienes otra opcion.");
			System.out.println("Despues de unos dias, logras atravesar este obstaculo.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		}


	}
	
	public static void pantano () {
		double temp = Math.random()*100;
		
		if (temp < 20) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(5);
			
			System.out.println("\nEl aire huele mal y te encuentras en un hostil y putrido pantano.");
			System.out.println("Parecio una eternidad, pero lograste salir de el.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
			
		} else if (temp < 40) {
			
			Jugador.reducirVida(20);
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(10);
							
			
			System.out.println("\nTe encuentras en un pantano muy espso, una critura viscosa sale de un pozo y te ataca por la espalda.");
			System.out.println("Casi te ahoga antes de poder darle unas patadas y algunos golpes y quitartelo de encima.");
			System.out.println("Logras escapar del pantano.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			System.out.println("Tu vida bajo 20 puntos. Vida: "+Jugador.getVida()+".");
			
			
		} else if (temp < 60) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			
			System.out.println("\nEntras en un pantano y encuentras un bote pequeña flotando en un lago putrido de color verde.");
			System.out.println("Te montas en el bote y logras cruzar el lago sin nun problema");
			System.out.println("Te tomo solo 2 horas atravesar el pantano gracias al bote. Te bajas y continuas tu viaje.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 80) {
			
			System.out.println("\nEn el medio de un pantano encuentras un altar con una pocion extraña encima de el.");
			System.out.println("Que deseas hacer?");
			System.out.println("1. Beber la pocion");
			System.out.println("2. Dejarla y continuar");
			
			boolean corr = true;
			while (corr) {
			
				@SuppressWarnings("resource")
				Scanner temp2 = new Scanner(System.in);
				String b = temp2.next().toLowerCase();
				
			if (b.equals("1")){
			
				corr = false;
				Jugador.reducirVida(20);
				Jugador.reducirHambre(20);
				Jugador.reducirSed(20);
				Jugador.incrementarEnergia(10);
				Jugador.reducirSaludMental(10);
									
				System.out.println("\nLa tomas y comienzas a sentirte mal y sin energias. Notas que te pones verde y pierdes la consciencia...");
				System.out.println("Te despertas un dia despues, conhambre y sed. Llegas a la conclusion de que caiste en estado de coma.");
				System.out.println("Pierdes 20 de vida. Vida: "+Jugador.getVida()+".");
				System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
			} else if (b.equals("2")){
				
				corr = false;
				Jugador.reducirHambre(10);
				Jugador.reducirSed(10);
				Jugador.reducirEnergia(10);
									
				System.out.println("\nSimplemente continuas.");
				System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
				
				
			} else {
				
				System.out.println("\nResponde con '1' o '2'.");
				
			}
			}
			
		} else if (temp < 100){
			
			Jugador.reducirVida(10);
			Jugador.reducirHambre(20);
			Jugador.reducirSed(20);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(20);
			
			System.out.println("\nTienes tan mala suerte que te caes en un pozo putrido de un pantano.");
			System.out.println("Vomitas del olor tan putrefacto que queda impregnado en ti.");
			System.out.println("Te sientes muy mal. Quizas algo te intoxico.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		}

	}
	
	public static void cripta () {
		double temp = Math.random()*100;
		
		if (temp < 20) {
			
			Jugador.incrementarHambre(30);
			Jugador.incrementarSed(30);
			Jugador.incrementarEnergia(30);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nEncuentras un hoyo en el piso, no sabes proque pero te adentras a investigar.\n");
			System.out.println(".Dentro del hoyo te das cuentas que estas dentro de unas catacumbas y estas rodeado de puras urnas\n");
			System.out.println("Entras en panico y corriendo encuentras un grial dorado. Sientes que emana una especie de poder. Decides agarrarlo");
			System.out.println("Sales y continuas tu aventura.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 40) {
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nCaminas por un cementerio en medio de la nada.");
			System.out.println("Comienzas a ver cosas. Tu cerebro distorsiana la realidad y comienzas a correr.");
			System.out.println("Te despiertas. El sol esta brillando. No estas en el cementerio. No sabes que paso.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nAgua y comida: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 60) {
			
			Jugador.reducirVida(30);
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(40);
			
			System.out.println("\nViajando en el medio de la nada encuentras un bosque, te adentras y ves una pequeña iglesia.");
			System.out.println("Decides entrar. Apenas lo haces la puerta se tranca bruscamente...");
			System.out.println("Comienzas a escucha ruidos, ves que hay sangre en el piso y unas personas muertas que comienzan a moverse...");
			System.out.println("Intentan atraparte, pero forzejeas un poco y logras abrir la puerta.");
			System.out.println("Un zombie logro herirte, pierdes 30 de vida. Vida: "+Jugador.getVida()+".");
			System.out.println("Comienzan a correr huyendo del bosque. Estas muy perturbado por esa experiencia.");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 80) {
			
			Jugador.reducirVida(20);
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(20);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nEres mordido por una rata cuando estas en un cementiro en la copa de una montaña.");
			System.out.println("La moridda duele, piensas que esta infectada. La curas lo mas que puedes.");
			System.out.println("Pierdes 20 de vida. Vida: "+Jugador.getVida()+".");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		} else if (temp < 100){
			
			Jugador.reducirHambre(10);
			Jugador.reducirSed(10);
			Jugador.reducirEnergia(10);
			Jugador.reducirSaludMental(10);
			
			System.out.println("\nEn tu viaje atraviesas un lugar muy extraño, indescriptible para ti. Sientes que alli perdiste algo...");
			System.out.println("Continuas, pero sientes que algo muy malo esta por suceder...");
			System.out.println("Energia: "+Jugador.getEnergia()+"\nSalud mental: "+Jugador.getSaludMental()+"\nSed y hambre: "+Jugador.getSed()+", "+Jugador.getHambre()+".");
			
		}
	}
	
	public static void campo () {
	}
	
	}
