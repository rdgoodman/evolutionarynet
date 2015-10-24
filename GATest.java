package evol;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GATest {

	@Test
	public void testALClone() {
		ArrayList<Double> AL = new ArrayList<Double>();
		AL.add(3.0);
		AL.add(2.99);
		AL.add(3.14);
		System.out.println();
		for(Double d: AL){
			System.out.println(d);
		}
		
		ArrayList<Double> AL2 = (ArrayList<Double>) AL.clone();
		System.out.println();
		for(Double d: AL2){
			System.out.println(d);
		}
	}

}
