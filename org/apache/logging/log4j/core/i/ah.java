/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.q;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class ah
extends ac {
    private final String[] b;
    private final d c;

    private ah(d d2, String[] arrstring) {
        super("Message", "message");
        this.b = arrstring;
        this.c = d2;
    }

    public static ah a(d d2, String[] arrstring) {
        return new ah(d2, arrstring);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        m m2 = h2.d();
        if (m2 != null) {
            String string = m2 instanceof q ? ((q)m2).a(this.b) : m2.a();
            if (string != null) {
                stringBuilder.append(this.c != null && string.contains("${") ? this.c.l().a(h2, string) : string);
            } else {
                stringBuilder.append("null");
            }
        }
    }
}

