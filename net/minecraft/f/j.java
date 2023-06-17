/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import java.util.Arrays;
import net.minecraft.a.w;
import net.minecraft.e.q;
import net.minecraft.f.ar;
import net.minecraft.g.c.b;
import net.minecraft.g.gl;
import net.minecraft.h.aq;
import net.minecraft.h.as;
import net.minecraft.h.c;
import net.minecraft.h.v;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.a.b.e;
import net.minecraft.u.ad;
import net.minecraft.u.aw;
import net.minecraft.w.a.a;

public class j
extends ar
implements c,
aw {
    private static final int[] a = new int[]{3};
    private static final int[] b;
    private static final int[] c;
    private cu[] d = new cu[5];
    private int e;
    private boolean[] f;
    private cg g;
    private String h;
    private int i;

    static {
        int[] arrn = new int[4];
        arrn[1] = 1;
        arrn[2] = 2;
        arrn[3] = 3;
        b = arrn;
        int[] arrn2 = new int[4];
        arrn2[1] = 1;
        arrn2[2] = 2;
        arrn2[3] = 4;
        c = arrn2;
    }

    @Override
    public String X() {
        return this.bO_() ? this.h : "container.brewing";
    }

    @Override
    public boolean bO_() {
        return this.h != null && !this.h.isEmpty();
    }

    public void a(String string) {
        this.h = string;
    }

    @Override
    public int e() {
        return this.d.length;
    }

    @Override
    public void a() {
        boolean[] arrbl;
        boolean bl2;
        if (this.i <= 0 && this.d[4] != null && this.d[4].a() == w.bN) {
            this.i = 20;
            --this.d[4].b;
            if (this.d[4].b <= 0) {
                this.d[4] = null;
            }
            this.C();
        }
        boolean bl3 = this.k();
        boolean bl4 = bl2 = this.e > 0;
        if (bl2) {
            boolean bl5;
            --this.e;
            boolean bl6 = bl5 = this.e == 0;
            if (bl5 && bl3) {
                this.n();
                this.C();
            } else if (!bl3) {
                this.e = 0;
                this.C();
            } else if (this.g != this.d[3].a()) {
                this.e = 0;
                this.C();
            }
        } else if (bl3 && this.i > 0) {
            --this.i;
            this.e = 400;
            this.g = this.d[3].a();
            this.C();
        }
        if (!this.k.C && !Arrays.equals(arrbl = this.f(), this.f)) {
            this.f = arrbl;
            b b2 = this.k.n(this.D());
            if (!(b2.c() instanceof gl)) {
                return;
            }
            for (int i2 = 0; i2 < gl.a.length; ++i2) {
                b2 = b2.a(gl.a[i2], Boolean.valueOf(arrbl[i2]));
            }
            this.k.a(this.l, b2, 2);
        }
    }

    public boolean[] f() {
        boolean[] arrbl = new boolean[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.d[i2] == null) continue;
            arrbl[i2] = true;
        }
        return arrbl;
    }

    private boolean k() {
        if (this.d[3] != null && this.d[3].b > 0) {
            cu cu2 = this.d[3];
            if (!net.minecraft.d.a.a(cu2)) {
                return false;
            }
            for (int i2 = 0; i2 < 3; ++i2) {
                cu cu3 = this.d[i2];
                if (cu3 == null || !net.minecraft.d.a.a(cu3, cu2)) continue;
                return true;
            }
            return false;
        }
        return false;
    }

    private void n() {
        cu cu2 = this.d[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            this.d[i2] = net.minecraft.d.a.d(cu2, this.d[i2]);
        }
        --cu2.b;
        net.minecraft.u.b.b b2 = this.D();
        if (cu2.a().q()) {
            cu cu3 = new cu(cu2.a().p());
            if (cu2.b <= 0) {
                cu2 = cu3;
            } else {
                net.minecraft.h.a.a(this.k, (double)b2.cy_(), (double)b2.k(), (double)b2.l(), cu3);
            }
        }
        if (cu2.b <= 0) {
            cu2 = null;
        }
        this.d[3] = cu2;
        this.k.b(1035, b2, 0);
    }

    public static void a(net.minecraft.u.a.a a2) {
        a2.a(net.minecraft.u.a.c.d, (net.minecraft.u.a.e)new e("Cauldron", new String[]{"Items"}));
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        q q2 = e2.c("Items", 10);
        this.d = new cu[this.e()];
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            net.minecraft.e.e e3 = q2.b(i2);
            byte by2 = e3.f("Slot");
            if (by2 < 0 || by2 >= this.d.length) continue;
            this.d[by2] = cu.a(e3);
        }
        this.e = e2.g("BrewTime");
        if (e2.b("CustomName", 8)) {
            this.h = e2.l("CustomName");
        }
        this.i = e2.f("Fuel");
    }

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("BrewTime", (short)this.e);
        q q2 = new q();
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            if (this.d[i2] == null) continue;
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            e3.a("Slot", (byte)i2);
            this.d[i2].b(e3);
            q2.a(e3);
        }
        e2.a("Items", q2);
        if (this.bO_()) {
            e2.a("CustomName", this.h);
        }
        e2.a("Fuel", (byte)this.i);
        return e2;
    }

    @Override
    public cu a(int n2) {
        return n2 >= 0 && n2 < this.d.length ? this.d[n2] : null;
    }

    @Override
    public cu a(int n2, int n3) {
        return v.a(this.d, n2, n3);
    }

    @Override
    public cu b(int n2) {
        return v.a(this.d, n2);
    }

    @Override
    public void a(int n2, cu cu2) {
        if (n2 >= 0 && n2 < this.d.length) {
            this.d[n2] = cu2;
        }
    }

    @Override
    public int g() {
        return 64;
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
        if (n2 == 3) {
            return net.minecraft.d.a.a(cu2);
        }
        cg cg2 = cu2.a();
        return n2 == 4 ? cg2 == w.bN : cg2 == w.bG || cg2 == w.bH || cg2 == w.bI || cg2 == w.bJ;
    }

    @Override
    public int[] a(ad ad2) {
        return ad2 == ad.b ? a : (ad2 == ad.a ? b : c);
    }

    @Override
    public boolean a(int n2, cu cu2, ad ad2) {
        return this.b(n2, cu2);
    }

    @Override
    public boolean b(int n2, cu cu2, ad ad2) {
        return n2 == 3 ? cu2.a() == w.bJ : true;
    }

    @Override
    public String h() {
        return "minecraft:brewing_stand";
    }

    @Override
    public aq a(a a2, net.minecraft.w.a.b b2) {
        return new as(a2, this);
    }

    @Override
    public int c(int n2) {
        switch (n2) {
            case 0: {
                return this.e;
            }
            case 1: {
                return this.i;
            }
        }
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
        switch (n2) {
            case 0: {
                this.e = n3;
                break;
            }
            case 1: {
                this.i = n3;
            }
        }
    }

    @Override
    public int i() {
        return 2;
    }

    @Override
    public void j() {
        Arrays.fill(this.d, null);
    }
}

