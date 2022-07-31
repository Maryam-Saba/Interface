interface drawable
{
	void draw();
}
class rectangle implements drawable
{
	public void draw()
	{
		System.out.println("Draw rectangle have four sides");
	}
}
class circle implements drawable
{
	public void draw()
	{
		System.out.println("Draw circle which have no sides");
	}
}
public class Interface
{
	public static void main(String args[])
	{
		rectangle obj1=new rectangle();
		circle obj2=new circle();
		obj1.draw();
		obj2.draw();
	}
}
