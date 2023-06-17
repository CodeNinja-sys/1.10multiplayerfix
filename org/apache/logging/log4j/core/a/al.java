/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.ak;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.h;
import org.apache.logging.log4j.core.g.r;
import org.apache.logging.log4j.core.net.a.c;

public final class al
extends ak {
    protected al(String string, f f2, d d2, boolean bl2, boolean bl3, org.apache.logging.log4j.core.net.c c2, org.apache.logging.log4j.core.net.d d3) {
        super(string, f2, d2, bl2, bl3, c2, d3);
    }

    public static al a(String string, String string2, c c2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, d d2, org.apache.logging.log4j.core.config.d d3, String string23, String string24, org.apache.logging.log4j.core.g.f[] arrf, String string25) {
        r r2;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string6, true);
        boolean bl3 = org.apache.logging.log4j.core.d.b.a(string7, true);
        int n2 = org.apache.logging.log4j.core.a.a.a(string3, 0);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string4, true);
        int n3 = org.apache.logging.log4j.core.a.a.a(string2, 0);
        boolean bl5 = Boolean.parseBoolean(string25);
        org.apache.logging.log4j.core.g.b b2 = r2 = "RFC5424".equalsIgnoreCase(string22) ? org.apache.logging.log4j.core.g.h.a(string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string24, "true", arrf, d3) : r.a(string8, string15, string16, string23);
        if (string5 == null) {
            h.b("No name provided for TLSSyslogAppender");
            return null;
        }
        org.apache.logging.log4j.core.net.c c3 = al.a(c2, string, n3, n2, bl4, (f)r2);
        if (c3 == null) {
            return null;
        }
        return new al(string5, (f)r2, d2, bl3, bl2, c3, bl5 ? d3.n() : null);
    }

    public static org.apache.logging.log4j.core.net.c a(c c2, String string, int n2, int n3, boolean bl2, f f2) {
        return org.apache.logging.log4j.core.net.al.a(c2, string, n2, n3, bl2, f2);
    }
}

