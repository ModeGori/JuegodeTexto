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
