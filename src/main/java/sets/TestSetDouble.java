package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		
		Set<Double> setDoubles = new HashSet<>(Set.of(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
		System.out.println(setDoubles);
		
		Double max = Double.MIN_NORMAL;
		for(Double doble : setDoubles) {
			if(doble > max) {
				max = doble;
			}
		}
		
		System.out.println("Le plus grand éléments est: " + max);
		
		Double min = Double.MAX_VALUE;
		for(Double doble : setDoubles) {
			if(doble < min) {
				min = doble;
			}
		}
		
		System.out.println("Le plus petits éléments est: " + min);
		setDoubles.remove(min);
		
		System.out.println("Liste: " + setDoubles);
	}

}
