import BITree.TreeSum;

public class Main {

    public static void main(String[] args) {
        double[] arr1 = {1.3, 2.34, 3.132, 4.34, 5.66, 6.77, 7.77, 8.854};
        TreeSum<Double> bitree = new TreeSum<Double>(arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            bitree.add(i, arr1[i]);
        }
        System.out.println(bitree.rsq(7,7));
    }
}
