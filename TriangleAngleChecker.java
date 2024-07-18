package secondlab;

public class TriangleAngleChecker { 
	public static void main(String[] args) {
	        // Predefined angles of a triangle
	        int a1 = 60;
	        int a2 = 50;
	        int a3 = 70;
	        int b=a1+a2+a3;
	        if (b==180) {
	            System.out.println("Angles " + a1 + ", " + a2 + ", " + a3 + " form a valid triangle.");
	        } else {
	            System.out.println("Angles " + a1 + ", " + a2 + ", " + a3 + " do not form a valid triangle.");
	        }
	    }
}
