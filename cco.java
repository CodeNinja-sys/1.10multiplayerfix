/*
 * Decompiled with CFR 0.150.
 */
public class cco
implements ds {
    private cmz a;
    private bqk b;
    private bpk c;

    public cco() {
    }

    public cco(bpk bpk2, cmz cmz2, bqk bqk2) {
        this.c = bpk2;
        this.a = cmz2;
        this.b = bqk2;
    }

    @Override
    public void a(si si2) {
        this.c = (bpk)si2.a(bpk.class);
        this.a = si2.c();
        this.b = bqk.a(si2.F());
    }

    @Override
    public void b(si si2) {
        si2.a(this.c);
        si2.a(this.a);
        si2.B(this.b.b());
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public cmz a() {
        return this.a;
    }

    public bqk b() {
        return this.b;
    }

    public bpk c() {
        return this.c;
    }
}

