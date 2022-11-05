package gg.rikgames.www;

public class paraConst {
    int m;
    int gm;

    public paraConst(int m, int gm) {
        this.m = m;
        this.gm = gm;
    }

    public static void main(String[] args) {
        paraConst paraConst1 = new paraConst(1, 2);

        System.out.println(paraConst1.m + " " + paraConst1.gm);
    }
}
