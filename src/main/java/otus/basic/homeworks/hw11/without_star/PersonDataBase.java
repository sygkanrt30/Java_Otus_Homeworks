package otus.basic.homeworks.hw11.without_star;


import java.util.HashMap;
import java.util.HashSet;

public class PersonDataBase {
    private final HashMap<Long, Person> mapOfPerson = new HashMap<>();
    private final HashSet<Position> positions = new HashSet<>();
    public HashMap<Long, Person> getMapOfPerson() {
        return mapOfPerson;
    }

    public PersonDataBase() {
        positions.add(Position.MANAGER);
        positions.add(Position.SENIOR_MANAGER);
        positions.add(Position.DIRECTOR);
        positions.add(Position.BRANCH_DIRECTOR);
    }

    public Person findById(Long id) {
        return mapOfPerson.get(id);
    }

    public void add(Person person) {
        mapOfPerson.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        Position position = mapOfPerson.get(person.getId()).getPosition();
        return positions.contains(position);
    }

    public boolean isEmployee(Person person) {
        return !isManager(person);
    }

}
