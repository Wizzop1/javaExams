package two;

public class Person implements Printable{
private String name;
private int age;


public void introduce() {
	System.out.println(name+"  " + age);
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


@Override
public void printDetails() {
	System.out.println(name+age);
}


}
