package otus.basic.homeworks.hw19;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.List;


public class MainApp {
    public static final Logger LOGGER = LogManager.getLogger(MainApp.class);

    public static void main(String[] args) {
        LOGGER.info("Начало работы приложения");
        List<Integer> arr = new ArrayList<>(List.of(3, 4, 5, 2, 1, 2, 31, 45, 5, 5, 11));
        List<Integer> newArr = elementsAfterLastOne(arr);
        System.out.println(newArr);
        LOGGER.info("Первая часть закончена");
        arr = new ArrayList<>(List.of(1, 1, 2));
        System.out.println(isContainsOneAndTwo(arr));
        LOGGER.info("Вторая часть закончена");
        LOGGER.info("Конец работы приложения");
    }

    public static List<Integer> elementsAfterLastOne(List<Integer> array) {
        LOGGER.debug("Начало работы метода elementsAfterLastOne");
        List<Integer> newArray = new ArrayList<>();
        if (!array.contains(1)) {
            throw new RuntimeException("В массиве нет единиц!!");
        } else {
            for (int i = 0; i < array.size(); i++) {
                if (array.get(array.size() - (i + 1)) == 1) {
                    newArray = array.subList(array.size() - i, array.size());
                    LOGGER.info("Создан новый список - {}", newArray);
                    break;
                }
            }
        }
        LOGGER.debug("Конец работы метода elementsAfterLastOne");
        return newArray;
    }

    public static boolean isContainsOneAndTwo(List<Integer> arr) {
        LOGGER.debug("Начало работы метода isContainsOneAndTwo");
        if (!(arr.contains(1) && arr.contains(2))) {
            LOGGER.info("Проверили есть ли в списке, хотя бы одна единица или двойка");
            return false;
        }
        for (Integer i : arr) {
            if (i != 1 && i != 2) {
                return false;
            }
        }
        LOGGER.info("Проверили нет ли в списке иных элементов");
        LOGGER.debug("Конец работы метода isContainsOneAndTwo");
        return true;
    }
}
