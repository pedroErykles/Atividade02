package app;

import java.util.Scanner;

import entites.Product;

public class Application {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Product p1 = new Product();
		
		int add;
		int remove;
		
		p1.setName("TV");
		p1.setPrice(900.00);
		p1.setQuantity(10);
		p1.totalValueStock();
		
		System.out.println(p1.toString());
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Enter the number of products to be added from stock: ");
		add = s.nextInt();
		
		p1.addProducts(add);
		
		System.out.println(p1.toString());
		
		System.out.println("Enter the number of products to be removed from stock: ");
		remove = s.nextInt();
		
		p1.removeProducts(remove);
		
		System.out.println(p1.toString());
		
		
		
		
		
		
		
	}

}
