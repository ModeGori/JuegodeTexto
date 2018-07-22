package com.MEGR.textgame;

public class Main extends Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void start () {
		System.out.println("Hola, este es mi juego");
		System.out.println("Usa el teclado y Enter para interactuar con la interfaz");
		System.out.println("Escribe tu respuesta y dale a Enter");
		
		System.out.println("\nTe despiertas y sientes una linda brisa que rosa tu rostro suavemente."
				+ "\nNo recuerdas absolutamente nada, solo te despertaste aqui."
				+ "\nDespues de un tiempo comienzas a recordar y poco a poco detallas el ambiente que te rodea."
				+ "\nAparentemente estas en un mundo desconocido y piensas que tu mejor opcion es ir lo mas lejos posible y esperar lo mejor."
				+ "\nDespues de unos minutos comienzas a recodar algo.... Tu nombre:");
		System.out.println("(Escribe tu nombre)");
		Nombre = input.next();
		
		dormir ();
		
		System.out.println("\nBien, me llamo " + Nombre + ". Que habra pasado antes de despertarme aqui."
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
		System.out.println("\nNo puedes ir a la derecha.... algo te dice que no hay nada bueno por alla.");
	}
	
	public static void leftstop(){
		System.out.println("\nEsta bloqueado el camino, mejor voy hacia otro lado.");
	}
	
		public static void endVida(){
			System.out.println("\n::::::::     :::     ::::    ::::  ::::::::::       ::::::::  :::     ::: :::::::::: :::::::::  ");
			System.out.println(":+:    :+:   :+: :+:   +:+:+: :+:+:+ :+:             :+:    :+: :+:     :+: :+:        :+:    :+: ");
			System.out.println("+:+         +:+   +:+  +:+ +:+:+ +:+ +:+             +:+    +:+ +:+     +:+ +:+        +:+    +:+ ");
			System.out.println(":#:        +#++:++#++: +#+  +:+  +#+ +#++:++#        +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:  ");
			System.out.println("+#+   +#+# +#+     +#+ +#+       +#+ +#+             +#+    +#+  +#+   +#+  +#+        +#+    +#+ ");
			System.out.println("#+#    #+# #+#     #+# #+#       #+# #+#             #+#    #+#   #+#+#+#   #+#        #+#    #+# ");
			System.out.println(" ########  ###     ### ###       ### ##########       ########      ###     ########## ###    ### ");
			
			System.out.println("\nMoriste agonizando y ahogandote en tu propia sangre. Desgraciadamente tu Vida bajo a 0.");
			System.out.println("Tu cuerpo se pudrira en este lugar y nadie se acordara de ti. Jamas sabras porque te despertaste en este mundo misterioso.");
			System.out.println("Te tomo, "+Jugador.Nombre+"; "+Juego.Dias+" dias para que te mataran.");
			System.out.println("\n            .-.");
			System.out.println("              | |____________________________________________________");
			System.out.println(" _ _ _ _ _ _ _| |                                                  .'`.");
			System.out.println("|_|_|_|_|_|_|_| |-------------------------------------------------.'****>");
			System.out.println("`.            | |_______________________________________________.'***.'");
			System.out.println("  `.        .'| |                                               `**'");
			System.out.println("    `-.___.'  `-'                                              .'*`.");
			System.out.println("                                                               `._.' .");
			System.out.println("                                                               .   .'*`.");
			System.out.println("                                                             .'*`. `._.'");
			
		}
		
		public static void endHambre(){
			System.out.println("\n::::::::     :::     ::::    ::::  ::::::::::       ::::::::  :::     ::: :::::::::: :::::::::  ");
			System.out.println(":+:    :+:   :+: :+:   +:+:+: :+:+:+ :+:             :+:    :+: :+:     :+: :+:        :+:    :+: ");
			System.out.println("+:+         +:+   +:+  +:+ +:+:+ +:+ +:+             +:+    +:+ +:+     +:+ +:+        +:+    +:+ ");
			System.out.println(":#:        +#++:++#++: +#+  +:+  +#+ +#++:++#        +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:  ");
			System.out.println("+#+   +#+# +#+     +#+ +#+       +#+ +#+             +#+    +#+  +#+   +#+  +#+        +#+    +#+ ");
			System.out.println("#+#    #+# #+#     #+# #+#       #+# #+#             #+#    #+#   #+#+#+#   #+#        #+#    #+# ");
			System.out.println(" ########  ###     ### ###       ### ##########       ########      ###     ########## ###    ### ");
			
			System.out.println("\nTe quedaste sin comida y moriste de hambre. Deberias de alimentarte para la proxima");
			System.out.println("Pues moriras aqui sin saber porque apareciste ene ste mundo tan misterioso.");

			System.out.println("Te tomo, "+Jugador.Nombre+"; "+Juego.Dias+" dias para morirte de hambre.");
			System.out.println("Que sad.");
			
			System.out.println("\n     _                                                 _.--.    __  _");
			System.out.println("    | |                                               ) |   `.,'  || |");
			System.out.println("    | |                                            (`'       |     : |");
			System.out.println("    | |                             _..-.-.-.-._    )     ,),'.    | |");
			System.out.println("    | |('.                    __..-' ) ) ) ) ) )``-'    _.-| |     | |");
			System.out.println("    | | | `...------''``--'''' |   )_____....---     ,''           ; |");
			System.out.println("    | |_(_..-......_________..._,-'_,..__....____..-'.._________..'| |");
			System.out.println("    | |____________________________________________________________| |");
			System.out.println("  __|_|____________________________________________________________|_|__");
			
			
		}

		public static void endSed(){
			System.out.println("\n::::::::     :::     ::::    ::::  ::::::::::       ::::::::  :::     ::: :::::::::: :::::::::  ");
			System.out.println(":+:    :+:   :+: :+:   +:+:+: :+:+:+ :+:             :+:    :+: :+:     :+: :+:        :+:    :+: ");
			System.out.println("+:+         +:+   +:+  +:+ +:+:+ +:+ +:+             +:+    +:+ +:+     +:+ +:+        +:+    +:+ ");
			System.out.println(":#:        +#++:++#++: +#+  +:+  +#+ +#++:++#        +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:  ");
			System.out.println("+#+   +#+# +#+     +#+ +#+       +#+ +#+             +#+    +#+  +#+   +#+  +#+        +#+    +#+ ");
			System.out.println("#+#    #+# #+#     #+# #+#       #+# #+#             #+#    #+#   #+#+#+#   #+#        #+#    #+# ");
			System.out.println(" ########  ###     ### ###       ### ##########       ########      ###     ########## ###    ### ");
			
			System.out.println("\nTe deshidrataste. No pudiste seguir caminando de tanta sed que tenias por no haber bebido ni una gota de agua.");
			System.out.println("Moriste en la mitad de la nada y nadie te recordara jamas.");
			
			System.out.println("Te tomo, "+Jugador.Nombre+"; "+Juego.Dias+" dias para morir agonizando sin agua.");
			
			System.out.println("\n   -     -   - ---- ---- - -   -   -- -   ----- - r    -      -");
			System.out.println("-------------------------------------------------r   -----------");
			System.out.println("---/----//--//////--////--/----/---------//////-/r   //r -----//");
			System.out.println("////////rr//////////////////////////////////r  //r   //r ////rrr");
			System.out.println("///////   r///rrr///rr///r////r/////////rrrrr   /r   rr  ////r");
			System.out.println("rrrrrrr   rr rrrrrrrrrrrrrrrrLorrrrrrrrrrrrrr   rr      rrrrr");
			System.out.println("rrrrrrL   rr rLLrrrrLrrorrrrrLoLrrrrLLorLLLLr   rr    rrrrrrr");
			System.out.println("LLLLLLL     rLLLLLLLLLLLooLLLoooLLoLooLLLLLLLr        LLLLLr");
			System.out.println("LLLLooo   rrooooooooooLLooo@@@@@@@@ooLoooooooorrrr    LLLLLr");
			System.out.println("ooooooo   roooooooooooooo@@@@@@@@@@@@oooooooooooor    oooorr");
			System.out.println("ooooooo   rooooooooooooo@@@@@@@@@@@@@@ooooooooooor    ooorr");
			System.out.println("........   r........sss...........................r    ..........");
			System.out.println("......  ........      ssss........................r    ...........");
			System.out.println("....  ..........       ...........................r    ..........");
			System.out.println("..  ............       ..............................   ...........");
			System.out.println(" .............     .s  = =........,...................   ..........");
			System.out.println("..............    .ss  == ==.....,......................    ..........");
			System.out.println("..............          == ==.........o...................   .......");
			System.out.println(".............            == == ,,,,@,,,,,,..................    ....");
			System.out.println("..............           bb#bbb#,,@@,,@,,,,,,,,,,.............    ....");
			System.out.println(".....................,,,,,,,,,,,,@@@@@@@@,,,,,,,,,,,,..........     ..");
			System.out.println("........................,,,,,,,,,^^^^^^^^,,,,,,,,,,.............");
		}
		
		public static void endEnergia(){
			System.out.println("\n::::::::     :::     ::::    ::::  ::::::::::       ::::::::  :::     ::: :::::::::: :::::::::  ");
			System.out.println(":+:    :+:   :+: :+:   +:+:+: :+:+:+ :+:             :+:    :+: :+:     :+: :+:        :+:    :+: ");
			System.out.println("+:+         +:+   +:+  +:+ +:+:+ +:+ +:+             +:+    +:+ +:+     +:+ +:+        +:+    +:+ ");
			System.out.println(":#:        +#++:++#++: +#+  +:+  +#+ +#++:++#        +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:  ");
			System.out.println("+#+   +#+# +#+     +#+ +#+       +#+ +#+             +#+    +#+  +#+   +#+  +#+        +#+    +#+ ");
			System.out.println("#+#    #+# #+#     #+# #+#       #+# #+#             #+#    #+#   #+#+#+#   #+#        #+#    #+# ");
			System.out.println(" ########  ###     ### ###       ### ##########       ########      ###     ########## ###    ### ");
			
			System.out.println("\nMoriste exhausto. Tu energia llego a 0.");
			System.out.println("Caiste en el suelo y tu cuerpo se podrira. Seras comido por los gusanos y nadie se acordara de ti.");

			System.out.println(Jugador.Nombre+" logaste viajar "+Juego.Dias+" dias.");
			
			System.out.println("\n          /`.__     ,");
			System.out.println("         /     |   / |");
			System.out.println("         ) ,-==-> /|/ |");
			System.out.println("          )__\\/ // |  |");
			System.out.println("         /  /' |//   | |");
			System.out.println("        /  (  /|/    | /");
			System.out.println("       /     //|    /,'");
			System.out.println("      // /  (( )    '");
			System.out.println("    //     (#) |");
			System.out.println("   /        )|/ |   '       ____");
			System.out.println("     //     // |    |");
			System.out.println("   //      //     ________       _,,--=_,");
			System.out.println(" /         |#|  /)      __/ + |____,--==<");
			System.out.println(" //________/#/_/'      (|_|__+/_,   ---<^");
			System.out.println("                                '==--=='");
			
		}
		
		public static void endSaludMental(){
			System.out.println("\n::::::::     :::     ::::    ::::  ::::::::::       ::::::::  :::     ::: :::::::::: :::::::::  ");
			System.out.println(":+:    :+:   :+: :+:   +:+:+: :+:+:+ :+:             :+:    :+: :+:     :+: :+:        :+:    :+: ");
			System.out.println("+:+         +:+   +:+  +:+ +:+:+ +:+ +:+             +:+    +:+ +:+     +:+ +:+        +:+    +:+ ");
			System.out.println(":#:        +#++:++#++: +#+  +:+  +#+ +#++:++#        +#+    +:+ +#+     +:+ +#++:++#   +#++:++#:  ");
			System.out.println("+#+   +#+# +#+     +#+ +#+       +#+ +#+             +#+    +#+  +#+   +#+  +#+        +#+    +#+ ");
			System.out.println("#+#    #+# #+#     #+# #+#       #+# #+#             #+#    #+#   #+#+#+#   #+#        #+#    #+# ");
			System.out.println(" ########  ###     ### ###       ### ##########       ########      ###     ########## ###    ### ");
			
			System.out.println("\nTe volviste loco. Aparentemente las cosas que viste en tu viaje fueron mucho para ti.");
			System.out.println("Nadie sabe que sucede en este punto de la historia, pero has fallado tu mision. Perdiste tu mente y el juego.");
			System.out.println(Jugador.Nombre+" sobrevivio "+Juego.Dias+" dias antes de volverse loco...");
			
			System.out.println("\n                    `'-._                    ");
			System.out.println("                      `. '-._                ");
			System.out.println("                        T.   '-.             ");
			System.out.println("                         $$p.   '-.          ");
			System.out.println("                         $$$$b.    `,        ");
			System.out.println("                      .g$$$$$$$b    ;        ");
			System.out.println("                    .d$$$$$$$$$$;   ;        ");
			System.out.println("                 __d$$$$$$P''^T$$   :        ");
			System.out.println("               .d$$$$P^^''___       :        ");
			System.out.println("              d$P'__..gg$$$$$$$$$$; ;        ");
			System.out.println("             d$$ :$$$$$$$$$$$$$$$$;  ;       ");
			System.out.println("            :$$; $$$$$$$$$$$$$$$$P  :$       ");
			System.out.println("            $$$  $$$$$$$$$$$$$$$$b  $$       ");
			System.out.println("           :$$$ :$$$$$$$$$$$$$$$$$; $$;      ");
			System.out.println("           $$$; $$$$$$$$$$$$$$$$$$; $$;      ");
			System.out.println("          :$$$  $$$$$$$$$^$$$$$$$$$ :$$      ");
			System.out.println("          $$$; :$$$p__gP' `Tp__g$$$ :$$      ");
			System.out.println("         :$$$  $$P`T$P' .$. `T$P'T$; $$;     ");
			System.out.println("         $$$; :$$;     :P^T;     :$; $$;     ");
			System.out.println("        :$$$  $$$$-.           .-$$$ :$$     ");
			System.out.println("        $$$$ :$$$$;     T$P   / :$$$  $$     ");
			System.out.println("       :$$$; $$$$$$  ; b:$;d :  $$$$; $$;    ");
			System.out.println("       $$$$; $$$$$$; : T T T ; :$$$$$ :$$    ");
			System.out.println("    .g$$$$$  :$$$$$$  ;' | ':  $$$$$$  T$b   ");
			System.out.println(" .g$$$$$$$$   $$$$$$b :     ; d$$$$$;   `Tb  ");
			System.out.println(":$$$$$$$$$;   :$$$$$$$;     :$$$$$$P         ");
			System.out.println(":$$$$$$$$$;    T$$$$$$$p._.g$$$$$$P         ;");
			System.out.println("$$$P^^T$$$$p.   `T$$$$$$$$$$$$$$P'     _/`.: ");
			System.out.println("       `T$$$$$b.  `T$$$$$$$$$$P'    .g$P   ; ");
			System.out.println("         `T$$$$$b.   '^T$$$$'     d$P'       ");
			System.out.println("          `T$$$$$$b.     $      'd$'         ");
			System.out.println("             '^T$$$$b.        .g$P'          ");
			System.out.println("                '^T$$$b    .g$P^'            ");
			System.out.println("                   '^T$b.g$P^'               ");
			System.out.println("                      '^$^''                 ");
		}

		

	}	