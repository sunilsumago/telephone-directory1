import java.util.*;
import java.lang.*;
class Tele
{
	public int id;
	public String name1,name2,name3,name4,name5,name6,name7,name8,name9,name10;
	public long no,no1,no2,no3,no4,no5,no6,no7,no8,no9,no10;
	
	Scanner s=new Scanner(System.in);
	void get()
	{
		
		System.out.println("Enter the name1:");
		name1=s.next();
		System.out.println("Enter the name2:");
		name2=s.next();
		System.out.println("Enter the name3:");
		name3=s.next();
		System.out.println("Enter the name4:");
		name4=s.next();
		System.out.println("Enter the name5:");
		name5=s.next();
		System.out.println("Enter the name6:");
		name6=s.next();
		System.out.println("Enter the name7:");
		name7=s.next();
		System.out.println("Enter the name8:");
		name8=s.next();
		System.out.println("Enter the name9:");
		name9=s.next();
		System.out.println("Enter the name10:");
		name10=s.next();

		System.out.println("Enter the no1:");
		no1=s.nextLong();
		System.out.println("Enter the no2:");
		no2=s.nextLong();
		System.out.println("Enter the no3:");
		no3=s.nextLong();
		System.out.println("Enter the no4:");
		no4=s.nextLong();
		System.out.println("Enter the no5:");
		no5=s.nextLong();
		System.out.println("Enter the no6:");
		no6=s.nextLong();
		System.out.println("Enter the no7:");
		no7=s.nextLong();
		System.out.println("Enter the no8:");
		no8=s.nextLong();
		System.out.println("Enter the no9:");
		no9=s.nextLong();
		System.out.println("Enter the no10:");
		no10=s.nextLong();
		
	}
}

class Directory extends Tele
{
	int id1,no;
	public void display()
	{
		System.out.println("\tTelephone \tDirectory");
		System.out.println("****************************************");

		System.out.println("----------------------------------");
		System.out.println("id\t\t name\t\t no");
		System.out.println("----------------------------------");

		System.out.println("\n1\t\t"+name1);
		System.out.println("\t\t\t"+no1);

		System.out.println("\n2\t\t"+name2);
		System.out.println("\t\t\t"+no2);

		System.out.println("\n3\t\t"+name3);
		System.out.println("\t\t\t"+no3);

		System.out.println("\n4\t\t"+name4);
		System.out.println("\t\t\t"+no4);

		System.out.println("\n5\t\t"+name5);
		System.out.println("\t\t\t"+no5);
		
		System.out.println("\n6\t\t"+name6);
		System.out.println("\t\t\t"+no6);
		
		System.out.println("\n7\t\t"+name7);
		System.out.println("\t\t\t"+no7);

		System.out.println("\n8\t\t"+name8);
		System.out.println("\t\t\t"+no8);
		
		System.out.println("\n9\t\t"+name9);
		System.out.println("\t\t\t"+no9);
		
		System.out.println("\n10\t\t"+name10);
		System.out.println("\t\t\t"+no10);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the id which you found:");
			id1=s.nextInt();
		}
		

		if(id1==1)
		{ 
			
			System.out.println("\n1\t\t"+name1);
			System.out.println("\t\t"+no1);
		}

		if(id1==2)
		{
			System.out.println("\n2\t\t"+name2);
			System.out.println("\t\t"+no2);
		}
		
		if(id1==3)
		{
			System.out.println("\n3\t\t"+name3);
			System.out.println("\t\t"+no3);
		}
		
		if(id1==4)
		{
			System.out.println("\n4\t\t"+name4);
			System.out.println("\t\t"+no4);
		}
		
		if(id1==5)
		{
			System.out.println("\n5\t\t"+name5);
			System.out.println("\t\t"+no5);
		}
		
		if(id1==6)
		{
			System.out.println("\n6\t\t"+name6);
			System.out.println("\t\t"+no6);
		}

		if(id1==7)
		{
			System.out.println("\n7\t\t"+name7);
			System.out.println("\t\t"+no7);
		}

		if(id1==8)
		{
			System.out.println("\n8\t\t"+name8);
			System.out.println("\t\t"+no8);
		}

		if(id1==9)
		{
			System.out.println("\n9\t\t"+name9);
			System.out.println("\t\t"+no9);
		}

		if(id1==10)
		{
			System.out.println("\n10\t\t"+name10);
			System.out.println("\t\t"+no10);
		}
		
		
	
	}
}
class SA1
{
	public static void main(String arg[])
	{
		Directory d=new Directory();
		d.get();

		d.display();
		
	}

}
		
				