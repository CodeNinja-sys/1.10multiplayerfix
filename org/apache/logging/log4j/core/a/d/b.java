/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.d;

import org.apache.logging.log4j.core.a.d.a;
import org.apache.logging.log4j.d;

public final class b {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final String b;
    private final a[] c;

    private b(String string, a ... arra) {
        this.b = string;
        this.c = arra;
    }

    public String a() {
        return this.b;
    }

    public a[] b() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        boolean bl2 = true;
        for (a a2 : this.c) {
            if (!bl2) {
                stringBuilder.append(",");
            }
            bl2 = false;
            stringBuilder.append(a2.toString());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static b a(String string, a ... arra) {
        if (string == null) {
            a.b("A pattern is required");
            return null;
        }
        if (arra == null || arra.length == 0) {
            a.b("No routes configured");
            return null;
        }
        return new b(string, arra);
    }
}

