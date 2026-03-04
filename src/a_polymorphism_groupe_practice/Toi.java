package a_polymorphism_groupe_practice;

public class Toi extends HumanRPG {

    @Override
    public void HP() {
        super.HP();
    }

    @Override
    public void go() {
        System.out.println("이동합니다람쥐");
    }

    @Override
    public void MP() {
        System.out.println("마나를 사용했습니다람쥐");
    }

    public void name() {
        System.out.println("캐릭터명: toi");
    }

    public void type() {
        System.out.println("포지션: 딜러");
    }

    public void character() {
        System.out.println("특성: 똥 던지기");
    }

    public void ulti() {
        System.out.println("궁극기: 흑마력의 변기");
    }
}
