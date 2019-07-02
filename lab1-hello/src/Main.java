
public class Main {
	public static void main(String args[])
	{
//		int a=10;
//		double price =10.5;
//		String name =  "Tanyarat";
//		System.out.println(name.toUpperCase());
//		System.out.println("Price: "+price);
//		
//		int[] num = {1,2,3,4,9};
//		for(int i=0; i<num.length; i++)
//			System.out.println(num[i]);
//		
//		int[] num2 = new int[100];
//		
//		String[] fruits = {"banana","apple"};
//		for(String f : fruits)
//			System.out.println(f);
		
		String tel = "053-453-063";
		String[] ts = tel.split("-");
		for(String t : ts)
			System.out.println(t);
	}
}