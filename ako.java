/*
 * Decompiled with CFR 0.150.
 */
public class ako
extends cjn
implements awn {
    private static final oi[] b = new oi[]{oi.c};
    private final cjn c;
    private final cmx d;
    private cwv e;
    private apo f;
    protected String a = "Options";

    public ako(cjn cjn2, cmx cmx2) {
        this.c = cjn2;
        this.d = cmx2;
    }

    @Override
    public void cH_() {
        this.a = bf.a("options.title", new Object[0]);
        int n2 = 0;
        for (oi oi2 : b) {
            if (oi2.a()) {
                this.y.add(new jq(oi2.c(), this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 - 12 + 24 * (n2 >> 1), oi2));
            } else {
                bcy bcy2 = new bcy(oi2.c(), this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 - 12 + 24 * (n2 >> 1), oi2, this.d.c(oi2));
                this.y.add(bcy2);
            }
            ++n2;
        }
        if (this.u.f != null) {
            ct ct2 = this.u.f.Q();
            this.e = new cwv(108, this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 - 12 + 24 * (n2 >> 1), 150, 20, this.a(ct2));
            this.y.add(this.e);
            if (this.u.G() && !this.u.f.E().r()) {
                this.e.a(this.e.c() - 20);
                this.f = new apo(109, this.e.g + this.e.c(), this.e.h);
                this.y.add(this.f);
                this.f.b(this.u.f.E().x());
                this.f.k = !this.f.a();
                this.e.k = !this.f.a();
            } else {
                this.e.k = false;
            }
        } else {
            this.y.add(new bcy(oi.L.c(), this.w / 2 - 155 + n2 % 2 * 160, this.x / 6 - 12 + 24 * (n2 >> 1), oi.L, this.d.c(oi.L)));
        }
        this.y.add(new cwv(110, this.w / 2 - 155, this.x / 6 + 48 - 6, 150, 20, bf.a("options.skinCustomisation", new Object[0])));
        this.y.add(new cwv(106, this.w / 2 + 5, this.x / 6 + 48 - 6, 150, 20, bf.a("options.sounds", new Object[0])));
        this.y.add(new cwv(101, this.w / 2 - 155, this.x / 6 + 72 - 6, 150, 20, bf.a("options.video", new Object[0])));
        this.y.add(new cwv(100, this.w / 2 + 5, this.x / 6 + 72 - 6, 150, 20, bf.a("options.controls", new Object[0])));
        this.y.add(new cwv(102, this.w / 2 - 155, this.x / 6 + 96 - 6, 150, 20, bf.a("options.language", new Object[0])));
        this.y.add(new cwv(103, this.w / 2 + 5, this.x / 6 + 96 - 6, 150, 20, bf.a("options.chat.title", new Object[0])));
        this.y.add(new cwv(105, this.w / 2 - 155, this.x / 6 + 120 - 6, 150, 20, bf.a("options.resourcepack", new Object[0])));
        this.y.add(new cwv(104, this.w / 2 + 5, this.x / 6 + 120 - 6, 150, 20, bf.a("options.snooper.view", new Object[0])));
        this.y.add(new cwv(200, this.w / 2 - 100, this.x / 6 + 168, bf.a("gui.done", new Object[0])));
    }

    public String a(ct ct2) {
        aym aym2 = new aym("");
        aym2.a(new du("options.difficulty", new Object[0]));
        aym2.b(": ");
        aym2.a(new du(ct2.b(), new Object[0]));
        return aym2.j();
    }

    @Override
    public void a(boolean bl2, int n2) {
        this.u.a(this);
        if (n2 == 109 && bl2 && this.u.f != null) {
            this.u.f.E().e(true);
            this.f.b(true);
            this.f.k = false;
            this.e.k = false;
        }
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j < 100 && cwv2 instanceof bcy) {
            oi oi2 = ((bcy)cwv2).a();
            this.d.a(oi2, 1);
            cwv2.i = this.d.c(oi.a(cwv2.j));
        }
        if (cwv2.j == 108) {
            this.u.f.E().a(ct.a(this.u.f.Q().a() + 1));
            this.e.i = this.a(this.u.f.Q());
        }
        if (cwv2.j == 109) {
            this.u.a(new ayi(this, new du("difficulty.lock.title", new Object[0]).j(), new du("difficulty.lock.question", new du(this.u.f.E().w().b(), new Object[0])).j(), 109));
        }
        if (cwv2.j == 110) {
            this.u.u.b();
            this.u.a(new zh(this));
        }
        if (cwv2.j == 101) {
            this.u.u.b();
            this.u.a(new agx(this, this.d));
        }
        if (cwv2.j == 100) {
            this.u.u.b();
            this.u.a(new btk(this, this.d));
        }
        if (cwv2.j == 102) {
            this.u.u.b();
            this.u.a(new car(this, this.d, this.u.S()));
        }
        if (cwv2.j == 103) {
            this.u.u.b();
            this.u.a(new ahj(this, this.d));
        }
        if (cwv2.j == 104) {
            this.u.u.b();
            this.u.a(new qn(this, this.d));
        }
        if (cwv2.j == 200) {
            this.u.u.b();
            this.u.a(this.c);
        }
        if (cwv2.j == 105) {
            this.u.u.b();
            this.u.a(new axb(this));
        }
        if (cwv2.j == 106) {
            this.u.u.b();
            this.u.a(new wl(this, this.d));
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, this.a, this.w / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

