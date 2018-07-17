package com.MEGR.textgame;

public class Mapa {
	public String[][] mapArray; //Areglo del mapa y el jugador
	public static String[][] movementMapArray; //Arreglo de coordenadas
	public static int y; 
	public static int x;

	public Mapa (int x, int y){               //Constructor del mapa

		mapArray = new String[x][y];
		movementMapArray = new String[x][y];

		for (int i = 0; i < x; i++) {	
			for (int j = 0; j < y; j++) {
				mapArray[i][j] = Integer.toString((int)(Math.random()*9)); 
			}
		}
		for (int i=0;i<x; i++){
			for (int j=0; j<y; j++){
				movementMapArray[i][j] = mapArray[i][j];
			}
		}
	}
	
	 static void Ambiente() { 
		 
		x = Jugador.getX();
		y = Jugador.getY();
		
		
			int temp = Integer.parseInt(movementMapArray[y][x]);
			switch (temp){
				case 0: Juego.aldea();
					break;
				case 1: Juego.bosque();
					break;
				case 2: Juego.rio();
					break;
				case 3: Juego.cueva();
					break;
				case 4: Juego.castillo();
					break;
				case 5: Juego.llanura();
					break;
				case 6: Juego.montaña();
					break;
				case 7: Juego.pantano();
					break;
				case 8: Juego.cripta();
					break;
				case 9: Juego.llanura();
					break;
				default:
					System.out.println("Bugazo");
					break;
			}
		
	}

	public void printmap() {                 
		for (int i = 0; i < mapArray.length; i++){
			
			System.out.print("|");
			
			for (int j = 0; j < mapArray[i].length; j++){
				System.out.print(mapArray[i][j]);
				System.out.print("  ");
			}
			
			System.out.println("|\n");
		}
	}
	


}
