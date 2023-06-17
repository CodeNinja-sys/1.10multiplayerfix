/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.c;

import org.apache.logging.log4j.core.a.a.c.c;
import org.apache.logging.log4j.core.a.a.c.h;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;

public final class a
extends org.apache.logging.log4j.core.a.a.a {
    private final String a = this.a() + "{ manager=" + this.h() + " }";

    private a(String string, d d2, boolean bl2, c c2) {
        super(string, d2, bl2, c2);
    }

    @Override
    public String toString() {
        return this.a;
    }

    public static a a(String string, String string2, d d2, String string3, h h2) {
        if (h2 == null) {
            h.b("NoSQL provider not specified for appender [{}].", string);
            return null;
        }
        int n2 = org.apache.logging.log4j.core.a.a.a(string3, 0);
        boolean bl2 = b.a(string2, true);
        String string4 = "noSqlManager{ description=" + string + ", bufferSize=" + n2 + ", provider=" + h2 + " }";
        c c2 = c.a(string4, n2, h2);
        if (c2 == null) {
            return null;
        }
        return new a(string, d2, bl2, c2);
    }
}

