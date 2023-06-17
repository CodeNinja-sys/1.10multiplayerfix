/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.d.ce;
import com.a.a.d.du;
import com.a.a.d.dw;
import com.a.a.d.ep;
import com.a.a.d.mq;
import com.a.a.d.yd;
import com.a.a.d.ym;
import com.a.a.d.yn;
import com.a.a.d.yo;
import java.io.Serializable;
import java.util.Iterator;
import java.util.SortedSet;

public final class yl
implements cm,
Serializable {
    private static final bl d = new ym();
    private static final bl e = new yn();
    static final yd a = new yo();
    private static final yl f = new yl(dw.d(), dw.e());
    final dw b;
    final dw c;
    private static final long g = 0L;

    static bl a() {
        return d;
    }

    static bl b() {
        return e;
    }

    static yl a(dw dw2, dw dw3) {
        return new yl(dw2, dw3);
    }

    public static yl a(Comparable comparable, Comparable comparable2) {
        return yl.a(dw.c(comparable), dw.b(comparable2));
    }

    public static yl b(Comparable comparable, Comparable comparable2) {
        return yl.a(dw.b(comparable), dw.c(comparable2));
    }

    public static yl c(Comparable comparable, Comparable comparable2) {
        return yl.a(dw.b(comparable), dw.b(comparable2));
    }

    public static yl d(Comparable comparable, Comparable comparable2) {
        return yl.a(dw.c(comparable), dw.c(comparable2));
    }

    public static yl a(Comparable comparable, ce ce2, Comparable comparable2, ce ce3) {
        cl.a((Object)ce2);
        cl.a((Object)ce3);
        dw dw2 = ce2 == ce.a ? dw.c(comparable) : dw.b(comparable);
        dw dw3 = ce3 == ce.a ? dw.b(comparable2) : dw.c(comparable2);
        return yl.a(dw2, dw3);
    }

    public static yl a(Comparable comparable) {
        return yl.a(dw.d(), dw.b(comparable));
    }

    public static yl b(Comparable comparable) {
        return yl.a(dw.d(), dw.c(comparable));
    }

    public static yl a(Comparable comparable, ce ce2) {
        switch (ce2) {
            case a: {
                return yl.a(comparable);
            }
            case b: {
                return yl.b(comparable);
            }
        }
        throw new AssertionError();
    }

    public static yl c(Comparable comparable) {
        return yl.a(dw.c(comparable), dw.e());
    }

    public static yl d(Comparable comparable) {
        return yl.a(dw.b(comparable), dw.e());
    }

    public static yl b(Comparable comparable, ce ce2) {
        switch (ce2) {
            case a: {
                return yl.c(comparable);
            }
            case b: {
                return yl.d(comparable);
            }
        }
        throw new AssertionError();
    }

    public static yl c() {
        return f;
    }

    public static yl e(Comparable comparable) {
        return yl.b(comparable, comparable);
    }

    public static yl a(Iterable iterable) {
        Comparable comparable;
        cl.a(iterable);
        if (iterable instanceof du) {
            return ((du)iterable).b();
        }
        Iterator iterator = iterable.iterator();
        Comparable comparable2 = comparable = (Comparable)cl.a(iterator.next());
        while (iterator.hasNext()) {
            Comparable comparable3 = (Comparable)cl.a(iterator.next());
            comparable = (Comparable)yd.d().a(comparable, (Object)comparable3);
            comparable2 = (Comparable)yd.d().b(comparable2, comparable3);
        }
        return yl.b(comparable, comparable2);
    }

    private yl(dw dw2, dw dw3) {
        if (dw2.a(dw3) > 0 || dw2 == dw.e() || dw3 == dw.d()) {
            throw new IllegalArgumentException("Invalid range: " + yl.b(dw2, dw3));
        }
        this.b = (dw)cl.a(dw2);
        this.c = (dw)cl.a(dw3);
    }

    public boolean d() {
        return this.b != dw.d();
    }

    public Comparable e() {
        return this.b.c();
    }

    public ce f() {
        return this.b.a();
    }

    public boolean g() {
        return this.c != dw.e();
    }

    public Comparable h() {
        return this.c.c();
    }

    public ce i() {
        return this.c.b();
    }

    public boolean j() {
        return this.b.equals(this.c);
    }

    public boolean f(Comparable comparable) {
        cl.a(comparable);
        return this.b.a(comparable) && !this.c.a(comparable);
    }

    public boolean g(Comparable comparable) {
        return this.f(comparable);
    }

    public boolean b(Iterable iterable) {
        if (mq.j(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = yl.c(iterable);
            Object object = sortedSet.comparator();
            if (yd.d().equals(object) || object == null) {
                return this.f((Comparable)sortedSet.first()) && this.f((Comparable)sortedSet.last());
            }
        }
        for (Object object : iterable) {
            if (this.f((Comparable)object)) continue;
            return false;
        }
        return true;
    }

    public boolean a(yl yl2) {
        return this.b.a(yl2.b) <= 0 && this.c.a(yl2.c) >= 0;
    }

    public boolean b(yl yl2) {
        return this.b.a(yl2.c) <= 0 && yl2.b.a(this.c) <= 0;
    }

    public yl c(yl yl2) {
        int n2 = this.b.a(yl2.b);
        int n3 = this.c.a(yl2.c);
        if (n2 >= 0 && n3 <= 0) {
            return this;
        }
        if (n2 <= 0 && n3 >= 0) {
            return yl2;
        }
        dw dw2 = n2 >= 0 ? this.b : yl2.b;
        dw dw3 = n3 <= 0 ? this.c : yl2.c;
        return yl.a(dw2, dw3);
    }

    public yl d(yl yl2) {
        int n2 = this.b.a(yl2.b);
        int n3 = this.c.a(yl2.c);
        if (n2 <= 0 && n3 >= 0) {
            return this;
        }
        if (n2 >= 0 && n3 <= 0) {
            return yl2;
        }
        dw dw2 = n2 <= 0 ? this.b : yl2.b;
        dw dw3 = n3 >= 0 ? this.c : yl2.c;
        return yl.a(dw2, dw3);
    }

    public yl a(ep ep2) {
        cl.a(ep2);
        dw dw2 = this.b.c(ep2);
        dw dw3 = this.c.c(ep2);
        return dw2 == this.b && dw3 == this.c ? this : yl.a(dw2, dw3);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof yl) {
            yl yl2 = (yl)object;
            return this.b.equals(yl2.b) && this.c.equals(yl2.c);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() * 31 + this.c.hashCode();
    }

    public String toString() {
        return yl.b(this.b, this.c);
    }

    private static String b(dw dw2, dw dw3) {
        StringBuilder stringBuilder = new StringBuilder(16);
        dw2.a(stringBuilder);
        stringBuilder.append('\u2025');
        dw3.b(stringBuilder);
        return stringBuilder.toString();
    }

    private static SortedSet c(Iterable iterable) {
        return (SortedSet)iterable;
    }

    Object k() {
        if (this.equals(f)) {
            return yl.c();
        }
        return this;
    }

    static int e(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.g((Comparable)object);
    }
}

