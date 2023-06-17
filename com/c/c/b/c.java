/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.w;
import com.a.b.z;
import java.util.HashSet;
import java.util.Set;

public class c {
    public Set a = new HashSet();

    public static c a(String string) {
        c c2 = new c();
        ab ab2 = new ab();
        try {
            w w2 = ab2.a(string);
            z z2 = w2.t();
            w w3 = z2.c("ops");
            if (w3.p()) {
                for (w w4 : w3.u()) {
                    c2.a.add(w4.d());
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return c2;
    }
}

