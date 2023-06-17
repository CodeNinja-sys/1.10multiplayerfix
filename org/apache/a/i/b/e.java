/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.a.b.b;
import org.apache.a.b.i;
import org.apache.a.b.o;
import org.apache.a.b.q;
import org.apache.a.f;
import org.apache.a.i.b.g;
import org.apache.a.o.d;
import org.apache.a.r;
import org.apache.a.x;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

abstract class e
implements org.apache.a.c.c {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private static final List b = Collections.unmodifiableList(Arrays.asList("negotiate", "Kerberos", "NTLM", "Digest", "Basic"));
    private final int c;
    private final String d;

    e(int n2, String string) {
        this.c = n2;
        this.d = string;
    }

    public boolean a(r r2, x x2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        int n2 = x2.a().b();
        return n2 == this.c;
    }

    public Map b(r r2, x x2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        f[] arrf = x2.b(this.d);
        HashMap<String, f> hashMap = new HashMap<String, f>(arrf.length);
        for (f f2 : arrf) {
            int n2;
            d d2;
            if (f2 instanceof org.apache.a.e) {
                d2 = ((org.apache.a.e)f2).a();
                n2 = ((org.apache.a.e)f2).b();
            } else {
                String string = f2.d();
                if (string == null) {
                    throw new q("Header value is null");
                }
                d2 = new d(string.length());
                d2.a(string);
                n2 = 0;
            }
            while (n2 < d2.e() && org.apache.a.n.f.a(d2.a(n2))) {
                ++n2;
            }
            int n3 = n2;
            while (n2 < d2.e() && !org.apache.a.n.f.a(d2.a(n2))) {
                ++n2;
            }
            int n4 = n2;
            String string = d2.a(n3, n4);
            hashMap.put(string.toLowerCase(Locale.US), f2);
        }
        return hashMap;
    }

    abstract Collection a(org.apache.a.c.a.c var1);

    public Queue a(Map map, r r2, x x2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(map, "Map of auth challenges");
        org.apache.a.o.a.a(r2, "Host");
        org.apache.a.o.a.a(x2, "HTTP response");
        org.apache.a.o.a.a(g2, "HTTP context");
        org.apache.a.c.e.c c2 = org.apache.a.c.e.c.a(g2);
        LinkedList<b> linkedList = new LinkedList<b>();
        org.apache.a.e.c c3 = c2.h();
        if (c3 == null) {
            this.a.b("Auth scheme registry not set in the context");
            return linkedList;
        }
        org.apache.a.c.i i2 = c2.i();
        if (i2 == null) {
            this.a.b("Credentials provider not set in the context");
            return linkedList;
        }
        org.apache.a.c.a.c c4 = c2.n();
        Collection collection = this.a(c4);
        if (collection == null) {
            collection = b;
        }
        if (this.a.a()) {
            this.a.b("Authentication schemes in the order of preference: " + collection);
        }
        for (String string : collection) {
            f f2 = (f)map.get(string.toLowerCase(Locale.US));
            if (f2 != null) {
                org.apache.a.b.f f3 = (org.apache.a.b.f)c3.c(string);
                if (f3 == null) {
                    if (!this.a.f()) continue;
                    this.a.d("Authentication scheme " + string + " not supported");
                    continue;
                }
                org.apache.a.b.d d2 = f3.a(g2);
                d2.a(f2);
                i i3 = new i(r2.a(), r2.b(), d2.b(), d2.a());
                o o2 = i2.a(i3);
                if (o2 == null) continue;
                linkedList.add(new b(d2, o2));
                continue;
            }
            if (!this.a.a()) continue;
            this.a.b("Challenge for " + string + " authentication scheme not available");
        }
        return linkedList;
    }

    public void a(r r2, org.apache.a.b.d d2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(r2, "Host");
        org.apache.a.o.a.a(d2, "Auth scheme");
        org.apache.a.o.a.a(g2, "HTTP context");
        org.apache.a.c.e.c c2 = org.apache.a.c.e.c.a(g2);
        if (this.a(d2)) {
            org.apache.a.c.a a2 = c2.j();
            if (a2 == null) {
                a2 = new g();
                c2.a(a2);
            }
            if (this.a.a()) {
                this.a.b("Caching '" + d2.a() + "' auth scheme for " + r2);
            }
            a2.a(r2, d2);
        }
    }

    protected boolean a(org.apache.a.b.d d2) {
        if (d2 == null || !d2.d()) {
            return false;
        }
        String string = d2.a();
        return string.equalsIgnoreCase("Basic") || string.equalsIgnoreCase("Digest");
    }

    public void b(r r2, org.apache.a.b.d d2, org.apache.a.n.g g2) {
        org.apache.a.o.a.a(r2, "Host");
        org.apache.a.o.a.a(g2, "HTTP context");
        org.apache.a.c.e.c c2 = org.apache.a.c.e.c.a(g2);
        org.apache.a.c.a a2 = c2.j();
        if (a2 != null) {
            if (this.a.a()) {
                this.a.b("Clearing cached auth scheme for " + r2);
            }
            a2.b(r2);
        }
    }
}

