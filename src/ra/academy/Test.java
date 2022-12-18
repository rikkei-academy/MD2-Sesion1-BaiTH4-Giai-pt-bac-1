package ra.academy;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //write your code here
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation 'a*x + b = 0' , please enter constants ");
        Scanner sc = new Scanner(System.in); // Khởi tạo đối tượng  sc từ lớp Scanner để nhập dữ liệu .
        System.out.println("Enter a :");
        double a = sc.nextDouble(); // Nhập và gán giá trị cho tham số a .
        System.out.println("Enter b :");
        double b = sc.nextDouble(); // Nhập và gán giá trị cho tham số b .
        if (a != 0) {
            double x = -b / a;
            System.out.println("The Equation pass when x = " + x); // phương trình có nghiệm duy nhất x = -b/a.
        } else { // a = 0
            if (b == 0) {// phương trình vô số nghiệm
                System.out.println("The solution is all x!");
            } else { // phương trình vô nghiệm
                System.out.println("No solution!");
            }
        }
    }
}
