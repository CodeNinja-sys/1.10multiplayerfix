/*
 * Decompiled with CFR 0.150.
 */
public class jh
implements ds {
    private int a;
    private short b;
    private boolean c;

    public jh() {
    }

    public jh(int n2, short s2, boolean bl2) {
        this.a = n2;
        this.b = s2;
        this.c = bl2;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.F();
        this.b = si2.G();
        this.c = si2.D();
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.C(this.b);
        si2.a(this.c);
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }
}

