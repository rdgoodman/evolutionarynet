package evol;

import java.util.ArrayList;

public class GA extends TrainingStrategy {
	
	// crossover rate
	private double cRate;
	// mutation rate
	private double mRate;
	// number of generations
	private int gens;
	// population size
	private int popSize;
	// pts = 5 -> 5-point crossover
	private int pts;
	// percent of pop to replace in each generation
	private double repl;
	
	// actual population
	private ArrayList<Chromosome> pop;
	
	/**
	 * Creates a new GA instance
	 * @param cRate crossover rate between 0 and 1
	 * @param mRate mutation rate between 0 and 1
	 * @param gens number of generations
	 * @param pop population size
	 * @param pts number of points for cross over (e.g. pts = 5 -> 5-point crossover)
	 * @param repl percentage of population to replace each generation, between 0 and 1
	 */
	public GA(double cRate, double mRate, int gens, int popSize, int pts, double repl) {
		this.cRate = cRate;
		this.mRate = mRate;
		this.gens = gens;
		this.popSize = popSize;
		this.pts = pts;
		this.repl = repl;
	}
	
	/** Creates new population of random individuals */
	protected void initPopulation(){
		for (int i = 0; i < popSize; i++){
			
		}
	}
	

	
	
	


}
