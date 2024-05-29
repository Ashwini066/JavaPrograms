package aggregation;

class BookDetails {
	String bookname,  storename;
	int noofbooks;
	AuthorDetails ad;
	public BookDetails(String bookname,String  storename,int noofbooks,AuthorDetails ad)
	{
		this.bookname=bookname;
		this.storename=storename;
		this.noofbooks=noofbooks;
		this.ad=ad;
	}
	public void printdetails()
	{
		System.out.println("Bookname : "+bookname);
		System.out.println("Store name : "+storename);
		System.out.println("No of books available : "+noofbooks);
		System.out.println("Author details : "+ad.Authorname+" aka "+ ad.Authornickname);
	}

	public static void main(String[] args) {
		AuthorDetails add= new AuthorDetails("Mary Queen","Mary");
		BookDetails bd = new BookDetails("The Hypocrite","Wellington",75,add);
		bd.printdetails();

	}

}
