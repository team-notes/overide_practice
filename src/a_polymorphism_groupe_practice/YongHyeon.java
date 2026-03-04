package a_polymorphism_groupe_practice;

public class YongHyeon extends HumanRPG{
    @Override
    public void HP() {
        super.HP();
    }

    @Override
    public void go() {
        System.out.println("용현이를 데리고 산책을 하려했으나 귀찮아서 움직이지 않았습니다.");
    }

    @Override
    public void MP() {
        System.out.println("10000000000000000000000000000000000000000");
    }

    public void Cute() {
        System.out.println("용현이가 애교를 부리자 적들은 그만 전의를 상실해버렸습니다.....");
    }

    public void Snack() {
        System.out.println("저는 그만 용현이가 너무 귀여워 간식을 던져버리고 말았습니다.");
    }

    public void Info() {
        System.out.println("수리산의 맹수 용현이 입니다. 이빨은 날카롭고 단단하며 털은 윤기나고 매끄럽습니다.");
        System.out.println("그의 몸은 아주 섹시하게 잘 빠졌으며 그의 핑크빛 코는 다른 어떤 코보다 아름 답습니다.");
    }
    public void Ultimate() {
        System.out.println("궁극기 산책 더하고싶어서 뻐팅기기를 사용했습니다. 어쩔수없이 산책시간이 2시간 연장되었습니다....");
    }
}
