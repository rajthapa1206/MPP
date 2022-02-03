import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product implements Cloneable{
	private String productID;
	private String description;
	private String manufacturer;
	private double price;
	
	public Product(String productID, String description, String manufacturer, double price) {
		this.productID = productID;
		this.description = description;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Product copy = (Product)super.clone();
		return copy;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(productID, description, manufacturer, price);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj.getClass() != this.getClass()) return false;
		if (obj == this) return true;
		Product prod = (Product) obj;
		return productID.equals(prod.productID) &&
				description.equals(prod.description) &&
				manufacturer.equals(prod.manufacturer) &&
				price == prod.price;		
	}
	
	@Override
	public String toString() {
		return "[ProductID: " + getProductID() +
				" Description: " + getDescription() +
				" Manufacturer: " + getManufacturer() +
				" Price: " + getPrice() + "]";
	}

	public static void main(String[] args) {
		List<Product> arr1 = new ArrayList<Product>();
		arr1.add(new Product("00330-53981-80677-ABOEM", "XP", "Dell", 879.99));
		arr1.add(new Product("00330-53981-80677-AAOEM", "XPS 13 Laptop", "Dell", 879.99));
		arr1.add(new Product("45879-53981-80677-42SDF", "XPS 15 Laptop", "Dell", 949.99));
		arr1.add(new Product("45879-52879-80677-42SDF", "Inspiron 15 Laptop", "Dell", 279.99));
		arr1.add(new Product("45879-52879-54789-42SDF", "Dell 24 Monitor - SE2422H", "Dell", 149.99));
		arr1.add(new Product("00330-53981-80677-AAOEM", "ThinkPad L14 Gen 2 Intel", "Lenovo", 979.99));
		arr1.add(new Product("00330-53981-80677-DF233", "ThinkPad X1 Titanium Yoga Intel", "Lenovo", 1049.99));
		arr1.add(new Product("13413-54315-32213-ABOEM", "Yoga 9i - Shadow Black", "Lenovo", 1279.99));
		arr1.add(new Product("00330-53981-59672-BD587", "Lenovo C27-30 27 inch FHD Monitor", "Lenovo", 149.99));
		arr1.add(new Product("98754-43513-23421-DSA32", "MacBook Pro 13", "Apple", 1299));
		arr1.add(new Product("54983-78259-80677-DAF23", "MacBook Air", "Apple", 999.99));
		arr1.add(new Product("98754-43513-23421-ADS52", "Pro Display XDR", "Apple", 599));
		arr1.add(new Product("32547-65897-20154-GDH23", "iPhone 13", "Apple", 699.99));
		
		System.out.printf("Average of price of all products: %.2f", 
		arr1.stream()
		.mapToDouble(Product::getPrice)
		.average().getAsDouble());
		
		System.out.println("\nDistinct Product Manufacturers that begin with the letter D in sorted order: ");
		arr1.stream()
		.filter(p -> (p.getManufacturer().startsWith("D")))
		.map(Product::getManufacturer)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.printf("Total Sum of all the prices: %.2f", 
				arr1.stream()
				.mapToDouble(Product::getPrice)
				.reduce(0,(a,b) -> a + b));
		
		System.out.println("\nDell products whose price is greater than $40: ");
		arr1.stream()
		.filter(p -> (p.getManufacturer().equals("Dell") && p.getPrice() > 40))
		.forEach(System.out::println);
		
		System.out.println("Products details with Manufacturer starting with D as capitalized without changing old ones: ");
		arr1.stream()
		.map( p -> {
			if (p.getManufacturer().startsWith("D")) {
				return new Product(p.getProductID(),
						p.getDescription(),
						p.getManufacturer().toUpperCase(),
						p.getPrice());			
			} else
			return p;
		})
		.forEach(System.out::println);
		
		System.out.println("Products details with Manufacturer starting with D make them as capitalized: ");
		arr1.stream()
		.forEach(p -> {
			if (p.getManufacturer().startsWith("D")) {
				System.out.print("\nProductID: " + p.getProductID() +
						" Description: " + p.getDescription() +
						" Manufacturer: " + p.getManufacturer().toUpperCase() +
						" Price: " + p.getPrice());
			     } else {
			    	 System.out.println(p.toString());			    	 
			    	 }
			});

		System.out.println("Product details with manufacturer starting with A in first as sorted and other as it is: ");
		Stream.concat(
				arr1.stream()
				.filter(p -> (p.getManufacturer().startsWith("A")))
				.sorted(Comparator.comparing(Product::getProductID)),
				arr1.stream()
				.filter(p -> !(p.getManufacturer().startsWith("A"))))
				.forEach(System.out::println);
				
		System.out.println("Product details starting with manufacturer beginning at A following with D and later: ");
		Stream.concat(Stream.concat(
				arr1.stream()
				.filter(p -> (p.getManufacturer().startsWith("A"))), 
				arr1.stream()
				.filter(p -> (p.getManufacturer().startsWith("L")))),
				arr1.stream()
				.filter(p -> !(p.getManufacturer().startsWith("A") ||
						p.getManufacturer().startsWith("L"))))
		.forEach(System.out::println);
		
		System.out.println("Save products in a new list and if manufacturer starts with Ap capitalize it: ");
		List<Product> prods = arr1.stream()
				.map(p -> {
					if (p.getManufacturer().startsWith("Ap")) {
						return new Product(p.getProductID(),
								p.getDescription(),
								p.getManufacturer().toUpperCase(),
								p.getPrice());
					} else {
						return p;
					}
				})
				.collect(Collectors.toList());
		System.out.println(prods.toString());
		
		System.out.println("Every product details into a single string separated by '****': ");
		String s2 = arr1.stream()
				.map(Product::toString)
				.collect(Collectors.joining("****"));
		System.out.println(s2);
		
		System.out.println("Every product details with its third character in description capitalized: ");
		arr1.stream()
		.map(p -> {
			if (p.getDescription().length() >= 3) {
				char[] arr = p.getDescription().toCharArray();
				arr[2] = Character.toUpperCase(arr[2]);
				p.setDescription(String.valueOf(arr));
						/*
						 * String s = p.getDescription().substring(2,3); s =
						 * p.getDescription().substring(0,2)+s.toUpperCase()+p.getDescription().
						 * substring(3,p.getDescription().length()); p.setDescription(s);
						 */
			}
			return p;
		})
		.forEach(System.out::println);
				
	}
}