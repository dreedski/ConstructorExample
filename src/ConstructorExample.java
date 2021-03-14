public class ConstructorExample {

    String name;
    int Age;
    String schoolName;

    public ConstructorExample(String n, int a, String sName){
        name = n;
        Age = a;
        schoolName = sName;
    }

    public String toString() {
        return "Hello " + name + " Age: " + Age + " School Name: " + schoolName;
    }

   public static void main(String args[]){
        ConstructorExample newStudent = new ConstructorExample("Drew", 34, "RSU");
        System.out.println(newStudent);

    }
}
