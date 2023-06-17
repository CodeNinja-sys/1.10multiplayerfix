/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import org.apache.logging.log4j.d;

public final class b {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final String b;
    private final org.apache.logging.log4j.b c;
    private final org.apache.logging.log4j.core.d d;

    private b(String string, org.apache.logging.log4j.b b2, org.apache.logging.log4j.core.d d2) {
        this.b = string;
        this.c = b2;
        this.d = d2;
    }

    public String a() {
        return this.b;
    }

    public org.apache.logging.log4j.b b() {
        return this.c;
    }

    public org.apache.logging.log4j.core.d c() {
        return this.d;
    }

    public String toString() {
        return this.b;
    }

    public static b a(String string, String string2, org.apache.logging.log4j.core.d d2) {
        if (string == null) {
            a.b("Appender references must contain a reference");
            return null;
        }
        org.apache.logging.log4j.b b2 = null;
        if (string2 != null && (b2 = org.apache.logging.log4j.b.a(string2, null)) == null) {
            a.b("Invalid level " + string2 + " on Appender reference " + string);
        }
        return new b(string, b2, d2);
    }
}

