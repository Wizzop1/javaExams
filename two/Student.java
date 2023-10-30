package two;

public class Student extends Person implements Printable{
	double grade;
	@Override
	public void introduce() {
		System.out.println("Name: "+getName() +" Age: "+getAge()+" Grade: "+grade);
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	

@Override
public void printDetails() {
	System.out.println(getName()+getAge()+grade);
}
	
}
