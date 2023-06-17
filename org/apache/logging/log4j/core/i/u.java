/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class u
extends ac {
    private static final u b = new u();

    private u() {
        super("Full Location", "fullLocation");
    }

    public static u a(String[] arrstring) {
        return b;
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        StackTraceElement stackTraceElement = h2.c();
        if (stackTraceElement != null) {
            stringBuilder.append(stackTraceElement.toString());
        }
    }
}

