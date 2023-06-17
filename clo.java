/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;
import org.apache.commons.c.am;
import org.lwjgl.a.g;

public class clo
extends cjn {
    private final cjn b;
    private cld c;
    private cld d;
    private String e;
    private String f = "survival";
    private String g;
    private boolean h = true;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean r;
    private cwv s;
    private cwv t;
    private cwv C;
    private cwv D;
    private cwv E;
    private cwv F;
    private cwv G;
    private String H;
    private String I;
    private String J;
    private String K;
    private int L;
    public String a = "";
    private static final String[] M = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    public clo(cjn cjn2) {
        this.b = cjn2;
        this.J = "";
        this.K = bf.a("selectWorld.newWorld", new Object[0]);
    }

    @Override
    public void d() {
        this.c.a();
        this.d.a();
    }

    @Override
    public void cH_() {
        org.lwjgl.a.g.a(true);
        this.y.clear();
        this.y.add(new cwv(0, this.w / 2 - 155, this.x - 28, 150, 20, bf.a("selectWorld.create", new Object[0])));
        this.y.add(new cwv(1, this.w / 2 + 5, this.x - 28, 150, 20, bf.a("gui.cancel", new Object[0])));
        this.s = this.b(new cwv(2, this.w / 2 - 75, 115, 150, 20, bf.a("selectWorld.gameMode", new Object[0])));
        this.t = this.b(new cwv(3, this.w / 2 - 75, 187, 150, 20, bf.a("selectWorld.moreWorldOptions", new Object[0])));
        this.C = this.b(new cwv(4, this.w / 2 - 155, 100, 150, 20, bf.a("selectWorld.mapFeatures", new Object[0])));
        this.C.l = false;
        this.D = this.b(new cwv(7, this.w / 2 + 5, 151, 150, 20, bf.a("selectWorld.bonusItems", new Object[0])));
        this.D.l = false;
        this.E = this.b(new cwv(5, this.w / 2 + 5, 100, 150, 20, bf.a("selectWorld.mapType", new Object[0])));
        this.E.l = false;
        this.F = this.b(new cwv(6, this.w / 2 - 155, 151, 150, 20, bf.a("selectWorld.allowCommands", new Object[0])));
        this.F.l = false;
        this.G = this.b(new cwv(8, this.w / 2 + 5, 120, 150, 20, bf.a("selectWorld.customizeType", new Object[0])));
        this.G.l = false;
        this.c = new cld(9, this.B, this.w / 2 - 100, 60, 200, 20);
        this.c.b(true);
        this.c.a(this.K);
        this.d = new cld(10, this.B, this.w / 2 - 100, 60, 200, 20);
        this.d.a(this.J);
        this.a(this.r);
        this.f();
        this.h();
    }

    private void f() {
        this.e = this.c.b().trim();
        for (char c2 : ate.c) {
            this.e = this.e.replace(c2, '_');
        }
        if (am.a((CharSequence)this.e)) {
            this.e = "World";
        }
        this.e = clo.a(this.u.i(), this.e);
    }

    private void h() {
        this.s.i = bf.a("selectWorld.gameMode", new Object[0]) + ": " + bf.a("selectWorld.gameMode." + this.f, new Object[0]);
        this.H = bf.a("selectWorld.gameMode." + this.f + ".line1", new Object[0]);
        this.I = bf.a("selectWorld.gameMode." + this.f + ".line2", new Object[0]);
        this.C.i = bf.a("selectWorld.mapFeatures", new Object[0]) + " ";
        this.C.i = this.h ? this.C.i + bf.a("options.on", new Object[0]) : this.C.i + bf.a("options.off", new Object[0]);
        this.D.i = bf.a("selectWorld.bonusItems", new Object[0]) + " ";
        this.D.i = this.k && !this.l ? this.D.i + bf.a("options.on", new Object[0]) : this.D.i + bf.a("options.off", new Object[0]);
        this.E.i = bf.a("selectWorld.mapType", new Object[0]) + " " + bf.a(aaf.a[this.L].b(), new Object[0]);
        this.F.i = bf.a("selectWorld.allowCommands", new Object[0]) + " ";
        this.F.i = this.i && !this.l ? this.F.i + bf.a("options.on", new Object[0]) : this.F.i + bf.a("options.off", new Object[0]);
    }

    public static String a(bxj bxj2, String string) {
        string = string.replaceAll("[\\./\"]", "_");
        for (String string2 : M) {
            if (!string.equalsIgnoreCase(string2)) continue;
            string = "_" + string + "_";
        }
        while (bxj2.a(string) != null) {
            string = string + "-";
        }
        return string;
    }

    @Override
    public void aG_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 1) {
            this.u.a(this.b);
        } else if (cwv2.j == 0) {
            this.u.a((cjn)null);
            if (this.m) {
                return;
            }
            this.m = true;
            long l2 = new Random().nextLong();
            String string = this.d.b();
            if (!am.a((CharSequence)string)) {
                try {
                    long l3 = Long.parseLong(string);
                    if (l3 != 0L) {
                        l2 = l3;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    l2 = string.hashCode();
                }
            }
            atd atd2 = new atd(l2, bvh.a(this.f), this.h, this.l, aaf.a[this.L]);
            atd2.a(this.a);
            if (this.k && !this.l) {
                atd2.a();
            }
            if (this.i && !this.l) {
                atd2.b();
            }
            this.u.a(this.e, this.c.b().trim(), atd2);
        } else if (cwv2.j == 3) {
            this.j();
        } else if (cwv2.j == 2) {
            if ("survival".equals(this.f)) {
                if (!this.j) {
                    this.i = false;
                }
                this.l = false;
                this.f = "hardcore";
                this.l = true;
                this.F.k = false;
                this.D.k = false;
                this.h();
            } else if ("hardcore".equals(this.f)) {
                if (!this.j) {
                    this.i = true;
                }
                this.l = false;
                this.f = "creative";
                this.h();
                this.l = false;
                this.F.k = true;
                this.D.k = true;
            } else {
                if (!this.j) {
                    this.i = false;
                }
                this.f = "survival";
                this.h();
                this.F.k = true;
                this.D.k = true;
                this.l = false;
            }
            this.h();
        } else if (cwv2.j == 4) {
            this.h = !this.h;
            this.h();
        } else if (cwv2.j == 7) {
            this.k = !this.k;
            this.h();
        } else if (cwv2.j == 5) {
            ++this.L;
            if (this.L >= aaf.a.length) {
                this.L = 0;
            }
            while (!this.i()) {
                ++this.L;
                if (this.L < aaf.a.length) continue;
                this.L = 0;
            }
            this.a = "";
            this.h();
            this.a(this.r);
        } else if (cwv2.j == 6) {
            this.j = true;
            this.i = !this.i;
            this.h();
        } else if (cwv2.j == 8) {
            if (aaf.a[this.L] == aaf.c) {
                this.u.a(new dae(this, this.a));
            } else {
                this.u.a(new cee(this, this.a));
            }
        }
    }

    private boolean i() {
        aaf aaf2 = aaf.a[this.L];
        if (aaf2 == null || !aaf2.e()) {
            return false;
        }
        if (aaf2 == aaf.g) {
            return clo.o();
        }
        return true;
    }

    private void j() {
        this.a(!this.r);
    }

    private void a(boolean bl2) {
        this.r = bl2;
        if (aaf.a[this.L] == aaf.g) {
            this.s.l = !this.r;
            this.s.k = false;
            if (this.g == null) {
                this.g = this.f;
            }
            this.f = "spectator";
            this.C.l = false;
            this.D.l = false;
            this.E.l = this.r;
            this.F.l = false;
            this.G.l = false;
        } else {
            this.s.l = !this.r;
            this.s.k = true;
            if (this.g != null) {
                this.f = this.g;
                this.g = null;
            }
            this.C.l = this.r && aaf.a[this.L] != aaf.f;
            this.D.l = this.r;
            this.E.l = this.r;
            this.F.l = this.r;
            this.G.l = this.r && (aaf.a[this.L] == aaf.c || aaf.a[this.L] == aaf.f);
        }
        this.h();
        this.t.i = this.r ? bf.a("gui.done", new Object[0]) : bf.a("selectWorld.moreWorldOptions", new Object[0]);
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.c.k() && !this.r) {
            this.c.a(c2, n2);
            this.K = this.c.b();
        } else if (this.d.k() && this.r) {
            this.d.a(c2, n2);
            this.J = this.d.b();
        }
        if (n2 == 28 || n2 == 156) {
            this.a((cwv)this.y.get(0));
        }
        ((cwv)this.y.get((int)0)).k = !this.c.b().isEmpty();
        this.f();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.r) {
            this.d.a(n2, n3, n4);
        } else {
            this.c.a(n2, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, bf.a("selectWorld.create", new Object[0]), this.w / 2, 20, -1);
        if (this.r) {
            this.b(this.B, bf.a("selectWorld.enterSeed", new Object[0]), this.w / 2 - 100, 47, -6250336);
            this.b(this.B, bf.a("selectWorld.seedInfo", new Object[0]), this.w / 2 - 100, 85, -6250336);
            if (this.C.l) {
                this.b(this.B, bf.a("selectWorld.mapFeatures.info", new Object[0]), this.w / 2 - 150, 122, -6250336);
            }
            if (this.F.l) {
                this.b(this.B, bf.a("selectWorld.allowCommands.info", new Object[0]), this.w / 2 - 150, 172, -6250336);
            }
            this.d.g();
            if (aaf.a[this.L].h()) {
                this.B.a(bf.a(aaf.a[this.L].c(), new Object[0]), this.E.g + 2, this.E.h + 22, this.E.c(), 0xA0A0A0);
            }
        } else {
            this.b(this.B, bf.a("selectWorld.enterName", new Object[0]), this.w / 2 - 100, 47, -6250336);
            this.b(this.B, bf.a("selectWorld.resultFolder", new Object[0]) + " " + this.e, this.w / 2 - 100, 85, -6250336);
            this.c.g();
            this.b(this.B, this.H, this.w / 2 - 100, 137, -6250336);
            this.b(this.B, this.I, this.w / 2 - 100, 149, -6250336);
        }
        super.a(n2, n3, f2);
    }

    public void a(cvn cvn2) {
        this.K = bf.a("selectWorld.newWorld.copyOf", cvn2.i());
        this.J = cvn2.a() + "";
        this.L = cvn2.s().g();
        this.a = cvn2.z();
        this.h = cvn2.q();
        this.i = cvn2.t();
        if (cvn2.r()) {
            this.f = "hardcore";
        } else if (cvn2.p().e()) {
            this.f = "survival";
        } else if (cvn2.p().d()) {
            this.f = "creative";
        }
    }
}

