/*
 * Decompiled with CFR 0.150.
 */
public class cxg
implements ds {
    private cbg a;
    private byte b;

    public cxg() {
    }

    public cxg(cbg cbg2) {
        this(cbg2, 1);
    }

    public cxg(cbg cbg2, byte by2) {
        this.a = cbg2;
        this.b = by2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.d();
        this.b = si2.E();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.B(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cbg a() {
        return this.a;
    }

    public boolean b() {
        return this.b == 1 || this.b == 2;
    }

    public byte c() {
        return this.b;
    }
}

