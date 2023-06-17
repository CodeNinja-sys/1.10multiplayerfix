/*
 * Decompiled with CFR 0.150.
 */
public class afv
extends bh {
    private bvp b = new bvp();

    public afv(String string) {
        super(string);
    }

    @Override
    public void a(bvp bvp2) {
        this.b = bvp2.o("Features");
    }

    @Override
    public bvp b(bvp bvp2) {
        bvp2.a("Features", this.b);
        return bvp2;
    }

    public void a(bvp bvp2, int n2, int n3) {
        this.b.a(afv.a(n2, n3), bvp2);
    }

    public static String a(int n2, int n3) {
        return "[" + n2 + "," + n3 + "]";
    }

    public bvp c() {
        return this.b;
    }
}

