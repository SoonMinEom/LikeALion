package OnClass.c221006.collection;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getSutdents();

        for (String student : students) {
            System.out.println(student);
        }

        System.out.println(students.size());
    }
}
