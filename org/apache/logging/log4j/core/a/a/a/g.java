/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.a.a;

import org.apache.logging.log4j.core.a.a.a.a;
import org.apache.logging.log4j.core.a.a.a.b;
import org.apache.logging.log4j.core.a.a.a.h;
import org.apache.logging.log4j.core.d;

public final class g
extends org.apache.logging.log4j.core.a.a.a {
    private final String a = this.a() + "{ manager=" + this.h() + " }";

    private g(String string, d d2, boolean bl2, h h2) {
        super(string, d2, bl2, h2);
    }

    @Override
    public String toString() {
        return this.a;
    }

    public static g a(String string, String string2, d d2, b b2, String string3, String string4, a[] arra) {
        int n2 = org.apache.logging.log4j.core.a.a.a(string3, 0);
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string2, true);
        StringBuilder stringBuilder = new StringBuilder("jdbcManager{ description=").append(string).append(", bufferSize=").append(n2).append(", connectionSource=").append(((Object)b2).toString()).append(", tableName=").append(string4).append(", columns=[ ");
        int n3 = 0;
        for (a a2 : arra) {
            if (n3++ > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(a2.toString());
        }
        stringBuilder.append(" ] }");
        h h2 = org.apache.logging.log4j.core.a.a.a.h.a(stringBuilder.toString(), n2, b2, string4, arra);
        if (h2 == null) {
            return null;
        }
        return new g(string, d2, bl2, h2);
    }
}

