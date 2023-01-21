package schol;
// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SCHOOL {
	public static void main(String[] args) {
		try{
			System.out.println(1/0);
		}
		catch(Exception e){
		    System.out.println("Error divided zero ");
			System.out.println(e);
		}
		finally{
		    System.out.println("Hello");
		}
// 		// TODO Auto-generated method stub
// 		// School s1 = new Teacher();
// 		// System.out.println("Hello");
// 		// System.out.println("Hello -->" + s1.arraySchoolElement[0].idSchool); // first index
// 		// System.out.println("Hello -->" + s1.arraySchoolElement[7].idSchool); // last index
// 		// School std1=new Student("Ali", 5, 6); // ERRor used fun .SetMarkAdd() in Student >>>>> ?
// 		// Student std1=new Student("Ali", 5, 6);
// 		// std1.SetMarkAdd();
// 		// std1.printAVG();
// 		Scanner in=new Scanner(System.in);
// 		Teacher[] Str1Array = new Teacher[3];
// 		for(int i=0;i<3;i++){
// 			String name=in.nextLine();
// 		// 	int age=in.nextInt();
// 		// 	int salary=in.nextInt();
// 		// 	int yearWork=in.nextInt();
// 			Str1Array[i]=new Teacher(name, 10, 320, 4);
// 		}
// 		for(int i=0;i<3;i++){
// 			System.out.println((i+1)+" name : "+Str1Array[i].getNameTeacher() + "_ age : "+Str1Array[i].getAge());
// 		}
// 		Str1Array[2]=new Teacher();
// 		ArrayList<String> cars = new ArrayList<String>();
// 		cars.add("Volvo");
// 		cars.add("BMW");
// 		cars.add("Ford");
// 		cars.add("Mazda");
// 		System.out.println(cars);
// 		System.out.println(cars.size());
// 		System.out.println(cars.get(0));
// 		System.out.println(cars.get(1));
// 		System.out.println(cars.get(2));
// 		System.out.println(cars.get(3));
// 		System.out.println(cars.set(1,"Hello"));
// 		System.out.println(cars);
// 		System.out.println(cars.remove(1));
// 		System.out.println(cars);
// 		System.out.println(cars.remove("Volvo"));
// 		System.out.println(cars);
// 		cars.clear();
// 		System.out.println("is empty : "+cars.isEmpty());
// 		cars.add("Volvo");
// 		cars.add("BMW");
// 		cars.add("Ford");
// 		cars.add("Mazda");
// 		System.out.println(cars);
// 		cars.add("FOLO");
// 		System.out.println(cars);
// 		cars.add(2,"SSSO");
// 		System.out.println(cars);
// 		cars.remove(5);
// 		System.out.println(cars);
// 		System.out.println(cars.contains("BM1W"));
// 		System.out.println(cars);
// 		System.out.println(cars.lastIndexOf("BMW"));
// 		System.out.println(cars);
// 		System.out.println(cars.indexOf("BMW"));
// 		System.out.println(cars);
// // 		Teacher[] Str1Array = new Teacher[3];
// // 		for(int i=0;i<3;i++){
// // 			String name=in.nextLine();
// // 			int age=in.nextInt();
// // 			int salary=in.nextInt();
// // 			int yearWork=in.nextInt();
// // 			Str1Array[i]=new Teacher(name, 10, 320, 4);
// // 		}
// // 		for(int i=0;i<3;i++){
// // 			System.out.println((i+1)+" name : "+Str1Array[i].getNameTeacher() + "_ age : "+Str1Array[i].getAge());
// // 		}
// 		Student s3=new Student("dfdg", 0, 22);

	}
}

abstract class Supeer { // abstract class CAN'T CREAT OBJECT --> AS TEMPLET
	int id;
	Scanner input=new Scanner(System.in);
	abstract void print();
	public final void S(){
		System.out.println("sfgsf");
	};
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
		nameTeacher = name;
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

final class Student extends School { // subClass --> extends --> inheritance to School class __ child
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
	// public void S(){
	// 	System.out.println("sfgsf");
	// };
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