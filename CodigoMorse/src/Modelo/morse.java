package Modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class morse {
	public static void main(String[] args) throws IOException{
		String cad;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		Scanner leer=new Scanner(System.in);
		Scanner sn=new Scanner(System.in);
		char seguir;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String [] codigo={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
				"..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----","  "};
	String texto="";
	boolean salir=false;
	int opcion;
	while(!salir){
		System.out.println("---------------Menu---------------");
		System.out.println("1.- convertir texto a codigo morse");
		System.out.println("2.- convertir codigo morse a texto");
		System.out.println("3.- salir");
		try{
		System.out.println("escribe tu opcion: ");
		opcion=sn.nextInt();
		switch (opcion){
		case 1:
			do{
				System.out.println("\n ingresa el texto porfavor: ");
			try{
				texto = entrada.readLine();
			}catch(Exception e){
				System.out.println("no a escrito nada.");
			}
			String ini="La frase '";
			String fin ="' en codigo morse es:  \n";
			if (texto.length()>0){
			for(int i=0;i<texto.length();i++){
				char caracter=texto.charAt(i);
				switch(caracter){
				case 'a':
				case 'A':
					fin+=(codigo[0]+" ");
					break;
				case 'b':
				case 'B':
					fin+=(codigo[1]+" ");
					break;
				case 'c':
				case 'C':
					fin+=(codigo[2]+" ");
					break;
				case 'd':
				case 'D':
					fin+=(codigo[3]+" ");
					break;
				case 'e':
				case 'E':
					fin+=(codigo[4]+" ");
					break;
				case 'f':
				case 'F':
					fin+=(codigo[5]+" ");
					break;
				case 'g':
				case 'G':
					fin+=(codigo[6]+" ");
					break;
				case 'h':
				case 'H':
					fin+=(codigo[7]+" ");
					break;
				case 'i':
				case 'I':
					fin+=(codigo[8]+" ");
					break;
				case 'j':
				case 'J':
					fin+=(codigo[9]+" ");
					break;
				case 'k':
				case 'K':
					fin+=(codigo[10]+" ");
					break;
				case 'l':
				case 'L':
					fin+=(codigo[11]+" ");
					break;
				case 'm':
				case 'M':
					fin+=(codigo[12]+" ");
					break;
				case 'n':
				case 'N':
					fin+=(codigo[13]+" ");
					break;
				case 'o':
				case 'O':
					fin+=(codigo[14]+" ");
					break;
				case 'p':
				case 'P':
					fin+=(codigo[15]+" ");
					break;
				case 'q':
				case 'Q':
					fin+=(codigo[16]+" ");
					break;
				case 'r':
				case 'R':
					fin+=(codigo[17]+" ");
					break;
				case 's':
				case 'S':
					fin+=(codigo[18]+" ");
					break;
				case 't':
				case 'T':
					fin+=(codigo[19]+" ");
					break;
				case 'u':
				case 'U':
					fin+=(codigo[20]+" ");
					break;
				case 'v':
				case 'V':
					fin+=(codigo[21]+" ");
					break;
				case 'w':
				case 'W':
					fin+=(codigo[22]+" ");
					break;
				case 'x':
				case 'X':
					fin+=(codigo[23]+" ");
					break;
				case 'y':
				case 'Y':
					fin+=(codigo[24]+" ");
					break;
				case 'z':
				case 'Z':
					fin+=(codigo[25]+" ");
					break;
				case '1':
					fin+=(codigo[26]+" ");
					break;
				case '2':
					fin+=(codigo[27]+" ");
					break;
				case '3':
					fin+=(codigo[28]+" ");
					break;
				case '4':
					fin+=(codigo[29]+" ");
					break;
				case '5':
					fin+=(codigo[30]+" ");
					break;
				case '6':
					fin+=(codigo[31]+" ");
					break;
				case '7':
					fin+=(codigo[32]+" ");
					break;
				case '8':
					fin+=(codigo[33]+" ");
					break;
				case '9':
					fin+=(codigo[34]+" ");
					break;
				case '0':
					fin+=(codigo[35]+" ");
					break;
				case ' ':
					fin+=(codigo[36]);
					break;
				}
			}
			System.out.println(ini+texto+fin);
			}else{
				System.out.println("no ingreso ninguna frase :-(\n");
			}
			 System.out.println("desa convertir aluna otra frase??");
			 System.out.println("     s = SI   o   n =  NO ");
			 seguir = (entrada.readLine ()).charAt(0);
			 if (seguir!='s' & seguir!='S'){
				 System.out.println("\n      ");
			 }
			
			}while((seguir=='s'||seguir=='S'));
			break;
		case 2:
			do{
				System.out.println("\ncada letra en codigo morse debe de ir separada por un espadio ' '");
				System.out.println("cada palabra  en codigo morse debe de ir separada por una diagonal '/'");
				System.out.println("ingresa el codigo porfavor:");
				cad=leer.nextLine();
				
			String [] palabra=cad.split("\\ ");
			String ini="La codigo '";
			String fin ="' traducido a text es:  \n";
			if (cad.length()>0){
				int j=0;
				while (j<=palabra.length-1){
					String pal=palabra[j];
					switch(pal){
					case ".-":
						fin+="a";
						break;
					case "-...":
						fin+="b";
						break;
					case "-.-.":
						fin+="c";
						break;
					case "-..":
						fin+="d";
						break;
					case ".":
						fin+="e";
						break;
					case "..-.":
						fin+="f";
						break;
					case "--.":
						fin+="g";
						break;
					case "....":
						fin+="h";
						break;
					case "..":
						fin+="i";
						break;
					case ".---":
						fin+="j";
						break;
					case "-.-":
						fin+="k";
						break;
					case ".-..":
						fin+="l";
						break;
					case"--":
						fin+="m";
						break;
					case "-.":
						fin+="n";
						break;
					case "---":
						fin+="o";
						break;
					case ".--.":
						fin+="p";
						break;
					case "--.-":
						fin+="q";
						break;
					case ".-.":
						fin+="r";
						break;
					case  "...":
						fin+="s";
						break;
					case "-":
						fin+="t";
						break;
					case "..-":
						fin+="u";
						break;
					case "...-":
						fin+="v";
						break;
					case ".--":
						fin+="w";
						break;
					case "-..-":
						fin+="x";
						break;
					case "-.--":
						fin+="y";
						break;
					case "--..":
						fin+="z";
						break;
					case "/":
						fin+=" ";
						break;
					case ".----":
						fin+="1";
						break;
					case "..---":
						fin+="2";
						break;
					case "...--":
						fin+="3";
						break;
					case "....-":
						fin+="4";
						break;
					case ".....":
						fin+="5";
						break;
					case "-....":
						fin+="6";
						break;
					case "--...":
						fin+="7";
						break;
					case "---..":
						fin+="8";
						break;
					case "----.":
						fin+="9";
						break;
					case "-----":
						fin+="0";
						break;
					
					}
					j++;
			    
			}
		System.out.println(ini+cad+fin);
		}else{
			System.out.println("no ingreso ningun codigo :-(\n");
		}
		 System.out.println("desa convertir algun otro codigo??");
		 System.out.println("     s = SI   o   n =  NO ");
		 seguir = (entrada.readLine ()).charAt(0);
		 if (seguir!='s' & seguir!='S'){
			 System.out.println("\n     ");
		 }
		 }while((seguir=='s'||seguir=='S'));
			break;
		case 3:
			salir=true;
			System.out.println("   HASTA PRONTO    ");
			break;
			default:
				System.out.println("porfavor seleccione solo una da las opciones");
		}
		}catch (InputMismatchException e) {
			System.out.println("Debes seleccionar una de las opciones");
            sn.next();
		}
	
	}

}
}
