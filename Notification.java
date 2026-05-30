
public class Notification {
	public static void main(String args[])
	{
		Notify o=new Notify();
		o.Insta();
		o.Twitter();
	}

}
interface NotifyInsta
{
	void Insta();
}
interface NotifyTwitter
{
	void Twitter();
}
class Notify implements NotifyInsta,NotifyTwitter
{
	public void Insta() {
		System.out.println("Notification from Insta");
		
	}
	public void Twitter() {
		System.out.println("Notification from Twitter");
		
	}
	
}