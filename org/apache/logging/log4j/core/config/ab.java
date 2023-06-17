/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import org.apache.logging.log4j.d;

public final class ab {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final String b;
    private final String c;

    private ab(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public static ab a(String string, String string2) {
        if (string == null) {
            a.b("Property key cannot be null");
        }
        return new ab(string, string2);
    }

    public String toString() {
        return this.b + "=" + this.c;
    }
}

