package BITree;


import num.Num;

public class TreeSum<T extends Number> {

    private int n;
    private Num[] f;

    public TreeSum(int n) {
        this.n = n;
        f = new Num[n];
        for (int j = 0; j < n; j++) {
            f[j] = new Num<>(0);
        }
    }
    
    private Num<Number> rsq(int r) throws ArrayIndexOutOfBoundsException {
        Num<Number> res = new Num<>(0);
        for (int i = r; i >= 0; i = (i & (i + 1)) - 1) {
            res.add(f[i]);
        }
        return res;
    }

    public Num<Number> rsq(int l, int r) throws ArrayIndexOutOfBoundsException{
        Num<Number> result = new Num<>(0);
        try {
            result.add(rsq(r));
            if (l > 0) {
                result.sub(rsq(l - 1));
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException(
                    "Wrong indexes of bounds");
        }

        return result;
    }

    public void add(int pos, T val) {
        try {
            if (pos < 0 | pos >= n) {
                throw new MyOwnExc();
            }
        } catch (MyOwnExc exc) {
            System.out.println("Error: " + exc);
        }

        while (pos < n) {
            f[pos].add(val);
            pos = pos | (pos + 1);
        }
    }

}

class MyOwnExc extends Exception {

    public String toString() {
        return "Wrong index of bound";
    }
}




