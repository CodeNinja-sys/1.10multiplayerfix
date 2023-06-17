/*
 * Decompiled with CFR 0.150.
 */
public class aey
implements ds {
    private int a;
    private dfm b;
    private bhl c;

    public aey() {
    }

    public aey(int n2, dfm dfm2, bhl bhl2) {
        this.a = n2;
        this.b = dfm2;
        this.c = bhl2 == null ? null : bhl2.j();
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = (dfm)si2.a(dfm.class);
        this.c = si2.i();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.a(this.c);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public bhl a() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    public dfm c() {
        return this.b;
    }
}

