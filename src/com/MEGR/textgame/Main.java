package com.MEGR.textgame;

public class Main extends Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void start () {
		System.out.println("Hola, este es mi juego");
		System.out.println("Usa el teclado y Enter para interactuar con la interfaz");
		System.out.println("Escribe tu respuesta y dale a Enter");
		
		System.out.println("\nTe despiertas y sientes una linda bisa que rosa tu rostro suavemente."
				+ "\nNo recuerdas absolutamente nada, solo te despertaste aqui."
				+ "\nDespues de un tiempo comienzas a reocrdar y poco a poco detallas el ambiente que te rodea."
				+ "\nAparentemente estas en un mundo desconocido y piensas que tu mejor opcion es ir lo mas lejos posible y esperar lo mejor."
				+ "\nDespues de unos minutos comienzas a recodar algo.... Tu nombre:");
		System.out.println("(Escribe tu nombre)");
		Nombre = input.next();
		
		dormir ();
		
		System.out.println("\nOkay, me llamo " + Nombre + ". Que habra pasado antes de despertarme aqui."
				+ "\nHmmmmm.... estoy confundido.... Igualmente... sere hombre o mujer? (Igualdad de genero)");
		boolean testgenero = true; 
		while (testgenero){
			Genero = input.next().toLowerCase();
			
			if (Genero.equals("hombre")){
				testgenero = false;
				break;
			}
		
			if (Genero.equals("mujer")){
				testgenero = false;
				break;
			} else 
				System.out.println("Por favor... responde con hombre o mujer.... No eres otra cosa rara que yo sepa\n");
		}
		
		System.out.println("\n*sigh*... Bueno: Quien soy? Que hago aqui? Y porque no recuerdo absolutamene nada?"
				+ "\nMe queda solo explorar a ver si encuentro mi hogar....."
				+ "\nPuedo moverme hacia adelante, izquierda y derecha para explorar este mundo misterioso"
				+ "\nPues a preparse, que comienza esta aventura!.");
	}
	
	public static void win() {
		
		System.out.println("\n__   __  _______  __   __    _     _  ___   __    _  __  ");
		System.out.println("|  | |  ||       ||  | |  |  | | _ | ||   | |  |  | ||  | ");
		System.out.println("|  |_|  ||   _   ||  | |  |  | || || ||   | |   |_| ||  | ");
		System.out.println("|       ||  | |  ||  |_|  |  |       ||   | |       ||  | ");
		System.out.println("|_     _||  |_|  ||       |  |       ||   | |  _    ||__| ");
		System.out.println("  |   |  |       ||       |  |   _   ||   | | | |   | __  ");
		System.out.println("  |___|  |_______||_______|  |__| |__||___| |_|  |__||__| ");
		
		System.out.println("\nGanaste!!. Llegaste al final del mundo y escapaste de este mundo tan misterioso.");
		System.out.println("Te tomo "+Juego.Dias+" dias escapar. Felicidades, "+Jugador.Nombre+"!");
		System.out.println("\nGracias por jugar!");
		
		
	}
	
	public static void rightstop(){
		System.out.println("\nNo puedes ir a la derecha.... algo te dice que no hya anda bueno por alla.");
	}
	
	public static void leftstop(){
		System.out.println("\nEsta bloqueado el camino, mejor voy hacia otro lado.");
	}
	
	