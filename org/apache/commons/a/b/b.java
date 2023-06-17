/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.b;

import org.apache.commons.a.b.d;
import org.apache.commons.a.b.f;
import org.apache.commons.a.b.g;

public class b {
    public static String a(byte[] arrby) {
        return b.a(arrby, null);
    }

    public static String a(byte[] arrby, String string) {
        if (string == null) {
            return f.b(arrby);
        }
        if (string.startsWith("$6$")) {
            return f.b(arrby, string);
        }
        if (string.startsWith("$5$")) {
            return f.a(arrby, string);
        }
        if (string.startsWith("$1$")) {
            return d.b(arrby, string);
        }
        return g.a(arrby, string);
    }

    public static String a(String string) {
        return b.a(string, null);
    }

    public static String a(String string, String string2) {
        return b.a(string.getBytes(org.apache.commons.a.d.f), string2);
    }
}

