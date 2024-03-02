import java.util.Arrays;
import java.util.Comparator;

class emp implements Comparable
{
	String name;
	int id;
	double salary;
	public static int num=100;
	emp(String n,double s)
	{
		name=n;
		salary=s;
		id=num++;
	}
	@Override
	public int compareTo(Object o) {
		return name.compareTo(((emp)o).name);
	}
	@Override
	public String toString() {
		return "name = "+name+",salary="+salary;
	}
}

public class Demo_02 {

	public static void main(String[] args) {
		emp[]e= {new emp("Ronila",50000.50),
				 new emp("Dev",20000.0),
				 new emp("Krish",30000.8),
				 new emp("Roshan",15000.5),
				 new emp("Gill",10000.9)
		};
		//Arrays.sort(e);
		//Arrays.sort(e,new Salcomparator());
		//Arrays.sort(e,new Namecomparator());
		for(emp a:e)
		{
			System.out.println(a);
		}
	}

}
