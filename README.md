![alt tag](http://connect.adfab.fr/wp-content/uploads/2016/12/NetBeans.svg_.png)
# Lambda Java 8 


```
private static void forData() {
        for (Motor item : itemList) {
            System.out.println(item.getName());
        }
}
 
 ```


```
 private static void runnableData() {
        Runnable runData = () -> System.out.println("Test");
        runData.run();
    }
```

```
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

```
 
 
 ```
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
 ```
 
