/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cc;
import com.a.a.b.cl;
import com.a.a.b.dg;
import com.a.a.c.aa;
import com.a.a.c.bw;
import com.a.a.c.f;
import com.a.a.c.n;
import com.a.a.c.o;
import com.a.a.c.q;
import com.a.a.c.s;
import com.a.a.c.u;
import com.a.a.c.v;
import com.a.a.c.w;
import com.a.a.c.x;
import com.a.a.c.y;
import com.a.a.c.z;
import com.a.a.d.jl;
import com.a.a.d.jt;
import java.util.concurrent.TimeUnit;

public final class l {
    private static final dg n = dg.a(',').b();
    private static final dg o = dg.a('=').b();
    private static final jt p = jt.n().b("initialCapacity", new q()).b("maximumSize", new u()).b("maximumWeight", new v()).b("concurrencyLevel", new o()).b("weakKeys", new s(bw.c)).b("softValues", new z(bw.b)).b("weakValues", new z(bw.c)).b("recordStats", new w()).b("expireAfterAccess", new n()).b("expireAfterWrite", new aa()).b("refreshAfterWrite", new x()).b("refreshInterval", new x()).b();
    Integer a;
    Long b;
    Long c;
    Integer d;
    bw e;
    bw f;
    Boolean g;
    long h;
    TimeUnit i;
    long j;
    TimeUnit k;
    long l;
    TimeUnit m;
    private final String q;

    private l(String string) {
        this.q = string;
    }

    public static l a(String string) {
        l l2 = new l(string);
        if (!string.isEmpty()) {
            for (String string2 : n.a(string)) {
                jl jl2 = jl.a(o.a(string2));
                cl.a(!jl2.isEmpty(), (Object)"blank key-value pair");
                cl.a(jl2.size() <= 2, "key-value pair %s with more than one equals sign", new Object[]{string2});
                String string3 = (String)jl2.get(0);
                y y2 = (y)p.get(string3);
                cl.a(y2 != null, "unknown key %s", new Object[]{string3});
                String string4 = jl2.size() == 1 ? null : (String)jl2.get(1);
                y2.a(l2, string3, string4);
            }
        }
        return l2;
    }

    public static l a() {
        return com.a.a.c.l.a("maximumSize=0");
    }

    f b() {
        f f2 = com.a.a.c.f.a();
        if (this.a != null) {
            f2.a(this.a);
        }
        if (this.b != null) {
            f2.a(this.b);
        }
        if (this.c != null) {
            f2.b(this.c);
        }
        if (this.d != null) {
            f2.b(this.d);
        }
        if (this.e != null) {
            switch (this.e) {
                case c: {
                    f2.i();
                    break;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        if (this.f != null) {
            switch (this.f) {
                case b: {
                    f2.l();
                    break;
                }
                case c: {
                    f2.k();
                    break;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        if (this.g != null && this.g.booleanValue()) {
            f2.r();
        }
        if (this.i != null) {
            f2.a(this.h, this.i);
        }
        if (this.k != null) {
            f2.b(this.j, this.k);
        }
        if (this.m != null) {
            f2.c(this.l, this.m);
        }
        return f2;
    }

    public String c() {
        return this.q;
    }

    public String toString() {
        return cc.a((Object)this).a(this.c()).toString();
    }

    public int hashCode() {
        return cc.a(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, com.a.a.c.l.a(this.h, this.i), com.a.a.c.l.a(this.j, this.k), com.a.a.c.l.a(this.l, this.m)});
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        l l2 = (l)object;
        return cc.a((Object)this.a, (Object)l2.a) && cc.a((Object)this.b, (Object)l2.b) && cc.a((Object)this.c, (Object)l2.c) && cc.a((Object)this.d, (Object)l2.d) && cc.a((Object)this.e, (Object)l2.e) && cc.a((Object)this.f, (Object)l2.f) && cc.a((Object)this.g, (Object)l2.g) && cc.a((Object)com.a.a.c.l.a(this.h, this.i), (Object)com.a.a.c.l.a(l2.h, l2.i)) && cc.a((Object)com.a.a.c.l.a(this.j, this.k), (Object)com.a.a.c.l.a(l2.j, l2.k)) && cc.a((Object)com.a.a.c.l.a(this.l, this.m), (Object)com.a.a.c.l.a(l2.l, l2.m));
    }

    private static Long a(long l2, TimeUnit timeUnit) {
        return timeUnit == null ? null : Long.valueOf(timeUnit.toNanos(l2));
    }
}

