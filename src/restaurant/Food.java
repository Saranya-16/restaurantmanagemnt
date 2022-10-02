package restaurant;
import java.util.Scanner;

public class Food {
	public String Name;
	public float Price;
	
	public Food() {
		this.Name=Name;
		this.Price=Price;
		
	}
	public void input()
	{
		Scanner bp=new Scanner(System.in);
		System.out.println("Enter the Name of the food");
		Name=bp.nextLine();
		System.out.println("Enter the Price of theFood");
		Price=bp.nextFloat();
		
		
	}
	public void Payment() {
		System.out.println("Price" +Price);
	}
	public String detail() {
		return Name+" "+Price;
	}
	public String getName() {
		return Name;
		
	}
	public void setName(String Name) {
		
	}
	public void setPrice(float Price) {

}
}
