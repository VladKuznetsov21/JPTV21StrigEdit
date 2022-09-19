/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21stringedit;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21StringEdit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==== StringEdit ====");
        System.out.println("==== Введите текст латиница ====");
        String str = scanner.nextLine();
        int repeat = 1;
        do {
            System.out.println("Выбирите номер функции: ");
            System.out.println("1. Количество сим. в тексте: ");
            System.out.println("2. Количество слов в тексте: ");
            System.out.println("3. Находит указанную подстроку в тексте: ");
            System.out.println("4. Заменяет указанную подстроку на другую подстроку: ");
            int numberFunction = scanner.nextInt();
            scanner.nextLine();
            switch (numberFunction) {
                case 0:
                    System.out.println("Bye!!!");
                    repeat = 0;
                case 1:
                    System.out.println("Выбрали функцию \"1. Количество сим. в тексте\"");
                    char[] strChar = str.toCharArray();
                    System.out.println("Просчитано: "+strChar.length+ "символ");
                    break;
                case 2:
                    System.out.println("Выбрали функцию \"2. Количество слов в тексте\"");
                    String[] wordArray = str.split("");
                    System.out.println("Просчитано: "+wordArray.length+ "слов");
                    break;
                case 3:
                    System.out.println("Выбрали функцию \"3. Находит указанную подстроку в тексте\"");
                    System.out.println("Введите подстроку поиска ");
                    String subStr = scanner.nextLine();
                    int indexSubStr = str.indexOf(subStr);
                    if(indexSubStr < 0) {
                        System.out.println("Такой подстроки в строке нет");
                    }else{
                        indexSubStr++;
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Выбрали функцию \"4. Заменяет указанную подстроку на другую подстроку\"");
                    System.out.println("");
                    break;
                default:
                    break;
            }        
            System.out.println("==================");
            if(repeat == 0) break;
        } while (true);
    }
    
}
