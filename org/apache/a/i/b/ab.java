/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.security.Principal;
import javax.net.ssl.SSLSession;
import org.apache.a.b.d;
import org.apache.a.b.j;
import org.apache.a.b.o;
import org.apache.a.c.e.c;
import org.apache.a.c.t;
import org.apache.a.f.u;
import org.apache.a.n.g;

public class ab
implements t {
    public static final ab a = new ab();

    public Object a(g g2) {
        SSLSession sSLSession;
        Object object;
        c c2 = c.a(g2);
        Principal principal = null;
        j j2 = c2.k();
        if (j2 != null && (principal = ab.a(j2)) == null) {
            object = c2.l();
            principal = ab.a((j)object);
        }
        if (principal == null && (object = c2.p()).c() && object instanceof u && (sSLSession = ((u)object).n()) != null) {
            principal = sSLSession.getLocalPrincipal();
        }
        return principal;
    }

    private static Principal a(j j2) {
        o o2;
        d d2 = j2.c();
        if (d2 != null && d2.d() && d2.c() && (o2 = j2.d()) != null) {
            return o2.a();
        }
        return null;
    }
}

