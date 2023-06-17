/*
 * Decompiled with CFR 0.150.
 */
public class bpy
extends ck {
    private final nb d;
    private bga e;
    iu a;
    private final double f;
    private final dct g;
    private int h;
    float b;
    float c;
    private float i;

    public bpy(nb nb2, double d2, float f2, float f3) {
        this.d = nb2;
        this.a = nb2.aQ;
        this.f = d2;
        this.g = nb2.ap();
        this.c = f2;
        this.b = f3;
        this.a(3);
        if (!(nb2.ap() instanceof vp)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }

    @Override
    public boolean b() {
        bga bga2 = this.d.E();
        if (bga2 == null) {
            return false;
        }
        if (bga2 instanceof bdl && ((bdl)bga2).aL()) {
            return false;
        }
        if (this.d.C()) {
            return false;
        }
        if (this.d.l(bga2) < (double)(this.c * this.c)) {
            return false;
        }
        this.e = bga2;
        return true;
    }

    @Override
    public boolean a() {
        return !this.g.m() && this.d.l(this.e) > (double)(this.b * this.b) && !this.d.C();
    }

    @Override
    public void c() {
        this.h = 0;
        this.i = this.d.a(cfh.g);
        this.d.a(cfh.g, 0.0f);
    }

    @Override
    public void d() {
        this.e = null;
        this.g.n();
        this.d.a(cfh.g, this.i);
    }

    private boolean a(cmz cmz2) {
        dbk dbk2 = this.a.n(cmz2);
        if (dbk2.a() == ahk.a) {
            return true;
        }
        return !dbk2.h();
    }

    @Override
    public void e() {
        this.d.am().a(this.e, 10.0f, (float)this.d.aw());
        if (this.d.C()) {
            return;
        }
        if (--this.h > 0) {
            return;
        }
        this.h = 10;
        if (this.g.a(this.e, this.f)) {
            return;
        }
        if (this.d.aG()) {
            return;
        }
        if (this.d.l(this.e) < 144.0) {
            return;
        }
        int n2 = cmk.c(this.e.aU) - 2;
        int n3 = cmk.c(this.e.aW) - 2;
        int n4 = cmk.c(this.e.cD().b);
        for (int i2 = 0; i2 <= 4; ++i2) {
            for (int i3 = 0; i3 <= 4; ++i3) {
                if (i2 >= 1 && i3 >= 1 && i2 <= 3 && i3 <= 3 || !this.a.n(new cmz(n2 + i2, n4 - 1, n3 + i3)).q() || !this.a(new cmz(n2 + i2, n4, n3 + i3)) || !this.a(new cmz(n2 + i2, n4 + 1, n3 + i3))) continue;
                this.d.a_((float)(n2 + i2) + 0.5f, n4, (float)(n3 + i3) + 0.5f, this.d.ba, this.d.bb);
                this.g.n();
                return;
            }
        }
    }
}

