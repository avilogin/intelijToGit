package src.Practice;

public class test001 {
    public static void main(String[] args) {
        String str = "boy good like made good girl boy like";
        String[] strArr = str.split(" ");
        for (int i = 0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);
        }
    }
}
