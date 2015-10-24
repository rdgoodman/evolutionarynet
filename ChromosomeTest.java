package evol;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ChromosomeTest {

	@Test
	public void testChromosomeSize() {
		ArrayList<Double> inputs = new ArrayList<Double>();
		inputs.add(3.0);
		inputs.add(2.0);
		inputs.add(.25);

		ArrayList<Double> expectedOutput = new ArrayList<Double>();
		expectedOutput.add(.8);
		
		FeedForwardANN net1 = new FeedForwardANN(1, 2, inputs, expectedOutput, true, false);		
		Chromosome c1 = new Chromosome(net1);
		
		FeedForwardANN net2 = new FeedForwardANN(1, 3, inputs, expectedOutput, true, false);		
		Chromosome c2 = new Chromosome(net2);
		
		FeedForwardANN net3 = new FeedForwardANN(2, 2, inputs, expectedOutput, true, false);		
		Chromosome c3 = new Chromosome(net3);
		
		assertEquals(11, c1.genNumGenes());
		assertEquals(16, c2.genNumGenes());
		assertEquals(17, c3.genNumGenes());

	}

}
