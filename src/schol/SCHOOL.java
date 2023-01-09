package schol;
import java.util.Scanner;

public class SCHOOL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School s1 = new Teacher();
		System.out.println("Hello");
		System.out.println("Hello -->" + s1.arraySchoolElement[0].idSchool); // first index
		System.out.println("Hello -->" + s1.arraySchoolElement[7].idSchool); // last index
		// School std1=new Student("Ali", 5, 6); // ERRor used fun .SetMarkAdd() in Student >>>>> ?
		Student std1=new Student("Ali", 5, 6);
		std1.SetMarkAdd();
		std1.printAVG();
	}

}

abstract class Supeer { // abstract class CAN'T CREAT OBJECT --> AS TEMPLET
	int id;
	Scanner input=new Scanner(System.in);
	abstract void print();
}

class School extends Supeer { // Super Class --> Father
	School[] arraySchoolElement = new School[8];
	int countArray = 0;
	static int idSchool = 500;
	private int id;
	private String naemSchool;
	private double area;
	private int fullStudentCount;
	static int countSchool = 0;
	private int countStdSchool;
	private int countTeacherScho;

//	School(String _naemSchool , double _area , int _fullStudentCount ,int _countStdSchool , int _countTeacherScho){
//		id=idSchool;
//		idSchool++;
//		countSchool++;
//		naemSchool=_naemSchool;
//		area=_area;                                                    --->   ERRor Create Constructor from SuperClass
//		fullStudentCount=_fullStudentCount;
//		countStdSchool=_countStdSchool;
//		countTeacherScho=_countTeacherScho;
//	}
//	
	void print() { // Overraid --> function in Super Class
		System.out.println("Super Class");
	}

	// overloding
	void testArea(int countStu, double area) {
		if (countStu * 2 <= area) {
			System.out.println("1 fun True School -- > /");
		} else {
			System.out.println("1 fun Fasle School -- > /");
		}
	}

	// overloding
	void testArea(double area) {
		if (countStdSchool * 2 <= area) {
			System.out.println("2 fun True School -- > /");
		} else {
			System.out.println("2 fun Fasle School -- > /");
		}
	}
}

class Teacher extends School { // subClass --> extends --> inheritance to School class __ child
	private static int idTeacher = 1000;
	private int id;
	private String nameTeacher;
	private static int countTeacher = 0;
	private int age;
	private int yearWork;
	private double salare;
	private double extraSalare;

	Teacher() {

	}

	Teacher(String name, int _age, int _salare, int _yearWork) {
		idSchool++;
		countSchool++;
		id = idTeacher;
		idTeacher++;
		countTeacher++;
		age = _age;
		salare = _salare;
		yearWork = _yearWork;
		arraySchoolElement[countArray] = this;
		countArray++;
	}

	public static int getIdTeacher() {
		return idTeacher;
	}

	public int getId() {
		return id;
	}

	public String getNameTeacher() {
		return nameTeacher;
	}

	public static int getCountTeacher() {
		return countTeacher;
	}

	public int getAge() {
		return age;
	}

	public int getYearWork() {
		return yearWork;
	}

	public double getSalare() {
		return salare;
	}

	// overriding
	void print() {
		System.out.println("Teacher Class");
	}
}

class Student extends School { // subClass --> extends --> inheritance to School class __ child
	private static int idStudent = 400;
	private static int countStudent = 0;
	private int id;
	private int countSubjectStd;
	private String nameStudent;
	private int age;
	private int[] mark=new int[countSubjectStd];
	Student(String name,  int age,int _countSubjectStd) {
		idSchool++;
		countSchool++;
		id = idStudent;
		countStudent++;
		nameStudent = name;
		this.age = age;
		arraySchoolElement[countArray] = this;
		countArray++;
		countSubjectStd=_countSubjectStd;
	}
	void SetMarkAdd(){
		for(int i=0;i<countSubjectStd;i++){
			System.out.println("Enter mark "+(i+1)+" : ");
			mark[i]=input.nextInt();
		}
	}
	void printAVG(){
		int sum=0;
		for(int i =0;i<countSubjectStd;i++){
			System.out.println("Mark "+(i+1)+" : "+mark[i]);
			sum+=mark[i];
		}
		System.out.println("AVG = "+sum/countSubjectStd);
	}

	// getter and setter
	public static int getCountStudent() {
		return countStudent;
	}

	public int getId() {
		return id;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public int getAge() {
		return age;
	}

	// overriding
	void print() {
		System.out.println("Student Class");
	}
}