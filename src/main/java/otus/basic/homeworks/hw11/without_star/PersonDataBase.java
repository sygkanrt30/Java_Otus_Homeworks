package otus.basic.homeworks.hw11.without_star;


import java.util.HashMap;

public class PersonDataBase {
    private final HashMap<Long, Person> mapOfPerson = new HashMap<>();

    public HashMap<Long, Person> getMapOfPerson() {
        return mapOfPerson;
    }

    public Person findById(Long id) {
        return mapOfPerson.get(id);
    }

    public void add(Person person) {
        mapOfPerson.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        Position position = mapOfPerson.get(person.getId()).getPosition();
        return position.equals(Position.DIRECTOR) || position.equals(Position.MANAGER) ||
                position.equals(Position.SENIOR_MANAGER) || position.equals(Position.BRANCH_DIRECTOR);
    }

    public boolean isEmployee(Person person) {
        return !isManager(person);
    }

}
