/*
 * Decompiled with CFR 0.150.
 */
public class zh
extends cjn {
    private final cjn a;
    private String b;

    public zh(cjn cjn2) {
        this.a = cjn2;
    }

    @Override
    public void cH_() {
        int n2 = 0;
        this.b = bf.a("options.skinCustomisation.title", new Object[0]);
        for (bzk bzk2 : bzk.values()) {
            this.y.add(new cqb(this, bzk2.b(), this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 + 24 * (n2 >> 1), 150, 20, bzk2, null));
            ++n2;
        }
        this.y.add(new bcy(199, this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 + 24 * (n2 >> 1), oi.H, this.u.u.c(oi.H)));
        if (++n2 % 2 == 1) {
            ++n2;
        }
        this.y.add(new cwv(200, this.w / 2 - 100, this.x / 6 + 24 * (n2 >> 1), bf.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 200) {
            this.u.u.b();
            this.u.a(this.a);
        } else if (cwv2.j == 199) {
            this.u.u.a(oi.H, 1);
            cwv2.i = this.u.u.c(oi.H);
            this.u.u.c();
        } else if (cwv2 instanceof cqb) {
            bzk bzk2 = cqb.a((cqb)cwv2);
            this.u.u.a(bzk2);
            cwv2.i = this.a(bzk2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, this.b, this.w / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    private String a(bzk bzk2) {
        String string = this.u.u.d().contains((Object)bzk2) ? bf.a("options.on", new Object[0]) : bf.a("options.off", new Object[0]);
        return bzk2.d().j() + ": " + string;
    }

    static /* synthetic */ String a(zh zh2, bzk bzk2) {
        return zh2.a(bzk2);
    }
}

