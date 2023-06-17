/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.a;

import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.d.v;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.d;

public final class a {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private final String b;
    private final g c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;

    private a(String string, g g2, String string2, boolean bl2, boolean bl3, boolean bl4) {
        this.b = string;
        this.c = g2;
        this.d = string2;
        this.e = bl2;
        this.f = bl3;
        this.g = bl4;
    }

    public String a() {
        return this.b;
    }

    public g b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public String toString() {
        return "{ name=" + this.b + ", layout=" + this.c + ", literal=" + this.d + ", timestamp=" + this.e + " }";
    }

    public static a a(org.apache.logging.log4j.core.config.d d2, String string, String string2, String string3, String string4, String string5, String string6) {
        if (v.a(string)) {
            a.b("The column config is not valid because it does not contain a column name.");
            return null;
        }
        boolean bl2 = v.b(string2);
        boolean bl3 = v.b(string3);
        boolean bl4 = Boolean.parseBoolean(string4);
        boolean bl5 = org.apache.logging.log4j.core.d.b.a(string5, true);
        boolean bl6 = Boolean.parseBoolean(string6);
        if (bl2 && bl3 || bl2 && bl4 || bl3 && bl4) {
            a.b("The pattern, literal, and isEventTimestamp attributes are mutually exclusive.");
            return null;
        }
        if (bl4) {
            return new a(string, null, null, true, false, false);
        }
        if (bl3) {
            return new a(string, null, string3, false, false, false);
        }
        if (bl2) {
            return new a(string, org.apache.logging.log4j.core.g.g.a(string2, d2, null, null, "false"), null, false, bl5, bl6);
        }
        a.b("To configure a column you must specify a pattern or literal or set isEventDate to true.");
        return null;
    }
}

