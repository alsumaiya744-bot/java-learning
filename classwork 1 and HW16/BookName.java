import java.util.Scanner;
class BookName
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		Scanner obj1=new Scanner(System.in);
		System.out.print("enter the total number of books :");
		int num=obj.nextInt();
		String Book_Name[]=new String[num];
		int Book_ID[]=new int[num];
		int index=0;
		int option;
		do
		{
			System.out.println("**************************************************");
			System.out.println("menu :");
			System.out.println("1. Add books");
			System.out.println("2. see the book list");
			System.out.println("3. search book by ID");
			System.out.println("4. exit");
			System.out.println("choose the option");
			option=obj.nextInt();
			switch(option)
			{
			case 1:
					if(index<Book_Name.length)
					{
					System.out.print("enter the name of book"+" "+(index+1)+" :");
					Book_Name[index]=obj1.nextLine();
					System.out.print("enter the ID of book"+" "+(index+1)+" :");
					Book_ID[index]=obj.nextInt();
					index++;
					}
					break;
			case 2:
				System.out.println("***********Book List***********");
				for(int i=0;i<Book_Name.length;i++)
				{
					if(Book_Name[i]!=null)
					{
					System.out.println("Book name"+"             "+"Book ID");
					System.out.println(Book_Name[i]+"                    "+Book_ID[i]);
					}
				}
				break;
			case 3:
					System.out.print("enter book ID :");
					int ID=obj.nextInt();
					boolean found=false;
					for(int i=0;i<Book_Name.length;i++)
					{
						if(ID==(Book_ID[i]))
						{
							System.out.println("Book Name :"+Book_Name[i]);
							found=true;
						}
					}
					if(!found)
					{
						System.out.println("incorrect ID");
					}
					break;
			case 4:
				System.out.println("Thank you");
				break;
			default:
				System.out.print("invalid choice");
			}
		
		}while(option<4);
	}
}