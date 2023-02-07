package concurrency.Phaser.Extends;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
	int numPhases;
	
	MyPhaser(int parties, int phaseCount) {
		super(parties);
		numPhases = phaseCount - 1;
	}
	
	protected boolean onAdvance(int p, int regParties) {
		System.out.println("Phase " + p + " completed.\n");
		
		if(p == numPhases || regParties == 0) return true;
		
		return false;
	}
}
