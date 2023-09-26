package day0823.lock;

import day0823.安全锁.SellTicket;

public class sellticketDemo {

        public static void main(String[] args) {
            SellTicket se=new SellTicket();
            Thread th1=new Thread(se,"窗口1");
            Thread th2=new Thread(se,"窗口2");
            Thread th3=new Thread(se,"窗口3");
            th1.start();
            th2.start();
            th3.start();

        }
    }


