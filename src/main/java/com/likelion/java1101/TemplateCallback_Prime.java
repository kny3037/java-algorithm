package com.likelion.java1101;

interface StatementStrategy{
    boolean compare(int a, int b);
}

public class TemplateCallback_Prime {
    //Template Callback적용

    boolean somOperation(int a, int b){
        return a < b;

    }

    public boolean isPrime(int num){
        for (int i = 2; somOperation(i, num); i++) {
            if ((num % i) == 0){
                return false;
            }
        }
        return true;
    }

   // 익명 내부클래스 사용
    public boolean compare(int num, StatementStrategy stmt){
        for (int i = 2; stmt.compare(i, num); i++) {
            if ((num % i) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TemplateCallback_Prime tcp = new TemplateCallback_Prime();
//        boolean r = tcp.compare(17, new StatementStrategy() {
//            @Override
//            public boolean compare(int a, int b) {
//                return a * a < b;
//            }
//        });

        // 위의 코드는 가독성이 떨어짐. 그래서 아래처럼 람다를 적용해서 작성 가능
        System.out.println(tcp.compare(13,(a,b)->a<b));
        System.out.println(tcp.compare(17,(a,b)->a<b));
        System.out.println(tcp.compare(21,(a,b)->a<b));
    }

}
