/*
 * Decompiled with CFR 0.150.
 */
public class jt {
    private final int a;
    private final cmz b;
    private int c;
    private int d;

    public jt(int n2, cmz cmz2) {
        this.a = n2;
        this.b = cmz2;
    }

    public cmz a() {
        return this.b;
    }

    public void a(int n2) {
        if (n2 > 10) {
            n2 = 10;
        }
        this.c = n2;
    }

    public int b() {
        return this.c;
    }

    public void b(int n2) {
        this.d = n2;
    }

    public int c() {
        return this.d;
    }
}

