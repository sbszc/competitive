import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1002_area_of_a_circle {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    double radius = scanner.nextDouble();
	    double PI = 3.14159;
	    double area = PI * radius * radius;
	    
	    DecimalFormat df = new DecimalFormat("0.0000");
	    System.out.println("A="+df.format(area));
	}

}
