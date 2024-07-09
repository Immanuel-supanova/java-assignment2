import java.util.Scanner;

public class Exam {

	public int course_work_done(double ass1, double ass2, double ass3, double cat1, double cat2) {
		int course_works;
		course_works = 0;
		// Check how many courseworks have been done

		for(int x = 1; x <= 1; x++){

			if(ass1 != 0){
				course_works += x;
			} 

			if(ass2 != 0){
				course_works += x;
			} 

			if(ass3 != 0){
				course_works += x;
			} 

			if(cat1 != 0){
				course_works += x;
			} 

			if(cat2 != 0){
				course_works += x;
			} 

		}

		return course_works;
	}

	public boolean has_passed(double ass1, double ass2, double ass3, double cat1, double cat2) {
		double pass_mark;
		pass_mark = 2/3 * 100;

		Exam exam = new Exam(); 

		if (exam.course_work_done(ass1, ass2, ass3, cat1, cat2) >= pass_mark){
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args){
		
		// Declare the variables
		double ass1, ass2, ass3, cat1, cat2, course_work, exam_result; 
		int course_work_done, userinput;

		// Initialize the variables
		ass1 = 4;
		ass2 = 0;
		ass3 = 10;
		cat1 = 15;
		cat2 = 12;
		exam_result = 37;
		course_work = ass1 + ass2 + ass3 + cat1 + cat2;
		
		// New Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// This block allows the user to interact with the program by collecting input responding with the oappropriate output. 
		do {
		
			System.out.println("\nThe Main Menu\n1: Course Work\n2: Exam Results\n3: Exit\nType any of the choices available");
			userinput = scanner.nextInt();
			
			if(userinput == 1){	
				System.out.println("\nCourse Work: " + course_work);
			} else if(userinput == 2){
				System.out.println("\nExam Results: " + exam_result);
			} else if(userinput == 3){
				System.out.println("\nExit");
				break;
			} else{
				System.out.println("\nInvalid Input");
			}


		} while(userinput != 0 && userinput <= 3); 
		 
		// Close the scanner
		scanner.close(); 

		Exam exam = new Exam(); 
		System.out.println(exam.has_passed(ass1, ass2, ass3, cat1, cat2));
		System.out.println(exam.course_work_done(ass1, ass2, ass3, cat1, cat2));

	}
}
