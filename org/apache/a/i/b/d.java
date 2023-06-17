/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import org.apache.a.b.b;
import org.apache.a.b.i;
import org.apache.a.b.k;
import org.apache.a.b.o;
import org.apache.a.c.a;
import org.apache.a.c.c;
import org.apache.a.f;
import org.apache.a.i.b.g;
import org.apache.a.r;
import org.apache.a.x;

class d
implements c {
    private final org.apache.commons.d.a a = org.apache.commons.d.c.b(this.getClass());
    private final org.apache.a.c.b b;

    public d(org.apache.a.c.b b2) {
        this.b = b2;
    }

    public boolean a(r r2, x x2, org.apache.a.n.g g2) {
        return this.b.a(x2, g2);
    }

    public Map b(r r2, x x2, org.apache.a.n.g g2) {
        return this.b.b(x2, g2);
    }

    public Queue a(Map map, r r2, x x2, org.apache.a.n.g g2) {
        org.apache.a.b.d d2;
        org.apache.a.o.a.a(map, "Map of auth challenges");
        org.apache.a.o.a.a(r2, "Host");
        org.apache.a.o.a.a(x2, "HTTP response");
        org.apache.a.o.a.a(g2, "HTTP context");
        LinkedList<b> linkedList = new LinkedList<b>();
        org.apache.a.c.i i2 = (org.apache.a.c.i)g2.a("http.auth.credentials-provider");
        if (i2 == null) {
            this.a.b("Credentials provider not set in the context");
            return linkedList;
        }
        try {
            d2 = this.b.a(map, x2, g2);
        }
        catch (k k2) {
            if (this.a.f()) {
                this.a.d(k2.getMessage(), k2);
            }
            return linkedList;
        }
        String string = d2.a();
        f f2 = (f)map.get(string.toLowerCase(Locale.US));
        d2.a(f2);
        i i3 = new i(r2.a(), r2.b(), d2.b(), d2.a());
        o o2 = i2.a(i3);
        if (o2 != null) {
            linkedList.add(new b(d2, o2));
        }
        return linkedList;
    }

    public void a(r r2, org.apache.a.b.d d2, org.apache.a.n.g g2) {
        a a2 = (a)g2.a("http.auth.auth-cache");
        if (this.a(d2)) {
            if (a2 == null) {
                a2 = new g();
                g2.a("http.auth.auth-cache", a2);
            }
            if (this.a.a()) {
                this.a.b("Caching '" + d2.a() + "' auth scheme for " + r2);
            }
            a2.a(r2, d2);
        }
    }

    public void b(r r2, org.apache.a.b.d d2, org.apache.a.n.g g2) {
        a a2 = (a)g2.a("http.auth.auth-cache");
        if (a2 == null) {
            return;
        }
        if (this.a.a()) {
            this.a.b("Removing from cache '" + d2.a() + "' auth scheme for " + r2);
        }
        a2.b(r2);
    }

    private boolean a(org.apache.a.b.d d2) {
        if (d2 == null || !d2.d()) {
            return false;
        }
        String string = d2.a();
        return string.equalsIgnoreCase("Basic") || string.equalsIgnoreCase("Digest");
    }

    public org.apache.a.c.b a() {
        return this.b;
    }
}

