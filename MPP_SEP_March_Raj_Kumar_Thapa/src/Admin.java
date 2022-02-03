import java.util.List;
import java.util.stream.Collectors;

public class Admin {
	public static List<Student> obtainHonorRoll(List<Student> list) {
		//implement
		return list.stream()
				.filter(s -> s.getMajor().equals(Majors.CS))
				.filter(s -> s.getGpa() > 3.0)
				.collect(Collectors.toList());
	}
}