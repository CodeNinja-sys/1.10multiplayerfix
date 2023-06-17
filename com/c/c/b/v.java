/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.z;
import com.c.c.e.a;

public class v {
    public String a;
    public long b;
    public long c;

    public static v a(z z2) {
        v v2 = new v();
        try {
            v2.a = com.c.c.e.a.a("profileUuid", z2, null);
            v2.b = com.c.c.e.a.a("joinTime", z2, Long.MIN_VALUE);
            v2.c = com.c.c.e.a.a("leaveTime", z2, Long.MIN_VALUE);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return v2;
    }
}

