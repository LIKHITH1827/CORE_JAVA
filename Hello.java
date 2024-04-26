
class  calculator{
    int a;
    public int add(int n1,int n2){
        return n1+n2;
    }
    public double add(int n1,int n2,int n3){
          return n1+n2+n3;
    }
}
public class Hello{
    
    public static void main(String a[]){
        
       int a1=3;
       int b=4;
       int c=5;
       
        calculator cobj=new calculator();
        double sum=cobj.add(a1, b,c);
        System.out.println(sum);
         

        int ar[]={1,2,3};
        int ar1[][]=new int[3][];
       // System.out.println(ar[3]);
       int array3d[][]={{1,2,3} ,{4,5,6}};
       array3d[0]=new int[4];
       array3d[1]=new int [5];


       
       

       for(int i=0;i<array3d.length;i++){
        for(int j=0;j<array3d[i].length;j++){

        }
       }

    }

}
