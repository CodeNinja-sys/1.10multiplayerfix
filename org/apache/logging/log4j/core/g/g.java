/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.d.e;
import org.apache.logging.log4j.core.d.t;
import org.apache.logging.log4j.core.g.b;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.ar;
import org.apache.logging.log4j.core.i.as;
import org.apache.logging.log4j.core.i.av;

public final class g
extends b {
    public static final String d = "%m%n";
    public static final String e = "%r [%t] %p %c %x - %m%n";
    public static final String f = "%d [%t] %p %c - %m%n";
    public static final String g = "Converter";
    private List h;
    private final String i;
    private final d j;
    private final av k;
    private final boolean l;

    private g(d d2, av av2, String string, Charset charset, boolean bl2) {
        super(charset);
        this.k = av2;
        this.i = string;
        this.j = d2;
        this.l = bl2;
        as as2 = org.apache.logging.log4j.core.g.g.a(d2);
        this.h = as2.a(string == null ? d : string, this.l);
    }

    public void a(String string) {
        String string2 = t.a(string);
        if (string2 == null) {
            return;
        }
        as as2 = org.apache.logging.log4j.core.g.g.a(this.j);
        this.h = as2.a(string2, this.l);
    }

    public String f() {
        return this.i;
    }

    @Override
    public Map d() {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("structured", "false");
        hashMap.put("formatType", "conversion");
        hashMap.put("format", this.i);
        return hashMap;
    }

    public String c(h h2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ar ar2 : this.h) {
            ar2.a(h2, stringBuilder);
        }
        Object object = stringBuilder.toString();
        if (this.k != null) {
            object = this.k.a((String)object);
        }
        return object;
    }

    public static as a(d d2) {
        if (d2 == null) {
            return new as(d2, g, ac.class);
        }
        as as2 = (as)d2.a(g);
        if (as2 == null) {
            as2 = new as(d2, g, ac.class);
            d2.a(g, as2);
            as2 = (as)d2.a(g);
        }
        return as2;
    }

    public String toString() {
        return this.i;
    }

    public static g a(String string, d d2, av av2, String string2, String string3) {
        Charset charset = org.apache.logging.log4j.core.d.e.a(string2);
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string3, true);
        return new g(d2, av2, string == null ? d : string, charset, bl2);
    }

    @Override
    public /* synthetic */ Serializable b(h h2) {
        return this.c(h2);
    }
}

