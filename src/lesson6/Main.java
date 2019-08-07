package lesson6;

public class Main {
    public static void main(String[] args) {

        int unbalancedTrees=0;
        int treesNumber=20;
        int value;
        int max=100;
        int min=-100;
        int lvls=6;

        for (int i=0; i<treesNumber; i++){
            BST<Integer,Integer> bst = new BST<>();
            int k=0;
            while (bst.getHeight()<=lvls) {
                k++;
                value=min + (int) (Math.random() * (max-min));
                bst.put(value,k);
            }
            if(bst.getRightHeight()-bst.getLeftHeight()>1||bst.getRightHeight()-bst.getLeftHeight()<-1){//unbalanced
                unbalancedTrees++;
            }
        }
        double percentage=100.0*(((double)unbalancedTrees)/((double)treesNumber));
        System.out.println("Процент несбалансированных деревьев: "+ percentage);
    }
}
