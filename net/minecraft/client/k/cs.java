/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.util.Random;
import net.minecraft.client.f.u;
import net.minecraft.client.k.bm;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cq;
import net.minecraft.client.k.dn;
import net.minecraft.q.a.d;
import net.minecraft.q.a.w;
import net.minecraft.q.ab;
import net.minecraft.q.aj;
import net.minecraft.q.am;
import org.lwjgl.a.g;

public class cs
extends cc {
    private final cc b;
    private dn c;
    private dn d;
    private String e;
    private String f = "survival";
    private String g;
    private boolean h = true;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean v;
    private ch w;
    private ch x;
    private ch C;
    private ch D;
    private ch E;
    private ch F;
    private ch G;
    private String H;
    private String I;
    private String J;
    private String K;
    private int L;
    public String a = "";
    private static final String[] M = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};

    public cs(cc cc2) {
        this.b = cc2;
        this.J = "";
        this.K = net.minecraft.client.f.u.a("selectWorld.newWorld", new Object[0]);
    }

    @Override
    public void bY_() {
        this.c.a();
        this.d.a();
    }

    @Override
    public void ct_() {
        org.lwjgl.a.g.a(true);
        this.r.clear();
        this.r.add(new ch(0, this.p / 2 - 155, this.q - 28, 150, 20, net.minecraft.client.f.u.a("selectWorld.create", new Object[0])));
        this.r.add(new ch(1, this.p / 2 + 5, this.q - 28, 150, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.w = this.b(new ch(2, this.p / 2 - 75, 115, 150, 20, net.minecraft.client.f.u.a("selectWorld.gameMode", new Object[0])));
        this.x = this.b(new ch(3, this.p / 2 - 75, 187, 150, 20, net.minecraft.client.f.u.a("selectWorld.moreWorldOptions", new Object[0])));
        this.C = this.b(new ch(4, this.p / 2 - 155, 100, 150, 20, net.minecraft.client.f.u.a("selectWorld.mapFeatures", new Object[0])));
        this.C.l = false;
        this.D = this.b(new ch(7, this.p / 2 + 5, 151, 150, 20, net.minecraft.client.f.u.a("selectWorld.bonusItems", new Object[0])));
        this.D.l = false;
        this.E = this.b(new ch(5, this.p / 2 + 5, 100, 150, 20, net.minecraft.client.f.u.a("selectWorld.mapType", new Object[0])));
        this.E.l = false;
        this.F = this.b(new ch(6, this.p / 2 - 155, 151, 150, 20, net.minecraft.client.f.u.a("selectWorld.allowCommands", new Object[0])));
        this.F.l = false;
        this.G = this.b(new ch(8, this.p / 2 + 5, 120, 150, 20, net.minecraft.client.f.u.a("selectWorld.customizeType", new Object[0])));
        this.G.l = false;
        this.c = new dn(9, this.u, this.p / 2 - 100, 60, 200, 20);
        this.c.b(true);
        this.c.a(this.K);
        this.d = new dn(10, this.u, this.p / 2 - 100, 60, 200, 20);
        this.d.a(this.J);
        this.a(this.v);
        this.f();
        this.g();
    }

    private void f() {
        this.e = this.c.b().trim();
        char[] arrc = net.minecraft.u.d.c;
        int n2 = net.minecraft.u.d.c.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = arrc[i2];
            this.e = this.e.replace(c2, '_');
        }
        if (org.apache.commons.c.am.a((CharSequence)this.e)) {
            this.e = "World";
        }
        this.e = cs.a(this.n.g(), this.e);
    }

    private void g() {
        this.w.i = String.valueOf(net.minecraft.client.f.u.a("selectWorld.gameMode", new Object[0])) + ": " + net.minecraft.client.f.u.a("selectWorld.gameMode." + this.f, new Object[0]);
        this.H = net.minecraft.client.f.u.a("selectWorld.gameMode." + this.f + ".line1", new Object[0]);
        this.I = net.minecraft.client.f.u.a("selectWorld.gameMode." + this.f + ".line2", new Object[0]);
        this.C.i = String.valueOf(net.minecraft.client.f.u.a("selectWorld.mapFeatures", new Object[0])) + " ";
        this.C.i = this.h ? String.valueOf(this.C.i) + net.minecraft.client.f.u.a("options.on", new Object[0]) : String.valueOf(this.C.i) + net.minecraft.client.f.u.a("options.off", new Object[0]);
        this.D.i = String.valueOf(net.minecraft.client.f.u.a("selectWorld.bonusItems", new Object[0])) + " ";
        this.D.i = this.k && !this.l ? String.valueOf(this.D.i) + net.minecraft.client.f.u.a("options.on", new Object[0]) : String.valueOf(this.D.i) + net.minecraft.client.f.u.a("options.off", new Object[0]);
        this.E.i = String.valueOf(net.minecraft.client.f.u.a("selectWorld.mapType", new Object[0])) + " " + net.minecraft.client.f.u.a(ab.a[this.L].b(), new Object[0]);
        this.F.i = String.valueOf(net.minecraft.client.f.u.a("selectWorld.allowCommands", new Object[0])) + " ";
        this.F.i = this.i && !this.l ? String.valueOf(this.F.i) + net.minecraft.client.f.u.a("options.on", new Object[0]) : String.valueOf(this.F.i) + net.minecraft.client.f.u.a("options.off", new Object[0]);
    }

    public static String a(w w2, String string) {
        string = string.replaceAll("[\\./\"]", "_");
        String[] arrstring = M;
        int n2 = M.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = arrstring[i2];
            if (!string.equalsIgnoreCase(string2)) continue;
            string = "_" + string + "_";
        }
        while (w2.a(string) != null) {
            string = String.valueOf(string) + "-";
        }
        return string;
    }

    @Override
    public void cs_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 1) {
                this.n.a(this.b);
            } else if (ch2.j == 0) {
                this.n.a((cc)null);
                if (this.m) {
                    return;
                }
                this.m = true;
                long l2 = new Random().nextLong();
                String string = this.d.b();
                if (!org.apache.commons.c.am.a((CharSequence)string)) {
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
                aj aj2 = new aj(l2, am.a(this.f), this.h, this.l, ab.a[this.L]);
                aj2.a(this.a);
                if (this.k && !this.l) {
                    aj2.a();
                }
                if (this.i && !this.l) {
                    aj2.b();
                }
                this.n.a(this.e, this.c.b().trim(), aj2);
            } else if (ch2.j == 3) {
                this.i();
            } else if (ch2.j == 2) {
                if ("survival".equals(this.f)) {
                    if (!this.j) {
                        this.i = false;
                    }
                    this.l = false;
                    this.f = "hardcore";
                    this.l = true;
                    this.F.k = false;
                    this.D.k = false;
                    this.g();
                } else if ("hardcore".equals(this.f)) {
                    if (!this.j) {
                        this.i = true;
                    }
                    this.l = false;
                    this.f = "creative";
                    this.g();
                    this.l = false;
                    this.F.k = true;
                    this.D.k = true;
                } else {
                    if (!this.j) {
                        this.i = false;
                    }
                    this.f = "survival";
                    this.g();
                    this.F.k = true;
                    this.D.k = true;
                    this.l = false;
                }
                this.g();
            } else if (ch2.j == 4) {
                this.h = !this.h;
                this.g();
            } else if (ch2.j == 7) {
                this.k = !this.k;
                this.g();
            } else if (ch2.j == 5) {
                ++this.L;
                if (this.L >= ab.a.length) {
                    this.L = 0;
                }
                while (!this.h()) {
                    ++this.L;
                    if (this.L < ab.a.length) continue;
                    this.L = 0;
                }
                this.a = "";
                this.g();
                this.a(this.v);
            } else if (ch2.j == 6) {
                this.j = true;
                this.i = !this.i;
                this.g();
            } else if (ch2.j == 8) {
                if (ab.a[this.L] == ab.c) {
                    this.n.a(new bm(this, this.a));
                } else {
                    this.n.a(new cq(this, this.a));
                }
            }
        }
    }

    private boolean h() {
        ab ab2 = ab.a[this.L];
        return ab2 != null && ab2.e() ? (ab2 == ab.g ? cs.o() : true) : false;
    }

    private void i() {
        this.a(!this.v);
    }

    private void a(boolean bl2) {
        this.v = bl2;
        if (ab.a[this.L] == ab.g) {
            this.w.l = !this.v;
            this.w.k = false;
            if (this.g == null) {
                this.g = this.f;
            }
            this.f = "spectator";
            this.C.l = false;
            this.D.l = false;
            this.E.l = this.v;
            this.F.l = false;
            this.G.l = false;
        } else {
            this.w.l = !this.v;
            this.w.k = true;
            if (this.g != null) {
                this.f = this.g;
                this.g = null;
            }
            this.C.l = this.v && ab.a[this.L] != ab.f;
            this.D.l = this.v;
            this.E.l = this.v;
            this.F.l = this.v;
            this.G.l = this.v && (ab.a[this.L] == ab.c || ab.a[this.L] == ab.f);
        }
        this.g();
        this.x.i = this.v ? net.minecraft.client.f.u.a("gui.done", new Object[0]) : net.minecraft.client.f.u.a("selectWorld.moreWorldOptions", new Object[0]);
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.c.k() && !this.v) {
            this.c.a(c2, n2);
            this.K = this.c.b();
        } else if (this.d.k() && this.v) {
            this.d.a(c2, n2);
            this.J = this.d.b();
        }
        if (n2 == 28 || n2 == 156) {
            this.a((ch)this.r.get(0));
        }
        ((ch)this.r.get((int)0)).k = !this.c.b().isEmpty();
        this.f();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        if (this.v) {
            this.d.a(n2, n3, n4);
        } else {
            this.c.a(n2, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, net.minecraft.client.f.u.a("selectWorld.create", new Object[0]), this.p / 2, 20, -1);
        if (this.v) {
            this.b(this.u, net.minecraft.client.f.u.a("selectWorld.enterSeed", new Object[0]), this.p / 2 - 100, 47, -6250336);
            this.b(this.u, net.minecraft.client.f.u.a("selectWorld.seedInfo", new Object[0]), this.p / 2 - 100, 85, -6250336);
            if (this.C.l) {
                this.b(this.u, net.minecraft.client.f.u.a("selectWorld.mapFeatures.info", new Object[0]), this.p / 2 - 150, 122, -6250336);
            }
            if (this.F.l) {
                this.b(this.u, net.minecraft.client.f.u.a("selectWorld.allowCommands.info", new Object[0]), this.p / 2 - 150, 172, -6250336);
            }
            this.d.g();
            if (ab.a[this.L].h()) {
                this.u.a(net.minecraft.client.f.u.a(ab.a[this.L].c(), new Object[0]), this.E.g + 2, this.E.h + 22, this.E.c(), 0xA0A0A0);
            }
        } else {
            this.b(this.u, net.minecraft.client.f.u.a("selectWorld.enterName", new Object[0]), this.p / 2 - 100, 47, -6250336);
            this.b(this.u, String.valueOf(net.minecraft.client.f.u.a("selectWorld.resultFolder", new Object[0])) + " " + this.e, this.p / 2 - 100, 85, -6250336);
            this.c.g();
            this.b(this.u, this.H, this.p / 2 - 100, 137, -6250336);
            this.b(this.u, this.I, this.p / 2 - 100, 149, -6250336);
        }
        super.a(n2, n3, f2);
    }

    public void a(d d2) {
        this.K = net.minecraft.client.f.u.a("selectWorld.newWorld.copyOf", d2.i());
        this.J = String.valueOf(d2.a());
        this.L = d2.t().g();
        this.a = d2.u();
        this.h = d2.r();
        this.i = d2.v();
        if (d2.s()) {
            this.f = "hardcore";
        } else if (d2.q().e()) {
            this.f = "survival";
        } else if (d2.q().d()) {
            this.f = "creative";
        }
    }
}

