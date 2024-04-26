class A{
    String s;
    //private
 private int an=6;

 //static var
    static int b=8;
    public void add(int a,int b){
      System.out.println(a+b);
    }

//static method
    public static void add1(A obj){
        System.out.println(obj.s+" ");
    }

    public void getAn(){
System.out.println(an);
    }


    //this keyword
    public void setAn(int an) {
        this.an = an;
        System.out.println(an);

    }

}
public class staticpractice {
    public static void main(String[] args) {
        
    
    A obj=new A();
    obj.s="instancwe";
    obj.add(8,9);
   
    A.add1(obj);

    //using getters to axis private var.
    obj.getAn();

    //set an using this keyword and setter
    obj.setAn(8);

   
    

    }
}

