package evol;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class GATest {
	
	@Test
	public void testRandomInitialize(){
		GA g = new GA(0.5, 0.5, 10, 30, 3, 0.25);
		ArrayList<Double> inputs = new ArrayList<Double>();
		inputs.add(3.0);
		inputs.add(2.0);
		inputs.add(.25);

		ArrayList<Double> expectedOutput = new ArrayList<Double>();
		expectedOutput.add(.8);
		
		FeedForwardANN net1 = new FeedForwardANN(1, 2, inputs, expectedOutput, true, false);
		
		g.optimize(net1);
		
		assertEquals(30, g.getPop().size());
		
		for (int i = 0; i < g.getPop().size(); i++){
			for (int j = 0; j < g.getPop().size(); j++){				
				if (i != j){
					for (int k = 0; k < g.getPop().get(i).getNumGenes(); k++){
						assertEquals(false, g.getPop().get(i).getGenes()[k] == g.getPop().get(j).getGenes()[k]);
					}
				}			
			}			
		}
		
	}

}
