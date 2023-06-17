/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import org.apache.a.aj;
import org.apache.a.c.c.j;
import org.apache.a.c.c.v;
import org.apache.a.c.e;
import org.apache.a.c.p;
import org.apache.a.f;
import org.apache.a.i.b.av;
import org.apache.a.n.g;
import org.apache.a.o.b;
import org.apache.a.o.k;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class w
implements p {
    private final a c = org.apache.commons.d.c.b(this.getClass());
    public static final String a = "http.protocol.redirect-locations";
    public static final w b = new w();
    private static final String[] d = new String[]{"GET", "HEAD"};

    public boolean a(u u2, x x2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(x2, "HTTP response");
        int n2 = x2.a().b();
        String string = u2.g().a();
        f f2 = x2.c("location");
        switch (n2) {
            case 302: {
                return this.b(string) && f2 != null;
            }
            case 301: 
            case 307: {
                return this.b(string);
            }
            case 303: {
                return true;
            }
        }
        return false;
    }

    public URI c(u u2, x x2, g g2) {
        Object object;
        org.apache.a.o.a.a(u2, "HTTP request");
        org.apache.a.o.a.a(x2, "HTTP response");
        org.apache.a.o.a.a(g2, "HTTP context");
        org.apache.a.c.e.c c2 = org.apache.a.c.e.c.a(g2);
        f f2 = x2.c("location");
        if (f2 == null) {
            throw new aj("Received redirect response " + x2.a() + " but no location header");
        }
        String string = f2.d();
        if (this.c.a()) {
            this.c.b("Redirect requested to location '" + string + "'");
        }
        org.apache.a.c.a.c c3 = c2.n();
        URI uRI = this.a(string);
        try {
            if (!uRI.isAbsolute()) {
                if (!c3.g()) {
                    throw new aj("Relative redirect location '" + uRI + "' not allowed");
                }
                object = c2.t();
                org.apache.a.o.b.a(object, "Target host");
                URI uRI2 = new URI(u2.g().c());
                URI uRI3 = org.apache.a.c.f.k.a(uRI2, (r)object, false);
                uRI = org.apache.a.c.f.k.a(uRI3, uRI);
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new aj(uRISyntaxException.getMessage(), uRISyntaxException);
        }
        object = (av)c2.a(a);
        if (object == null) {
            object = new av();
            g2.a(a, object);
        }
        if (!c3.h() && ((av)object).a(uRI)) {
            throw new e("Circular redirect to '" + uRI + "'");
        }
        ((av)object).b(uRI);
        return uRI;
    }

    protected URI a(String string) {
        try {
            String string2;
            org.apache.a.c.f.j j2 = new org.apache.a.c.f.j(new URI(string).normalize());
            String string3 = j2.h();
            if (string3 != null) {
                j2.c(string3.toLowerCase(Locale.US));
            }
            if (k.a(string2 = j2.j())) {
                j2.d("/");
            }
            return j2.a();
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new aj("Invalid redirect URI: " + string, uRISyntaxException);
        }
    }

    protected boolean b(String string) {
        for (String string2 : d) {
            if (!string2.equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    public org.apache.a.c.c.u b(u u2, x x2, g g2) {
        URI uRI = this.c(u2, x2, g2);
        String string = u2.g().a();
        if (string.equalsIgnoreCase("HEAD")) {
            return new org.apache.a.c.c.k(uRI);
        }
        if (string.equalsIgnoreCase("GET")) {
            return new j(uRI);
        }
        int n2 = x2.a().b();
        if (n2 == 307) {
            return v.a(u2).a(uRI).n();
        }
        return new j(uRI);
    }
}

