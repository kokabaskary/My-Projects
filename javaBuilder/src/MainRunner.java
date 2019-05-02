import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog1 = new Animal("Tom", 4);
		Animal dog2 = new Animal("Cookies", 4);
		Animal dog3 = new Animal("Cookies", 4);
		Animal dog4 = new Animal("Biscuit", 4);
		Animal dog5 = new Animal("Buscuit", 4);
		
		ArrayList<Animal> dogList = new ArrayList<Animal>(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
		
		
		
//		Animal[] shahsPets1 = {dog2, dog3};//using array
//		List<Animal> shahsPets2 = new ArrayList<Animal>();//using arraylist
//		shahsPets2.add(dog2);
//		shahsPets2.add(dog3);
		
		//short cut for adding list elements
//		ArrayList<Animal> shahsPet = new ArrayList<Animal>(Arrays.asList(dog2,dog3,dog4));
//		
//		for (Animal animal : shahsPet) {
//			System.out.println(animal.name);
//		}
////		
		String animalName = "Cookies";
		
//		Animal animal = null;
		
		ArrayList<Animal> aList = new ArrayList<>();
		
//		for(int i=0; i<shahsPet.size(); i++) {
//			if(!shahsPet.get(i).name.equals(animalName)) {
//				continue;
//			}else {
//				System.out.println("Size before removal: "+ shahsPet.size());
//				shahsPet.remove(shahsPet.get(i));//removing from shah's pet list
////				animal =shahsPet.get(i);
////				aList.add(shahsPet.get(i));
////				System.out.println("Dog Found with name: "+ shahsPet.get(i).name);
//				
////				System.out.println("Dog Found with name: "+ animal.name);
//
//			}
//		}System.out.println("Number of Shah's pet is : "+ shahsPet.size());
////		System.out.println("Dog Found with name: "+ shahsPet.size());
////		System.out.println("Dog Found with name: "+ aList.size());
//		
//		
//	}
		
		 // Create a new ArrayList for non duplicate 
        ArrayList<Animal> distinct = new ArrayList<Animal>();
        
        
        for(int i=0; i<dogList.size();i++) {
        	for(int j=0; i<distinct.size(); j++) {
        		String dAnimal =null;
        		dAnimal=dogList.get(i).name;
        		distinct.get(j).name= dAnimal;
        		break;
        	}
        	for (int k = 0; k <distinct.size(); k++) {
        		if(!dogList.get(i).name.equals(distinct.get(k).name)) {
        			distinct.add(dogList.get(i));
        			}
        		}
        	}
        for(Animal disDog: distinct) {
        	System.out.println(disDog.name);
        }
		
//		for(int i= shahsPet.size()-1;i>=0; i--) {
//			if(!shahsPet.get(i).name.equals(animalName)) {
//				continue;
//			}else {
//				System.out.println("Size before removal: "+ shahsPet.size());
//				shahsPet.remove(shahsPet.get(i));//removing from shah's pet list
//				
//			}
//		}System.out.println("Number of Shah's pet is : "+ shahsPet.size());
//		
//		System.out.println("Here are our avaliable dogs: ");
//		for (Animal dog : dogList) {
//			System.out.println(dog.name);
//			
//		}

		
	}

}
