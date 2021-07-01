package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

/**
 * Hello world!
 *
 */
public class MyStudentRecordsMgmtApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student[] students= {
        		new Student(110001,"Dave", LocalDate.of(1951, 11, 18)),
        		new Student(110002,"Anna", LocalDate.of(1990, 12, 07)),
        		new Student(110003,"Erica", LocalDate.of(1974, 01, 31)),
        		new Student(110004,"Carlos", LocalDate.of(2009, 11, 22)),
        		new Student(110005,"Bob", LocalDate.of(1990, 03, 05)),
        		
        };
        printListOfStudents(students);
        List<Student>mm=getListOfPlatinumAlumniStudents(students);
        System.out.println(mm);
        int [] entry= {5,7,10,15,14,35};
        printHelloWorld(entry);
        findSecondBiggest(entry);
    }
    private static void printListOfStudents(Student[]students) {
    	Arrays.stream(students).sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
    	
    }
    private static List<Student> getListOfPlatinumAlumniStudents(Student[]student){
    	return Arrays.stream(student).filter(x->LocalDate.now().getYear()-x.getDateOfAdmission().getYear()>30).sorted(Comparator.comparing(Student::getDateOfAdmission)).collect(Collectors.toList());
    	
    }
    public static void printHelloWorld(int[]num) {
    	for(int i=0; i<num.length;i++) {
    		if(num[i]%5==0 && num[i]%7==0) {
    			System.out.println("Hello World");
    		}
    		if (num[i]%5==0) {
    			System.out.println("World");
    		}
    		if(num[i]%7==0) {
    			System.out.println("hello");
    		}
    		
    	}
    }
    private static void findSecondBiggest(int []arr) {
    int temp, size;
    size = arr.length;

    for(int i = 0; i<size; i++ ){
       for(int j = i+1; j<size; j++){

          if(arr[i]>arr[j]){
             temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
          }
       }
    }
    System.out.println("The second largest number is: "+arr[size-2]);
    }
    
}
