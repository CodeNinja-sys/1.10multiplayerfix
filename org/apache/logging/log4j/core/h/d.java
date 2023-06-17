/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.core.config.plugins.PluginManager;
import org.apache.logging.log4j.core.config.plugins.k;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.h.c;
import org.apache.logging.log4j.core.h.e;
import org.apache.logging.log4j.core.h.f;
import org.apache.logging.log4j.core.h.g;
import org.apache.logging.log4j.core.h.p;
import org.apache.logging.log4j.core.h.q;

public class d
implements g {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.d.d.k();
    private static final char b = ':';
    private final Map c = new HashMap();
    private final g d;

    public d(g g2) {
        this.d = g2 == null ? new f(new HashMap()) : g2;
        PluginManager pluginManager = new PluginManager("Lookup");
        pluginManager.b();
        Map map = pluginManager.a();
        for (Map.Entry entry : map.entrySet()) {
            Class class_ = ((k)entry.getValue()).a();
            try {
                this.c.put(entry.getKey(), class_.newInstance());
            }
            catch (Exception exception) {
                a.b("Unable to create Lookup for " + (String)entry.getKey(), (Throwable)exception);
            }
        }
    }

    public d() {
        this.d = new f(new HashMap());
        this.c.put("sys", new p());
        this.c.put("env", new c());
        this.c.put("jndi", new e());
        try {
            if (Class.forName("javax.servlet.ServletContext") != null) {
                this.c.put("web", new q());
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            a.a("ServletContext not present - WebLookup not added");
        }
        catch (Exception exception) {
            a.b("Unable to locate ServletContext", (Throwable)exception);
        }
    }

    @Override
    public String a(String string) {
        return this.a(null, string);
    }

    @Override
    public String a(h h2, String string) {
        if (string == null) {
            return null;
        }
        int n2 = string.indexOf(58);
        if (n2 >= 0) {
            String string2 = string.substring(0, n2);
            String string3 = string.substring(n2 + 1);
            g g2 = (g)this.c.get(string2);
            String string4 = null;
            if (g2 != null) {
                String string5 = string4 = h2 == null ? g2.a(string3) : g2.a(h2, string3);
            }
            if (string4 != null) {
                return string4;
            }
            string = string.substring(n2 + 1);
        }
        if (this.d != null) {
            return h2 == null ? this.d.a(string) : this.d.a(h2, string);
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : this.c.keySet()) {
            if (stringBuilder.length() == 0) {
                stringBuilder.append("{");
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string);
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }
}

