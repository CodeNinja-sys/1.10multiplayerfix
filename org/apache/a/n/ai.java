/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import java.util.HashMap;
import java.util.Map;
import org.apache.a.o.a;

public class ai {
    private final Map a = new HashMap();

    public synchronized void a(String string, Object object) {
        org.apache.a.o.a.a((Object)string, "URI request pattern");
        this.a.put(string, object);
    }

    public synchronized void a(String string) {
        if (string == null) {
            return;
        }
        this.a.remove(string);
    }

    public synchronized void a(Map map) {
        org.apache.a.o.a.a(map, "Map of handlers");
        this.a.clear();
        this.a.putAll(map);
    }

    public synchronized void b(Map map) {
        org.apache.a.o.a.a(map, "Map of handlers");
        this.a.clear();
        this.a.putAll(map);
    }

    public synchronized Map a() {
        return this.a;
    }

    public synchronized Object b(String string) {
        org.apache.a.o.a.a((Object)string, "Request path");
        Object v2 = this.a.get(string);
        if (v2 == null) {
            String string2 = null;
            for (String string3 : this.a.keySet()) {
                if (!this.a(string3, string) || string2 != null && string2.length() >= string3.length() && (string2.length() != string3.length() || !string3.endsWith("*"))) continue;
                v2 = this.a.get(string3);
                string2 = string3;
            }
        }
        return v2;
    }

    protected boolean a(String string, String string2) {
        if (string.equals("*")) {
            return true;
        }
        return string.endsWith("*") && string2.startsWith(string.substring(0, string.length() - 1)) || string.startsWith("*") && string2.endsWith(string.substring(1, string.length()));
    }

    public String toString() {
        return this.a.toString();
    }
}

