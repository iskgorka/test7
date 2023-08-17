public class ClassExamples {
}
/*
Ex1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String s = "Try to check";
        do {
            System.out.println("Введите число от 1 до 5: ");
            str = br.readLine();
            str = str.trim();
            switch (str) {
                case "0":
                    break;
                case "1":
                case "2":
                    System.out.println("Ввели " + str);
                    break;
                case "3":
                case "4":
                case "5":
                    if (str.contains("4") | str.contains("5")) {
                        s = s.replace('y', 'N');
                        str = str + " " + s.toUpperCase();
                    }
                    System.out.println("Ввели " + str);
                    break;
                default:
                    int twoD[][] = new int[4][5];
                    int i, j, k = 0;
                    for (i = 0; i < 4; i++)
                        for (j = 0; j < 5; j++) {
                            twoD[i][j] = k;
                            k++;
                        }
                    for (i = 0; i < 4; i++) {
                        for (j = 0; j < 5; j++) {
                            System.out.print(twoD[i][j] + " ");
                        }
                        System.out.println();
                    }
            }
        } while (!str.equals("0"));

interface example 1
        interface CallBack {
            void callBack(int param);
        }

interface example 2
        interface CallBack {
            void callBack(int param);
        }
        class Client implements CallBack {
            //реализовать интерфейс CallBack
            public void callBack(int p) {
                System.out.println("Метод callBack, вызываемый со значением " + p);
            }
        }

interface example 3
        interface CallBack {
            void callBack(int param);
        }
        class Client implements CallBack {
            //реализовать интерфейс CallBack
            public void callBack(int p) {
                System.out.println("Метод callBack, вызываемый со значением " + p);
            }
            void nonifaceMeth(){
                System.out.println("В классах, реализующих интерфейсы, " +
                        "могут определятся и другие элементы");
            }
        }

interface example 3_1
        class Bird {
            String getName() {
                return "Unknow";
            }
            void displayInformation() {
                System.out.println("The bird name is " + getName());
            }
        }
        class Peacock extends Bird {
            String getName() {
                return "Peacock";
            }
        }
        class Demo {
            public static void main(String[] args) {
                Bird bird = new Peacock();
                bird.displayInformation(); // The bird name is Peacock
            }
        }

interface example 3_2
        class A {
            void callMe() {
                System.out.println("В методе callMe() из класса А");
            }
            void methA() {
                System.out.println("methA из класса А");
            }
        }
        class B extends A {
            //переопределённый метод callMe()
            void callMe() {
                System.out.println("В методе callMe() из класса B");
            }
            void methB() {
                System.out.println("methB из класса B");
            }
        }
        class C extends A {
            void callMe() {
                System.out.println("В методе callMe() из класса C");
            }
            void methC() {
                System.out.println("methC из класса C");
            }
        }
        class Dispatch {
            public static void main(String[] args){
                A a = new A(); // объект класса А
                B b = new B();
                C c = new C();
                A r; // объявить ссылку на объект типа А
                r = a; // переменная r ссылается на объект типа А
                r.callMe(); // вызвать вариант метода callMe(), определённый в классе А
                r.methA();
                //r.methB();
                //r.methC();
                r = b; // переменная r ссылается на объект типа B
                r.callMe(); // вызвать вариант метода callMe(), определённый в классе В
                r.methA();
                //r.methB();
                //r.methC();
                r = c; // переменная r ссылается на объект типа C
                r.callMe(); // вызвать вариант метода callMe(), определённый в классе С
                r.methA();
                //r.methB();
                //r.methC();
            }
        }

interface example 4
        interface CallBack {
            void callBack(int param);
        }
        class Client implements CallBack {
            //реализовать интерфейс CallBack
            public void callBack(int p) {
                System.out.println("Метод callBack, вызываемый со значением " + p);
            }
            void nonifaceMeth(){
                System.out.println("В классах, реализующих интерфейсы, " +
                        "могут определятся и другие элементы");
            }
        }
        class Testiface {
            public static void main(String[] args){
                CallBack c = new Client();
                c.callBack(22);
                //c.nonifaceMeth();
            }
        }

interface example 5
        interface CallBack {
            void callBack(int param);
        }
        class Client implements CallBack {
            //реализовать интерфейс CallBack
            public void callBack(int p) {
                System.out.println("Метод callBack, вызываемый со значением " + p);
            }
            void nonifaceMeth(){
                System.out.println("В классах, реализующих интерфейсы, " +
                        "могут определятся и другие элементы");
            }
        }
        class AnotherClient implements CallBack {
            //реализовать интерфейс CallBack
            public void callBack(int p) {
                System.out.println("Метод callBack из класса AnotherClient");
                System.out.println("p в квадрате равно " + (p*p));
            }
        }
        class TestIface2 {
            public static void main(String[] args){
                CallBack c = new Client();
                AnotherClient ob = new AnotherClient();
                c.callBack(42);
                c = ob; // теперь переменна c ссылается на объект типа AnotherClient
                c.callBack(42);
            }
        }

interface example 6
        class Figure {
            double dim1;
            double dim2;
            Figure(double a, double b) {
                dim1 = a;
                dim2 = b;
            }
        }
        class Rectangle extends Figure {
            double dimR;
            Rectangle(double a, double b) {
                super(a, b);
            }
            double area() {
                System.out.println("В области четырехугольника.");
                return dim1 * dim2;
            }
        }
        class Triangle extends Figure {
            double dimT;
            Triangle(double a, double b) {
                super(a, b);
            }
            double area() {
                System.out.println("В области треугольника.");
                return dim1 * dim2 / 2;
            }
        }
        class Areas {
            public static void main(String[] args) {
                Figure figure;
                Rectangle r = new Rectangle(9, 5);
                Triangle t = new Triangle(10, 8);
                figure = r; // переводим подкласс Rectangle в суперкласс Figure
                //Rectangle r2 = figure; // суперкласс Figure в подкласс Rectangle
                //System.out.println("Площадь равна " + figure.area());
                t = (Triangle)figure;
                System.out.println("Площадь равна " + t.area());
            }
        }

interface example 6_1
        interface CallBack {
            void callBack(int param);
        }
        class Client implements CallBack {
            public void callBack(int p) {
                System.out.println("Метод callBack из класса Client, вызываемый со значением " + p);
            }
        }
        class AnotherClient implements CallBack {
            public void callBack(int p) {
                System.out.println("Метод callBack из класса AnotherClient, p в квадрате равно " + p*p);
            }
        }
        class TestIface {
            public static void callClass(CallBack ob, int p) {
                System.out.println(ob.getClass() + " вызывает метод callBack");
                ob.callBack(p);
            }
            public static void main(String[] args) {
                callClass(new Client(), 10);
                callClass(new AnotherClient(), 20);
            }
        }

interface example 7
        interface CallBack {
            void callBack(int param);
        }
        abstract class Incomplete implements CallBack {
            int a, b;
            void show() {
                System.out.println("a: " + a + " b: " + b);
            }
        }

interface example 8
        // Пример вложенного интерфейса
        // Этот класс содержит интерфейс как свой элемент
        class A {
            // это вложенный интерфейс
            public interface NestedIF {
                boolean isNotNegative(int x);
            }
        }
        // класс В реализует вложенный интерфейс
        class B implements A.NestedIF {
            public boolean isNotNegative(int x) {
                return x < 0 ? false : true;
            }
        }
        class NestedIFDemo {
            public static void main(String[] args){
        // Использовать ссылку на вложенный интерфейс
                A.NestedIF nif = new B();
                if(nif.isNotNegative(10))
                    System.out.println("Число 10 положительное.");
                if(nif.isNotNegative(-12))
                    System.out.println("Число -12 отрицательное.");
            }
        }

interface example 9
        // Определить интерфейс для целочисленного стека
        interface IntStack {
            void push(int item); // сохранить элемент в стеке
            int pop(); // извлечь элемент из стека
        }
        // Реализация интерфейса IntStack для стека фиксированного размера
        class FixedStack implements IntStack {
            private int stck[];
            private int tos;
        //Выделить память и инициализировать стек
            FixedStack(int size) {
                stck = new int [size];
                tos = -1;
            }
        //Разместить элемент в стеке
            public void push(int item) {
                if(tos == stck.length - 1) // использовать поле длинны стека
                    System.out.println("Стек заполнен.");
                else
                    stck[++tos] = item;
            }
        //Извлечь элемент из стека
            public int pop() {
                if(tos < 0) {
                    System.out.println("Стек не загружен.");
                    return 0;
                } else
                    return stck[tos--];
            }
        }
        class IFTest {
            public static void main(String args[]) {
                FixedStack mystack1 = new FixedStack(5);
                FixedStack mystack2 = new FixedStack(8);
        // разместить числа в стеке
                for (int i = 0; i < 5; i++) mystack1.push(i);
                for (int i = 0; i < 8; i++) mystack2.push(i);
        // извлечь эти числа из стека
                System.out.println("Стек в mystack1: ");
                for (int i = 0; i < 5; i++)
                    System.out.println(mystack1.pop());
                System.out.println("Стек в mystack2: ");
                for (int i = 0; i < 8; i++)
                    System.out.println(mystack2.pop());
            }
        }

interface example 10
        // Определить интерфейс для целочисленного стека
        interface IntStack {
            void push(int item); // сохранить элемент в стеке
            int pop(); // извлечь элемент из стека
        }

        class DynStack implements IntStack {
            private int stck[];
            private int tos;
        //Выделить память и инициализировать стек
            DynStack(int size) {
                stck = new int [size];
                tos = -1;
            }
        //Разместить элемент в стеке
            public void push(int item) {
        // если стек заполнен, выделить память под стек большего размера
                if(tos == stck.length - 1) {
                    int temp[] = new int[stck.length * 2]; //удвоить размер стека
                    for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
                    stck = temp;
                    stck[++tos] = item;
                } else
                    stck[++tos] = item;
            }
        //Извлечь элемент из стека
            public int pop() {
                if(tos < 0) {
                    System.out.println("Стек не загружен.");
                    return 0;
                } else
                    return stck[tos--];
            }
        }
        class IFTest2 {
            public static void main(String args[]) {
                DynStack mystack1 = new DynStack(5);
                DynStack mystack2 = new DynStack(8);
        // В этих циклах увеличиваются размеры каждого стека
                for (int i = 0; i < 12; i++) mystack1.push(i);
                for (int i = 0; i < 20; i++) mystack2.push(i);
        // извлечь эти числа из стека
                System.out.println("Стек в mystack1: ");
                for (int i = 0; i < 12; i++)
                    System.out.println(mystack1.pop());
                System.out.println("Стек в mystack2: ");
                for (int i = 0; i < 20; i++)
                    System.out.println(mystack2.pop());
            }
        }

interface example 11
        // Создать переменную интерфейса и обратиться к стекам через неё
        // Определить интерфейс для целочисленного стека
        interface IntStack {
            void push(int item); // сохранить элемент в стеке
            int pop(); // извлечь элемент из стека
        }

        class DynStack implements IntStack {
            private int stck[];
            private int tos;
            //Выделить память и инициализировать стек
            DynStack(int size) {
                stck = new int [size];
                tos = -1;
            }
            //Разместить элемент в стеке
            public void push(int item) {
                // если стек заполнен, выделить память под стек большего размера
                if(tos == stck.length - 1) {
                    int temp[] = new int[stck.length * 2]; //удвоить размер стека
                    for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
                    stck = temp;
                    stck[++tos] = item;
                } else
                    stck[++tos] = item;
            }
            //Извлечь элемент из стека
            public int pop() {
                if(tos < 0) {
                    System.out.println("Стек не загружен.");
                    return 0;
                } else
                    return stck[tos--];
            }
        }

        // Реализация интерфейса IntStack для стека фиксированного размера
        class FixedStack implements IntStack {
            private int stck[];
            private int tos;
            //Выделить память и инициализировать стек
            FixedStack(int size) {
                stck = new int [size];
                tos = -1;
            }
            //Разместить элемент в стеке
            public void push(int item) {
                if(tos == stck.length - 1) // использовать поле длинны стека
                    System.out.println("Стек заполнен.");
                else
                    stck[++tos] = item;
            }
            //Извлечь элемент из стека
            public int pop() {
                if(tos < 0) {
                    System.out.println("Стек не загружен.");
                    return 0;
                } else
                    return stck[tos--];
            }
        }

        class IFTest3 {
            public static void main(String args[]) {
                IntStack mystack; //создать переменную ссылки на интерфейс
                DynStack ds = new DynStack(5);
                FixedStack fs = new FixedStack(8);
                mystack = ds; // загрузить динамический стек
        //разместить числа в стеке
                for (int i = 0; i < 12; i++) mystack.push(i);
                mystack = fs; // загрузить фиксированный стек
                for (int i = 0; i < 8; i++) mystack.push(i);
                mystack = ds;
                System.out.println("Значения в динамическом стеке: ");
                for (int i = 0; i < 12; i++)
                    System.out.println(mystack.pop());
                mystack = fs;
                System.out.println("Значения в фиксированном стеке: ");
                for (int i = 0; i < 8; i++)
                    System.out.println(mystack.pop());
            }
        }

interface example 12
        interface SharedConstants {
            int NO = 0;
            int YES = 1;
            int MAYBE = 2;
            int LATER = 3;
            int SOON = 4;
            int NEVER = 5;
        }
        class Question implements SharedConstants {
            Random rand = new Random();
            int ask() {
                int prob = (int) (100 * rand.nextDouble());
                if(prob < 30){
                    return NO; // 30%
                } else if (prob < 60) { // от 30 до 60
                    return YES; // 30%
                } else if (prob < 75) {
                    return LATER; // 15%
                } else if (prob < 98) {
                    return SOON; // 13%
                } else
                    return NEVER; // 2%
            }
        }
        class AskMe implements SharedConstants {
            static void answer(int result) {
                switch (result) {
                    case NO:
                        System.out.println("Нет.");
                        break;
                    case YES:
                        System.out.println("Да.");
                        break;
                    case MAYBE:
                        System.out.println("Возможно.");
                        break;
                    case LATER:
                        System.out.println("Позднее.");
                        break;
                    case SOON:
                        System.out.println("Вскоре.");
                        break;
                    case NEVER:
                        System.out.println("Никогда.");
                        break;
                }
            }
            public static void main(String[] args) {
                Question q = new Question();
                answer(q.ask());
                answer(q.ask());
                answer(q.ask());
                answer(q.ask());
            }
        }

interface example 13
        //Один интерфейс может расширять другой
        interface A {
            void meth1();
            void meth2();
        }
        // Теперь интерфейс В включает в себя методы meth1() и meth2() и добавляет метод meth3()
        interface B extends A {
            void meth3();
        }
        //Этот класс должен реализовывать все методы из интерфейсов А и В
        class MyClass implements B {
            public void meth1(){
                System.out.println("Реализация метода meth1().");
            }
            public void meth2(){
                System.out.println("Реализация метода meth2().");
            }
            public void meth3(){
                System.out.println("Реализация метода meth3().");
            }
        }
        class Main {
            public static void main(String[] args) {
                MyClass ob = new MyClass();
                ob.meth1();
                ob.meth2();
                ob.meth3();
            }
        }

interface example 14
        interface MyInterface {
        //Это объявление обычного метода в интерфейсе, он НЕ предоставляет реализацию по умолчанию
            int getNumber();
        //Это объявление метода по умоллчанию. Обратите внимание на его реализацию по умолчанию
            default String getString() {
                return "Объект типа String по умолчанию";
            }
        }
        class MyClass implements MyInterface {
            //В этом классе должен быть реализован только метод getNumber()
            //А вызов метода getString() разрешается по умолчанию.
            public int getNumber() {
                return 100;
            }
        }
        //Использовать метод по умолчанию
        class DefaultMethodDemo {
            public static void main(String[] args){
                MyClass ob = new MyClass();
        //Метод getNumber() можно вызвать, поскольку он явно реализован в классе MyClass
                System.out.println(ob.getNumber());
        //Метод getString() так же можно вызвать, так как в интерфейсе имеется его реализация по умолчанию.
                System.out.println(ob.getString());
            }
        }

interface example 15
        interface MyInterface {
            //Это объявление обычного метода в интерфейсе, он НЕ предоставляет реализацию по умолчанию
            int getNumber();
            //Это объявление метода по умоллчанию. Обратите внимание на его реализацию по умолчанию
            default String getString() {
                return "Объект типа String по умолчанию";
            }
        }
        //Реализовать интерфейс MyInterface
        class MyClass2 implements MyInterface {
            public int getNumber() {
                return 100;
            }
            public String getString() {
                return "Это другая символьная строка.";
            }
        }
        //Использовать метод по умолчанию
        class DefaultMethodDemo {
            public static void main(String[] args){
                MyClass2 ob = new MyClass2();
                System.out.println(ob.getNumber());
                System.out.println(ob.getString());
            }
        }

interface example 16
        interface IntStack {
            void push(int item);
            int pop();
        // у метода clear() теперь имеется вариант по умолчанию, поэтому
        // его можно реализовать в классе, который будет имплементировать интерфейс
            default void clear() {
                System.out.println("Метод clear() не реализован.");
            }
        }

interface example 17
        interface MyIF {
            int getNumber();
            default String getString() {
                return "Объект типа String по умолчанию";
            }
            static int getDefaultNumber(){
                System.out.println("Метод getDefaultNumber(), вызываемый со значением 0.");
                return 0;
            }
        }
        class Client implements MyIF {
            Client() {
                System.out.println("Конструктор класса Client.");
            }
            public void callBack(int p){
                System.out.println("Метод callBack() вызываемый со значением " + p);
            }
            public int getNumber() {
                System.out.println("Метод getNumber(), вызываемый со значением 10");
                return 10;
            }
        }
        class Demo {
            public static void main(String[] args) {
                int defNum = MyIF.getDefaultNumber();
                System.out.println(defNum);
                Client ob = new Client();
                System.out.println(ob.getString());
                ob.callBack(30);
                ob.getNumber();

            }
        }

Presentation examples
Example 1
        class Bird {
            public String getName() {
                return "Unknown";
            }
            public void displayInformation() {
                System.out.println("The bird name is " + getName());
            }
        }
        class Peacock extends Bird {
            public String getName() {
                return "Peacock";
            }
        }
        class Main {
            public static void main(String[] args) {
                Bird bird = new Peacock();
                bird.displayInformation(); // Peacock
            }
        }

Example 2
        class Primate {
            public boolean hasHair() {
                return true;
            }
        }
        interface HasTail {
            boolean isTailStriped();
        }
        class Lemur extends Primate implements HasTail {
            public int age = 10;
            public boolean isTailStriped() {
                return false;
            }
        }
        class Main {
            public static void main(String[] args) {
                Lemur lemur = new Lemur();
                System.out.println(lemur.age); // 10
                HasTail hasTail = lemur;
                System.out.println(hasTail.isTailStriped()); // false
                Primate primate = lemur;
                System.out.println(primate.hasHair()); // true
            }
        }

Example 3
        class Reptile {
            public String getName() {
                return "Reptile";
            }
        }
        class Alligator extends Reptile {
            public String getName() {
                return "Alligator";
            }
        }
        class Crocodile extends Reptile {
            public String getName() {
                return "Crocodile";
            }
        }
        class ZooWorker {
            public static void feed(Reptile reptile) {
                System.out.println("Feeding " + reptile.getName());
            }
            public static void main(String[] args){
                feed(new Crocodile());
                feed(new Alligator());
                feed(new Reptile());
            }
        }
*/