/*
 * Decompiled with CFR 0.150.
 */
public class cup
extends byf {
    private cmd g;

    @Override
    public void c() {
        this.c = new cvi(cff.k);
        this.e = true;
        bvp bvp2 = this.b.E().a(cyy.c);
        this.g = this.b instanceof alj ? new cmd((alj)this.b, bvp2.o("DragonFight")) : null;
    }

    @Override
    public tv d() {
        return new cgb(this.b, this.b.E().q(), this.b.y());
    }

    @Override
    public float a(long l2, float f2) {
        return 0.0f;
    }

    @Override
    public float[] a(float f2, float f3) {
        return null;
    }

    @Override
    public amj b(float f2, float f3) {
        int n2 = 0xA080A0;
        float f4 = cmk.b(f2 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f4 = cmk.a(f4, 0.0f, 1.0f);
        float f5 = 0.627451f;
        float f6 = 0.5019608f;
        float f7 = 0.627451f;
        return new amj(f5 *= f4 * 0.0f + 0.15f, f6 *= f4 * 0.0f + 0.15f, f7 *= f4 * 0.0f + 0.15f);
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public float g() {
        return 8.0f;
    }

    @Override
    public boolean b(int n2, int n3) {
        return this.b.b(new cmz(n2, 0, n3)).a().c();
    }

    @Override
    public cmz i() {
        return new cmz(100, 50, 0);
    }

    @Override
    public int j() {
        return 50;
    }

    @Override
    public boolean c(int n2, int n3) {
        return false;
    }

    @Override
    public cyy a() {
        return cyy.c;
    }

    @Override
    public void q() {
        bvp bvp2 = new bvp();
        if (this.g != null) {
            bvp2.a("DragonFight", this.g.a());
        }
        this.b.E().a(cyy.c, bvp2);
    }

    @Override
    public void r() {
        if (this.g != null) {
            this.g.b();
        }
    }

    public cmd s() {
        return this.g;
    }
}

