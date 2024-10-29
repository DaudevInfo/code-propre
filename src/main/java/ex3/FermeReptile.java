package ex3;
import java.util.List;

public class FermeReptile extends ZoneZoo{

	public double calculerKgsNourritureParJour(){
		return this.animals.size() * 0.1;
	}
}