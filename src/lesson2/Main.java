package lesson2;

public class Main {
    public static void main(String[] args) {


        MyArrayList<Integer> mal = new MyArrayList(100000);

        for (int i = 0; i < 100000; i++) {
            mal.add(i + (int) (Math.random() * 100000));
        }
        long timeBegin = System.currentTimeMillis();
        mal.bubbleSort();
        System.out.println("Время сортировки пузырьком " + (System.currentTimeMillis() - timeBegin));

        MyArrayList<Integer> malIns = new MyArrayList(100000);

        for (int k = 0; k < 100000; k++) {
            malIns.add((int) (Math.random() * 100000));
        }
       timeBegin = System.currentTimeMillis();
        malIns.insertionSort();
        System.out.println("Время сортировки вставками " + (System.currentTimeMillis() - timeBegin));


        MyArrayList<Integer> malSel = new MyArrayList(1000000);

        for (int k = 0; k < 100000; k++) {
            malSel.add((int) (Math.random() * 100000));
        }
        timeBegin = System.currentTimeMillis();
        malSel.selectionSort();
        System.out.println("Время сортировки выбором " + (System.currentTimeMillis() - timeBegin));


    }
}
