package com.likelion.PCCP;

import java.util.*;

public class Printer {

    public int solution(int[] priorities, int location) {

        List<PrintJob> printlist = new ArrayList<PrintJob>();
        for (int i = 0; i < priorities.length; i++)
            printlist.add(new PrintJob(i,priorities[i]));

        int answer = 0;
        while(!printlist.isEmpty()){
            // 0번을 꺼내서 max priority가 아니면 다시 끝에 넣는다.
            PrintJob job = printlist.remove(0);
            if (printlist.stream().anyMatch(otherJob ->job.priority < otherJob.priority)){
                printlist.add(job);
            }else {
                //max priority이면 내가 찾는 job이 맞는지 확인
                answer++;
                if (location == job.location)
                    break;
            }
        }
        return answer;
    }
    class PrintJob{
        int priority;
        int location;

        public PrintJob(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        int [] priorities = {1,1,9,1,1,1};
        System.out.println(printer.solution(priorities,0));
    }
}

