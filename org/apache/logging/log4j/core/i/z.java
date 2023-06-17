/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class z
extends ac {
    private static final z b = new z();

    private z() {
        super("Line", "line");
    }

    public static z a(String[] arrstring) {
        return b;
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        StackTraceElement stackTraceElement = h2.c();
        if (stackTraceElement != null) {
            stringBuilder.append(stackTraceElement.getLineNumber());
        }
    }
}

