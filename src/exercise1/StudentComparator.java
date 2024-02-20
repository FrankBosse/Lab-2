package exercise1;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
    
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAge() == s2.getAge()) {
            return s1.getName().compareTo(s2.getName());
        } else {
            return Integer.compare(s1.getAge(), s2.getAge());
        }
    }
}
