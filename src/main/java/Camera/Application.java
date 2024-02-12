package Camera;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

//        과제 카메라 사진작가는 DSLR or 디지털카메라  중 선택할 수있다.
//                전원켜기, 줌인or 줌아웃, 셔터누르기, 계속촬영 or 사진첩가기, 전원유지 or 전원끄기
//        카메라는 전원켜기 ,줌인or 줌아웃, 사진찍기 , 계속촬영 or 사진첩가기 ,전원유지 or 전원끄기 카메라 처음에 전원off 상태이다.
//        DSLR 은 촬영 전 렌즈를 삽입해야한다..
//                사진은 한장씩 찍힌다.
//        저장된사진은 사진첩에서만 지울수 있다.
//        사진작가는 먼저 카메라 전원을 켜준다 이미 켜져있는경우에는 잔여배터리량이 표시된다.
//                사진작가는 카메라 전원이 켜져있는경우 촬영물을 앵글에 담은뒤 줌인or줌아웃을 해 촬영물을 찍을 준비를 한다
//        사진작가가 셔터를 누르면 사진이 촬영이된다. 셔터가 눌린 뒤에는 사진은 사진첩에 저장이된다.
//        사진촬영후에는 사진첩으로이동 OR 계속촬영 중 선택해야한다 찍은사진 없이 사진첩에 갈경우 저장된 사진이 없다고 안내문이 나온다
//        사진첩에서는 사진을 삭제 or 컴퓨터로 전송을 선택할 수 있다. 계속 촬영을 선택하면 카메라 선택으로 넘어간다
//
//        사진작가가 수신할 수 있는 메세지
//
//        카메라 고르기
//        전원켜기
//        줌인or 줌아웃 하기
//                사진찍기
//        계속촬영 or 사진첩가기
//        전원유지 or 전원끄기

//        카메라가 수신할 수 있는 메시지 0. 카메라 선택당하기
//        전원켜기
//        줌인 or 줌아웃
//                사진찍기
//        계속촬영 or 사진첩가기 단 필름카메라는 계속촬영 or 전원끄기
//        전원유지 or 전원끄기
//        default : 명령을 수행할 수 없습니다.

        Camera camera = new Camera();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("======사진촬영======");
            System.out.println("1. 카메라 고르기");
            System.out.println("2. 전원 켜기");
            System.out.println("3. 줌인or줌아웃");
            System.out.println("4. 줌 비정상 or 줌 정상");
            System.out.println("5. 계속촬영 or 사진첩");
            System.out.println("6. 사진첩");
            System.out.println("7. 전원끄기");
            System.out.println("9. 카메라 끄기");
            System.out.println("행동 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    camera.On();
                    break;
                case 2 :camera.choice();
                break;
                case 3: camera.zoom();
                break;
                case 4: camera.shutter();
                break;
                case 5: camera.selcect();
                break;
                case 6: camera.photozip();
                break;
                case 7: camera.off();
                break;
            }
            if (no == 9) {
                break;
            }
        }
    }
}
