package lesson2;

public class MyArrayList<Item extends Comparable> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity " + capacity);
        } else {
            list = (Item[]) new Comparable[capacity];
        }
    }

    public MyArrayList() {
        list = (Item[]) new Comparable[DEFAULT_CAPACITY];
    }

    public void add(Item item) {
        list[size] = item;
        size++;
    }

    public void add(int index, Item item) {
        if (index > size) {
            index = size;
        }
        if (index < 0) {
            index = 0;
        }
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public boolean remove(Item item) {
        int i = 0;
        while (i < size && !list[i].equals(item)) {
            i++;
        }
        if (i == size) {
            return false;
        }
        for (int j = i; j < size - 1; j++) {
            list[j] = list[j + 1];
        }
        size--;
        list[size] = null;
        return true;
    }

    public Item get(int index) {
        return list[index];
    }

    public void set(int index, Item item) {
        list[index] = item;
    }

    public int size() {
        return size;
    }

    public boolean find(Item item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    private boolean less(Item item1, Item item2) {
        return item1.compareTo(item2) < 0;
    }

    private void swap(int index1, int index2) {
        Item temp = list[index1];
        list[index1] = list[index2];
        list[index2] = temp;

    }

    public void selectionSort() {
        int iMin;
        for (int i = 0; i < size - 1; i++) {
            iMin = i;
            for (int j = i + 1; j < size; j++) {
                if (less(list[j], list[iMin])) {
                    iMin = j;
                }
            }
            swap(i, iMin);
//            System.out.println(this);
        }
    }

    public void insertionSort() {
        for (int left = 0; left < size; left++) {
            // Вытаскиваем значение элемента
            Item value = list[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (less(value, list[i])) {
                    list[i + 1] = list[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            list[i + 1] = value;
        }
    }

    public void bubbleSort(){
        // в худшем и среднем случае – O(n2), в лучшем случае – O(n).
        boolean isSwap;
        for (int i = size-1; i >0 ; i--) {
            isSwap = false;
            for (int j = 0; j < i; j++) {
                if(less(list[j+1], list[j])){
                    swap(j+1,j);
                    isSwap = true;
                }
            }
            if(!isSwap){
                System.out.println("break i= " + i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += list[i] + " ";
        }
        return s;
    }
}
