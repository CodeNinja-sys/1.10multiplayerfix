/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.a.b.m;
import org.apache.a.b.q;
import org.apache.a.c;
import org.apache.a.g;
import org.apache.a.i.a.a;
import org.apache.a.k.x;
import org.apache.a.o.d;
import org.apache.a.u;

public abstract class ac
extends a {
    private final Map a = new HashMap();
    private final Charset b;

    public ac(m m2) {
        super(m2);
        this.b = c.f;
    }

    public ac(Charset charset) {
        this.b = charset != null ? charset : c.f;
    }

    public ac() {
        this(c.f);
    }

    public Charset k() {
        return this.b;
    }

    String a(u u2) {
        String string = (String)u2.f().a("http.auth.credential-charset");
        if (string == null) {
            string = this.k().name();
        }
        return string;
    }

    protected void a(d d2, int n2, int n3) {
        org.apache.a.k.g g2 = org.apache.a.k.g.b;
        x x2 = new x(n2, d2.e());
        g[] arrg = g2.a(d2, x2);
        if (arrg.length == 0) {
            throw new q("Authentication challenge is empty");
        }
        this.a.clear();
        for (g g3 : arrg) {
            this.a.put(g3.a(), g3.b());
        }
    }

    protected Map l() {
        return this.a;
    }

    public String a(String string) {
        if (string == null) {
            return null;
        }
        return (String)this.a.get(string.toLowerCase(Locale.ENGLISH));
    }

    public String b() {
        return this.a("realm");
    }
}

