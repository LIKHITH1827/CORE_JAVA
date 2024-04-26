/**
 * Innerenhanced
 */

    

public class enhanced {
    public static void main(String[] args) {
        int a[]={1,2,3};
        for(int n: a){
            System.out.println(n);
        }
        
    String s="likhith";
  
    System.out.println(s.contains("s"));
    System.out.println(s.charAt(0));
    System.out.println(s.substring(1,3));
    System.out.println(s);
        
   StringBuffer stb=new StringBuffer("likhith");
   stb.append('a');
   System.out.println(stb);
   stb.append("hii");
   System.out.println(stb);
   stb.reverse();
   System.out.println(stb);
   stb.insert(3,'z');
   System.out.println(stb);
    }


   
    
}
