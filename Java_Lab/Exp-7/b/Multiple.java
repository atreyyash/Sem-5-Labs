// Java program to demonstrate Multiple Inheritance
// through default methods

// Interface 1
interface I1 {

	// Default method
	default void show()
	{

		// Print statement if method is called
		// from interface 1
		System.out.println("Default I1");
	}
}

// Interface 2
interface I2 {

	// Default method
	default void show()
	{

		// Print statement if method is called
		// from interface 2
		System.out.println("Default I2");
	}
}

// Main class
// Implementation class code
class Multiple implements I1, I2 {

	// Overriding default show method
	public void show()
	{

		// Using super keyword to call the show
		// method of PI1 interface
		I1.super.show();

		// Using super keyword to call the show
		// method of PI2 interface
		I2.super.show();
	}

	// Mai driver method
	public static void main(String args[])
	{

		// Creating object of this class in main() method
		Multiple d = new Multiple();
		d.show();
	}
}
