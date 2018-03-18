package SortingBasic.SelectionSortUsingComparable;

/**
 * 描述:学生类
 *
 * @author 闫文强
 * @create 2018-03-18 9:42
 */
public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student student) {
		if (this.score<student.score)
			return -1;
		else if (this.score>student.score)
			return 1;
		else
			return this.name.compareTo(student.name);
	}

	@Override
	public String toString() {
		return "Student: " + this.name + " " + Integer.toString( this.score );
	}
}