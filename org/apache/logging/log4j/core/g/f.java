/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.a.x;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.d.o;

public final class f {
    private final Map a;
    private final String b;
    private final String c;
    private final boolean d;

    private f(Map map, String string, String string2, boolean bl2) {
        this.b = string;
        this.c = string2;
        this.a = Collections.unmodifiableMap(map);
        this.d = bl2;
    }

    public Map a() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }

    public static f a(o[] arro, String string, String string2, String string3) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (o o2 : arro) {
            hashMap.put(o2.a(), o2.b());
        }
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string3, false);
        return new f(hashMap, string, string2, bl2);
    }

    public x b() {
        if (this.c == null || this.b == null) {
            return null;
        }
        int n2 = Integer.parseInt(this.c);
        return new x(this.b, n2, null, null);
    }

    public boolean c() {
        return this.d;
    }
}

