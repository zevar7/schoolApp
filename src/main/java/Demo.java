import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        list<String> names = new ArrayList<>();
        //store an ordered collection of elements
        //ArrayList
        // dynamic array
        names.add("Java");
        names.add("JavaScript");
        names.add("Python");
        names.remove("JavaScript");
        names.remove("Python");
        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.contains("html"));

        list<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(6);
        nums.add(10);
        System.out.println(nums.contains(6));
        System.out.println(nums.isEmpty());

        nums.clear();
        System.out.println(nums);
    }
}
