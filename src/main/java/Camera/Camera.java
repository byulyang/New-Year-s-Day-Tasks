package Camera;

public class Camera {

    private boolean isOn; // 초기값 false
    private  int cheese;

    public void choice() {
        if (isOn) {
            System.out.println("DSLR카메라를 선택했습니다.");
        } else {
            this.isOn = true;
            System.out.println("디지털카메라를 선택했습니다.");

        }
    }
    public void On() {
        if(isOn) {
            System.out.println("카메라는 이미 전원이 켜져있습니다.");
        } else {
            this.isOn = true;
            System.out.println("카메라 전원을 켰습니다.");
        }

    }
    public void zoom() {
        if(isOn) {
            System.out.println("대상이 흐립니다 다시 맞춰주세요.");
        } else {
            System.out.println("지금 딱 좋습니다 그대로 계세요.");
        }
    }
    public void shutter() {
        if (isOn) {
            System.out.println("대상이 흐려 촬영이 불가능합니다.");
        } else {
            System.out.println("자 웃으세요 치이즈으.");
        }
    }
    public void selcect() {
        if (isOn) {
            System.out.println("계속 촬영합니다~");
        } else {
            System.out.println("사진첩으로 이동합니다.");
        }
    }
    public void photozip() {
        if (isOn)
        if(this.cheese > 0){
            this.cheese = 0;
            System.out.println("사진을 삭제합니다");
        } else {
            System.out.println("사진을 저장합니다");
        } else {
            System.out.println("사진을 클라우드로 옮깁니다!");
        }
    }
    public void off() {
        if (isOn) {
            if (cheese > 0) {
                this.cheese = 0;
                System.out.println("사진전송중이네느 전원을 끌 수 없습니다. Stop버튼을 눌러주세요");
            } else {
                this.isOn = false;
                System.out.println("전원을 종료합니다 다시 작동하려면 전원버튼을 눌러주세요.");
            }
        } else {
            System.out.println("이미 전원이 꺼져 있는 상태입니다. 전원 상태를 확인하세요.");
        }
    }

}
