package lab7;

public class PetVet {

	public static void main(String[] args) {
		
		Animal dog = new Dog ("Huskey", 2 , 'M');
		Animal cat = new Cat ("Chesire", 1 , 'M');
		Animal cow = new Cow ("Freeshin", 6 , 'M');
		
		Vet vet = new Vet ("Tom");
		
		
		System.out.println(dog.toString());
		System.out.println(cat.toString());
		System.out.println(cow.toString());
		
		
		
		
		
		
		Animal[] animals = new Animal[3];
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = cow;
		
		vet.vaccinate(animals);
		
		 /* for(Animal i:animals) {
			i.eat();
		}
		
		for(Animal i:animals) {
			i.makeSound();
		} */


	}

} // end class
