package package_example.p2;

import package_example.p1.Protection;

class Protection2 extends Protection {
    Protection2() {
        System.out.println("Конструктор Protection2, унаследованный из другого пакета p2");
// default переменная n доступна только для данного класса или пакета р1
// System.out.println("n = " + p.n);
// private переменная n_pri доступна только в классe Protection
// System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
