/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.a.c.e.c;
import org.apache.a.c.h;
import org.apache.a.f;
import org.apache.a.g.b;
import org.apache.a.g.j;
import org.apache.a.n.g;
import org.apache.a.o.k;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.w;
import org.apache.commons.d.a;

public class e
implements w {
    private final a a = org.apache.commons.d.c.b(this.getClass());

    public void a(u u2, g g2) {
        int n2;
        Object object;
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(g2, "HTTP context");
        String string = u2.g().a();
        if (string.equalsIgnoreCase("CONNECT")) {
            return;
        }
        c c2 = c.a(g2);
        h h2 = c2.d();
        if (h2 == null) {
            this.a.b("Cookie store not specified in HTTP context");
            return;
        }
        org.apache.a.e.c c3 = c2.g();
        if (c3 == null) {
            this.a.b("CookieSpec registry not specified in HTTP context");
            return;
        }
        r r2 = c2.t();
        if (r2 == null) {
            this.a.b("Target host not set in the context");
            return;
        }
        org.apache.a.f.b.e e2 = c2.b();
        if (e2 == null) {
            this.a.b("Connection route not set in the context");
            return;
        }
        org.apache.a.c.a.c c4 = c2.n();
        String string2 = c4.e();
        if (string2 == null) {
            string2 = "best-match";
        }
        if (this.a.a()) {
            this.a.b("CookieSpec selected: " + string2);
        }
        URI uRI = null;
        if (u2 instanceof org.apache.a.c.c.u) {
            uRI = ((org.apache.a.c.c.u)u2).k();
        } else {
            try {
                uRI = new URI(u2.g().c());
            }
            catch (URISyntaxException uRISyntaxException) {
                // empty catch block
            }
        }
        String string3 = uRI != null ? uRI.getPath() : null;
        String string4 = r2.a();
        int n3 = r2.b();
        if (n3 < 0) {
            n3 = e2.a().b();
        }
        org.apache.a.g.e e3 = new org.apache.a.g.e(string4, n3 >= 0 ? n3 : 0, !k.a(string3) ? string3 : "/", e2.j());
        j j2 = (j)c3.c(string2);
        if (j2 == null) {
            throw new p("Unsupported cookie policy: " + string2);
        }
        org.apache.a.g.h h3 = j2.a(c2);
        ArrayList arrayList = new ArrayList(h2.a());
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        Date date = new Date();
        for (Object object2 : arrayList) {
            if (!object2.a(date)) {
                if (!h3.b((b)object2, e3)) continue;
                if (this.a.a()) {
                    this.a.b("Cookie " + object2 + " match " + e3);
                }
                arrayList2.add(object2);
                continue;
            }
            if (!this.a.a()) continue;
            this.a.b("Cookie " + object2 + " expired");
        }
        if (!arrayList2.isEmpty()) {
            Object object2;
            List list = h3.a(arrayList2);
            object2 = list.iterator();
            while (object2.hasNext()) {
                object = (f)object2.next();
                u2.a((f)object);
            }
        }
        if ((n2 = h3.a()) > 0) {
            boolean bl2 = false;
            object = arrayList2.iterator();
            while (object.hasNext()) {
                b b2 = (b)object.next();
                if (n2 == b2.k() && b2 instanceof org.apache.a.g.p) continue;
                bl2 = true;
            }
            if (bl2 && (object = h3.b()) != null) {
                u2.a((f)object);
            }
        }
        g2.a("http.cookie-spec", h3);
        g2.a("http.cookie-origin", e3);
    }
}

