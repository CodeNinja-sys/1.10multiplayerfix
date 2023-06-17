/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.net.URI;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.config.f;
import org.apache.logging.log4j.core.config.g;
import org.apache.logging.log4j.core.config.h;
import org.apache.logging.log4j.core.config.o;
import org.apache.logging.log4j.e.b;

class i
extends f {
    private i() {
    }

    @Override
    public d a(String string, URI uRI) {
        Object object;
        if (uRI == null) {
            object = this.f.a(org.apache.logging.log4j.e.b.a().a("log4j.configurationFile"));
            if (object != null) {
                h h2 = null;
                try {
                    h2 = this.a(new URI((String)object));
                }
                catch (Exception exception) {
                    // empty catch block
                }
                if (h2 == null) {
                    ClassLoader classLoader = this.getClass().getClassLoader();
                    h2 = this.a((String)object, classLoader);
                }
                if (h2 != null) {
                    for (f f2 : org.apache.logging.log4j.core.config.f.e()) {
                        String[] arrstring = f2.c();
                        if (arrstring == null) continue;
                        for (String string2 : arrstring) {
                            d d2;
                            if (!string2.equals("*") && !((String)object).endsWith(string2) || (d2 = f2.a(h2)) == null) continue;
                            return d2;
                        }
                    }
                }
            }
        } else {
            object = org.apache.logging.log4j.core.config.f.e().iterator();
            while (object.hasNext()) {
                f f3 = (f)object.next();
                String[] arrstring = f3.c();
                if (arrstring == null) continue;
                for (String string3 : arrstring) {
                    d d3;
                    if (!string3.equals("*") && !uRI.toString().endsWith(string3) || (d3 = f3.a(string, uRI)) == null) continue;
                    return d3;
                }
            }
        }
        if ((object = this.a(true, string)) == null && (object = this.a(true, null)) == null && (object = this.a(false, string)) == null) {
            object = this.a(false, null);
        }
        return object != null ? object : new o();
    }

    private d a(boolean bl2, String string) {
        boolean bl3 = string != null && string.length() > 0;
        ClassLoader classLoader = this.getClass().getClassLoader();
        for (f f2 : org.apache.logging.log4j.core.config.f.e()) {
            String string2 = bl2 ? "log4j2-test" : "log4j2";
            String[] arrstring = f2.c();
            if (arrstring == null) continue;
            for (String string3 : arrstring) {
                String string4;
                h h2;
                if (string3.equals("*") || (h2 = this.b(string4 = bl3 ? string2 + string + string3 : string2 + string3, classLoader)) == null) continue;
                return f2.a(h2);
            }
        }
        return null;
    }

    @Override
    public String[] c() {
        return null;
    }

    @Override
    public d a(h h2) {
        if (h2 != null) {
            String string = h2.b();
            for (f f2 : org.apache.logging.log4j.core.config.f.e()) {
                String[] arrstring = f2.c();
                if (arrstring == null) continue;
                for (String string2 : arrstring) {
                    if (!string2.equals("*") && (string == null || !string.endsWith(string2))) continue;
                    d d2 = f2.a(h2);
                    if (d2 != null) {
                        return d2;
                    }
                    c.b("Cannot determine the ConfigurationFactory to use for {}", string);
                    return null;
                }
            }
        }
        c.b("Cannot process configuration, input source is null");
        return null;
    }

    /* synthetic */ i(g g2) {
        this();
    }
}

