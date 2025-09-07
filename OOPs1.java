public class OOPS{
    public static void main(String ar[]){
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="Pink";
        System.out.println(p1.color);
        student s1=new student();
        s1.calcPercentage(83, 97, 99);
        System.out.println("Total Perecntage: "+s1.percentage);
    }
}


class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class student{
    int m1, m2, m3;
    float percentage;
    void calcPercentage(int Phy, int Chem, int Bio){
        m1=Phy;
        m2=Chem;
        m3=Bio;
        percentage=((m1+m2+m3)/300.0f)*100;
    }
}  //classes and objects
