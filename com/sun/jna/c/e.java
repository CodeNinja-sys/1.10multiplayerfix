/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.c;

import com.sun.jna.aq;
import com.sun.jna.r;
import java.lang.reflect.Method;

public class e
implements r {
    public static final r a = new e(true);
    public static final r b = new e(false);
    private final String c;

    protected e(boolean bl2) {
        this.c = bl2 ? "W" : "A";
    }

    public String a(aq aq2, Method method) {
        String string = method.getName();
        if (!string.endsWith("W") && !string.endsWith("A")) {
            try {
                string = aq2.a(string + this.c, 1).a();
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                // empty catch block
            }
        }
        return string;
    }
}

