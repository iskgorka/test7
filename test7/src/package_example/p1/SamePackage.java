package package_example.p1;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор SamePackage из того же пакета р1.");
        System.out.println("n = " + p.n);
// private переменная n_pri доступна только в классe Protection
// System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
