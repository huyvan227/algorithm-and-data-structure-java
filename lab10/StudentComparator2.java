import java.util.Comparator;
public class StudentComparator2 implements Comparator{
	public int compare(Object o1, Object o2){
		Student s1 = (Student) o2;
		Student s2 = (Student) o1;
		double result = s1.avg() - s2.avg();
		if(result > 0) return 1;
		if(result < 0) return -1;
		return 0;
	}
	

}