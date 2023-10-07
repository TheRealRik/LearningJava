package IntelliJ.Test.src.com.realrik;

public class breakstatement {
    public static void main(String[] args) {
        int x;
        for(x=1;x<=10;x++){
            System.out.println(x);
            if(x==5)
                break;
            System.out.println("rik");
        }
    }
}
