class DisplayBook
{
	void display(int bookId[],String bookName[],String author[])
	{
		if(bookId.length==0)
		{
			System.out.println("There is no book to display");
		}
		for(int i=0;i<bookId.length;i++)
		{
			System.out.println("************* Book Number "+(i+1)+" *************");
            System.out.println("Book ID :"+bookId[i]);
			System.out.println("Book Name :"+bookName[i]);
			System.out.println("Author Name :"+author[i]);
		}
	}
}