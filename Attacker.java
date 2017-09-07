import java.util.Random;
import java.util.Scanner;
public class Attacker 
{
	int attackersMove;
	int high = 1;
	int medium = 2;
	int low = 3;
	private int highProbability;
	private int mediumProbality;
	private int lowProbability;
	int result;
    String attResult;
    int[] attackProb;
    int attackProbIndex = 0; 
    int attackResult;
	
	public Attacker()
	{
		attackProb = new int[100];
	}
    
    public int generateAttacker()
    {
        Random generator = new Random();
        Double inBetweener;
        inBetweener = generator.nextDouble();
        int start = 0;
        if (start < inBetweener && inBetweener < (lowProbability/100)) {
            attackProb[attackProbIndex] = low; 
            attackProbIndex++;
        } else if ((lowProbability/100) < inBetweener && inBetweener <(mediumProbality/100)) {
            attackProb[attackProbIndex] = medium; 
            attackProbIndex++;
        } else {
            attackProb[attackProbIndex] = high; 
            attackProbIndex++;                                                                      
        }
        
        if ((highProbability + mediumProbality + lowProbability) != 100) {
            attackResult = generator.nextInt(3)+1;
        } else {
            attackResult = attackProb[generator.nextInt(attackProb.length)]; 
        }
        attackersMove = attackResult;
        return attackersMove;
    }


	public String getResult()
	{
		if (attackersMove == high)
			attResult = "High";
		else if (attackersMove == medium) 
			attResult = "Medium";
		else if (attackersMove == low)
			attResult = "Low";
		return (attResult);
	}
	
	public int getAttack()
	{
		if (attackersMove == high)
			result = high;
		else if (attackersMove == medium) 
			result = medium;
		else if (attackersMove == low)
			result = low;
		return (result);
	}
	//new
	
	public void setProb()
	{
		Scanner input = new Scanner(System.in);
  
		System.out.println("Percentage of attacks that will be aimed low: ");
		lowProbability = input.nextInt();
		//highProbability = highProbability / 100;
		
		System.out.println("Percentage of attacks that will be aimed medium: ");
		mediumProbality = input.nextInt();
		//mediumProbality = mediumProbality/ 100;
		
		System.out.println("Percentage of attacks that will be aimed high: ");
		highProbability = input.nextInt();
		//lowProbability = lowProbability / 100;
	}

	/*public int Checker()
	{
		if ((highProbability + mediumProbality + lowProbability) != 1)
			attackProb = 3 
	}*/
	// new
	/*public void setAttackProb()
	{
		do{
			for (int i = 0; i < 100; i++)
			{
				Random genaretor = new Random();
				int inBetweener = -1;
				inBetweener = genaretor.nextInt(2);
				int start = 0;
				if (start < inBetweener && inBetweener < (lowProbability/100))
					attackProb[i] = low; 
				else if ((lowProbability/100) < inBetweener && inBetweener <(mediumProbality/100))
					attackProb[i] = medium;
				else
					attackProb [i] = high;
			}
		}while ((highProbability + mediumProbality + lowProbability) == 100);																		
	}*/
}