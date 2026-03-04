package a_polymorphism_groupe_practice;

public class Applicaton {

    public static void main(String[] args) {

        System.out.println(" ===== 소환사의 협곡에 오신 것을 존나 환영합니다! ======");

        System.out.println("챔피언 가붕이가 등장합니다!");

        HumanRPG human = new HumanRPG();
        human.HP();
        human.go();
        human.MP();
        System.out.println("\n");
        System.out.println(" ===== 소환사의 협곡에 오신 것을 존나 환영합니다! ======");

        System.out.println("챔피언 아리가 등장합니다!");

        Ahri ahri = new Ahri();
        ahri.HP();
        ahri.go();
        ahri.MP();

        System.out.println(" <<아리가 고유기를 사용합니다!>> ");

        ahri.champ();
        System.out.println("\n");
        System.out.println(" ===== 소환사의 협곡에 오신 것을 존나 환영합니다! ======");

        Mosungjin mo = new Mosungjin();

        System.out.println("야생의 모성진이 등장합니다!");
        mo.HP();
        mo.go();
        mo.MP();
        System.out.println("<<모가 궁극기를 시전합니다!>>");

        mo.ulti();
        System.out.println("\n");
        System.out.println(" ===== 소환사의 협곡에 오신 것을 존나 환영합니다! ======");

        Ezreal ez = new Ezreal();

        ez.HP();
        ez.go();
        ez.MP();

        System.out.println("<<이즈리얼이 궁극기를 시전합니다!>>");
        ez.arrow();
        ez.vision();
        ez.ezrealUlti();

        System.out.println(" ===== 소환사의 협곡에 오신 것을 존나 환영합니다! ======");

        System.out.println("야생의 용현이가 등장합니다!");

        YongHyeon you = new YongHyeon();

        you.HP();
        you.go();
        you.MP();

        System.out.println("<<용현이가 궁극기를 시전합니다!>>");
        System.out.println("\n");
        you.Cute();
        you.Snack();
        you.Info();
        you.Ultimate();

        System.out.println("야생의 Toi가 등장합니다!");

        Toi t = new Toi();

        t.HP();
        t.go();
        t.MP();

        System.out.println("<<Toi가 궁극기를 시전합니다!>>");
        System.out.println("\n");
        t.type();
        t.character();
        t.ulti();


    }

}
