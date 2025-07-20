public class sumOfEven {
    public static void main(String[] args) {
        int n = 10;
        int total = 0;
        for(int a = 0; a <= n; a++){
            if(a%2 != 0){
                continue;
            }
            total+=a;
        }
        System.out.println("The total of Sum of Even Numbers :" + total);
    }
}
