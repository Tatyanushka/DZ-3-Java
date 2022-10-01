import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("red");
        list.add("blue");
        list.add("black");
        list.add("green");
        list.add("orange");
        System.out.println("Список 1: " + list);
    
        
        //добавляем к каждому элементу символ '!'
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+"!");
        }
        System.out.println();


        System.out.println("Вставка на первую позицию элемента yellow :");
        list.add(0,"yellow");
        for (String str : list){
            System.out.println(str);
        }
        System.out.println();


        System.out.println("Извлечение элемента по 3 индексу из списка: " + list.get(3));
        System.out.println("Обновдение элемента массива по 3 индексу на <grey>: ");
        list.set(3, "grey");
        for (String str : list){
            System.out.println(str);
        }
        System.out.println();


        System.out.println("Удалениe третьего элемента (grey) из списка массивов: ");
        list.remove(3);
        for (String str : list){
            System.out.println(str);
        }
        System.out.println();


//поиска элемента в списке массивов:
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элемент для поиска: ");
        String element = in.nextLine();
    
        if (list.contains(element)) {
            System.out.println("Элемент присутствует в списке массивов!");
        } else {
            System.out.println("Элемента нет в списке массивов!");
        }
        System.out.println();


        //сортировка заданного списка массивов:
        System.out.println("Список перед сортировкой: "+list);
        Collections.sort(list);
        System.out.println("Список после сортировки: "+list);
        System.out.println();


        // копирование одного списка массивов в другой:
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");
        System.out.println("Список 2: " + list2);
        Collections.copy(list, list2); //копируем список 2 в список 1
        System.out.println("После копирования список 1: " + list);
        System.out.println("После копирования список 2: " + list2);
    }       
}



