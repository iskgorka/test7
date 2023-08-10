package package_example.p1;

class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласса Derived из пакета р1.");
        System.out.println("n = " + n);
// private переменная n_pri доступна только в классe Protection
// System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
