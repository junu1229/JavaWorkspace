package com.kh.condition;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ConditionPractice c = new ConditionPractice();
//		c.practice1();
//		c.practice2();
//		c.practice3();
//		c.practice4();
//		c.practice5();
//		c.practice6();
//		c.practice7();
//		c.practice8();
//		c.practice9();
//		c.practice10();
		c.practice11();
	}

    /*
       키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
       짝수가 아니면 “홀수다“를 출력하세요.
       양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
    
       숫자를 한 개 입력하세요 : -8
       양수만 입력해주세요.
     */
    public void practice1() {
    	int num1 = 0;
    	String str = "";
    	System.out.println("양수를 입력해주세요. > ");
    	num1 = sc.nextInt();
    	if(num1 > 0) {
    		System.out.println(str = num1%2 == 0 ? "짝수다" : "홀수다");
    	}
    	else {
			System.out.println("양수만 입력해주세요.");
		}
        
    }

    /*
        정수 num1과 num2가 매개변수로 주어진다. 두 수가 같으면 1 다르면 -1을 출력하세요.

        num1 : 2
        num2 : 3
        -1

        num1 : 11
        num2 : 11
        1
     */
    public void practice2() {
    	
    	int num1 = 0;
    	int num2 = 0;
    	int result = 0;
    	System.out.println("숫자를 입력해주세요. > ");
    	num1 = sc.nextInt();
    	System.out.println("숫자를 입력해주세요. > ");
    	num2 = sc.nextInt();
    	System.out.println(result = num1 == num2 ? 1 : -1);
    	
        
    }

    /*
        A 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라준다.
        피자 조각 수와 피자를 먹는 사람의 수를 입력받아 한 사람 당 최소 한 조각 이상 피자를 먹으려면 
        최소 몇 판의 피자를 시켜야 하는지 출력하세요.

        피자 조각 수 : 7
        피자 먹는 사람 수 : 10
        2

     */
    public void practice3() {
    	
    	int pizzaPieceNum = 0;
    	int peopleNum = 0;
    	System.out.println("피자 조각 수를 입력해주세요. > ");
    	pizzaPieceNum = sc.nextInt();
    	System.out.println("사람의 수를 입력해주세요. > ");
    	peopleNum = sc.nextInt();
    	if (peopleNum%pizzaPieceNum == 0) {
			System.out.println(peopleNum/pizzaPieceNum);
		}
    	else {
    		System.out.println(peopleNum/pizzaPieceNum+1);
		}
    	System.out.println();
        
    }

    /*
        국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        불합격인 경우에는 “불합격입니다.”를 출력하세요.
    
        국어점수 : 88 
        수학점수 : 50 
        영어점수 : 40 
        불합격입니다.

        국어점수 : 88
        수학점수 : 50
        영어점수 : 45
        국어 : 88
        수학 : 50
        영어 : 45
        합계 : 183
        평균 : 61.0
        축하합니다, 합격입니다!
     */
    public void practice4() {
    	int korScore = 0;
    	int mathScore = 0;
    	int engScore = 0;
    	int totalScore = 0;
    	double averageScore = 0;
    	
    	System.out.println("국어 점수를 입력해주세요. > ");
    	korScore = sc.nextInt();
    	System.out.println("수학 점수를 입력해주세요. > ");
    	mathScore = sc.nextInt();
    	System.out.println("영어 점수를 입력해주세요. > ");
    	engScore = sc.nextInt();
    	
    	totalScore = korScore + mathScore + engScore;
    	averageScore = totalScore/3;

    	if (korScore >= 40 && mathScore >= 40 && engScore >= 40 && averageScore >= 60) {
    		
    		System.out.println("국어 : "+korScore);
    		System.out.println("수학 : "+mathScore);
    		System.out.println("영어 : "+engScore);
    		System.out.println("합계 : "+totalScore);
    		System.out.println("평균 : "+averageScore);
    		System.out.println("축하합니다, 합격입니다!");
			
		}
    	
    	else {
			
    		System.out.println("국어 : "+korScore);
    		System.out.println("수학 : "+mathScore);
    		System.out.println("영어 : "+engScore);
    		System.out.println("불합격입니다.");
		
    	}
  
    }

    /*
        B 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만원 이상 사면 20%를 할인해준다.
        구매한 옷의 가격을 입력했을 때, 지불해야 할 금액을 출력하세요.
        
        구매한 옷 가격 : 580,000
        464,000
     */
    public void practice5() {
    	
    	int buyPrice = 0;
    	
    	System.out.println("옷 가격을 입력해주세요. > ");
    	buyPrice = sc.nextInt();
    	
    	if (buyPrice > 500000) {
			buyPrice *= 0.8;
		}
    	else if (buyPrice > 300000) {
    		buyPrice *= 0.9;
    		
    	}
    	else if (buyPrice > 100000) {
    		buyPrice *= 0.95;
    		
    	}
    	System.out.println(buyPrice);
    	

    }


    /*
        각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류한다.
        입력받은 각에 따라 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 출력하세요.
     */
    public void practice6() {
    	int degree = 0;
    	
    	System.out.println("각도를 입력해주세요. > ");
    	degree = sc.nextInt();
    	
    	if (degree < 0) {
    		System.out.println("입력값 오류입니다.");
    	}
    	else if (degree<90 ) {
			System.out.println(1);
		}
    	else if (degree==90) {
    		System.out.println(2);
    	}
    	else if (degree<180) {
    		System.out.println(3);
    	}
    	else if (degree==180) {
    		System.out.println(4);
    	}
    	

    }


    /*
      아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
      로그인 성공 시 “로그인 성공”, 
      아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
      비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

      아이디 : happy
      비밀번호 : 1234
      로그인 성공!
 
      아이디 : happy
      비밀번호 : 23467
      비밀번호가 틀렸습니다.

      아이디 : happy222
      비밀번호 : 1234
      아이디가 틀렸습니다.
    */
    public void practice7() {
    	
    	String loginId = "happy";
    	int loginPassword = 1234;
    	
    	String userLoginId = "";
    	int userLoginPassword = 0;
    	
    	System.out.println("아이디를 입력해주세요. > ");
    	userLoginId = sc.nextLine();
    	System.out.println("비밀번호를 입력해주세요. > ");
    	userLoginPassword = sc.nextInt();
    	
    	if (loginId.equals(userLoginId) && loginPassword == userLoginPassword) {
			System.out.println("로그인 성공!");
		}
    	else if(!(loginId.equals(userLoginId))) {
    		System.out.println("아이디가 틀렸습니다.");
		}
    	else if(loginPassword != userLoginPassword){
    		System.out.println("비밀번호가 틀렸습니다.");
		}
    	else {
    		System.out.println("아이디와 비밀번호가 틀렸습니다.");
		}
 
    }

    /*
        키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
        저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
        BMI = 몸무게 / (키(m) * 키(m))
        BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
        BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
        BMI가 30이상일 경우 고도 비만

        키(m)를 입력해 주세요 : 1.62
        몸무게(kg)를 입력해 주세요 : 46
        BMI 지수 : 17.527815881725342
        저체중

     */
    public void practice8() {
    	
    	double height = 0;
    	double weigt = 0;
    	double bmi = 0;
    	
    	System.out.println("키를 입력해주세요. > ");
    	height = sc.nextDouble();
    	System.out.println("키를 입력해주세요. > ");
    	weigt = sc.nextDouble();
    	
    	
    	bmi = weigt / (height*height);
    	System.out.println("BMI 지수 : "+bmi);
    	if (bmi<18.5) {
			System.out.println("저체중");
		}
    	else if (bmi<23) {
    		System.out.println("정상체중");
    	}
    	else if (bmi<25) {
    		System.out.println("과체중");
    	}
    	else if (bmi<30) {
    		System.out.println("비만");
    	}
    	else {
    		System.out.println("고도 비만");
    	}
       
    }

    /*
        키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
        (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
        “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)

        피연산자1 입력 : 15
        피연산자2 입력 : 4
        연산자를 입력(+,-,*,/,%) : /
        15 / 4 = 3

     */
    public void practice9() {
    	int num1 = 0;
    	int num2 = 0;
    	char c = '\u0000';
 
    	
    	System.out.println("숫자를 입력해주세요. > ");
    	num1 = sc.nextInt();
    	System.out.println("숫자를 입력해주세요. > ");
    	num2 = sc.nextInt();
    	System.out.println("연산기호를 입력해주세요. > ");
    	c = sc.next().charAt(0);
    	sc.nextLine();
    	
    	switch (c) {
		case '+':
			System.out.println(num1 +num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '%':
			System.out.println(num1 % num2);
			break;

		}

    }

    /*
      아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
      종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요

        1. 입력
        2. 수정
        3. 조회
        4. 삭제
        9. 종료
        메뉴 번호를 입력하세요 : 3
        조회 메뉴입니다.
     */
    public void practice10() {
    	int menuNum = 0;
    	System.out.println("숫자를 입력해주세요. > ");
    	menuNum = sc.nextInt();
    	
    	switch (menuNum) {
		case 1:
			System.out.println("입력메뉴입니다.");
			break;
		case 2:
			System.out.println("수정메뉴입니다.");
			break;
		case 3:
			System.out.println("조회메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			break;

		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}

    }

    /*
        중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
        총 점 100점 중 배점으로는 다음과 같다.
        중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)

        이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력

        총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
        아니면 Fail을 출력하세요.


        중간 고사 점수 : 80
        기말 고사 점수 : 90
        과제 점수 : 50
        출석 회수 : 15
        ===========결과==========
        중간 고사 점수(20) : 16.0
        기말 고사 점수(30) : 27.0
        과제 점수 (30) : 15.0
        출석 점수 (20) : 15.0
        총점 : 73.0
        PASS

        중간 고사 점수 : 80
        기말 고사 점수 : 30
        과제 점수 : 60
        출석 회수 : 18
        ===========결과==========
        FAIL [점수 미달] (총점 61.0)

        중간 고사 점수 : 90
        기말 고사 점수 : 100
        과제 점수 : 80
        출석 회수 : 13
        ===========결과==========
        FAIL [출석 횟수 부족] (13/20)

        중간 고사 점수 : 100
        기말 고사 점수 : 80
        과제 점수 : 40
        출석 회수 : 10
        ===========결과==========
        FAIL [출석 횟수 부족] (10/20)
        FAIL [점수 미달] (총점 66.0)

     */
    public void practice11() {
    	double middleScore = 0;
    	double finalScore = 0;
    	double homeWorkScore = 0;
    	int attendance = 0;
    	double totalScore = 0;
    	System.out.println("중간고사 점수를 입력해주세요. > ");
    	middleScore = sc.nextInt();
    	System.out.println("기말고사 점수를 입력해주세요. > ");
    	finalScore = sc.nextInt();
    	System.out.println("과제 점수를 입력해주세요. > ");
    	homeWorkScore = sc.nextInt();
    	System.out.println("출석 횟수를 입력해주세요. > ");
    	attendance = sc.nextInt();
    	totalScore = (middleScore*0.2) + (finalScore*0.3) + (homeWorkScore*0.3) + (attendance);
    	
    	
    	if (totalScore > 70 && attendance > 70*0.2) {
    		
    		System.out.println("중간고사 점수(20) : " + middleScore*0.2);
    		System.out.println("기말고사 점수(30) : " + finalScore*0.3);
    		System.out.println("과제 점수(30) : " + homeWorkScore*0.3);
    		System.out.println("출석 점수(20) : " + attendance);
    		System.out.println("총점 : " + totalScore);
    		System.out.println("PASS");
			
		}
    	else if (totalScore < 70 && attendance > 70*0.2) {
    		
    		System.out.println("FAIL [점수미달] (총점 " + totalScore + ")");
    		
    	}
    	
    	else if (totalScore > 70 && attendance < 70*0.2) {
    		
    		System.out.println("FAIL [출석 횟수 부족] (" + attendance + "/20)");
    		
    	}
    	
    	else if (totalScore < 70 && attendance < 70*0.2) {
    		
    		System.out.println("FAIL [출석 횟수 부족] (" + attendance + "/20)");
    		System.out.println("FAIL [점수미달] (총점 " + totalScore + ")");
    		
    	}
    	
        
    }
    
}