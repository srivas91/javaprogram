
class MyClass
{
	int a=10;
	private int id=202;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
}
public class AccessDemo {

	public static void main(String[] args) {
	  MyClass obj=new MyClass();
	  obj.setId(303);
	  System.out.println("id is"+obj.getId());
	  
	}

}
