package evol;

import java.util.ArrayList;

public class Chromosome {
	
	// TODO: get from ANN
	private int numGenes;
	
	private Double[] genes;
	private double fitness;
	private FitnessFunction f;
	private ArrayList<Double> outputs;
	
	
	public Chromosome(int numGenes){
		this.numGenes = numGenes;
		f = new FitnessFunction();
		
		// sets random initial gene values
		randomInit();
	}
	
	private void randomInit(){
		for (int i = 0; i < numGenes; i++){
			genes[i] = Math.random();
		}
	}
	
	public void evaluate(){
		// TODO: figure out where evaluation should actually happen - maybe in GA?
		// would require using this.getOutputs(), possibly
		//fitness = f.evaluate(this);
	}
	
	public int genNumGenes(){
		return numGenes;
	}
	
}
