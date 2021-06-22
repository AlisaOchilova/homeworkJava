package homework3;

public abstract class AbstractClass {
    private int name1;
    private double name2;
    private String name3;
    private String name4;

    public void setname1(int name1){
        this.name1 = 1;
    };

    private void setname2(double name2){
        this.name2 = 1.1;
    };

    private void setname3(String name3){
        this.name3 = "1";
    };

    private int getName1(){
        name1 = 1;
        return name1;
    }

    private double getName2(){
        name2 = 2.0;
        return name2;
    }

    private String getName3(){
        name3 = "3";
        return name3;
    }

    public void setName4(String name4){
        this.name4 = "4";
    };

    public abstract void move();
}
