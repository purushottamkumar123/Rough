package Methods;

public class ReturningArray {
    int [] getMyArray(){
        int x[]={11,12,13,14,15};
        return x;
    }
    String [][] getTwoArray(){
        String [][] s={
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"},
                {"abc4","pqr4","xyz4"},
                {"abc5","pqr5","xyz5"}

        };
        return s;

    }

    public static void main(String[] args) {
        ReturningArray obj=new ReturningArray();
        obj.getMyArray();
    }
}
