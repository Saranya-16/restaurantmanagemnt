package restaurant;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood {
	ArrayList<Food> foodlist=new ArrayList<>();
	ArrayList<GuestOrder> guestorder=new ArrayList<>();
	Food Food;
	public GuestOrder GuestOrder;
	public int SelectFood;
	public ManageFood() {
		
	}
	Scanner bp=new Scanner(System.in);
	
	public void bp() {
		System.out.println("Enter number of food to be added in menu");
		int n=Integer.parseInt(bp.nextLine());
		for (int i=0;i<n;i++) {
			Food food =new Food();
			food.input();
			foodlist.add(food);
		}
	}
	public void print() {
		for(int i=0;i<foodlist.size();i++) {
			System.out.println((i+1)+"."+foodlist.get(i).detail());
		}
	}
		
		public void Price(){
			float PriceFood=0;
			float Totalpayment=0;
			int number;
			GuestOrder guest=new GuestOrder();
			guest.input();
			guestorder.add(guest);
			for(int i=0;i<10;i++) {
				System.out.println("select Food"+(i+1));
				SelectFood=bp.nextInt();
			
				if(SelectFood==0)
				{
					guest.setTotalpayment(Totalpayment);
					System.out.println("Total Payment");
					System.out.println(Totalpayment);
					System.out.println("Thank you , Visit Again");
					System.out.println("\n**********************");				
					break;
				}
				else {
					System.out.println("Enter Quantity");
					number=bp.nextInt();
					Food food= foodlist.get(SelectFood -1);
					guest.setEatList(food);
					PriceFood=food.Price*number;
				}
				Totalpayment+=PriceFood;
				System.out.println("Order finish");
				System.out.println("Payment is"+i);
				System.out.println(""+PriceFood);
				System.out.println(" If  Order placed enter 0");
			}
		}
			public void printOrder() 
			{
				for(int i=0; i<guestorder.size();i++) {
					guestorder.get(i).print();
					
				}
					
					}
			public void search() {
				Scanner bp=new Scanner(System.in);
				String idtable;
				int up=0;
				System.out.println("Enter table number payment");
				idtable=bp.nextLine();
				for(int i=0;i<guestorder.size();i++ ) {
					
				
				if(guestorder.get(i).getIdTable().equalsIgnoreCase(idtable)) 
				{
					guestorder.get(i).print();	
					up++;
				}
				}
				if(up==0) {
					System.out.println("No table number"+idtable);
				}
					
				
	}
			
			public void DelteFood() {
				String deletefood;
				int up=0;
				System.out.println("Enter name of the food to delete");
				deletefood=bp.nextLine();
				
				for(int i=0;i<foodlist.size();i++) {
					if(foodlist.get(i).getName().equals(deletefood)) {
						up++;
						foodlist.remove(i);
						System.out.println("deleted from menu");
						break;
						
					}
				}if(up==0) {
					System.out.println(deletefood+ "Not Found");
				}
				}
				
			}


		
			
		

	
	


