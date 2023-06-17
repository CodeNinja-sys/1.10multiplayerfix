/*
 * Decompiled with CFR 0.150.
 */
public class wl
extends cjn {
    private final cjn b;
    private final cmx c;
    protected String a = "Options";
    private String d;

    public wl(cjn cjn2, cmx cmx2) {
        this.b = cjn2;
        this.c = cmx2;
    }

    @Override
    public void cH_() {
        this.a = bf.a("options.sounds.title", new Object[0]);
        this.d = bf.a("options.off", new Object[0]);
        int n2 = 0;
        this.y.add(new aub(this, csg.a.ordinal(), this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 - 12 + 24 * (n2 >> 1), csg.a, true));
        n2 += 2;
        for (csg csg2 : csg.values()) {
            if (csg2 == csg.a) continue;
            this.y.add(new aub(this, csg2.ordinal(), this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 - 12 + 24 * (n2 >> 1), csg2, false));
            ++n2;
        }
        this.y.add(new bcy(201, this.w / 2 - 75, this.x / 6 - 12 + 24 * (++n2 >> 1), oi.K, this.c.c(oi.K)));
        this.y.add(new cwv(200, this.w / 2 - 100, this.x / 6 + 168, bf.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 200) {
            this.u.u.b();
            this.u.a(this.b);
        } else if (cwv2.j == 201) {
            this.u.u.a(oi.K, 1);
            cwv2.i = this.u.u.c(oi.K);
            this.u.u.b();
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, this.a, this.w / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    protected String a(csg csg2) {
        float f2 = this.c.a(csg2);
        if (f2 == 0.0f) {
            return this.d;
        }
        return (int)(f2 * 100.0f) + "%";
    }

    static /* synthetic */ cmx a(wl wl2) {
        return wl2.c;
    }
}

