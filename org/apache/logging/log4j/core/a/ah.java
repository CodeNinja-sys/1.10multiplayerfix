/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.c.m;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.core.g.c;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.net.y;

public final class ah
extends a {
    private static final int b = 512;
    protected final y a;

    private ah(String string, d d2, f f2, y y2, boolean bl2) {
        super(string, d2, f2, bl2);
        this.a = y2;
    }

    public static ah a(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, f f2, d d2, String string15) {
        y y2;
        int n2;
        if (string == null) {
            h.b("No name provided for SMTPAppender");
            return null;
        }
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string15, true);
        int n3 = org.apache.logging.log4j.core.a.a.a(string10, 0);
        boolean bl3 = Boolean.parseBoolean(string13);
        int n4 = n2 = string14 == null ? 512 : Integer.parseInt(string14);
        if (f2 == null) {
            f2 = c.a(null, null, null, null, null, null);
        }
        if (d2 == null) {
            d2 = m.a(null, null, null);
        }
        if ((y2 = y.a(string2, string3, string4, string5, string6, string7, string8, string9, n3, string11, string12, bl3, d2.toString(), n2)) == null) {
            return null;
        }
        return new ah(string, d2, f2, y2, bl2);
    }

    @Override
    public boolean b(h h2) {
        boolean bl2 = super.b(h2);
        if (bl2) {
            this.a.a(h2);
        }
        return bl2;
    }

    @Override
    public void a(h h2) {
        this.a.a(this.b(), h2);
    }
}

