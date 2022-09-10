package Methods;

public class MethodsArgument2 {
    void printMyarray(int [] arr,String s){
        System.out.println(s);
        for ( int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    void printMyTwoArray(String[][]str){
        for (int i=0;i< str.length;i++){
            for (int j=0;j< str[0].length;j++){
                System.out.println(str[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MethodsArgument2 obj=new MethodsArgument2();
        int a[]={12,13,14,15};
        obj.printMyarray(a,"Purushottam");
        String[][] s={
                { "abc1","def","ghi"},
                {"jkl","mno","pqr"},
                {"stu","vwx","yza"},
                {"stu1","vwx2","yza3"},
                {"stu1","vwx2","yza3"}
        };
        obj.printMyTwoArray(s);
    }
}
