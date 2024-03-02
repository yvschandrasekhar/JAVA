import java.util.Arrays;
class circle implements Comparable
{
	int radius;
	circle(int r)
	{
		radius=r;
	}
	@Override
	public String toString()
	{
		return "radius = "+radius;
	}
	public int compareTo(Object o) {
		return radius - ((circle)o).radius;
	}
}
public class Demo_01 {

	public static void main(String[] args) {
		circle[]c=new circle[4];
		c[0]=new circle(10);
		c[1]=new circle(40);
		c[2]=new circle(20);
		c[3]=new circle(50);
		Arrays.sort(c);
		for(circle a:c)
		{
			System.out.println(a );
		}
	}

}
