/*
 * Decompiled with CFR 0.150.
 */
public class aqp
implements ds {
    private int a;
    private cmz b;
    private int c;
    private boolean d;

    public aqp() {
    }

    public aqp(int n2, cmz cmz2, int n3, boolean bl2) {
        this.a = n2;
        this.b = cmz2;
        this.c = n3;
        this.d = bl2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.K();
        this.b = si2.c();
        this.c = si2.K();
        this.d = si2.D();
    }

    @Override
    public void b(si si2) {
        si2.E(this.a);
        si2.a(this.b);
        si2.E(this.c);
        si2.a(this.d);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public boolean a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public cmz d() {
        return this.b;
    }
}

