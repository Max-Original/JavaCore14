package javacore14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {
public static void main(String[] args) {
	
	Set<Car> setCars = new HashSet<Car>();
	
	setCars.add(new Car("Toyota",200));
	setCars.add(new Car("Dodge",180));
	setCars.add(new Car("Fiat", 220));
	setCars.add(new Car("Audi", 320));
	setCars.add(new Car("BMW", 280));
	setCars.add(new Car("Apolo", 320));
	
	Set<Car> setCars2 = new TreeSet<Car>();
	setCars2.addAll(setCars);
	
	List<Car> setCarsSorted = new ArrayList<Car>(setCars);
	
	Collections.sort(setCarsSorted, new CarSort());
	System.out.println("not sorted = "+"\n "+setCars+"\n ");
	System.out.println("sorted with Compator by speed and brand = "+"\n "+setCarsSorted+"\n ");
	System.out.println("sorted with Comparebel by brand = "+"\n "+setCars2+"\n ");
	
	
}
}
