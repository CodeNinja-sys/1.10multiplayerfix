/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ap;

public final class ad
extends ap {
    private static final ad b = new ad(null);

    private ad(String[] arrstring) {
        super("Logger", "logger", arrstring);
    }

    public static ad a(String[] arrstring) {
        if (arrstring == null || arrstring.length == 0) {
            return b;
        }
        return new ad(arrstring);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        stringBuilder.append(this.a(h2.b()));
    }
}

