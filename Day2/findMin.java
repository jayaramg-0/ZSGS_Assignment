class findMin {
    public static void main(String[] args) {
        int a = 34 ,b = 23,c = 12;
        int min;

        if(a<b){
            if(a<c){
                min = a; 
            }
            else{
                min = c;
            }
        }
        else{
            if(b < c){
                min = b;
            }
            else{
                min = c;
            }
        }
        System.out.println(min);
    }
}
