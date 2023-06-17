/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.v;

import java.util.List;
import net.minecraft.a.w;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.o.ae;
import net.minecraft.v.a;
import net.minecraft.v.c;
import net.minecraft.v.e;
import net.minecraft.v.f;
import net.minecraft.v.g;
import net.minecraft.v.h;
import net.minecraft.v.i;
import net.minecraft.v.j;
import net.minecraft.v.k;
import net.minecraft.v.l;
import net.minecraft.v.m;
import net.minecraft.v.n;

public abstract class d {
    public static final d[] a = new d[12];
    public static final d b = new i(0, "buildingBlocks");
    public static final d c = new m(1, "decorations");
    public static final d d = new a(2, "redstone");
    public static final d e = new e(3, "transportation");
    public static final d f = new h(4, "misc").a(new ae[]{ae.a});
    public static final d g = new g(5, "search").a("item_search.png");
    public static final d h = new c(6, "food");
    public static final d i = new n(7, "tools").a(ae.h, ae.i, ae.j);
    public static final d j = new f(8, "combat").a(ae.b, ae.c, ae.f, ae.d, ae.e, ae.k, ae.g);
    public static final d k = new l(9, "brewing");
    public static final d l = new k(10, "materials");
    public static final d m = new j(11, "inventory").a("inventory.png").k().i();
    private final int n;
    private final String o;
    private String p = "items.png";
    private boolean q = true;
    private boolean r = true;
    private ae[] s;
    private cu t;

    public d(int n2, String string) {
        this.n = n2;
        this.o = string;
        net.minecraft.v.d.a[n2] = this;
    }

    public int b() {
        return this.n;
    }

    public String c() {
        return this.o;
    }

    public String d() {
        return "itemGroup." + this.c();
    }

    public cu e() {
        if (this.t == null) {
            this.t = new cu(this.a(), 1, this.f());
        }
        return this.t;
    }

    public abstract cg a();

    public int f() {
        return 0;
    }

    public String g() {
        return this.p;
    }

    public d a(String string) {
        this.p = string;
        return this;
    }

    public boolean h() {
        return this.r;
    }

    public d i() {
        this.r = false;
        return this;
    }

    public boolean j() {
        return this.q;
    }

    public d k() {
        this.q = false;
        return this;
    }

    public int l() {
        return this.n % 6;
    }

    public boolean m() {
        return this.n < 6;
    }

    public ae[] n() {
        return this.s;
    }

    public d a(ae ... arrae) {
        this.s = arrae;
        return this;
    }

    public boolean a(ae ae2) {
        if (this.s == null) {
            return false;
        }
        ae[] arrae = this.s;
        int n2 = this.s.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ae ae3 = arrae[i2];
            if (ae3 != ae2) continue;
            return true;
        }
        return false;
    }

    public void a(List list) {
        for (cg cg2 : cg.e) {
            if (cg2 == null || cg2.a() != this) continue;
            cg2.a(cg2, this, list);
        }
        if (this.n() != null) {
            this.a(list, this.n());
        }
    }

    public void a(List list, ae ... arrae) {
        for (net.minecraft.o.j j2 : net.minecraft.o.j.b) {
            if (j2 == null || j2.c == null) continue;
            boolean bl2 = false;
            for (int i2 = 0; i2 < arrae.length && !bl2; ++i2) {
                if (j2.c != arrae[i2]) continue;
                bl2 = true;
            }
            if (!bl2) continue;
            list.add(w.cn.a(new net.minecraft.o.k(j2, j2.a())));
        }
    }
}

