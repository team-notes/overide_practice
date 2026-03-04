package a_polymorphism_groupe_practice;

    public class Ezreal extends HumanRPG {

        @Override
        public void HP() {
            super.HP();
        }

        @Override
        public void go() {
            System.out.println("앞으로 걸어갑니다.");
        }

        @Override
        public void MP() {
            System.out.println("마나를 회복하는 중입니다.");
        }

        public void arrow() {
            System.out.println("신비한 화살을 사용합니다.");
            System.out.println("길거리에 서있던 시민이 맞아 죽었습니다.");
        }

        public void vision() {
            System.out.println("비전이동을 사용합니다.");
            System.out.println("이동 위치에 있던 시민이 죽었습니다.");
        }

        public void ezrealUlti() {
            System.out.println("정조준 일격을 사용합니다!!");
            System.out.println("정면에 있던 시민 523명의 상체와 하체가 분리되었습니다.");
        }
    }

