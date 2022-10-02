package restaurant;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Food> foodlist=new ArrayList<>();
		ManageFood managefood=new ManageFood();
		int select;
		Scanner bp=new Scanner(System.in);
		do {
			 Menumain();
			 select=Integer.parseInt(bp.nextLine());
			switch (select) {
			case 1:
				do {
					 MenuManageFood();
					 select=Integer.parseInt(bp.nextLine());
					switch (select) {
					case 1:
						managefood.bp();
						break;
						
						
						case 2:	
							managefood.print();
							managefood.DelteFood();
							break;
						case 3:
							managefood.printOrder();
							break;
						case 4:
							managefood.search();
							break;
						case 0:
							System.out.println("back");
							break;
					
							default:
								break;
					}
					}while(select !=0);
					break;
					case 2:
					do {
					MenuOrder();
					 select=Integer.parseInt(bp.nextLine());
					switch (select) {
					case 1:
						managefood.print();
						managefood.Price();
						break;
					case 0:
							System.out.println("back");
							break;
							default:
								break;
					}
					
					}while(select!=0);
					break;
					default:
						break;
			}
		
			
		}while(select!=3);
	}
	static void MenuManageFood() {
	System.out.println("---------Menu Manage Food--------");
	System.out.println("0.Back to  main menu");
	System.out.println("1.Add food to Menu");
	System.out.println("2.Delete food from Menu");
	System.out.println("----------------------");
	System.out.println("select");
	}
		static void MenuOrder() {
			System.out.println("---------Menu Order--------");
			System.out.println("0.Back to main menu");
			System.out.println("1.Print food and order");
			System.out.println("----------------------");
			System.out.println("select");
			}
		static void Menumain() {
			System.out.println("----WELCOME TO 'delicious' RESTAURANT--------");
			System.out.println("1.Manage Food");
			System.out.println("2.Manage Order");
			System.out.println("3.Exit");
		}
	
		
}
		
	

