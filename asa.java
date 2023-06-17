/*
 * Decompiled with CFR 0.150.
 */
public class asa
implements ds {
    private int a;
    private short b;
    private boolean c;

    public asa() {
    }

    public asa(int n2, short s2, boolean bl2) {
        this.a = n2;
        this.b = s2;
        this.c = bl2;
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.E();
        this.b = si2.G();
        this.c = si2.E() != 0;
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.C(this.b);
        si2.B(this.c ? 1 : 0);
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }
}

