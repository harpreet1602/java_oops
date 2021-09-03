public class exp3Armstrong {
    public static void main(String[] args){
        int a,b,c,n;
        for(int i = 100; i<1000 ; i++){
            a = i % 10;
            b = i % 100/10;
            c= i/100;
             n =a*a*a + b*b*b + c*c*c;
             if(i==n){
                 System.out.println(i);
             }
        }
    }
}
