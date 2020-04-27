package num;

public class Num<T extends Number> extends Number {

    private int numI;
    private double numD;
    private long numL;
    private float numF;


    public Num(int num) {
        this.numI = num;
    }
    public Num(double num) {
        this.numD = num;
    }
    public Num(long num) {
        this.numL = num;
    }
    public Num(float num) {
        this.numF = num;
    }


    public String toString() {
        if(intValue() > 0) {
            return "" + intValue();
        } else if(longValue() > 0) {
            return "" + longValue();
        } else if(doubleValue() > 0) {
            return "" + doubleValue();
        } else
            return "" + floatValue();
    }


    public void add(int num) {
        this.numI += num;
    }
    public void add(long num) {
        this.numL += num;
    }
    public void add(float num) {
        this.numF += num;
    }
    public void add(double num) {
        this.numD += num;
    }

    public void add(T num) {
        switch ((num.getClass().toString().split("lang")[1])) {
            case ".Float":
                this.add(num.floatValue());
                break;
            case ".Long":
                this.add(num.longValue());
                break;
            case ".Integer":
                this.add(num.intValue());
                break;
            case ".Double":
                this.add(num.doubleValue());
                break;
        }
    }

    public void sub(int num) {
        this.numI -= num;
    }
    public void sub(long num) {
        this.numL -= num;
    }
    public void sub(double num) {
        this.numD -= num;
    }
    public void sub(float num) {
        this.numF -= num;
    }

    public void add(Num num) {
        switch (num.typeOfNum(num)) {
            case "Float":
                this.add(num.floatValue());
                break;
            case "Long":
                this.add(num.longValue());
                break;
            case "Integer":
                this.add(num.intValue());
                break;
            case "Double":
                this.add(num.doubleValue());
                break;
        }
    }

    public String typeOfNum(Num num) {
        if(num.intValue() > 0) {
            return "Integer";
        } else if(num.longValue() > 0) {
            return "Long";
        } else if(num.doubleValue() > 0) {
            return "Double";
        } else
            return "Float";
    }


    public void sub(Num num) {
        switch (num.typeOfNum(num)) {
            case "Float":
                this.sub(num.floatValue());
                break;
            case "Long":
                this.sub(num.longValue());
                break;
            case "Integer":
                this.sub(num.intValue());
                break;
            case "Double":
                this.sub(num.doubleValue());
                break;
        }
    }



    @Override
    public int intValue() {
        return numI;
    }

    @Override
    public long longValue() {
        return numL;
    }

    @Override
    public float floatValue() {
        return numF;
    }

    @Override
    public double doubleValue() {
        return numD;
    }


}
