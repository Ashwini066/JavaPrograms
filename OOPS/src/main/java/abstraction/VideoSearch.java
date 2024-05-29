package abstraction;

public class VideoSearch extends Google{
	public void search()
	{
		System.out.println("Perform a video search");
	}

	public static void main(String[] args) {
		VideoSearch obj1=new VideoSearch();
		ImageSearch obj2=new ImageSearch();
		obj1.search();
		obj2.search();

	}

}
