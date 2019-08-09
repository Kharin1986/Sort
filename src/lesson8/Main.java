package lesson8;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> hm = new ChainingHashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        hm.put(5,"five");
        hm.put(6,"six");
        hm.put(7,"seven");
        hm.put(8,"eight");

      //  System.out.println(hm.get(3));

//        for (int i = 0; i <99 ; i++) {
//            hm.put((int)(Math.random()*1000),""+i);
//        }

       // System.out.println(hm);
        hm.delete(4);

      //  System.out.println(hm.get(4));
        System.out.println(hm.toString());
        LinearProbingHashMap<Integer, String> lhm = new LinearProbingHashMap<>();
//        lhm.put(1,"one");
//        lhm.put(2,"two");
//        lhm.put(3,"three");
//        lhm.put(4,"four");
//
//        System.out.println(lhm.get(4));

//        for (int i = 0; i <50 ; i++) {
//            lhm.put((int)(Math.random()*1000),""+i);
//        }
//
//        System.out.println(lhm);


    }
}
