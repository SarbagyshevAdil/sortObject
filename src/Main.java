import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("Adil",16);
        Student student1=new Student("Jazira",17);
        Student student2=new Student("Kunduz",18);
        Student student3=new Student("Asema",19);
        Student student4=new Student("Max",20);
        LinkedList<Student>list=new LinkedList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        System.out.println(list);
    }
}