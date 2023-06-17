/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.d.c;
import net.minecraft.e.e;
import net.minecraft.f.ar;
import net.minecraft.f.t;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.hf;
import net.minecraft.g.hw;
import net.minecraft.h.ao;
import net.minecraft.m.cd;
import net.minecraft.m.cu;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.u.aw;
import net.minecraft.u.b.g;
import net.minecraft.w.a.a;
import net.minecraft.w.h.ad;

public class aq
extends ar
implements net.minecraft.h.c,
aw {
    public static final c[][] a = new c[][]{{net.minecraft.a.c.a, net.minecraft.a.c.c}, {net.minecraft.a.c.k, net.minecraft.a.c.h}, {net.minecraft.a.c.e}, {net.minecraft.a.c.j}};
    private static final Set b = aad.a();
    private final List c = ov.a();
    private long d;
    private float e;
    private boolean f;
    private int g = -1;
    private c h;
    private c i;
    private cu j;
    private String o;

    static {
        c[][] arrc = a;
        int n2 = a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            c[] arrc2 = arrc[i2];
            Collections.addAll(b, arrc2);
        }
    }

    @Override
    public void a() {
        if (this.k.B() % 80L == 0L) {
            this.k();
        }
    }

    public void k() {
        if (this.k != null) {
            this.s();
            this.p();
        }
    }

    private void p() {
        if (this.f && this.g > 0 && !this.k.C && this.h != null) {
            double d2 = this.g * 10 + 10;
            int n2 = 0;
            if (this.g >= 4 && this.h == this.i) {
                n2 = 1;
            }
            int n3 = (9 + this.g * 2) * 20;
            int n4 = this.l.cy_();
            int n5 = this.l.k();
            int n6 = this.l.l();
            net.minecraft.u.b.a a2 = new net.minecraft.u.b.a(n4, n5, n6, n4 + 1, n5 + 1, n6 + 1).b(d2).a(0.0, this.k.L(), 0.0);
            List list = this.k.a(net.minecraft.w.a.b.class, a2);
            for (net.minecraft.w.a.b b2 : list) {
                b2.c(new net.minecraft.d.j(this.h, n3, n2, true, true));
            }
            if (this.g >= 4 && this.h != this.i && this.i != null) {
                for (net.minecraft.w.a.b b2 : list) {
                    b2.c(new net.minecraft.d.j(this.i, n3, 0, true, true));
                }
            }
        }
    }

    private void s() {
        int n2;
        int n3 = this.g;
        int n4 = this.l.cy_();
        int n5 = this.l.k();
        int n6 = this.l.l();
        this.g = 0;
        this.c.clear();
        this.f = true;
        t t2 = new t(ad.a(cd.a));
        this.c.add(t2);
        boolean bl2 = true;
        g g2 = new g();
        for (n2 = n5 + 1; n2 < 256; ++n2) {
            float[] arrf;
            b b2 = this.k.n(g2.b(n4, n2, n6));
            if (b2.c() == p.cG) {
                arrf = ad.a((cd)((Object)b2.a(hw.a)));
            } else {
                if (b2.c() != p.cH) {
                    if (b2.f() >= 15 && b2.c() != p.h) {
                        this.f = false;
                        this.c.clear();
                        break;
                    }
                    t2.a();
                    continue;
                }
                arrf = ad.a((cd)((Object)b2.a(hf.f)));
            }
            if (!bl2) {
                arrf = new float[]{(t2.b()[0] + arrf[0]) / 2.0f, (t2.b()[1] + arrf[1]) / 2.0f, (t2.b()[2] + arrf[2]) / 2.0f};
            }
            if (Arrays.equals(arrf, t2.b())) {
                t2.a();
            } else {
                t2 = new t(arrf);
                this.c.add(t2);
            }
            bl2 = false;
        }
        if (this.f) {
            n2 = 1;
            while (n2 <= 4) {
                int n7 = n5 - n2;
                if (n7 < 0) break;
                boolean bl3 = true;
                block2: for (int i2 = n4 - n2; i2 <= n4 + n2 && bl3; ++i2) {
                    for (int i3 = n6 - n2; i3 <= n6 + n2; ++i3) {
                        cn cn2 = this.k.n(new net.minecraft.u.b.b(i2, n7, i3)).c();
                        if (cn2 == p.bT || cn2 == p.R || cn2 == p.ah || cn2 == p.S) continue;
                        bl3 = false;
                        continue block2;
                    }
                }
                if (!bl3) break;
                this.g = n2++;
            }
            if (this.g == 0) {
                this.f = false;
            }
        }
        if (!this.k.C && this.g == 4 && n3 < this.g) {
            for (net.minecraft.w.a.b b3 : this.k.a(net.minecraft.w.a.b.class, new net.minecraft.u.b.a(n4, n5, n6, n4, n5 - 4, n6).b(10.0, 5.0, 10.0))) {
                b3.a((k)net.minecraft.r.j.K);
            }
        }
    }

    public List n() {
        return this.c;
    }

    public float o() {
        if (!this.f) {
            return 0.0f;
        }
        int n2 = (int)(this.k.B() - this.d);
        this.d = this.k.B();
        if (n2 > 1) {
            this.e -= (float)n2 / 40.0f;
            if (this.e < 0.0f) {
                this.e = 0.0f;
            }
        }
        this.e += 0.025f;
        if (this.e > 1.0f) {
            this.e = 1.0f;
        }
        return this.e;
    }

    @Override
    public net.minecraft.x.d.b.j bJ_() {
        return new net.minecraft.x.d.b.j(this.l, 3, this.d());
    }

    @Override
    public e d() {
        return this.a(new e());
    }

    @Override
    public double bM_() {
        return 65536.0;
    }

    private static c d(int n2) {
        c c2 = net.minecraft.d.c.a(n2);
        return b.contains(c2) ? c2 : null;
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.h = aq.d(e2.h("Primary"));
        this.i = aq.d(e2.h("Secondary"));
        this.g = e2.h("Levels");
    }

    @Override
    public e a(e e2) {
        super.a(e2);
        e2.a("Primary", net.minecraft.d.c.a(this.h));
        e2.a("Secondary", net.minecraft.d.c.a(this.i));
        e2.a("Levels", this.g);
        return e2;
    }

    @Override
    public int e() {
        return 1;
    }

    @Override
    public cu a(int n2) {
        return n2 == 0 ? this.j : null;
    }

    @Override
    public cu a(int n2, int n3) {
        if (n2 == 0 && this.j != null) {
            if (n3 >= this.j.b) {
                cu cu2 = this.j;
                this.j = null;
                return cu2;
            }
            this.j.b -= n3;
            return new cu(this.j.a(), n3, this.j.h());
        }
        return null;
    }

    @Override
    public cu b(int n2) {
        if (n2 == 0) {
            cu cu2 = this.j;
            this.j = null;
            return cu2;
        }
        return null;
    }

    @Override
    public void a(int n2, cu cu2) {
        if (n2 == 0) {
            this.j = cu2;
        }
    }

    @Override
    public String X() {
        return this.bO_() ? this.o : "container.beacon";
    }

    @Override
    public boolean bO_() {
        return this.o != null && !this.o.isEmpty();
    }

    public void a(String string) {
        this.o = string;
    }

    @Override
    public int g() {
        return 1;
    }

    @Override
    public boolean a_(net.minecraft.w.a.b b2) {
        return this.k.q(this.l) != this ? false : b2.h((double)this.l.cy_() + 0.5, (double)this.l.k() + 0.5, (double)this.l.l() + 0.5) <= 64.0;
    }

    @Override
    public void b(net.minecraft.w.a.b b2) {
    }

    @Override
    public void c(net.minecraft.w.a.b b2) {
    }

    @Override
    public boolean b(int n2, cu cu2) {
        return cu2.a() == w.bY || cu2.a() == w.k || cu2.a() == w.m || cu2.a() == w.l;
    }

    @Override
    public String h() {
        return "minecraft:beacon";
    }

    @Override
    public net.minecraft.h.aq a(a a2, net.minecraft.w.a.b b2) {
        return new ao(a2, this);
    }

    @Override
    public int c(int n2) {
        switch (n2) {
            case 0: {
                return this.g;
            }
            case 1: {
                return net.minecraft.d.c.a(this.h);
            }
            case 2: {
                return net.minecraft.d.c.a(this.i);
            }
        }
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
        switch (n2) {
            case 0: {
                this.g = n3;
                break;
            }
            case 1: {
                this.h = aq.d(n3);
                break;
            }
            case 2: {
                this.i = aq.d(n3);
            }
        }
    }

    @Override
    public int i() {
        return 3;
    }

    @Override
    public void j() {
        this.j = null;
    }

    @Override
    public boolean c(int n2, int n3) {
        if (n2 == 1) {
            this.k();
            return true;
        }
        return super.c(n2, n3);
    }

    @Override
    public int[] a(net.minecraft.u.ad ad2) {
        return new int[0];
    }

    @Override
    public boolean a(int n2, cu cu2, net.minecraft.u.ad ad2) {
        return false;
    }

    @Override
    public boolean b(int n2, cu cu2, net.minecraft.u.ad ad2) {
        return false;
    }
}

