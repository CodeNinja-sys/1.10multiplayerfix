/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import net.minecraft.j.f;
import net.minecraft.r.a;
import net.minecraft.r.e;
import net.minecraft.r.i;
import net.minecraft.r.l;
import net.minecraft.r.n;
import net.minecraft.r.o;
import net.minecraft.u.d.a.c;
import net.minecraft.u.d.a.d;

public class k {
    public final String e;
    private final net.minecraft.u.d.a a;
    public boolean f;
    private final l b;
    private final f c;
    private Class d;
    private static final NumberFormat k = NumberFormat.getIntegerInstance(Locale.US);
    public static l g = new n();
    private static final DecimalFormat l = new DecimalFormat("########0.00");
    public static l h = new a();
    public static l i = new e();
    public static l j = new i();

    public k(String string, net.minecraft.u.d.a a2, l l2) {
        this.e = string;
        this.a = a2;
        this.b = l2;
        this.c = new net.minecraft.j.k(this);
        net.minecraft.j.f.a.put(this.c.c(), this.c);
    }

    public k(String string, net.minecraft.u.d.a a2) {
        this(string, a2, g);
    }

    public k h() {
        this.f = true;
        return this;
    }

    public k i() {
        if (o.a.containsKey(this.e)) {
            throw new RuntimeException("Duplicate stat id: \"" + ((k)o.a.get((Object)this.e)).a + "\" and \"" + this.a + "\" at id " + this.e);
        }
        o.b.add(this);
        o.a.put(this.e, this);
        return this;
    }

    public boolean d() {
        return false;
    }

    public String a(int n2) {
        return this.b.a(n2);
    }

    public net.minecraft.u.d.a e() {
        net.minecraft.u.d.a a2 = this.a.f();
        a2.a().a(net.minecraft.u.d.o.h);
        a2.a().a(new c(net.minecraft.u.d.a.d.b, new net.minecraft.u.d.k(this.e)));
        return a2;
    }

    public net.minecraft.u.d.a j() {
        net.minecraft.u.d.a a2 = this.e();
        net.minecraft.u.d.a a3 = new net.minecraft.u.d.k("[").a(a2).a("]");
        a3.a(a2.a());
        return a3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            k k2 = (k)object;
            return this.e.equals(k2.e);
        }
        return false;
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        return "Stat{id=" + this.e + ", nameId=" + this.a + ", awardLocallyOnly=" + this.f + ", formatter=" + this.b + ", objectiveCriteria=" + this.c + '}';
    }

    public f k() {
        return this.c;
    }

    public Class l() {
        return this.d;
    }

    public k b(Class class_) {
        this.d = class_;
        return this;
    }

    static /* synthetic */ NumberFormat m() {
        return k;
    }

    static /* synthetic */ DecimalFormat n() {
        return l;
    }
}

