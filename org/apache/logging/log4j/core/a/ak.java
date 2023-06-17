/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.ai;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.h;
import org.apache.logging.log4j.core.g.r;
import org.apache.logging.log4j.core.net.c;
import org.apache.logging.log4j.core.net.x;

public class ak
extends ai {
    protected static final String b = "RFC5424";

    protected ak(String string, f f2, d d2, boolean bl2, boolean bl3, c c2, org.apache.logging.log4j.core.net.d d3) {
        super(string, f2, d2, c2, bl2, bl3, d3);
    }

    public static ak a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18, String string19, String string20, String string21, String string22, String string23, d d2, org.apache.logging.log4j.core.config.d d3, String string24, String string25, org.apache.logging.log4j.core.g.f[] arrf, String string26) {
        r r2;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string7, true);
        boolean bl3 = org.apache.logging.log4j.core.d.b.a(string8, true);
        int n2 = org.apache.logging.log4j.core.a.a.a(string4, 0);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string5, true);
        int n3 = org.apache.logging.log4j.core.a.a.a(string2, 0);
        boolean bl5 = Boolean.parseBoolean(string26);
        org.apache.logging.log4j.core.g.b b2 = r2 = b.equalsIgnoreCase(string23) ? org.apache.logging.log4j.core.g.h.a(string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string25, "false", arrf, d3) : r.a(string9, string16, string17, string24);
        if (string6 == null) {
            h.b("No name provided for SyslogAppender");
            return null;
        }
        x x2 = (x)org.apache.logging.log4j.e.a.a(x.class, string3);
        c c2 = ak.a(x2, string, n3, n2, bl4, r2);
        if (c2 == null) {
            return null;
        }
        return new ak(string6, (f)r2, d2, bl3, bl2, c2, bl5 ? d3.n() : null);
    }
}

