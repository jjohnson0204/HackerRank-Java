package Java.DataStructures.Medium;
import java.util.*;

/*
 * Create the Student and Priorities classes here.
 */

class Student {
    int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    public List<Student>getStudents(List<String>events) {
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(
                Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getId));
        List<Student> students = new ArrayList<>();
        for (String e : events) {
            Scanner in = new Scanner(e);
            String event = in.next();
            if(event.equals("ENTER")){
                String name = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();
                Student student = new Student(id, name, cgpa);
                studentQueue.add(student);
            }
            else if (event.equals("SERVED")) {
                Student first = studentQueue.poll();
            }
            in.close();
        }
        Student first = studentQueue.poll();
        if (first != null) {
            while (first != null) {
                students.add(first);
                first = studentQueue.poll();
            }
        }
        return students;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
