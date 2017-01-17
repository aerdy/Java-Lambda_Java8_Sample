/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdasample;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Vim
 */
public class LambdaSample {

    private static ArrayList<Motor> itemList;
    private static int data = 10;

    public static void main(String[] args) {
        // TODO code application logic here
        initData();
        //forData();
        //runnableData();
        comparatorData();
        listenerData();
        
    }

    private static void initData() {
        itemList = new ArrayList<>();

        Motor item = new Motor();
        item.setName("Honda Vario ");
        item.setType("CBS 2010 ");
        itemList.add(item);

        item = new Motor();
        item.setName("Andong Vario ");
        item.setType("CBS 2010 ");
        itemList.add(item);

        item = new Motor();
        item.setName("Cupu Vario ");
        item.setType("CBS 2010 ");
        itemList.add(item);

    }

    private static void forData() {
        for (Motor item : itemList) {
            System.out.println(item.getName());
        }

    }

    private static void runnableData() {
        Runnable runData = () -> System.out.println("Test");
        runData.run();
    }

    private static void comparatorData() {
        //gak pakek lambda
//        Collections.sort(itemList, new Comparator<Motor>() {
//            @Override
//            public int compare(Motor o1, Motor o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//
//        });

        //pakek lambda
        Collections.sort(itemList, (Motor m1, Motor m2) -> m1.getName().compareTo(m2.getName()));

        for (Motor data : itemList) {
            System.out.println(data.getName());
            System.out.println(data.getType());
            System.out.println("-------------------");
        }

    }

    private static void listenerData() {
        JButton testButton = new JButton("Test Button");
//        testButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                System.out.println("Click Detected by Anon Class");
//            }
//        });

        testButton.addActionListener(e -> System.out.println("Click Detected by Lambda Listner"));

        // Swing stuff
        JFrame frame = new JFrame("Listener Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(testButton, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
