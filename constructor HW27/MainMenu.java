import java.util.Scanner;
class MainMenu
{
	Scanner obj=new Scanner(System.in);
	int[] bookId=new int[0];
	String[] bookName=new String[0];
	String[] author=new String[0];
	int choice=0;
	int index=0;
	int index1=0;
	int index2=0;
	AddBook add;
	void mainMenu()
	{
		do
		{
			System.out.println("menu :");
			System.out.print("1. Add a new book\n2. Display all books\n3. Borrow a book\n4. Return a book\n5. Exit\n");
			System.out.println("enter your choice :");
			choice=obj.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("enter book ID :");
					int bookID=obj.nextInt();
					obj.nextLine();
					System.out.print("enter book name :");
					String name=obj.nextLine();
					System.out.print("enter author name :");
					String authorName=obj.nextLine();
					add=new AddBook(bookID,name,authorName,true);
					bookId=add.bookid(bookId,index++);
					bookName=add.name(bookName,index1++);
					author=add.author(author,index2++);
					break;
				case 2:
					DisplayBook dis=new DisplayBook();
					dis.display(bookId,bookName,author);
					break;
				case 3:
					add.borrowBook();
					break;
				case 4:
					add.returnBook();
					break;
				case 5:
					System.out.println("Thank You");
					break;
				default:
					System.out.println("Inavlid Choice");
			}
		}while(choice!=5);
	}
}