package otus.basic.homeworks.hw7;


import otus.basic.homeworks.hw7.transport.*;

public class Human {
    private final String name;
    private String currentTransport;
    private final CurrentTransport[] currentVehicle = {
            new Horse(600),
            new TerrainVehicle(150),
            new Car(70),
            new Bicycle()
    };

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getInTransport(TypeOfTransport transport) {
        switch (transport.getName()) {
            case "автомобиль", "вездеход":
                System.out.println(name + " сел в " + transport.getName());
                currentTransport = transport.getName();
                break;
            case "велосипед", "лошадь":
                System.out.println(name + " сел на " + transport.getName());
                currentTransport = transport.getName();
                break;
        }
    }

    public void getOutTransport() {
        switch (currentTransport) {
            case "автомобиль", "вездеход":
                System.out.println(name + " покинул " + currentTransport);
                currentTransport = "";
                break;
            case "велосипед":
                System.out.println(name + " слез с " + currentTransport + "а");
                currentTransport = "";
                break;
            case "лошадь":
                String reHorse = currentTransport.substring(0, currentTransport.length() - 1);
                System.out.println(name + " слез с " + reHorse + "и");
                currentTransport = "";
                break;

        }
    }

    public boolean driveOnTransport(TypeOfArea typeOfArea) {
        if (currentTransport == null) {
            System.out.println("Человек дошел!");
            return true;
        } else {
            String[] listOfTransport = {
                    "лошадь",
                    "вездеход",
                    "автомобиль",
                    "велосипед"
            };
            for (int i = 0; i < currentVehicle.length; i++) {
                if (currentTransport.equals(listOfTransport[i])) {
                    return currentVehicle[i].drive(typeOfArea);
                }
            }
        }
        return false;
    }

}
