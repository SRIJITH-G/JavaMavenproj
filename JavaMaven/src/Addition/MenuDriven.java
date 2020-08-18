package Addition;

	import java.util.Scanner;

	public class MenuDriven {
		
		@SuppressWarnings("resource")
		public static void main(String [] args)
		{
			int a , gst = 10 ;
			int bill = 0 ;
			char choice;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Only one dish for one person");
			System.out.println("Enter c for Chapathi - 40Rs. ");
			System.out.println("Enter f for fried Rice - 90Rs.");
			System.out.println("Enter p for Poori - 55Rs.");
			System.out.println("Enter d for Dosa -75Rs.");
			String s = input.next();
			choice = s.charAt(0);
			
			
			switch(choice)
			{
			case 'c':
				System.out.println("Price of the Food:");
				a= input.nextInt();
				bill = a + gst;
				break;
		
			case 'f':
				System.out.println("Price of the Food:");
				a = input.nextInt();
				bill = a + gst;
				break;
			case 'p':
				System.out.println("Price of the Food:");
				a= input.nextInt();
				bill = a + gst;
				break;
			case 'd':
				System.out.println("Price of the Food:");
				a= input.nextInt();
				bill = a + gst;
				break;
		
		
				default:
				System.out.println("Not Available");
			}
			System.out.println("YOUR BILL + GST-10Rs. :" +bill);

		}
	}


