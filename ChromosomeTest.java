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
		
		FeedForwardANN net = new FeedForwardANN(1, 2, inputs, expectedOutput, true, false);
		
		Chromosome c = new Chromosome(net);
		assertEquals(11, c.genNumGenes());
	}

}
