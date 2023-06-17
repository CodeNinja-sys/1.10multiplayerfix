/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.h;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.a.ag;
import org.apache.a.ai;
import org.apache.a.c;
import org.apache.a.f;
import org.apache.a.k.x;
import org.apache.a.n;
import org.apache.a.o.a;
import org.apache.a.o.d;
import org.apache.a.o.k;

public final class g
implements Serializable {
    private static final long o = -7768694718232371896L;
    public static final g a = org.apache.a.h.g.a("application/atom+xml", org.apache.a.c.g);
    public static final g b = org.apache.a.h.g.a("application/x-www-form-urlencoded", org.apache.a.c.g);
    public static final g c = org.apache.a.h.g.a("application/json", org.apache.a.c.e);
    public static final g d = org.apache.a.h.g.a("application/octet-stream", (Charset)null);
    public static final g e = org.apache.a.h.g.a("application/svg+xml", org.apache.a.c.g);
    public static final g f = org.apache.a.h.g.a("application/xhtml+xml", org.apache.a.c.g);
    public static final g g = org.apache.a.h.g.a("application/xml", org.apache.a.c.g);
    public static final g h = org.apache.a.h.g.a("multipart/form-data", org.apache.a.c.g);
    public static final g i = org.apache.a.h.g.a("text/html", org.apache.a.c.g);
    public static final g j = org.apache.a.h.g.a("text/plain", org.apache.a.c.g);
    public static final g k = org.apache.a.h.g.a("text/xml", org.apache.a.c.g);
    public static final g l = org.apache.a.h.g.a("*/*", (Charset)null);
    public static final g m = j;
    public static final g n = d;
    private final String p;
    private final Charset q;
    private final ag[] r;

    g(String string, Charset charset) {
        this.p = string;
        this.q = charset;
        this.r = null;
    }

    g(String string, ag[] arrag) {
        this.p = string;
        this.r = arrag;
        String string2 = this.a("charset");
        this.q = !org.apache.a.o.k.b(string2) ? Charset.forName(string2) : null;
    }

    public String a() {
        return this.p;
    }

    public Charset b() {
        return this.q;
    }

    public String a(String string) {
        org.apache.a.o.a.a(string, "Parameter name");
        if (this.r == null) {
            return null;
        }
        for (ag ag2 : this.r) {
            if (!ag2.a().equalsIgnoreCase(string)) continue;
            return ag2.b();
        }
        return null;
    }

    public String toString() {
        d d2 = new d(64);
        d2.a(this.p);
        if (this.r != null) {
            d2.a("; ");
            org.apache.a.k.f.b.a(d2, this.r, false);
        } else if (this.q != null) {
            d2.a("; charset=");
            d2.a(this.q.name());
        }
        return d2.toString();
    }

    private static boolean e(String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 != '\"' && c2 != ',' && c2 != ';') continue;
            return false;
        }
        return true;
    }

    public static g a(String string, Charset charset) {
        String string2 = ((String)org.apache.a.o.a.b(string, "MIME type")).toLowerCase(Locale.US);
        org.apache.a.o.a.a(org.apache.a.h.g.e(string2), "MIME type may not contain reserved characters");
        return new g(string2, charset);
    }

    public static g b(String string) {
        return new g(string, (Charset)null);
    }

    public static g a(String string, String string2) {
        return org.apache.a.h.g.a(string, !org.apache.a.o.k.b(string2) ? Charset.forName(string2) : null);
    }

    private static g a(org.apache.a.g g2) {
        String string = g2.a();
        ag[] arrag = g2.c();
        return new g(string, arrag != null && arrag.length > 0 ? arrag : null);
    }

    public static g c(String string) {
        org.apache.a.o.a.a((Object)string, "Content type");
        d d2 = new d(string.length());
        d2.a(string);
        x x2 = new x(0, string.length());
        org.apache.a.g[] arrg = org.apache.a.k.g.b.a(d2, x2);
        if (arrg.length > 0) {
            return org.apache.a.h.g.a(arrg[0]);
        }
        throw new ai("Invalid content type: " + string);
    }

    public static g a(n n2) {
        org.apache.a.g[] arrg;
        if (n2 == null) {
            return null;
        }
        f f2 = n2.d();
        if (f2 != null && (arrg = f2.e()).length > 0) {
            return org.apache.a.h.g.a(arrg[0]);
        }
        return null;
    }

    public static g b(n n2) {
        g g2 = org.apache.a.h.g.a(n2);
        return g2 != null ? g2 : m;
    }

    public g a(Charset charset) {
        return org.apache.a.h.g.a(this.a(), charset);
    }

    public g d(String string) {
        return org.apache.a.h.g.a(this.a(), string);
    }
}

