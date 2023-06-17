/*
 * Decompiled with CFR 0.150.
 */
public class bzd
implements ds {
    private int a;
    private ct b;
    private bvh c;
    private aaf d;

    public bzd() {
    }

    public bzd(int n2, ct ct2, aaf aaf2, bvh bvh2) {
        this.a = n2;
        this.b = ct2;
        this.c = bvh2;
        this.d = aaf2;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.K();
        this.b = ct.a(si2.F());
        this.c = bvh.a(si2.F());
        this.d = aaf.a(si2.e(16));
        if (this.d == null) {
            this.d = aaf.b;
        }
    }

    @Override
    public void b(si si2) {
        si2.E(this.a);
        si2.B(this.b.a());
        si2.B(this.c.a());
        si2.a(this.d.a());
    }

    public int a() {
        return this.a;
    }

    public ct b() {
        return this.b;
    }

    public bvh c() {
        return this.c;
    }

    public aaf d() {
        return this.d;
    }
}

