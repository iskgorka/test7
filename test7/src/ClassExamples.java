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

*/