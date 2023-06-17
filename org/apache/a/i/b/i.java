/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.b.o;
import org.apache.a.o.a;

public class i
implements org.apache.a.c.i {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    public void a(org.apache.a.b.i i2, o o2) {
        org.apache.a.o.a.a(i2, "Authentication scope");
        this.a.put(i2, o2);
    }

    private static o a(Map map, org.apache.a.b.i i2) {
        o o2 = (o)map.get(i2);
        if (o2 == null) {
            int n2 = -1;
            org.apache.a.b.i i3 = null;
            for (org.apache.a.b.i i4 : map.keySet()) {
                int n3 = i2.a(i4);
                if (n3 <= n2) continue;
                n2 = n3;
                i3 = i4;
            }
            if (i3 != null) {
                o2 = (o)map.get(i3);
            }
        }
        return o2;
    }

    public o a(org.apache.a.b.i i2) {
        org.apache.a.o.a.a(i2, "Authentication scope");
        return i.a(this.a, i2);
    }

    public void a() {
        this.a.clear();
    }

    public String toString() {
        return this.a.toString();
    }
}

