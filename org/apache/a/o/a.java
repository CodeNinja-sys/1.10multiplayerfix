/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.util.Collection;
import org.apache.a.o.k;

public class a {
    public static void a(boolean bl2, String string) {
        if (!bl2) {
            throw new IllegalArgumentException(string);
        }
    }

    public static void a(boolean bl2, String string, Object ... arrobject) {
        if (!bl2) {
            throw new IllegalArgumentException(String.format(string, arrobject));
        }
    }

    public static Object a(Object object, String string) {
        if (object == null) {
            throw new IllegalArgumentException(string + " may not be null");
        }
        return object;
    }

    public static CharSequence a(CharSequence charSequence, String string) {
        if (charSequence == null) {
            throw new IllegalArgumentException(string + " may not be null");
        }
        if (k.a(charSequence)) {
            throw new IllegalArgumentException(string + " may not be empty");
        }
        return charSequence;
    }

    public static CharSequence b(CharSequence charSequence, String string) {
        if (charSequence == null) {
            throw new IllegalArgumentException(string + " may not be null");
        }
        if (k.b(charSequence)) {
            throw new IllegalArgumentException(string + " may not be blank");
        }
        return charSequence;
    }

    public static Collection a(Collection collection, String string) {
        if (collection == null) {
            throw new IllegalArgumentException(string + " may not be null");
        }
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(string + " may not be empty");
        }
        return collection;
    }

    public static int a(int n2, String string) {
        if (n2 <= 0) {
            throw new IllegalArgumentException(string + " may not be negative or zero");
        }
        return n2;
    }

    public static long a(long l2, String string) {
        if (l2 <= 0L) {
            throw new IllegalArgumentException(string + " may not be negative or zero");
        }
        return l2;
    }

    public static int b(int n2, String string) {
        if (n2 < 0) {
            throw new IllegalArgumentException(string + " may not be negative");
        }
        return n2;
    }

    public static long b(long l2, String string) {
        if (l2 < 0L) {
            throw new IllegalArgumentException(string + " may not be negative");
        }
        return l2;
    }
}

