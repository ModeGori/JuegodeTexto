package com.MEGR.textgame;


public class Jugador extends Variables {
	public static int Vida = 100;
	public static int Hambre = 100;
	public static int Sed = 100;
	public static int Energia = 100;
	public static int EquilibrioMental = 100;
	public static boolean escapar = false;
	public static int x;
	public static int y;
	
		public static void Movimiento () {
			System.out.println("\n Me puedo mover hacia adelante, izquierda o derecha.... ¿Que haré?");
			boolean a = true;
				while (a) {
					Texto = input.next().toLowerCase();
					if (Texto.equals("adelante")) {
						a = false;
						forwardMove();
						
					} else if (Texto.equalsIgnoreCase("izquierda")) {
						if (x <= 0) {
							System.out.println("¡No puedes ir a la izquierda");
							Juego.mapborder = true;
							rightMove();
						} else
						a = false;
						leftMove();
						
					} else if (Texto.equalsIgnoreCase("derecha")){
						if (x >= 9) {
							System.out.println("¡No puedes ir a la derecha!");
							
							Juego.mapborder = true;
							leftMove();
						} else
						a = false;
						rightMove();
					} else {
						System.out.println("Abstenerse a 'adelante','izquierda' o 'derecha'.");
					}
				}
			}
			
				
			public static void forwardMove(){       // Adelante
				if (y == 0){
					escapar = true;
				} else
				y -= 1;
			
			}
			
			public static void leftMove(){ 		    // Izquierda
				
				x -= 1;		
			}
			
			public static void rightMove(){         // Derecha
						
				x += 1;	
			}
			
			public static boolean victorycondition(){
				return escapar;
				
				}
				public static void ReducirVida (int a) { //Modificar Vida
			    Vida -= a; 
			  }
				public static void IncrementarVida(int a) {
				if (Vida <=90){
					Vida += a;
				}
			}
				public static int getVida(){
				return Jugador.Vida;
			}
				public static void reducirHambre(int a) {   //Modificar Hambre
			    Hambre -= a; 
			  }
				public static void incrementarHambre(int a) {
				if (Hambre <=90){
					Hambre += a;
				}
			}
				public static int getHambre(){
				return Jugador.Hambre;
			}
				public static void reducirSed(int a) {  //Modificar Sed
			    Sed -= a; 
			  }
				public static void incrementarSed(int a) {
				if (Sed <=90){
					Sed += a;
				}
			}
				public static int getSed(){
				return Jugador.Sed;
			}
				public static void reducirEnergia(int a) { //Modificar Energia
			    Energia -= a; 
			  }
				public static void incrementarEnergia(int a) {
				if (Energia <=90){
					Energia += a;
				}
			}
				public static int getEnergia(){
				return Jugador.Energia;
			}
				public static void reducirEqulibrioMental(int a) { //Modificar EnergiaMental
			    EquilibrioMental -= a; 
			  }
				public static void incrementarEquilibrioMental(int a) {
				if (EquilibrioMental <=90){
					EquilibrioMental += a;
				}
			}
				public static int getEquilibrioMental(){
				return Jugador.EquilibrioMental;
			}

					
		}
