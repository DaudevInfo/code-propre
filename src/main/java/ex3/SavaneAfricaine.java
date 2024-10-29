package ex3;
import java.util.List;

public class SavaneAfricaine extends ZoneZoo{

	public double calculerKgsNourritureParJour(){
		return this.animals.size() * 10;
	}
}