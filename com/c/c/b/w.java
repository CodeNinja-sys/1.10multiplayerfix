/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.t;
import com.a.b.z;
import com.c.c.b.v;
import com.c.c.e.a;
import java.util.ArrayList;
import java.util.List;

public class w {
    public long a;
    public List b = new ArrayList();

    public static w a(String string) {
        w w2 = new w();
        ab ab2 = new ab();
        try {
            com.a.b.w w3 = ab2.a(string);
            z z2 = w3.t();
            w2.a = com.c.c.e.a.a("periodInMillis", z2, -1L);
            com.a.b.w w4 = z2.c("playerActivityDto");
            if (w4 != null && w4.p()) {
                t t2 = w4.u();
                for (com.a.b.w w5 : t2) {
                    v v2 = v.a(w5.t());
                    w2.b.add(v2);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return w2;
    }
}

