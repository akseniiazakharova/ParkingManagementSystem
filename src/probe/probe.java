package probe;

import java.util.ArrayList;
import java.util.Iterator;

import newprojekt.newProjekt;

public class probe {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> notesList = new ArrayList();
		
	
		
		ArrayList<Integer> annaList = new ArrayList<Integer>();
		annaList.add(3);
		annaList.add(10);
		annaList.add(12);
		
		ArrayList<Integer> maximList = new ArrayList<Integer>();
		maximList.add(4);
		maximList.add(10);
		
		notesList.add(annaList);
		notesList.add(maximList);
		
		
			for (int i = 0; i < notesList.size(); i++) {
				int sum = 0;
				ArrayList<Integer> currentStudentNote = notesList.get(i);
				
				for (Integer note : currentStudentNote) {
					sum += note;
					
				}
				
				double average = sum / currentStudentNote.size();
				
				System.out.println("Student " + (i+1) + " has note " + average);
				
				
				
				
			}
		
		
		
		
		
		
		
			
		}

	

}
