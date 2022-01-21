package tp_algo_base_java;

import java.util.Scanner;

public class Tp3 {
	public static Scanner sc;
	
	public static void afficherArguments(int a, String b, double c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void etesVousToto(String nom) {
		if (nom=="Toto") System.out.println("Vous etes Toto !");
		else System.out.println("Vous n'etes pas Toto");
	}
	
	public static void etesVousToto2(String nom) {
		if (nom=="Toto" || nom=="toto") System.out.println("Vous etes Toto !");
		else System.out.println("Vous n'etes pas Toto");
	}
	
	public static void etesVousUntel(String untel) {
		System.out.println("Nom ? ");
		String nom= sc.next();		
		if (nom.equals(untel)) System.out.println("Vous etes "+untel);
		else System.out.println("Vous n'etes pas "+ untel);
	}
	
	public static void quiEtesVous() {
		System.out.println("Nom ? ");
		String nom = sc.next();		
		System.out.println("Prenom ? ");
		String prenom = sc.next();
		System.out.println("Age ? ");
		int age= sc.nextInt();
		System.out.println("Vous etes "+prenom+" "+nom+" "+" et vous avez "
				+ age +" ans.");
	}
	
	public static void quiEstPlusGrand(int x, int y) {
		if (x==y) System.out.println(x+" et "+y+" sont égaux !");
		else if (x<y) System.out.println(y+" est plus grand que "+x);
		else System.out.println(x+" est plus grand que "+y);
	}
	
	public static void quelleHeure() {
		System.out.println("heure ?");
		int h = sc.nextInt();
		if(h<0 || h>=24) System.out.println("Je vous demande pardon ?");
		else if (0<=h && h<5) System.out.println("Il faut dormir !");
		else if (5<=h && h<12) System.out.println("Bon matin !");
		else if (14<=h && h<18) System.out.println("Bon après-midi !");
		else if (18<=h && h<21) System.out.println("Bon soir !");
		else if (21<=h && h<24) System.out.println("Bonne nuit !");
		else System.out.println("Probleme !");
	}
	
	public static void calculette() {
		System.out.println("Nombre :");
		int x = sc.nextInt();
		System.out.println("Operateur :");
		String op = sc.next();
		System.out.println("Nombre :");
		int y = sc.nextInt();
		
		float res=0;
		if (op.equals("+")) res = x+y;
		if (op.equals("-")) res = x-y; 
		if (op.equals("*")) res = x*y;
		if (op.equals("/")) res = x/y;
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("s?");
		String s = sc.next();
		System.out.println("n?");
		int n = sc.nextInt();
		System.out.println("s:"+s+" "+"n:"+n);
		
		afficherArguments(1, "toto", 2.1);
		etesVousToto("tata");
		etesVousToto2("toto");
		etesVousUntel("max");
		etesVousUntel("max");
		quiEtesVous();
		quiEstPlusGrand(5,6);
		quelleHeure();
		calculette();
		sc.close();
	}

}
