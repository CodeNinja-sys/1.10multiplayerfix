/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import com.a.a.d.ov;
import java.util.ArrayList;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.o.a;
import net.minecraft.o.aa;
import net.minecraft.o.ab;
import net.minecraft.o.ac;
import net.minecraft.o.ad;
import net.minecraft.o.ae;
import net.minecraft.o.c;
import net.minecraft.o.g;
import net.minecraft.o.h;
import net.minecraft.o.l;
import net.minecraft.o.n;
import net.minecraft.o.o;
import net.minecraft.o.p;
import net.minecraft.o.q;
import net.minecraft.o.r;
import net.minecraft.o.s;
import net.minecraft.o.t;
import net.minecraft.o.u;
import net.minecraft.o.w;
import net.minecraft.o.x;
import net.minecraft.o.y;
import net.minecraft.o.z;
import net.minecraft.u.bp;

public abstract class j {
    public static final net.minecraft.u.c.c b = new net.minecraft.u.c.c();
    private final k[] a;
    private final q e;
    public ae c;
    protected String d;

    public static j c(int n2) {
        return (j)b.a(n2);
    }

    public static int b(j j2) {
        return b.d(j2);
    }

    public static j a(String string) {
        return (j)b.a(new bp(string));
    }

    protected j(q q2, ae ae2, k[] arrk) {
        this.e = q2;
        this.c = ae2;
        this.a = arrk;
    }

    public Iterable a(net.minecraft.w.l l2) {
        ArrayList arrayList = ov.a();
        k[] arrk = this.a;
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            k k2 = arrk[i2];
            cu cu2 = l2.a(k2);
            if (cu2 == null) continue;
            arrayList.add(cu2);
        }
        return arrayList.size() > 0 ? arrayList : null;
    }

    public q c() {
        return this.e;
    }

    public int d() {
        return 1;
    }

    public int a() {
        return 1;
    }

    public int a(int n2) {
        return 1 + n2 * 10;
    }

    public int b(int n2) {
        return this.a(n2) + 5;
    }

    public int a(int n2, net.minecraft.u.n n3) {
        return 0;
    }

    public float a(int n2, net.minecraft.w.ae ae2) {
        return 0.0f;
    }

    public boolean a(j j2) {
        return this != j2;
    }

    public j b(String string) {
        this.d = string;
        return this;
    }

    public String b() {
        return "enchantment." + this.d;
    }

    public String d(int n2) {
        String string = net.minecraft.u.d.b.a.a(this.b());
        return n2 == 1 && this.a() == 1 ? string : String.valueOf(string) + " " + net.minecraft.u.d.b.a.a("enchantment.level." + n2);
    }

    public boolean a(cu cu2) {
        return this.c.a(cu2.a());
    }

    public void a(net.minecraft.w.l l2, net.minecraft.w.n n2, int n3) {
    }

    public void b(net.minecraft.w.l l2, net.minecraft.w.n n2, int n3) {
    }

    public boolean e() {
        return false;
    }

    public static void f() {
        k[] arrk = new k[]{k.f, k.e, k.d, k.c};
        b.a(0, new bp("protection"), new z(q.a, ab.a, arrk));
        b.a(1, new bp("fire_protection"), new z(q.b, ab.b, arrk));
        b.a(2, new bp("feather_falling"), new z(q.b, ab.c, arrk));
        b.a(3, new bp("blast_protection"), new z(q.c, ab.d, arrk));
        b.a(4, new bp("projectile_protection"), new z(q.b, ab.e, arrk));
        b.a(5, new bp("respiration"), new w(q.c, arrk));
        b.a(6, new bp("aqua_affinity"), new g(q.c, arrk));
        b.a(7, new bp("thorns"), new x(q.d, arrk));
        b.a(8, new bp("depth_strider"), new p(q.c, arrk));
        b.a(9, new bp("frost_walker"), new l(q.c, k.c));
        b.a(16, new bp("sharpness"), new a(q.a, 0, k.a));
        b.a(17, new bp("smite"), new a(q.b, 1, k.a));
        b.a(18, new bp("bane_of_arthropods"), new a(q.b, 2, k.a));
        b.a(19, new bp("knockback"), new u(q.b, k.a));
        b.a(20, new bp("fire_aspect"), new h(q.c, k.a));
        b.a(21, new bp("looting"), new r(q.c, ae.g, k.a));
        b.a(32, new bp("efficiency"), new o(q.a, k.a));
        b.a(33, new bp("silk_touch"), new c(q.d, k.a));
        b.a(34, new bp("unbreaking"), new n(q.b, k.a));
        b.a(35, new bp("fortune"), new r(q.c, ae.h, k.a));
        b.a(48, new bp("power"), new aa(q.a, k.a));
        b.a(49, new bp("punch"), new ac(q.c, k.a));
        b.a(50, new bp("flame"), new y(q.c, k.a));
        b.a(51, new bp("infinity"), new s(q.d, k.a));
        b.a(61, new bp("luck_of_the_sea"), new r(q.c, ae.i, k.a));
        b.a(62, new bp("lure"), new ad(q.c, ae.i, k.a));
        b.a(70, new bp("mending"), new t(q.c, k.values()));
    }
}

