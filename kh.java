/*
 * Decompiled with CFR 0.150.
 */
public abstract class kh {
    protected static final bpx[] b = new bpx[]{new bpx("textures/blocks/destroy_stage_0.png"), new bpx("textures/blocks/destroy_stage_1.png"), new bpx("textures/blocks/destroy_stage_2.png"), new bpx("textures/blocks/destroy_stage_3.png"), new bpx("textures/blocks/destroy_stage_4.png"), new bpx("textures/blocks/destroy_stage_5.png"), new bpx("textures/blocks/destroy_stage_6.png"), new bpx("textures/blocks/destroy_stage_7.png"), new bpx("textures/blocks/destroy_stage_8.png"), new bpx("textures/blocks/destroy_stage_9.png")};
    protected ccg c;

    public void a(bql bql2, double d2, double d3, double d4, float f2, int n2) {
        cbg cbg2 = bql2.v();
        if (cbg2 != null && this.c.j != null && bql2.y().equals(this.c.j.a())) {
            this.a(true);
            this.a(bql2, cbg2.j(), d2, d3, d4, 12);
            this.a(false);
        }
    }

    protected void a(boolean bl2) {
        cja.g(cjg.r);
        if (bl2) {
            cja.w();
        } else {
            cja.v();
        }
        cja.g(cjg.q);
    }

    protected void a(bpx bpx2) {
        bnm bnm2 = this.c.e;
        if (bnm2 != null) {
            bnm2.a(bpx2);
        }
    }

    protected iu a() {
        return this.c.f;
    }

    public void a(ccg ccg2) {
        this.c = ccg2;
    }

    public deb b() {
        return this.c.a();
    }

    public boolean a(bql bql2) {
        return false;
    }

    protected void a(bql bql2, String string, double d2, double d3, double d4, int n2) {
        cpk cpk2 = this.c.g;
        double d5 = bql2.a(cpk2.aU, cpk2.aV, cpk2.aW);
        if (d5 > (double)(n2 * n2)) {
            return;
        }
        float f2 = this.c.h;
        float f3 = this.c.i;
        boolean bl2 = false;
        cwz.a(this.b(), string, (float)d2 + 0.5f, (float)d3 + 1.5f, (float)d4 + 0.5f, 0, f2, f3, false, false);
    }
}

