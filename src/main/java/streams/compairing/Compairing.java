package streams.compairing;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Compairing {

    public static void main(String[] args) {
        Student s1 = new Student("Surajit",70,164);
        Student s2 = new Student("Roma",92,153);
        Student s3 = new Student("Soma",95,163);

        Optional<Student> minHeight = Stream.of(s1, s2, s3).min(
                Comparator.comparing(s -> s.getHeight())
        );

        System.out.println("Min Height - " + minHeight.get());

        Optional<Student> maxScore = Stream.of(s1, s2, s3).max(
                Comparator.comparing(s -> s.getScore())
        );

        System.out.println("Max Score - " + maxScore.get());

        Optional<Student> largestName = Stream.of(s1, s2, s3).max(
                Comparator.comparing(s -> s.getName())
        );

        System.out.println("Largest Name - " +largestName.get());
    }
}
