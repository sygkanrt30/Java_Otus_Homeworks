package otus.basic.homeworks.hw11.without_star;

public enum Position {
    MANAGER("manager"),
    DIRECTOR("director"),
    DRIVER("driver"),
    ENGINEER("engineer"),
    SENIOR_MANAGER("senior manager"),
    DEVELOPER("developer"),
    QA("qa"),
    JANITOR("janitor"),
    PLUMBER("plumber"),
    BRANCH_DIRECTOR("branch director"),
    JUNIOR_DEVELOPER("junior developer");

    public String getName() {
        return name;
    }

    final String name;

    Position(String name) {
        this.name = name;
    }
}
