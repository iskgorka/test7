package package_example.p2;

class OtherPackage {
    OtherPackage() {
        package_example.p1.Protection p = new package_example.p1.Protection();
        System.out.println("Конструктор OtherPackage из другого пакета р2.");
// default переменная n доступна только для данного класса или пакета р1
// System.out.println("n = " + p.n);
// private переменная n_pri доступна только в классe Protection
// System.out.println("n_pri = " + p.n_pri);
// protected переменная n_pro доступна только для данного класса, подкласса или пакета р1
// System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
