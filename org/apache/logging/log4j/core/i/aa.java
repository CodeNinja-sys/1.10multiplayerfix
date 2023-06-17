/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.d.k;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class aa
extends ac {
    private static final aa b = new aa();
    private final String c = k.e;

    private aa() {
        super("Line Sep", "lineSep");
    }

    public static aa a(String[] arrstring) {
        return b;
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        stringBuilder.append(this.c);
    }
}

