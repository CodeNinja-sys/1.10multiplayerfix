/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import org.apache.a.c.f.f;
import org.apache.a.c.f.g;
import org.apache.a.c.f.i;

public class h {
    private static final f a;

    public static String a(String string) {
        return a.a(string);
    }

    static {
        f f2;
        try {
            f2 = new g();
        }
        catch (Exception exception) {
            f2 = new i();
        }
        a = f2;
    }
}

