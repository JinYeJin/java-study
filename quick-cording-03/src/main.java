import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String input_1 = sc.nextLine();
		String input_2 = sc.nextLine();
		
		int x = Integer.parseInt(input_1);
		int y = Integer.parseInt(input_2);
		
		
		try
		{
			float rst = x/y;
			System.out.println(rst);
		}catch(ArithmeticException ae)
		{
			ae.toString();
		}catch(NumberFormatException ne)
		{
			ne.toString();
		}catch(OverNumberException oe)
		{
			oe.toString();
		}
	}

}
