/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.c.g;

public class k
implements Serializable {
    private static final long g = 5947847346149275958L;
    public static final k a = new k(new String[]{null});
    public static final k b = new k("a-zA-Z");
    public static final k c = new k("a-z");
    public static final k d = new k("A-Z");
    public static final k e = new k("0-9");
    protected static final Map f = Collections.synchronizedMap(new HashMap());
    private final Set h = Collections.synchronizedSet(new HashSet());

    public static k a(String ... arrstring) {
        k k2;
        if (arrstring == null) {
            return null;
        }
        if (arrstring.length == 1 && (k2 = (k)f.get(arrstring[0])) != null) {
            return k2;
        }
        return new k(arrstring);
    }

    protected k(String ... arrstring) {
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(arrstring[i2]);
        }
    }

    protected void a(String string) {
        if (string == null) {
            return;
        }
        int n2 = string.length();
        int n3 = 0;
        while (n3 < n2) {
            int n4 = n2 - n3;
            if (n4 >= 4 && string.charAt(n3) == '^' && string.charAt(n3 + 2) == '-') {
                this.h.add(org.apache.commons.c.g.b(string.charAt(n3 + 1), string.charAt(n3 + 3)));
                n3 += 4;
                continue;
            }
            if (n4 >= 3 && string.charAt(n3 + 1) == '-') {
                this.h.add(org.apache.commons.c.g.a(string.charAt(n3), string.charAt(n3 + 2)));
                n3 += 3;
                continue;
            }
            if (n4 >= 2 && string.charAt(n3) == '^') {
                this.h.add(org.apache.commons.c.g.b(string.charAt(n3 + 1)));
                n3 += 2;
                continue;
            }
            this.h.add(org.apache.commons.c.g.a(string.charAt(n3)));
            ++n3;
        }
    }

    g[] a() {
        return this.h.toArray(new g[this.h.size()]);
    }

    public boolean a(char c2) {
        for (g g2 : this.h) {
            if (!g2.c(c2)) continue;
            return true;
        }
        return false;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof k)) {
            return false;
        }
        k k2 = (k)object;
        return this.h.equals(k2.h);
    }

    public int hashCode() {
        return 89 + this.h.hashCode();
    }

    public String toString() {
        return this.h.toString();
    }

    static {
        f.put(null, a);
        f.put("", a);
        f.put("a-zA-Z", b);
        f.put("A-Za-z", b);
        f.put("a-z", c);
        f.put("A-Z", d);
        f.put("0-9", e);
    }
}

