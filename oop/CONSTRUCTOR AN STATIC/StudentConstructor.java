public class StudentConstructor {
    int rno;
    String name;
    int std;

    // MIMP INTERVIEW QUE..
    /*
     * QUE. DO CONSTRUCTORS RETURN ANYTHING EVEN THOUGH THEY DO NOT HAVE ANY RETURN
     * TYPE ??
     * ANS..
     * YES CONSTRUCTORS RETURN INITALIZED OBJECT OF CURRENT CLASS OR THEIR CLASS AND
     * ASSIGN TO THE CORRESPPONDING REFERNCE VARIABLE
     */
    StudentConstructor() {
        System.out.println(
                "START :: User Defined Default Constructor.\n(JVM Default Constructor is already Called To Set Default Values Like 0 and Null)");
        System.out.println(rno + " " + name + " " + std);

        rno = 1;
        name = "xyz";
        std = 12;

        System.out.println(rno + " " + name + " " + std);
        System.out.println("END :: User Defined default Constructor.");
    }

    StudentConstructor(int r, String n, int s) {
        System.out.println("START :: Parameterized Constructor.");
        System.out.println(rno + " " + name + " " + std + this);

        rno = r;
        name = n;
        std = s;

        System.out.println(rno + " " + name + " " + std + this);
        System.out.println("END :: Parameterized Constructor.");

    }

    StudentConstructor(StudentConstructor s) {
        System.out.println("START :: Copy Constructor.");
        System.out.println(rno + " " + name + " " + std + this);

        rno = s.rno;
        name = s.name;
        std = s.std;

        System.out.println("END :: Copy Constructor.");
        System.out.println(rno + " " + name + " " + std + this);
    }

    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor();
        StudentConstructor s2 = new StudentConstructor(2, "abc", 12);
        StudentConstructor s3 = new StudentConstructor(s2);

    }

}
