/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ac;
import com.a.b.b.a.h;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.t;
import com.a.b.w;
import com.a.b.y;
import com.a.b.z;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class g
extends a {
    private static final Reader a = new h();
    private static final Object b = new Object();
    private final List c = new ArrayList();

    public g(w w2) {
        super(a);
        this.c.add(w2);
    }

    public void a() {
        this.a(d.a);
        t t2 = (t)this.q();
        this.c.add(t2.iterator());
    }

    public void b() {
        this.a(d.b);
        this.r();
        this.r();
    }

    public void c() {
        this.a(d.c);
        z z2 = (z)this.q();
        this.c.add(z2.b().iterator());
    }

    public void d() {
        this.a(d.d);
        this.r();
        this.r();
    }

    public boolean e() {
        d d2 = this.f();
        return d2 != d.d && d2 != d.b;
    }

    public d f() {
        if (this.c.isEmpty()) {
            return d.j;
        }
        Object object = this.q();
        if (object instanceof Iterator) {
            boolean bl2 = this.c.get(this.c.size() - 2) instanceof z;
            Iterator iterator = (Iterator)object;
            if (iterator.hasNext()) {
                if (bl2) {
                    return d.e;
                }
                this.c.add(iterator.next());
                return this.f();
            }
            return bl2 ? d.d : d.b;
        }
        if (object instanceof z) {
            return d.c;
        }
        if (object instanceof t) {
            return d.a;
        }
        if (object instanceof ac) {
            ac ac2 = (ac)object;
            if (ac2.z()) {
                return d.f;
            }
            if (ac2.b()) {
                return d.h;
            }
            if (ac2.y()) {
                return d.g;
            }
            throw new AssertionError();
        }
        if (object instanceof y) {
            return d.i;
        }
        if (object == b) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    private Object q() {
        return this.c.get(this.c.size() - 1);
    }

    private Object r() {
        return this.c.remove(this.c.size() - 1);
    }

    private void a(d d2) {
        if (this.f() != d2) {
            throw new IllegalStateException("Expected " + (Object)((Object)d2) + " but was " + (Object)((Object)this.f()));
        }
    }

    public String g() {
        this.a(d.e);
        Iterator iterator = (Iterator)this.q();
        Map.Entry entry = (Map.Entry)iterator.next();
        this.c.add(entry.getValue());
        return (String)entry.getKey();
    }

    public String h() {
        d d2 = this.f();
        if (d2 != d.f && d2 != d.g) {
            throw new IllegalStateException("Expected " + (Object)((Object)d.f) + " but was " + (Object)((Object)d2));
        }
        return ((ac)this.r()).d();
    }

    public boolean i() {
        this.a(d.h);
        return ((ac)this.r()).n();
    }

    public void j() {
        this.a(d.i);
        this.r();
    }

    public double k() {
        d d2 = this.f();
        if (d2 != d.g && d2 != d.f) {
            throw new IllegalStateException("Expected " + (Object)((Object)d.g) + " but was " + (Object)((Object)d2));
        }
        double d3 = ((ac)this.q()).e();
        if (!this.p() && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + d3);
        }
        this.r();
        return d3;
    }

    public long l() {
        d d2 = this.f();
        if (d2 != d.g && d2 != d.f) {
            throw new IllegalStateException("Expected " + (Object)((Object)d.g) + " but was " + (Object)((Object)d2));
        }
        long l2 = ((ac)this.q()).i();
        this.r();
        return l2;
    }

    public int m() {
        d d2 = this.f();
        if (d2 != d.g && d2 != d.f) {
            throw new IllegalStateException("Expected " + (Object)((Object)d.g) + " but was " + (Object)((Object)d2));
        }
        int n2 = ((ac)this.q()).j();
        this.r();
        return n2;
    }

    public void close() {
        this.c.clear();
        this.c.add(b);
    }

    public void n() {
        if (this.f() == d.e) {
            this.g();
        } else {
            this.r();
        }
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public void o() {
        this.a(d.e);
        Iterator iterator = (Iterator)this.q();
        Map.Entry entry = (Map.Entry)iterator.next();
        this.c.add(entry.getValue());
        this.c.add(new ac((String)entry.getKey()));
    }
}

