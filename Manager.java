/* Version 1 = created basic attacker and defender
   Version 2 = updated the defender class to record statistics of hits and blocks
   Version 3 = Added attacking probability */
import java.util.Random;
import java.util.Scanner;
public class Manager
{
	public static void main(String[] args)
	{
		int fightSimulation;
		Attacker attacker = new Attacker();
		Defender defender = new Defender();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of rounds: ");
		fightSimulation = in.nextInt();
		attacker.setProb();
		System.out.println();
		
		for (int i = 1; i <= fightSimulation; i++)
		{
			
			attacker.generateAttacker();
			defender.generateDefender();
			defender.setDefense(attacker.getAttack());
			System.out.printf("Round %2d...    Attacker: %7s  Defender: %7s  Result: %7s",i,attacker.getResult(),defender.getDefend(),defender.getDefense());
			System.out.println();
			defender.setHits();
			defender.setBlocks();
		}

		System.out.println();
		System.out.println("Summary of Kombat");
		System.out.println("Total Hits: "+defender.getHits()+"  Total Blocks: "+defender.getBlocks());

	}
}