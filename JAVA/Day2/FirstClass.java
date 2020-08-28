/**
 * 작성일: 2020.08.29
 * 작성자: 권다연
 * 파일명: FirstClass.java
 */
/* 자바 프로그램 구조 및 데이터 타입
클래스: 자바프로그램의 최소 구성단위로, 선언된 클래스 내부에 실행에 필요한 변수나 메서드 등이 정의됨

자바애플리케이션은 바이트 코드로 변역된 후에 바로 실행할 수 있는 일반 프로그램
클래스 내에 java라는 명령어로 프로그램을 실행할 떄 자동으로 호출되어 프로그램을 시작하는 main()메서드를 가지고 있어야함

java.io 패키지: 처리하기 어려운 입출력 작업을 효율적으로 지원하기 위해 java.io 패키지를 제공하여 입출력프로그램을 구현함

예약어: 시스템에서 일정 특성을 가진 언어로 등록된 것으로, 데이터 타입이나 프로그램 정의를 위해 사용됨. 자바의 모든 예약어는 소 문자로 이루어짐
예: void, break, class, char, long, public, private...*/

public class FirstClass { //클래스 영역
    public static void main(String args[]){ //main: 메인메소드 영역
        System.out.println("첫번째로 작성한 자바 프로그램");
        System.out.println("FirstClass 애플리케이션입니다");
        //System: 클래스
        //out: 변수
        //println: 메소드
        int age = 25;
    }
}


