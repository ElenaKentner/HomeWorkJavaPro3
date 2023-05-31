/*
Задачи на ArrayList:
1.Удаление дубликатов: Напишите метод, который принимает массив int и возвращает ArrayList,
содержащий все уникальные элементы исходного массива, сохраняя их порядок.
2.Обратный порядок: Напишите метод, который принимает массив int и возвращает ArrayList,
содержащий элементы исходного массива в обратном порядке.
Задачи на Set:
3.Поиск пересечения: Напишите метод, который принимает два массива int и возвращает Set,
содержащий элементы, которые присутствуют и в первом, и во втором массивах.
4.Подсчет уникальных элементов: Напишите метод, который принимает массив int и возвращает
количество уникальных элементов в этом массиве, используя Set для хранения уникальных значений.
 */

package HomeWork3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] array1 = {3,2, 3, 2, 4, 1, 5, 3, 1}; //создаем и инициализируем массив интов
        int[] array2 = {5, 6, 4, 7, 3, 1, 1, 9}; //создаем и инициализируем массив интов второй

        ArrayList<Integer> uniqueList = removeDuplicates(array1); //вызываем мптод удаления дубликатов и сохраняем результат в uniqueList
        System.out.println("Массив после удаления дубликатов: " + uniqueList); //в консоль результат после применения метода удаления дубликатов

        ArrayList<Integer> reserveList = reversedArray(array1); //вызываем метод вернуть инты в обратном порядке
        System.out.println("Массив в обратоном порядке: " + reserveList); //результат в консоль

        Set<Integer> intersection = findIntersection(array1, array2); //вызов метода найти пересекающиеся значения в 2 массивах
        System.out.println("Пересекающиеся элементы из двух массивов: " + intersection);

        Set<Integer> uniqueElements = findUniqueElements(array1); //вызываем метод количества уникальных элементов
        System.out.println("Количество уникальных элементов: " + uniqueElements);

    }

    //1.Удаление дубликатов: Напишите метод, который принимает массив int и возвращает ArrayList,
    //содержащий все уникальные элементы исходного массива, сохраняя их порядок.
    public static ArrayList<Integer> removeDuplicates(int[] array) {
        ArrayList<Integer> result = new ArrayList<>(); //создаем аррейлист
        HashSet<Integer> set = new HashSet<>(); //создаем HashSet
        for (int num : array) { //проходим по массиву без индексауии
            // for (int i = 0; i < array.length; i++) {  или так с индексацией
            //    int num = array[i];}
            if (!set.contains(num)) { //если элемент не содержится в HashSet(contains - метод на содержание у сет),
                result.add(num); //то добавляем в ArrayList result
                set.add(num); //добавляем в HashSet set для следующей проверки
            }
        }
        return result; //возвращаем ArrayList result
    }

//    2.Обратный порядок: Напишите метод, который принимает массив int и возвращает ArrayList,
//    содержащий элементы исходного массива в обратном порядке.
        public static ArrayList<Integer> reversedArray(int[] array) {
            ArrayList<Integer> result = new ArrayList<>(); //создаем аррейлист
            for (int i = array.length - 1; i >= 0; i--) { // проходим по изначальному массиву с конца до начала
            result.add(array[i]); //добавляем результат в ArrayList result
        }
            return result; //возвращаем аррейлист с результатом обратного порядка
    }

//Задачи на Set:
//3.Поиск пересечения: Напишите метод, который принимает два массива int и возвращает Set,
//содержащий элементы, которые присутствуют и в первом, и во втором массивах.
    public static Set<Integer> findIntersection(int[] array1, int[] array2) {
        Set<Integer> intersection = new HashSet<>();
        Set<Integer> set = new HashSet<>(); //создаем сет для хранения пересечения элементов

        for (int num : array1) { //заполняем сет элементами из первого массива
            set.add(num);
        }
        for (int num : array2) { //проходим по всем элементам второго массива
            if (set.contains(num)) { //усли элемент уже есть в массивк1 - добавляем его в сет intersection
                intersection.add(num);
            }
        }
        return intersection;//возвращаем сет с пересечением элементов
    }

//4.Подсчет уникальных элементов: Напишите метод, который принимает массив int и возвращает
//    количество уникальных элементов в этом массиве, используя Set для хранения уникальных значений.
    public static Set<Integer> findUniqueElements(int[] array1) {
        Set<Integer> uniqueElements = new HashSet<>();  //зоздаем хешсет для хранения уникальных элементов
        for (int num : array1) { //добавляем все элеиенты массива в сет чтобы найти уникальные значения
            uniqueElements.add(num);
        }
        return uniqueElements; //возвращаем только коичество элеиентов в сете
    }






}
