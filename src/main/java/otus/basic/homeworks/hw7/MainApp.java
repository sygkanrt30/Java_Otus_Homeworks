package otus.basic.homeworks.hw7;


public class MainApp {
    public static void main(String[] args) {
        Human human = new Human("Bob");
        TypeOfArea[] typeOfAreas = {
                TypeOfArea.SWAMP,
                TypeOfArea.FOREST,
                TypeOfArea.PLAIN,
        };
        TypeOfTransport[] typesOfTransport = {
                TypeOfTransport.HORSE,
                TypeOfTransport.CAR,
                TypeOfTransport.TERRAIN_VEHICLE,
                TypeOfTransport.BICYCLE
        };
        boolean bool;
        for (TypeOfTransport transport : typesOfTransport) {
            human.getInTransport(transport);
            for (TypeOfArea typeOfArea : typeOfAreas) {
                bool = human.driveOnTransport(typeOfArea);
                System.out.println(bool);
                System.out.println();
            }
            human.getOutTransport();
            System.out.println();
        }
    }
}
