
public class StringCalculator 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello string calculator" );
    }

	public static int add(String string) throws RuntimeException {
	
		String arguments[]=string.split(",");
	
		/*removed after exception that lenght >2
		 if(arguments.length==2 && Integer.parseInt(arguments[0])>=0 && Integer.parseInt(arguments[1])>=0 &&Integer.parseInt(arguments[0])<=1000 && Integer.parseInt(arguments[1])<=1000 )
		{
			return ((Integer.parseInt(arguments[0]))+(Integer.parseInt(arguments[1])));
		}
		else if(arguments.length==1 && Integer.parseInt(arguments[0])>=0 &&Integer.parseInt(arguments[0])<=1000)
		{
			return Integer.parseInt(arguments[0]);
		}
		
		else
		{
			throw new RuntimeException();
		}
	*/
		int sum=0;
		for(String x : arguments)
		{
			int num=Integer.parseInt(x);
			if(num>=0)
			{
				if(num<=1000)  //ignoring elements greater than 1000
				{
					sum+=num;
				}
			}
			else
			{
				throw new RuntimeException();//elements with negative numbers
			}
		}
		if(arguments.length==0)
		{
			throw new RuntimeException();//for null string
		}
		return sum;
	}
	
    
}
