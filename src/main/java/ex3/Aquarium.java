package ex3;
import java.util.List;

public class Aquarium extends ZoneZoo{

	public double calculerKgsNourritureParJour(){
		return this.animals.size() * 0.2;
	}
}