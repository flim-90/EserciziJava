package it.begear.esercizi.giorno3.esercizio2;
/*ESERCIZIO 2 - Classe Eroe con attibuti nome, forza, saggezza e destrezza. 
Tre classi Mago, arciere e guerriero estendono Eroe.
Il mago deve avere saggezza uguale o superiore a 15
l'arciere deve avere destrezza uguale o sueriore a 15
Il guerriero deve avere forza uguale o superiore a 15
Generare casualmente tra 10 e 20 i valori delle tre abilità, assicurandosi che solo 
una possa superare il 15 e che almeno una lo superi e poi istanziare la 
classe relativa.
*/
public class Main {

	public static void main(String[] args) {
		Guerriero guerriero1 = new Guerriero("Arthas");
		Mago mago1 = new Mago("Crowley");
		Arciere arciere1 = new Arciere("Chrom");
		
		System.out.println("mago " + mago1.getNome() + " destrezza " 
		+ mago1.getDestrezza() + " forza " + mago1.getForza() + " saggezza " + mago1.getSaggezza());
		System.out.println("arciere " + arciere1.getNome() + " destrezza  " 
				+ arciere1.getDestrezza() + " forza " + arciere1.getForza() + " saggezza " + arciere1.getSaggezza());
		System.out.println("guerriero " + guerriero1.getNome() + " destrezza " 
				+ guerriero1.getDestrezza() + " forza " + guerriero1.getForza() + " saggezza " + guerriero1.getSaggezza());
	}

}
