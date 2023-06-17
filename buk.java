/*
 * Decompiled with CFR 0.150.
 */
public class buk
implements ds {
    private int a;
    private byte b;

    public buk() {
    }

    public buk(cpk cpk2, byte by2) {
        this.a = cpk2.bW();
        this.b = by2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.K();
        this.b = si2.E();
    }

    @Override
    public void b(si si2) {
        si2.E(this.a);
        si2.B(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cpk a(iu iu2) {
        return iu2.a(this.a);
    }

    public byte a() {
        return this.b;
    }
}

