import java.util.Random;
public class Defender
{
	public final int high = 1;
	public final int medium = 2;
	public final int low = 3;
	int defenderMove;
	String defense;
	final int defenderProb = 3;
	String result = "";
	private int trackHits = 0;
	private int trackBlocks = 0;
	 

	public int generateDefender()
	{
		Random defenderGeneretor = new Random();
		int defendResult = -1;
		defendResult = defenderGeneretor.nextInt(defenderProb) + 1;
		defenderMove = defendResult; 
		return(defenderMove);
	}

	public String getDefend()
	{
		if (defenderMove == high) 
			result = "High";
		else if (defenderMove == medium)
			result = "Medium";
		else if (defenderMove == low)
			result = "Low";
		return(result);
	}

	public String getDefense()
	{
		return (defense);
	}

	public int getHits()
	{
		return(trackHits);
	}

	public int getBlocks()
	{
		return(trackBlocks);
	}

	public void setDefense(int anattack)
	{
		if (anattack == defenderMove)
			defense = "Block";
		if (anattack != defenderMove)
			defense = "Hit";
	}

	public void setHits()
	{
		if (getDefense() == "Hit")
			trackHits += 1; 
	}

	public void setBlocks()
	{
		if (getDefense() == "Block")
		trackBlocks += 1; 
	}
}