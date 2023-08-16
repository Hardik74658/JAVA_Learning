import java.util.*;

public class StudentInfo {
    int rno;
    String name;
    int std;
    static String sname;

    public static void setSchoolName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter School Name: ");
        StudentInfo.sname = sc.nextLine();
    }

    public void scanData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Std: ");
        std = sc.nextInt();
    }

    public void dispData() {
        System.out.println(rno + " " + name + " " + std + " " + sname);
    }

    public static void main(String[] args) {
        StudentInfo s[] = new StudentInfo[5];
        StudentInfo.setSchoolName();
        for (int i = 0; i < 5; i++) {
            s[i] = new StudentInfo();
            s[i].scanData();
        }
        for (int i = 0; i < 5; i++) {
            s[i].dispData();
        }
    }
}
