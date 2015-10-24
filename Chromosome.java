package evol;

import java.util.ArrayList;

public class Chromosome {
	
	// TODO: get from ANN
	private int numGenes;
	private FeedForwardANN net;
	// TODO: intialize this net
	
	private Double[] genes;
	private double fitness;
	private FitnessFunction f;
	private ArrayList<Double> outputs;
	
	
	// TODO: this net should be unique to the GA instance
	public Chromosome(FeedForwardANN net){
		
		this.net = net;
		
		calcNumGenes();
		
		genes = new Double[numGenes];
		
		f = new FitnessFunction();
		
		// sets random initial gene values
		randomInit();
	}

	private void calcNumGenes(){
		// per layer
		for (int i = 0; i < net.getNumLayers(); i++){
			// per node
			for (int j = 0; j < net.getLayer(i).size(); j++){
				numGenes += net.getLayer(i).get(j).getNumWeights();
			}
		}
		
	}
	
	private void randomInit(){
		for (int i = 0; i < numGenes; i++){
			genes[i] = Math.random();
		}
	}
	
	public void evaluate(){
		//
		// Step 1: assign weights using gene values
		// 
		int placeholder = 0;
		
		// by layer
		for (int l = 1; l < net.getNumLayers(); l++){
			// by node in layer
			for (int n = 0; n < net.getLayer(l).size(); n++){
				ArrayList<Double> newWeights = new ArrayList<Double>();
				// adds appropriate section of chromosome as this node's weights
				for (int i = placeholder; i < net.getLayer(l).get(n).getNumWeights() + placeholder; i++){
					newWeights.add(genes[i]);
				}
				net.getLayer(l).get(n).setWeights(newWeights);
			}
		}
		
		//
		// Step 2: generate outputs using all the new weights
		// 
		net.generateOutput();
		
		// TODO: remember to clear all the outputs and stuff
		
		//
		// Step 3: calculate & assign fitness
		// 
		fitness = net.calcNetworkError();		
	}
	
	public int genNumGenes(){
		return numGenes;
	}
	
	public void setNetwork(FeedForwardANN net){
		this.net = net;
	}
}
