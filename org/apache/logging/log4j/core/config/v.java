/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.b.l;
import org.apache.logging.log4j.core.config.a;
import org.apache.logging.log4j.core.config.ab;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.core.g;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.f;

public class v
extends org.apache.logging.log4j.core.c.b {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private static final int b = 3;
    private static final long c = 1000L;
    private static org.apache.logging.log4j.core.e.g d = null;
    private List e = new ArrayList();
    private final Map f = new ConcurrentHashMap();
    private final String g;
    private org.apache.logging.log4j.core.e.g i;
    private b j;
    private boolean k = true;
    private boolean l = true;
    private v m;
    private final AtomicInteger n = new AtomicInteger();
    private boolean o = false;
    private final Map p;
    private final org.apache.logging.log4j.core.config.d q;

    public v() {
        this.i = d;
        this.j = org.apache.logging.log4j.b.c;
        this.g = "";
        this.p = null;
        this.q = null;
    }

    public v(String string, b b2, boolean bl2) {
        this.i = d;
        this.g = string;
        this.j = b2;
        this.k = bl2;
        this.p = null;
        this.q = null;
    }

    protected v(String string, List list, org.apache.logging.log4j.core.d d2, b b2, boolean bl2, ab[] arrab, org.apache.logging.log4j.core.config.d d3, boolean bl3) {
        super(d2);
        this.i = d;
        this.g = string;
        this.e = list;
        this.j = b2;
        this.k = bl2;
        this.l = bl3;
        this.q = d3;
        if (arrab != null && arrab.length > 0) {
            this.p = new HashMap(arrab.length);
            for (ab ab2 : arrab) {
                boolean bl4 = ab2.b().contains("${");
                this.p.put(ab2, bl4);
            }
        } else {
            this.p = null;
        }
    }

    @Override
    public org.apache.logging.log4j.core.d aY_() {
        return super.aY_();
    }

    public String d() {
        return this.g;
    }

    public void a(v v2) {
        this.m = v2;
    }

    public v e() {
        return this.m;
    }

    public void a(org.apache.logging.log4j.core.b b2, b b3, org.apache.logging.log4j.core.d d2) {
        this.f.put(b2.a(), new a(b2, b3, d2));
    }

    public void b(String string) {
        a a2 = (a)this.f.remove(string);
        if (a2 != null) {
            this.a(a2);
        }
    }

    public Map f() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f.entrySet()) {
            hashMap.put(entry.getKey(), ((a)entry.getValue()).c());
        }
        return hashMap;
    }

    protected void g() {
        this.n();
        Collection collection = this.f.values();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            a a2 = (a)iterator.next();
            iterator.remove();
            this.a(a2);
        }
    }

    private void a(a a2) {
        org.apache.logging.log4j.core.d d2 = a2.aY_();
        if (d2 != null) {
            a2.b(d2);
            if (d2 instanceof g) {
                ((g)((Object)d2)).f();
            }
        }
    }

    public List h() {
        return this.e;
    }

    public void a(b b2) {
        this.j = b2;
    }

    public b i() {
        return this.j;
    }

    public org.apache.logging.log4j.core.e.g j() {
        return this.i;
    }

    public void a(org.apache.logging.log4j.core.e.g g2) {
        this.i = g2;
    }

    public boolean k() {
        return this.k;
    }

    public void a(boolean bl2) {
        this.k = bl2;
    }

    public boolean l() {
        return this.l;
    }

    public Map m() {
        return this.p == null ? null : Collections.unmodifiableMap(this.p);
    }

    public void a(String string, f f2, String string2, b b2, m m2, Throwable throwable) {
        ArrayList<ab> arrayList = null;
        if (this.p != null) {
            arrayList = new ArrayList<ab>(this.p.size());
            for (Map.Entry entry : this.p.entrySet()) {
                ab ab2 = (ab)entry.getKey();
                String string3 = (Boolean)entry.getValue() != false ? this.q.l().a(ab2.b()) : ab2.b();
                arrayList.add(ab.a(ab2.a(), string3));
            }
        }
        h h2 = this.i.a(string, f2, string2, b2, m2, arrayList, throwable);
        this.d(h2);
    }

    private synchronized void n() {
        if (this.o) {
            return;
        }
        this.o = true;
        int n2 = 0;
        while (this.n.get() > 0) {
            try {
                this.wait(1000L * (long)(n2 + 1));
            }
            catch (InterruptedException interruptedException) {
                if (++n2 <= 3) continue;
                break;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d(h h2) {
        this.n.incrementAndGet();
        try {
            if (this.b(h2)) {
                return;
            }
            h2.a(this.l());
            this.a(h2);
            if (this.k && this.m != null) {
                this.m.d(h2);
            }
        }
        finally {
            if (this.n.decrementAndGet() == 0) {
                v v2 = this;
                synchronized (v2) {
                    if (this.o) {
                        this.notifyAll();
                    }
                }
            }
        }
    }

    protected void a(h h2) {
        for (a a2 : this.f.values()) {
            a2.a(h2);
        }
    }

    public String toString() {
        return org.apache.logging.log4j.core.d.v.a(this.g) ? "root" : this.g;
    }

    public static v b(String string, String string2, String string3, String string4, org.apache.logging.log4j.core.config.b[] arrb, ab[] arrab, org.apache.logging.log4j.core.config.d d2, org.apache.logging.log4j.core.d d3) {
        b b2;
        if (string3 == null) {
            a.b("Loggers cannot be configured without a name");
            return null;
        }
        List<org.apache.logging.log4j.core.config.b> list = Arrays.asList(arrb);
        try {
            b2 = org.apache.logging.log4j.b.a(string2, org.apache.logging.log4j.b.c);
        }
        catch (Exception exception) {
            a.b("Invalid Log level specified: {}. Defaulting to Error", string2);
            b2 = org.apache.logging.log4j.b.c;
        }
        String string5 = string3.equals("root") ? "" : string3;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string, true);
        return new v(string5, list, d3, b2, bl2, arrab, d2, v.c(string4));
    }

    protected static boolean c(String string) {
        if (string == null) {
            boolean bl2 = !l.class.getName().equals(System.getProperty("Log4jContextSelector"));
            return bl2;
        }
        return Boolean.parseBoolean(string);
    }

    static {
        String string = org.apache.logging.log4j.e.b.a().a("Log4jLogEventFactory");
        if (string != null) {
            try {
                Class class_ = org.apache.logging.log4j.core.d.p.a(string);
                if (class_ != null && org.apache.logging.log4j.core.e.g.class.isAssignableFrom(class_)) {
                    d = (org.apache.logging.log4j.core.e.g)class_.newInstance();
                }
            }
            catch (Exception exception) {
                a.b("Unable to create LogEventFactory " + string, (Throwable)exception);
            }
        }
        if (d == null) {
            d = new org.apache.logging.log4j.core.e.b();
        }
    }
}

