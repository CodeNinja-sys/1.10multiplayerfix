/*
 * Decompiled with CFR 0.150.
 */
public class aqo
implements ds {
    private int a;
    private int b;
    private int c;

    public aqo() {
    }

    public aqo(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.F();
        this.b = si2.G();
        this.c = si2.G();
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.C(this.b);
        si2.C(this.c);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }
}

