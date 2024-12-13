package otus.basic.homeworks.hw11;


import otus.basic.homeworks.hw11.with_star.BinaryTreeSearch;
import otus.basic.homeworks.hw11.with_star.TreeNode;
import otus.basic.homeworks.hw11.without_star.Person;
import otus.basic.homeworks.hw11.without_star.PersonDataBase;
import otus.basic.homeworks.hw11.without_star.Position;
import otus.basic.homeworks.hw11.without_star.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        PersonDataBase personDataBase = new PersonDataBase();
        ArrayList<Person> listOfPerson = new ArrayList<>(List.of(
                new Person("Jake", Position.DEVELOPER, 1343L),
                new Person("Paul", Position.BRANCH_DIRECTOR, 13784L),
                new Person("CJ", Position.DRIVER, 444L),
                new Person("Brandon", Position.ENGINEER, 1003L),
                new Person("Dell", Position.QA, 121233L),
                new Person("Sofia", Position.JANITOR, 1223L),
                new Person("Bob", Position.PLUMBER, 7896L),
                new Person("John", Position.MANAGER, 3369L),
                new Person("Mike", Position.SENIOR_MANAGER, 56778L),
                new Person("Zion", Position.DIRECTOR, 75675L),
                new Person("Stephen", Position.JUNIOR_DEVELOPER, 120003L),
                new Person("Moses", Position.JUNIOR_DEVELOPER, 122143L),
                new Person("Trevor", Position.QA, 123L)
        ));
        for (Person person : listOfPerson) {
            personDataBase.add(person);
        }
        Person person = personDataBase.findById(122143L);
        System.out.println(personDataBase.isManager(person));
        System.out.println(personDataBase.isEmployee(person));
        System.out.println("Первое задание закончилось");
        int[] array = {1, 4, 5, 56, 8, 7, 6, 5, 4, 35, 67, 56, 2};
        Sort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        array = new int[]{1, 4, 5, 56, 8, 7, 6, 5, 4, 35, 67, 56, 2};
        Sort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
        System.out.println("Второе задание закончилось");
        ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 8, 9, 45, 67, 88, 89, 90, 99, 100));
        BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch(arr);
        TreeNode tree = binaryTreeSearch.sortedListToBinaryTreeSearch();
        int value = binaryTreeSearch.find(100, tree);
        System.out.println(value);

    }
}

