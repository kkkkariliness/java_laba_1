import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main m = new Main();

        // 1.1
        //Дробная часть.
        //Дана сигнатура метода: public double fraction (double x);
        //Необходимо реализовать метод таким образом, чтобы он возвращал только
        //дробную часть числа х. Подсказка: вещественное число может быть
        //преобразовано к целому путем отбрасывания дробной части.
        out.print("1.1: ");
        double x1 = 3.14;
        while (true) {
            out.print("Введите вещественное число: ");
            if (in.hasNextDouble()){ // Если ввели вещественное
                x1 = in.nextDouble(); // Принимаем это значение
                break;
            }
            else {
                in.nextLine(); // Очищаем буфер
                out.println("Давай по новой, тебе нужно вещественное число!");
            }
        }
        double res1 = m.fraction(x1);
        System.out.println("Вы ввели: " + x1);
        System.out.println("Дробная часть: " + res1);

        // 1.3
        //Букву в число.
        //Дана сигнатура метода: public int charToNum (char x);
        //Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7
        //8 9”. Необходимо реализовать метод таким образом, чтобы он преобразовывал
        //символ в соответствующее число. Подсказка: код символа ‘0’ — это число 48.
        out.print("1.3: ");
        out.println("Введите х (х должен быть целым числом от 0 до 9): ");
        char x3 = '0';
        int res3 = 0;
        while (true) {
            x3 = in.next().charAt(0); // Принимаем первый символ строки
            res3 = m.charToNum(x3);
            if (res3 == x3) { // Если ввели не цифру
                out.print("Это не подходит! Давай по новой: ");
            }
            else break;
        }
        System.out.println("Вы ввели символ: '" + x3 + "'");
        System.out.println("Это будет число " + res3);

        // 1.5
        //Двузначное.
        //Дана сигнатура метода: public bool is2Digits (int x);
        //Необходимо реализовать метод таким образом, чтобы он принимал число x и
        //возвращал true, если оно двузначное.
        out.print("1.5: ");
        int x5 = 22;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){ // Если ввели целое число
                x5 = in.nextInt(); // Принимаем число
                break;
            }
            else { // Если ввели что-то другое
                in.nextLine(); // Очищаем буфер
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        boolean res5 = m.is2Digits(x5);
        if (res5) out.println("Ваше число " + x5 + " является двузначным");
        else out.println("Ваше число " + x5 + " не является двузначным");

        // 1.7
        //Диапазон.
        //Дана сигнатура метода: public bool isInRange (int a, int b, int num);
        //Метод принимает левую и правую границу (a и b) некоторого числового
        //диапазона. Необходимо реализовать метод таким образом, чтобы он возвращал
        //true, если num входит в указанный диапазон (включая границы). Обратите
        //внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а
        //кто меньше)
        out.print("1.7: ");
        int a = 0;
        int b = 0;
        int num = 0;
        while (true) {
            out.print("Введите одну границу диапазона: ");
            if (in.hasNextInt()){
                a = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        while (true) {
            out.print("Введите другую границу диапазона: ");
            if (in.hasNextInt()){
                b = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        while (true) {
            out.print("Введите чило, которое нам предстоит там найти: ");
            if (in.hasNextInt()){
                num = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        boolean res7 = m.isInRange(a, b, num);
        if (res7) out.println("Ваше число " + num + " входит в диапазон");
        else out.println("Ваше число " + num + " не входит в диапазон");

        // 1.9
        //Равенство.
        //Дана сигнатура метода: public bool isEqual(int a, int b, int c);
        //Необходимо реализовать метод таким образом, чтобы он возвращал true, если
        //все три полученных методом числа равны.
        out.print("1.9: ");
        int a1 = 2;
        int b1 = 3;
        int c1 = 4;
        while (true) {
            out.print("Введите число 1: ");
            if (in.hasNextInt()){
                a1 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        while (true) {
            out.print("Введите число 2: ");
            if (in.hasNextInt()){
                b1 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        while (true) {
            out.print("Введите чило 3: ");
            if (in.hasNextInt()){
                c1 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        boolean res9 = m.isEqual(a1, b1, c1);
        if (res9) out.println("true, ваши числа равны");
        else out.println("false, ваши числа не равны");


        // 2.1
        //Модуль числа.
        //Дана сигнатура метода: public int abs (int x);
        //Необходимо реализовать метод таким образом, чтобы он возвращал модуль
        //числа х (если оно было положительным, то таким и остается, если он было
        //отрицательным – то необходимо вернуть его без знака минус).
        out.print("2.1: ");
        int x2_1 = -2;
        while (true) {
            out.print("Введите x, модуль которого нужно узнать: ");
            if (in.hasNextInt()){
                x2_1 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        int res2_1 = m.abs(x2_1);
        out.println(res2_1);

        // 2.3
        //Тридцать пять.
        //Дана сигнатура метода: public bool is35 (int x);
        //Необходимо реализовать метод таким образом, чтобы он возвращал true, если
        //число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то
        //вернуть надо false. Подсказка: оператор % позволяет получить остаток от
        //деления.
        out.print("2.3: ");
        int x2_3 = 2;
        while (true) {
            out.print("Введите x, чтобы узнать делиться ли оно на 3 или 5: ");
            if (in.hasNextInt()){
                x2_3 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        boolean res2_3 = m.is35(x2_3);
        out.println(res2_3);

        // 2.5
        //Тройной максимум.
        //Дана сигнатура метода: public int max3 (int x, int y, int z);
        //Необходимо реализовать метод таким образом, чтобы он возвращал
        //максимальное из трех полученных методом чисел. Подсказка: идеальное
        //решение включает всего две инструкции if и не содержит вложенных if.
        out.print("2.5: ");
        int a2_5 = 2;
        int b2_5 = 3;
        int c2_5 = 4;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                a2_5 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        while (true) {
            out.print("Введите число y: ");
            if (in.hasNextInt()){
                b2_5 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        while (true) {
            out.print("Введите чило z: ");
            if (in.hasNextInt()){
                c2_5 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        int res2_5 = m.max3(a2_5, b2_5, c2_5);
        out.println("Местный максимум: " + res2_5);

        // 2.7
        //Двойная сумма.
        //Дана сигнатура метода: public int sum2 (int x, int y);
        //Необходимо реализовать метод таким образом, чтобы он возвращал сумму
        //чисел x и y. Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть
        //число 20.
        out.print("2.7: ");
        int a2_7 = 25;
        int b2_7 = 5;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                a2_7 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        while (true) {
            out.print("Введите y: ");
            if (in.hasNextInt()){
                b2_7 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        int res2_7 = m.sum2(a2_7, b2_7);
        out.println("Их сума: " + res2_7);

        // 2.9
        //День недели.
        //Дана сигнатура метода: public String day (int x);
        //Метод принимает число x, обозначающее день недели. Необходимо реализовать
        //метод таким образом, чтобы он возвращал строку, которая будет обозначать
        //текущий день недели, где 1- это понедельник, а 7 – воскресенье. Если число не
        //от 1 до 7 то верните текст “это не день недели”. Вместо if в данной задаче
        //используйте switch
        out.print("2.9: ");
        int x2_9 = 5;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                x2_9 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        String res2_9 = m.day(x2_9);
        out.println(res2_9);


        // 3.1
        //Числа подряд.
        //Дана сигнатура метода: public String listNums (int x);
        //Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
        //которой будут записаны все числа от 0 до x (включительно)
        out.print("3.1: ");
        int x3_1 = 5;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                x3_1 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        String res3_1 = m.listNums(x3_1);
        out.println("Твоя строка будет: " + res3_1);

        // 3.3
        // Четные числа.
        //Дана сигнатура метода: public String chet (int x);
        //Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
        //которой будут записаны все четные числа от 0 до x (включительно). Подсказа
        //для обеспечения качества кода: инструкцию if использовать не следует.
        out.print("3.3: ");
        int x3_3 = 5;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                x3_3 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        String res3_3 = m.chet(x3_3);
        out.println("Твоя строка будет: " + res3_3);

        // 3.5
        //Длина числа.
        //Дана сигнатура метода: public int numLen (long x);
        //Необходимо реализовать метод таким образом, чтобы он возвращал количество
        //знаков в числе x.
        //Подсказка:
        //Int у=123/10; // у будет иметь значение 12
        out.print("3.5: ");
        int x3_5 = 12345;
        while (true) {
            out.print("Введите x, длину котрого хотите узнать: ");
            if (in.hasNextInt()){
                x3_5 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        int res3_5 = m.numLen(x3_5);
        out.println(res3_5);

        // 3.7
        //Квадрат.
        //Дана сигнатура метода: public void square (int x);
        //Необходимо реализовать метод таким образом, чтобы он выводил на экран
        //квадрат из символов ‘*’ размером х, у которого х символов в ряд и х символов в
        //высоту.
        out.print("3.7: ");
        int x3_7 = 5;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                x3_7 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        m.square(x3_7);

        // 3.9
        //Правый треугольник.
        //Дана сигнатура метода: public void rightTriangle (int x);
        //Необходимо реализовать метод таким образом, чтобы он выводил на экран
        //треугольник из символов ‘*’ у которого х символов в высоту, а количество
        //символов в ряду совпадает с номером строки, при этом треугольник выровнен
        //по правому краю. Подсказка: перед символами ‘*’ следует выводить
        //необходимое количество пробелов.
        out.print("3.9: ");
        int x3_9 = 5;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                x3_9= in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        m.rightTriangle(x3_9);


        // 4.1
        //Поиск первого значения.
        //Дана сигнатура метода: public int findFirst (int[] arr, int x);
        //Необходимо реализовать метод таким образом, чтобы он возвращал индекс
        //первого вхождения числа x в массив arr. Если число не входит в массив –
        //возвращается -1.
        out.print("4.1: ");
        int x4_1 = 2;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                x4_1= in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        int length4_1 = 10;
        while (true) {
            out.print("Введите длину массива: ");
            if (in.hasNextInt()){
                length4_1 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        out.print("Твой массив: ");
        int[] arr4_1 = new int[Math.abs(length4_1)]; // Обновляем длину массива
        for (int i = 0; i < Math.abs(length4_1); i++) {
            arr4_1[i] = ((int)(Math.random() * 101) - 50); // Заполняем рандомными числами из диапазона [-50;50]
        }
        out.println(Arrays.toString(arr4_1)); // Выводим массив одной строкой
        int res4_1 = m.findFirst(arr4_1, x4_1);
        out.println("Индекс первого вхождения х: " + res4_1);

        // 4.3
        //Поиск максимального.
        //Дана сигнатура метода: public int maxAbs (int[] arr);
        //Необходимо реализовать метод таким образом, чтобы он возвращал
        //наибольшее по модулю (то есть без учета знака) значение массива arr
        out.print("4.3: ");
        int length4_3 = 10;
        while (true) {
            out.print("Введите длину массива: ");
            if (in.hasNextInt()){
                length4_3 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        out.print("Твой массив: ");
        int[] arr4_3 = new int[Math.abs(length4_3)];
        for (int i = 0; i < Math.abs(length4_3); i++) {
            arr4_3[i] = ((int)(Math.random() * 101) - 50); // рандомное число из диапазона [-50;50]
        }
        out.println(Arrays.toString(arr4_3));
        int res4_3 = m.maxAbs(arr4_3);
        out.println("Тут максимум: " + res4_3);

        // 4.5
        //Добавление массива в массив.
        //Дана сигнатура метода: public int[] add (int[] arr, int[] ins, int pos);
        //Необходимо реализовать метод таким образом, чтобы он возвращал новый
        //массив, который будет содержать все элементы массива arr, однако в позицию
        //pos будут вставлены значения массива ins.
        out.print("4.5: ");
        int length4_5_1 = 10;
        while (true) {
            out.print("Введите длину массива 1: ");
            if (in.hasNextInt()){
                length4_5_1 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        out.print("Твой массив: ");
        int[] arr4_5 = new int[Math.abs(length4_5_1)];
        for (int i = 0; i < Math.abs(length4_5_1); i++) {
            arr4_5[i] = ((int)(Math.random() * 101) - 50); // рандомное число из диапазона [-50;50]
        }
        out.println(Arrays.toString(arr4_5));
        int length4_5_2 = 10;
        while (true) {
            out.print("Введите длину массива 2: ");
            if (in.hasNextInt()){
                length4_5_2 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        out.print("Твой массив: ");
        int[] ins4_5 = new int[Math.abs(length4_5_2)];
        for (int i = 0; i < Math.abs(length4_5_2); i++) {
            ins4_5[i] = ((int)(Math.random() * 101) - 50); // рандомное число из диапазона [-50;50]
        }
        out.println(Arrays.toString(ins4_5));
        int pos4_5 = 3;
        while (true) {
            out.print("Введите позицию, на которую вставить второй массив: ");
            if (in.hasNextInt()){
                pos4_5 = in.nextInt();
                if (pos4_5 >= 0 && pos4_5 < Math.abs(length4_5_1)) break;
                else out.println("Давай по новой, число не должно превышать длину первого массива!");
            }
            else {
                in.nextLine();
                out.println("Давай по новой, число должно быть целым");
            }
        }
        int[] res4_5 = m.add(arr4_5, ins4_5, pos4_5);
        System.out.println(Arrays.toString(res4_5));

        // 4.7
        //Возвратный реверс.
        //Дана сигнатура метода: public int[] reverseBack (int[] arr);
        //Необходимо реализовать метод таким образом, чтобы он возвращал новый
        //массив, в котором значения массива arr записаны задом наперед.
        out.print("4.7: ");
        int length4_7 = 10;
        while (true) {
            out.print("Введите длину массива: ");
            if (in.hasNextInt()){
                length4_7 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        out.print("Твой массив: ");
        int[] arr4_7 = new int[Math.abs(length4_7)];
        for (int i = 0; i < Math.abs(length4_7); i++) {
            arr4_7[i] = ((int)(Math.random() * 101) - 50); // рандомное число из диапазона [-50;50]
        }
        out.println(Arrays.toString(arr4_7));
        int[] res4_7 = m.reverseBack(arr4_7);
        System.out.println("Твой массив наоборот: " + Arrays.toString(res4_7));

        // 4.9
        //Все вхождения.
        //Дана сигнатура метода: public int[] findAll (int[] arr, int x);
        //Необходимо реализовать метод таким образом, чтобы он возвращал новый
        //массив, в котором записаны индексы всех вхождений числа x в массив arr.
        out.print("4.9: ");
        int x4_9 = 2;
        while (true) {
            out.print("Введите x: ");
            if (in.hasNextInt()){
                x4_9= in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        int length4_9 = 10;
        while (true) {
            out.print("Введите длину массива: ");
            if (in.hasNextInt()){
                length4_9 = in.nextInt();
                break;
            }
            else {
                in.nextLine();
                out.println("Давай по новой, тебе нужно целое число!");
            }
        }
        out.print("Твой массив: ");
        int[] arr4_9 = new int[Math.abs(length4_9)];
        for (int i = 0; i < Math.abs(length4_9); i++) {
            arr4_9[i] = ((int)(Math.random() * 101) - 50); // рандомное число из диапазона [-50;50]
        }
        out.println(Arrays.toString(arr4_9));
        int[] res4_9 = m.findAll(arr4_9, x4_9);
        System.out.println("х стоит в массиве на позициях: " + Arrays.toString(res4_9));
    }

    //нечетные
    // МЕТОДЫ
    // 1.1
    public double fraction(double x) {

        long integerPart = (int) x; // Берем целую часть

        return x - integerPart; // Вычитаем целую из дробной
    }

    // 1.3
    public int charToNum(char x) {

        if (x < 48 || x > 57) return x;
        return x - 48;
    }

    // 1.5
    public boolean is2Digits(int x) {

        return Math.abs(x) >= 10 && Math.abs(x) <= 99;
    }

    // 1.7
    public boolean isInRange(int a, int b, int num) {

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }

    // 1.9
    public boolean isEqual(int a, int b, int c) {

        return a == b && b == c;
    }

    // Условия
    // 2.1
    public int abs(int x) {

        return Math.abs(x);
    }

    // 2.3
    public boolean is35 (int x) {

        return (x % 3 == 0 || x % 5 == 0) && !(x % 3 == 0 && x % 5 == 0);
    }

    // 2.5
    public int max3 (int x, int y, int z) {

        if (x >= y && x >= z) return x;
        if (y >= z) return y;
        return z;
    }

    // 2.7
    public int sum2 (int x, int y) {
        if (x + y <= 19 && x + y >= 10) return 20;
        return x + y;
    }

    // 2.9
    public String day (int x) {
        return switch (x) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "А кому-то пора учить дни недели ;)";
        };
    }

    // Циклы
    // 3.1
    public String listNums (int x) {
        x = Math.abs(x); // Преобразуем отрицательное число в положительное
        StringBuilder s = new StringBuilder(); // Создаём пустую изменяемую строку
        for (int j = 0; j <= x; j++){
            s.append(j);
        }
        return s.toString(); // Возвращаем обычный string
    }

    // 3.3
    public String chet (int x) {
        x = Math.abs(x); // Преобразуем отрицательное число в положительное
        StringBuilder s = new StringBuilder(); // Создаём пустую изменяемую строку
        for (int j = 0; j <= x; j+=2){
            s.append(j);
        }
        return s.toString(); // Возвращаем обычный string
    }

    // 3.5
    public int numLen (long x) {
        if (x == 0) return 1;
        int count = 0;
        x = Math.abs(x); // Преобразуем отрицательное число в положительное
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    // 3.7
    public void square (int x) {
        x = Math.abs(x); // Преобразуем отрицательное число в положительное
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) out.print("* "); // Выводим звездочки
            out.println();
        }
    }

    // 3.9
    public void rightTriangle (int x) {

        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) out.print(" "); // Выводим пробелы
            for (int k = 0; k < i; k++) out.print("*"); // Выводим звездочки
            out.println(); // Переходим на новую строку
        }
    }

    // Массивы
    // 4.1
    public int findFirst (int[] arr, int x) {

        if (arr == null || arr.length == 0) return -1; // Если массив не оч попался((
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // 4.3
    public int maxAbs (int[] arr) {

        if (arr == null || arr.length == 0) return -1024;
        int max_el = Math.abs(arr[0]);
        for (int i = 1; i < arr.length; i++) { // Ищем максимум
            int el = Math.abs(arr[i]);
            if (el > max_el) max_el = el;
        }
        return max_el;
    }

    // 4.5
    public int[] add (int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length]; // Создаём новый массив размером как наши два
        System.arraycopy(arr, 0, result, 0, pos); // Копируем элементы из исходного массива в новый массив до позиции вставки
        //исходный массив 1, с какого эл копировать, итоговый массив, в какую позицию в нём, сколько элементов)
        System.arraycopy(ins, 0, result, pos, ins.length);// Копируем элементы из второго массива в новый массив, начиная с позиции вставки
        //исходный массив 2, с какого эл копировать, итоговый массив, в какую позицию в нём, сколько элементов)
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos); // Копируем оставшиеся элементы из исходного массива в новый массив
        //исходный массив 1, с какого эл копировать, итоговый массив, в какую позицию в нём, сколько элементов)
        return result;
    }

    // 4.7
    public int[] reverseBack (int[] arr) {

        int[] result = new int[arr.length];
        int k = 0;
        for (int i = arr.length -1; i >= 0; i--) { // Идём с конца
            result[k] = arr[i];
            k++;
        }
        return result;
    }

    // 4.9
    public int[] findAll (int[] arr, int x) {

        ArrayList<Integer> indices = new ArrayList<>();  // ArrayList, потому что не знаем сколько будет элементов
        for (int i = 0; i < arr.length; i++) if (arr[i] == x) indices.add(i);
        int[] result = new int[indices.size()]; // Преобразуем ArrayList в массив
        for (int i = 0; i < indices.size(); i++) result[i] = indices.get(i);
        return result;
    }

}