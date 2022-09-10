public class string {
    public static void main(String[] args) {
         String str="This is purushottam kumar";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(5));
        System.out.println(str.substring(1,5));
        String str2="Hi This is java";
        System.out.println(str2.substring(4,13));
        String str3="Puru is good boy";
        System.out.println(str3.substring(0)+str3.substring(0,0));
        System.out.println(str3.substring(1)+str3.substring(0,1));
        System.out.println(str3.substring(2)+str3.substring(0,2));
        System.out.println(str3.substring(3)+str3.substring(0,3));
        String[]sAr= str3.split("");
        for (int i=0;i<sAr.length;i++)
            System.out.println(sAr[i]);


    }
}
