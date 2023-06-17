/*
 * Decompiled with CFR 0.150.
 */
public class bpd
implements ds {
    private boolean a;
    private boolean b;

    public bpd() {
    }

    public bpd(boolean bl2, boolean bl3) {
        this.a = bl2;
        this.b = bl3;
    }

    @Override
    public void a(si si2) {
        this.a = si2.D();
        this.b = si2.D();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.b;
    }
}

