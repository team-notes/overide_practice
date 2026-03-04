package a_polymorphism_groupe_practice;
/*캐릭터 만들기
* 이름 : 모성진
* 직업 :  탱커
*
*  <필수로 넣어야 하는 것>
* 1. 체력
* 2. 이동하기
* 3. 마나
* 4. 특성 : 불씨의 바미*/
public class Mosungjin extends HumanRPG{
    @Override
    public void MP() {
        System.out.println("마나를 사용했지만 마나를 사용하지 않는 캐릭터입니다.");
    }

    @Override
    public void go() {
        System.out.println("앞으로 움직이지만 덩치가 ㅈㄴ 커서 느리게 움직입니다.");
    }

    @Override
    public void HP() {
        super.HP();
    }
    public void ulti() {
        System.out.println("불씨의 바미를 사용하여 상대방을 불태웁니다.");
    }
}
