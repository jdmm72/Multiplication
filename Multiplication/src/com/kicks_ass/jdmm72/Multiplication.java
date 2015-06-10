package com.kicks_ass.jdmm72;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Multiplication {
	ArrayList<String> correct = new ArrayList<>();
	int numOne;
	int numTwo;
	int streak = 0;
	int numDone = 0;
	String problem;
	Random rn = new Random();
	
	public void getNextProblem(){
			numOne = rn.nextInt(13);
			numTwo = rn.nextInt(13);
			problem = numOne + " X " + numTwo;
			if(!correct.contains(problem)){
				numDone++;
				correct.add(problem);
			}
		
	}
	
	private void makeProblemList(){
		while(correct.size() < 169){
			getNextProblem();
		}
	}

	public static void main(String[] args) {	
		Multiplication multiplication = new Multiplication();
		multiplication.makeProblemList();
		System.out.println(multiplication.correct);
	}
}
