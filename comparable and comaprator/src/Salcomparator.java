import java.util.Comparator;

public class Salcomparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if(((emp)o1).salary > ((emp)o2).salary)return 1;
		if(((emp)o1).salary < ((emp)o2).salary)return -1;
		return 0;
	}

}
