/*
 * Decompiled with CFR 0.150.
 */
public class cxv
extends cjn
implements awn {
    private int a;
    private final cbg b;

    public cxv(cbg cbg2) {
        this.b = cbg2;
    }

    @Override
    public void cH_() {
        this.y.clear();
        this.a = 0;
        if (this.u.f.E().r()) {
            this.y.add(new cwv(0, this.w / 2 - 100, this.x / 4 + 72, bf.a("deathScreen.spectate", new Object[0])));
            this.y.add(new cwv(1, this.w / 2 - 100, this.x / 4 + 96, bf.a("deathScreen." + (this.u.F() ? "deleteWorld" : "leaveServer"), new Object[0])));
        } else {
            this.y.add(new cwv(0, this.w / 2 - 100, this.x / 4 + 72, bf.a("deathScreen.respawn", new Object[0])));
            this.y.add(new cwv(1, this.w / 2 - 100, this.x / 4 + 96, bf.a("deathScreen.titleScreen", new Object[0])));
            if (this.u.M() == null) {
                ((cwv)this.y.get((int)1)).k = false;
            }
        }
        for (cwv cwv2 : this.y) {
            cwv2.k = false;
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(cwv cwv2) {
        switch (cwv2.j) {
            case 0: {
                this.u.h.n();
                this.u.a((cjn)null);
                break;
            }
            case 1: {
                if (this.u.f.E().r()) {
                    this.u.a(new agj());
                    break;
                }
                ayi ayi2 = new ayi(this, bf.a("deathScreen.quit.confirm", new Object[0]), "", bf.a("deathScreen.titleScreen", new Object[0]), bf.a("deathScreen.respawn", new Object[0]), 0);
                this.u.a(ayi2);
                ayi2.a(20);
            }
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2) {
            if (this.u.f != null) {
                this.u.f.w();
            }
            this.u.a((ym)null);
            this.u.a(new agj());
        } else {
            this.u.h.n();
            this.u.a((cjn)null);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        cbg cbg2;
        boolean bl2 = this.u.f.E().r();
        this.b(0, 0, this.w, this.x, 0x60500000, -1602211792);
        cja.D();
        cja.b(2.0f, 2.0f, 2.0f);
        this.a(this.B, bf.a(bl2 ? "deathScreen.title.hardcore" : "deathScreen.title", new Object[0]), this.w / 2 / 2, 30, 0xFFFFFF);
        cja.E();
        if (this.b != null) {
            this.a(this.B, this.b.j(), this.w / 2, 85, 0xFFFFFF);
        }
        this.a(this.B, bf.a("deathScreen.score", new Object[0]) + ": " + (Object)((Object)aug.o) + this.u.h.al(), this.w / 2, 100, 0xFFFFFF);
        if (this.b != null && n3 > 85 && n3 < 85 + this.B.a && (cbg2 = this.b(n2)) != null && cbg2.h().i() != null) {
            this.a(cbg2, n2, n3);
        }
        super.a(n2, n3, f2);
    }

    public cbg b(int n2) {
        if (this.b == null) {
            return null;
        }
        int n3 = this.u.k.a(this.b.j());
        int n4 = this.w / 2 - n3 / 2;
        int n5 = this.w / 2 + n3 / 2;
        int n6 = n4;
        if (n2 < n4 || n2 > n5) {
            return null;
        }
        for (cbg cbg2 : this.b) {
            if ((n6 += this.u.k.a(cma.a(cbg2.b(), false))) <= n2) continue;
            return cbg2;
        }
        return null;
    }

    @Override
    public boolean q_() {
        return false;
    }

    @Override
    public void d() {
        super.d();
        ++this.a;
        if (this.a == 20) {
            for (cwv cwv2 : this.y) {
                cwv2.k = true;
            }
        }
    }
}

