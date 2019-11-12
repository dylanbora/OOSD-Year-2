package lab5;

public class MyFirstCircle
{
		public static void main (String args[])
		{
			Point myPoint = new Point(10, 20);

			Circle myCircle = new Circle(15, 30, 5);
			
			Cylinder myCylinder = new Cylinder( 15 , 30 , 50);

			System.out.println("Point details : " + myPoint);
			System.out.println("Circle details: " + myCircle);
			System.out.println("Clyinder details: " + myCylinder);
			
			

		}
}

