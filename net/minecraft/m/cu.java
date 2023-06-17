/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.io;
import com.a.a.d.ov;
import com.a.a.d.vi;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.aa;
import net.minecraft.a.w;
import net.minecraft.e.q;
import net.minecraft.g.cn;
import net.minecraft.h.k;
import net.minecraft.m.av;
import net.minecraft.m.cg;
import net.minecraft.m.dd;
import net.minecraft.o.f;
import net.minecraft.o.j;
import net.minecraft.u.a.a;
import net.minecraft.u.a.c;
import net.minecraft.u.a.e;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.u.d.a.d;
import net.minecraft.u.d.o;
import net.minecraft.w.a.b;
import net.minecraft.w.ae;
import net.minecraft.w.b.a.h;
import net.minecraft.w.l;
import net.minecraft.w.n;

public final class cu {
    public static final DecimalFormat a = new DecimalFormat("#.##");
    public int b;
    public int c;
    private cg d;
    private net.minecraft.e.e e;
    private int f;
    private net.minecraft.w.f.l g;
    private cn h;
    private boolean i;
    private cn j;
    private boolean k;

    public cu(cn cn2) {
        this(cn2, 1);
    }

    public cu(cn cn2, int n2) {
        this(cn2, n2, 0);
    }

    public cu(cn cn2, int n2, int n3) {
        this(cg.a(cn2), n2, n3);
    }

    public cu(cg cg2) {
        this(cg2, 1);
    }

    public cu(cg cg2, int n2) {
        this(cg2, n2, 0);
    }

    public cu(cg cg2, int n2, int n3) {
        this.d = cg2;
        this.b = n2;
        this.f = n3;
        if (this.f < 0) {
            this.f = 0;
        }
    }

    public static cu a(net.minecraft.e.e e2) {
        cu cu2 = new cu();
        cu2.c(e2);
        return cu2.a() != null ? cu2 : null;
    }

    private cu() {
    }

    public static void a(a a2) {
        a2.a(net.minecraft.u.a.c.f, (e)new net.minecraft.u.a.b.a());
        a2.a(net.minecraft.u.a.c.f, (e)new net.minecraft.u.a.b.b());
    }

    public cu a(int n2) {
        n2 = Math.min(n2, this.b);
        cu cu2 = new cu(this.d, n2, this.f);
        if (this.e != null) {
            cu2.e = this.e.g();
        }
        this.b -= n2;
        return cu2;
    }

    public cg a() {
        return this.d;
    }

    public ab a(b b2, net.minecraft.q.k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        ab ab2 = this.a().a(this, b2, k2, b3, ah2, ad2, f2, f3, f4);
        if (ab2 == ab.a) {
            b2.a(net.minecraft.r.o.b(this.d));
        }
        return ab2;
    }

    public float a(net.minecraft.g.c.b b2) {
        return this.a().a(this, b2);
    }

    public net.minecraft.u.a a(net.minecraft.q.k k2, b b2, ah ah2) {
        return this.a().a(this, k2, b2, ah2);
    }

    public cu a(net.minecraft.q.k k2, l l2) {
        return this.a().a(this, k2, l2);
    }

    public net.minecraft.e.e b(net.minecraft.e.e e2) {
        bp bp2 = (bp)cg.e.b(this.d);
        e2.a("id", bp2 == null ? "minecraft:air" : bp2.toString());
        e2.a("Count", (byte)this.b);
        e2.a("Damage", (short)this.f);
        if (this.e != null) {
            e2.a("tag", this.e);
        }
        return e2;
    }

    public void c(net.minecraft.e.e e2) {
        this.d = cg.c(e2.l("id"));
        this.b = e2.f("Count");
        this.f = e2.g("Damage");
        if (this.f < 0) {
            this.f = 0;
        }
        if (e2.b("tag", 10)) {
            this.e = e2.o("tag");
            if (this.d != null) {
                this.d.a(this.e);
            }
        }
    }

    public int b() {
        return this.a().i();
    }

    public boolean c() {
        return this.b() > 1 && (!this.d() || !this.f());
    }

    public boolean d() {
        return this.d == null ? false : (this.d.k() <= 0 ? false : !this.n() || !this.o().p("Unbreakable"));
    }

    public boolean e() {
        return this.d.j();
    }

    public boolean f() {
        return this.d() && this.f > 0;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.f;
    }

    public void b(int n2) {
        this.f = n2;
        if (this.f < 0) {
            this.f = 0;
        }
    }

    public int i() {
        return this.d == null ? 0 : this.d.k();
    }

    public boolean a(int n2, Random random) {
        if (!this.d()) {
            return false;
        }
        if (n2 > 0) {
            int n3 = net.minecraft.o.f.a(aa.s, this);
            int n4 = 0;
            for (int i2 = 0; n3 > 0 && i2 < n2; ++i2) {
                if (!net.minecraft.o.n.a(this, n3, random)) continue;
                ++n4;
            }
            if ((n2 -= n4) <= 0) {
                return false;
            }
        }
        this.f += n2;
        return this.f > this.i();
    }

    public void a(int n2, l l2) {
        if ((!(l2 instanceof b) || !((b)l2).J.d) && this.d() && this.a(n2, l2.bd())) {
            l2.e(this);
            --this.b;
            if (l2 instanceof b) {
                b b2 = (b)l2;
                b2.a(net.minecraft.r.o.c(this.d));
            }
            if (this.b < 0) {
                this.b = 0;
            }
            this.f = 0;
        }
    }

    public void a(l l2, b b2) {
        boolean bl2 = this.d.a(this, l2, (l)b2);
        if (bl2) {
            b2.a(net.minecraft.r.o.b(this.d));
        }
    }

    public void a(net.minecraft.q.k k2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3, b b4) {
        boolean bl2 = this.d.a(this, k2, b2, b3, b4);
        if (bl2) {
            b4.a(net.minecraft.r.o.b(this.d));
        }
    }

    public boolean b(net.minecraft.g.c.b b2) {
        return this.d.a(b2);
    }

    public boolean a(b b2, l l2, ah ah2) {
        return this.d.a(this, b2, l2, ah2);
    }

    public cu j() {
        cu cu2 = new cu(this.d, this.b, this.f);
        if (this.e != null) {
            cu2.e = this.e.g();
        }
        return cu2;
    }

    public static boolean a(cu cu2, cu cu3) {
        return cu2 == null && cu3 == null ? true : (cu2 != null && cu3 != null ? (cu2.e == null && cu3.e != null ? false : cu2.e == null || cu2.e.equals(cu3.e)) : false);
    }

    public static boolean b(cu cu2, cu cu3) {
        return cu2 == null && cu3 == null ? true : (cu2 != null && cu3 != null ? cu2.d(cu3) : false);
    }

    private boolean d(cu cu2) {
        return this.b != cu2.b ? false : (this.d != cu2.d ? false : (this.f != cu2.f ? false : (this.e == null && cu2.e != null ? false : this.e == null || this.e.equals(cu2.e))));
    }

    public static boolean c(cu cu2, cu cu3) {
        return cu2 == cu3 ? true : (cu2 != null && cu3 != null ? cu2.a(cu3) : false);
    }

    public static boolean d(cu cu2, cu cu3) {
        return cu2 == cu3 ? true : (cu2 != null && cu3 != null ? cu2.b(cu3) : false);
    }

    public boolean a(cu cu2) {
        return cu2 != null && this.d == cu2.d && this.f == cu2.f;
    }

    public boolean b(cu cu2) {
        return !this.d() ? this.a(cu2) : cu2 != null && this.d == cu2.d;
    }

    public String k() {
        return this.d.d(this);
    }

    public static cu c(cu cu2) {
        return cu2 == null ? null : cu2.j();
    }

    public String toString() {
        return String.valueOf(this.b) + "x" + this.d.cw_() + "@" + this.f;
    }

    public void a(net.minecraft.q.k k2, n n2, int n3, boolean bl2) {
        if (this.c > 0) {
            --this.c;
        }
        if (this.d != null) {
            this.d.a(this, k2, n2, n3, bl2);
        }
    }

    public void a(net.minecraft.q.k k2, b b2, int n2) {
        b2.a(net.minecraft.r.o.a(this.d), n2);
        this.d.b(this, k2, b2);
    }

    public int l() {
        return this.a().c(this);
    }

    public av m() {
        return this.a().b(this);
    }

    public void a(net.minecraft.q.k k2, l l2, int n2) {
        this.a().a(this, k2, l2, n2);
    }

    public boolean n() {
        return this.e != null;
    }

    public net.minecraft.e.e o() {
        return this.e;
    }

    public net.minecraft.e.e a(String string, boolean bl2) {
        if (this.e != null && this.e.b(string, 10)) {
            return this.e.o(string);
        }
        if (bl2) {
            net.minecraft.e.e e2 = new net.minecraft.e.e();
            this.a(string, e2);
            return e2;
        }
        return null;
    }

    public q p() {
        return this.e == null ? null : this.e.c("ench", 10);
    }

    public void d(net.minecraft.e.e e2) {
        this.e = e2;
    }

    public String q() {
        net.minecraft.e.e e2;
        String string = this.a().a(this);
        if (this.e != null && this.e.b("display", 10) && (e2 = this.e.o("display")).b("Name", 8)) {
            string = e2.l("Name");
        }
        return string;
    }

    public cu a(String string) {
        if (this.e == null) {
            this.e = new net.minecraft.e.e();
        }
        if (!this.e.b("display", 10)) {
            this.e.a("display", new net.minecraft.e.e());
        }
        this.e.o("display").a("Name", string);
        return this;
    }

    public void r() {
        if (this.e != null && this.e.b("display", 10)) {
            net.minecraft.e.e e2 = this.e.o("display");
            e2.q("Name");
            if (e2.c()) {
                this.e.q("display");
                if (this.e.c()) {
                    this.d((net.minecraft.e.e)null);
                }
            }
        }
    }

    public boolean s() {
        return this.e == null ? false : (!this.e.b("display", 10) ? false : this.e.o("display").b("Name", 8));
    }

    public List a(b b2, boolean bl2) {
        q q2;
        q q3;
        int n2;
        int n3;
        ArrayList arrayList = ov.a();
        String string = this.q();
        if (this.s()) {
            string = (Object)((Object)o.u) + string;
        }
        string = String.valueOf(string) + (Object)((Object)o.v);
        if (bl2) {
            String string2 = "";
            if (!string.isEmpty()) {
                string = String.valueOf(string) + " (";
                string2 = ")";
            }
            int n4 = cg.a(this.d);
            string = this.e() ? String.valueOf(string) + String.format("#%04d/%d%s", n4, this.f, string2) : String.valueOf(string) + String.format("#%04d%s", n4, string2);
        } else if (!this.s() && this.d == w.bk) {
            string = String.valueOf(string) + " #" + this.f;
        }
        arrayList.add(string);
        int n5 = 0;
        if (this.n() && this.e.b("HideFlags", 99)) {
            n5 = this.e.h("HideFlags");
        }
        if ((n5 & 0x20) == 0) {
            this.d.a(this, b2, arrayList, bl2);
        }
        if (this.n()) {
            q q4;
            if ((n5 & 1) == 0 && (q4 = this.p()) != null) {
                for (int i2 = 0; i2 < q4.e(); ++i2) {
                    n3 = q4.b(i2).g("id");
                    short s2 = q4.b(i2).g("lvl");
                    if (net.minecraft.o.j.c(n3) == null) continue;
                    arrayList.add(net.minecraft.o.j.c(n3).d(s2));
                }
            }
            if (this.e.b("display", 10)) {
                q q5;
                net.minecraft.e.e e2 = this.e.o("display");
                if (e2.b("color", 3)) {
                    if (bl2) {
                        arrayList.add("Color: #" + String.format("%06X", e2.h("color")));
                    } else {
                        arrayList.add((Object)((Object)o.u) + net.minecraft.u.d.b.a.a("item.dyed"));
                    }
                }
                if (e2.d("Lore") == 9 && !(q5 = e2.c("Lore", 8)).c()) {
                    for (n3 = 0; n3 < q5.e(); ++n3) {
                        arrayList.add((Object)((Object)o.f) + (Object)((Object)o.u) + q5.g(n3));
                    }
                }
            }
        }
        k[] arrk = net.minecraft.h.k.values();
        n3 = arrk.length;
        for (n2 = 0; n2 < n3; ++n2) {
            k k2 = arrk[n2];
            vi vi2 = this.a(k2);
            if (vi2.o() || (n5 & 2) != 0) continue;
            arrayList.add("");
            arrayList.add(net.minecraft.u.d.b.a.a("item.modifiers." + k2.d()));
            for (Map.Entry entry : vi2.l()) {
                h h2 = (h)entry.getValue();
                double d2 = h2.d();
                boolean bl3 = false;
                if (h2.a() == cg.f) {
                    d2 += b2.a(net.minecraft.w.d.e).b();
                    d2 += (double)net.minecraft.o.f.a(this, ae.a);
                    bl3 = true;
                } else if (h2.a() == cg.g) {
                    d2 += b2.a(net.minecraft.w.d.f).b();
                    bl3 = true;
                }
                double d3 = h2.c() != 1 && h2.c() != 2 ? d2 : d2 * 100.0;
                if (bl3) {
                    arrayList.add(" " + net.minecraft.u.d.b.a.a("attribute.modifier.equals." + h2.c(), a.format(d3), net.minecraft.u.d.b.a.a("attribute.name." + (String)entry.getKey())));
                    continue;
                }
                if (d2 > 0.0) {
                    arrayList.add((Object)((Object)o.j) + " " + net.minecraft.u.d.b.a.a("attribute.modifier.plus." + h2.c(), a.format(d3), net.minecraft.u.d.b.a.a("attribute.name." + (String)entry.getKey())));
                    continue;
                }
                if (!(d2 < 0.0)) continue;
                arrayList.add((Object)((Object)o.m) + " " + net.minecraft.u.d.b.a.a("attribute.modifier.take." + h2.c(), a.format(d3 *= -1.0), net.minecraft.u.d.b.a.a("attribute.name." + (String)entry.getKey())));
            }
        }
        if (this.n() && this.o().p("Unbreakable") && (n5 & 4) == 0) {
            arrayList.add((Object)((Object)o.j) + net.minecraft.u.d.b.a.a("item.unbreakable"));
        }
        if (this.n() && this.e.b("CanDestroy", 9) && (n5 & 8) == 0 && !(q3 = this.e.c("CanDestroy", 8)).c()) {
            arrayList.add("");
            arrayList.add((Object)((Object)o.h) + net.minecraft.u.d.b.a.a("item.canBreak"));
            for (n2 = 0; n2 < q3.e(); ++n2) {
                cn cn2 = cn.a(q3.g(n2));
                if (cn2 != null) {
                    arrayList.add((Object)((Object)o.i) + cn2.bV_());
                    continue;
                }
                arrayList.add((Object)((Object)o.i) + "missingno");
            }
        }
        if (this.n() && this.e.b("CanPlaceOn", 9) && (n5 & 0x10) == 0 && !(q2 = this.e.c("CanPlaceOn", 8)).c()) {
            arrayList.add("");
            arrayList.add((Object)((Object)o.h) + net.minecraft.u.d.b.a.a("item.canPlace"));
            for (n2 = 0; n2 < q2.e(); ++n2) {
                cn cn3 = cn.a(q2.g(n2));
                if (cn3 != null) {
                    arrayList.add((Object)((Object)o.i) + cn3.bV_());
                    continue;
                }
                arrayList.add((Object)((Object)o.i) + "missingno");
            }
        }
        if (bl2) {
            if (this.f()) {
                arrayList.add("Durability: " + (this.i() - this.g()) + " / " + this.i());
            }
            arrayList.add((Object)((Object)o.i) + ((bp)cg.e.b(this.d)).toString());
            if (this.n()) {
                arrayList.add((Object)((Object)o.i) + "NBT: " + this.o().e().size() + " tag(s)");
            }
        }
        return arrayList;
    }

    public boolean t() {
        return this.a().e(this);
    }

    public dd u() {
        return this.a().f(this);
    }

    public boolean v() {
        return !this.a().g(this) ? false : !this.w();
    }

    public void a(j j2, int n2) {
        if (this.e == null) {
            this.d(new net.minecraft.e.e());
        }
        if (!this.e.b("ench", 9)) {
            this.e.a("ench", new q());
        }
        q q2 = this.e.c("ench", 10);
        net.minecraft.e.e e2 = new net.minecraft.e.e();
        e2.a("id", (short)net.minecraft.o.j.b(j2));
        e2.a("lvl", (short)((byte)n2));
        q2.a(e2);
    }

    public boolean w() {
        return this.e != null && this.e.b("ench", 9);
    }

    public void a(String string, net.minecraft.e.a a2) {
        if (this.e == null) {
            this.d(new net.minecraft.e.e());
        }
        this.e.a(string, a2);
    }

    public boolean x() {
        return this.a().r();
    }

    public boolean y() {
        return this.g != null;
    }

    public void a(net.minecraft.w.f.l l2) {
        this.g = l2;
    }

    public net.minecraft.w.f.l z() {
        return this.g;
    }

    public int A() {
        return this.n() && this.e.b("RepairCost", 3) ? this.e.h("RepairCost") : 0;
    }

    public void c(int n2) {
        if (!this.n()) {
            this.e = new net.minecraft.e.e();
        }
        this.e.a("RepairCost", n2);
    }

    public vi a(k k2) {
        vi vi2;
        if (this.n() && this.e.b("AttributeModifiers", 9)) {
            vi2 = io.v();
            q q2 = this.e.c("AttributeModifiers", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                net.minecraft.e.e e2 = q2.b(i2);
                h h2 = net.minecraft.w.d.a(e2);
                if (h2 == null || e2.b("Slot", 8) && !e2.l("Slot").equals(k2.d()) || h2.a().getLeastSignificantBits() == 0L || h2.a().getMostSignificantBits() == 0L) continue;
                vi2.a(e2.l("AttributeName"), h2);
            }
        } else {
            vi2 = this.a().a(k2);
        }
        return vi2;
    }

    public void a(String string, h h2, k k2) {
        if (this.e == null) {
            this.e = new net.minecraft.e.e();
        }
        if (!this.e.b("AttributeModifiers", 9)) {
            this.e.a("AttributeModifiers", new q());
        }
        q q2 = this.e.c("AttributeModifiers", 10);
        net.minecraft.e.e e2 = net.minecraft.w.d.a(h2);
        e2.a("AttributeName", string);
        if (k2 != null) {
            e2.a("Slot", k2.d());
        }
        q2.a(e2);
    }

    public void a(cg cg2) {
        this.d = cg2;
    }

    public net.minecraft.u.d.a B() {
        net.minecraft.u.d.k k2 = new net.minecraft.u.d.k(this.q());
        if (this.s()) {
            k2.a().b(true);
        }
        net.minecraft.u.d.a a2 = new net.minecraft.u.d.k("[").a(k2).a("]");
        if (this.d != null) {
            net.minecraft.e.e e2 = this.b(new net.minecraft.e.e());
            a2.a().a(new net.minecraft.u.d.a.c(net.minecraft.u.d.a.d.c, new net.minecraft.u.d.k(e2.toString())));
            a2.a().a(this.u().e);
        }
        return a2;
    }

    public boolean a(cn cn2) {
        if (cn2 == this.h) {
            return this.i;
        }
        this.h = cn2;
        if (this.n() && this.e.b("CanDestroy", 9)) {
            q q2 = this.e.c("CanDestroy", 8);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                cn cn3 = cn.a(q2.g(i2));
                if (cn3 != cn2) continue;
                this.i = true;
                return true;
            }
        }
        this.i = false;
        return false;
    }

    public boolean b(cn cn2) {
        if (cn2 == this.j) {
            return this.k;
        }
        this.j = cn2;
        if (this.n() && this.e.b("CanPlaceOn", 9)) {
            q q2 = this.e.c("CanPlaceOn", 8);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                cn cn3 = cn.a(q2.g(i2));
                if (cn3 != cn2) continue;
                this.k = true;
                return true;
            }
        }
        this.k = false;
        return false;
    }
}

