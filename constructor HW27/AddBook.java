class AddBook
{
	int bookID;
	String name;
	String authorName;
	boolean isAvailable;
	AddBook(int bookID,String name,String authorName,boolean isAvailable)
	{
		this.bookID=bookID;
		this.name=name;
		this.authorName=authorName;
		this.isAvailable=isAvailable;
	}
	int[] bookid(int bookId[],int index)
	{
		int newBookId[]=new int[index+1];
		for(int i=0;i<bookId.length;i++)
		{
			newBookId[i]=bookId[i];
		}
		newBookId[index]=bookID;
		return newBookId;
	}
	String[] name(String bookName[],int index1)
	{
	    String newBookName[]=new String[index1+1];
		for(int i=0;i<bookName.length;i++)
		{
			newBookName[i]=bookName[i];
		}
		newBookName[index1]=name;
		return newBookName;
	}
	String[] author(String author[],int index2)
	{
	    String newAuthor[]=new String[index2+1];
		for(int i=0;i<author.length;i++)
		{
			newAuthor[i]=author[i];
		}
		newAuthor[index2]=authorName;
		return newAuthor;
	}
	void borrowBook()
	{
		if(isAvailable==true)
		{
			System.out.println("Book is available to borrow");
			isAvailable=false;
		}
		else
		{
			System.out.println("Book is borrowed");
		}
	}
	void returnBook()
	{
		isAvailable=true;
		System.out.println("Book is returned");
	}
}