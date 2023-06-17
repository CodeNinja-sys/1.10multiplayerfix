/*
 * Decompiled with CFR 0.150.
 */
public class ckb
implements ds {
    private ct a;
    private boolean b;

    public ckb() {
    }

    public ckb(ct ct2, boolean bl2) {
        this.a = ct2;
        this.b = bl2;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = ct.a(si2.F());
    }

    @Override
    public void b(si si2) {
        si2.B(this.a.a());
    }

    public boolean a() {
        return this.b;
    }

    public ct b() {
        return this.a;
    }
}

