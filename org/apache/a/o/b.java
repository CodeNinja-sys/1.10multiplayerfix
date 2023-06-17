/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import org.apache.a.o.k;

public class b {
    public static void a(boolean bl2, String string) {
        if (!bl2) {
            throw new IllegalStateException(string);
        }
    }

    public static void a(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalStateException(String.format(string, arrobject));
        }
    }

    public static void a(Object object, String string) {
        if (object == null) {
            throw new IllegalStateException(string + " is null");
        }
    }

    public static void a(CharSequence charSequence, String string) {
        if (k.a(charSequence)) {
            throw new IllegalStateException(string + " is empty");
        }
    }

    public static void b(CharSequence charSequence, String string) {
        if (k.b(charSequence)) {
            throw new IllegalStateException(string + " is blank");
        }
    }
}

