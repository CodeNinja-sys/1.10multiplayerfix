/*
 * Decompiled with CFR 0.150.
 */
public class bex
extends ck {
    private final cfl a;
    private dap b;

    public bex(cfl cfl2) {
        this.a = cfl2;
        if (!(cfl2.ap() instanceof vp)) {
            throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
        }
    }

    @Override
    public boolean b() {
        if (this.a.aQ.h()) {
            return false;
        }
        cmz cmz2 = new cmz(this.a);
        aus aus2 = this.a.aQ.T().a(cmz2, 16);
        if (aus2 == null) {
            return false;
        }
        this.b = aus2.b(cmz2);
        if (this.b == null) {
            return false;
        }
        return (double)this.b.b(cmz2) < 2.25;
    }

    @Override
    public boolean a() {
        if (this.a.aQ.h()) {
            return false;
        }
        return !this.b.i() && this.b.c(new cmz(this.a));
    }

    @Override
    public void c() {
        ((vp)this.a.ap()).a(false);
        ((vp)this.a.ap()).b(false);
    }

    @Override
    public void d() {
        ((vp)this.a.ap()).a(true);
        ((vp)this.a.ap()).b(true);
        this.b = null;
    }

    @Override
    public void e() {
        this.b.b();
    }
}

