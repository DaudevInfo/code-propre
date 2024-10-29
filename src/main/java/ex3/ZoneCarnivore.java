package ex3;
import java.util.List;

public class ZoneCarnivore extends ZoneZoo{

	public double calculerKgsNourritureParJour(){
		return this.animals.size() * 10;
	}
}