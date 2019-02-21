package lambda.com;

public class Order {
	public static void main(String args[])
	{
		Customer_Order o=(amount)->
		{
			if (amount>1000)
			{
				System.out.println("Accepted");
			}
			else
			{
				System.out.println("Completed");
			}	
			return amount;};
		
		
			o.orders(1100);
			
	


	
}
}
