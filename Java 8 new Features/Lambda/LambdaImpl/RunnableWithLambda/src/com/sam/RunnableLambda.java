package com.sam;

public class RunnableLambda {
    public static void main(String[] args) {
        Thread threadUsingAnonymous = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Runnable using anonymous Class");
            }
        });
    }

    threadUsingAnonymous.run();

    Thread threadUsingLambda = new Thread(() -> System.out.println("Runnable using Lambda"));

    threadUsingLambda.run();

}