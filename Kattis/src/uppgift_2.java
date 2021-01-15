import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uppgift_2 {
	public class Family {
		String parentA;
		String parentB;
		String child;

		public Family(String child, String parentA, String parentB) {
			this.child = child;
			this.parentA = parentA;
			this.parentB = parentB;
		}
	}

	List<String> candidates = new ArrayList<String>();
	List<Family> familyTree = new ArrayList<Family>();
	String king;
	public void run() {
		readingInput();
		double minimumBlood = -999;
		String successor ="";
		for(String candidate:candidates) {
			double blood = candidateBloodCalc(candidate);
			if(blood>minimumBlood) {
				minimumBlood = blood;
				successor = candidate;
			//	System.out.println(successor + " blood relation " + blood);
			}	
		}
		System.out.println(successor);
	}

	public void readingInput() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		king = scan.next();
		while (N-- > 0) {
			String child = scan.next();
			String parentA = scan.next();
			String parentB = scan.next();
			familyTree.add(new Family(child, parentA, parentB));
		}
		while (M-- > 0) {
			candidates.add(scan.next());
		}
	}

	public double candidateBloodCalc(String candidateName) {
		/*
		 * return bloodCalc(parentA,parentB); if(parentA.isChild) return
		 * bloodCalc(parentA,parentB) else return 0;
		 * 
		 */
		if (candidateName.equals(null))
			return 0;
		if(candidateName.equals(king))
			return 1;

		for (Family family : familyTree) {
			if (family.child.equals(candidateName)) {
				System.out.println(candidateName+ " has blood relation "+ (candidateBloodCalc(family.parentA) + candidateBloodCalc(family.parentB)) / 2);
				return (candidateBloodCalc(family.parentA) + candidateBloodCalc(family.parentB)) / 2;
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uppgift_2 a = new uppgift_2();
		a.run();
	}

}
