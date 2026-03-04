package a_polymorphism_groupe_practice;

public class Ahri extends HumanRPG{

    @Override
    public void HP() {
        super.HP();
    }

    @Override
    public void go() {
        System.out.println("예아 거리를 활보합니다!");
    }

    @Override
    public void MP() {
        System.out.println("마나를 존나 씁니다.... 귀환을 타십쇼");
    }

    public void champ() {
        System.out.println("아리가 궁극기를 시전합니다! 뚜벅이들이 슬퍼합니다...");
    }
}
