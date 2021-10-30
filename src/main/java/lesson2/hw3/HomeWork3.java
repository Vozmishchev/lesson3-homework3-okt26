package lesson2.hw3;

import javax.swing.plaf.synth.SynthSeparatorUI;
import java.util.Scanner;

public class HomeWork3 {
    /* Написать программу, которая загадывает случайное число от 0 до 9 и  пользователю дается 3 попытки угадать это число.
      При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
      чем загаданное,  или меньше. После победы или проигрыша выводится запрос –
      «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tryuse = 0;
        int random = (int) (Math.random() * 9);
        System.out.print("Угадай число с трех попыток от 0 до 9 :");

        while (tryuse < 3) {
            int number = input.nextInt();

            if (number > random) {
                System.out.print("Загаданное число меньше:");
                System.out.println("");
            } else if (number < random) {
                System.out.print("Загаданное число больше:");
                System.out.println("");
            } else if (number == random) {
                System.out.print("Ты отгадал!");
                System.out.println("");
            }
            tryuse++;
        }
        System.out.print("К сожалению, игра закончилась. Начать заново? Да - 1; Нет - 0:\n ");

        String s = input.next();
        if (s.equals("1")) {
            main(null);
        }
    }
}




























