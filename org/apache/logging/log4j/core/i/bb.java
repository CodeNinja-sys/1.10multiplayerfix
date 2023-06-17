/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class bb
extends ac {
    private static final bb b = new bb();

    private bb() {
        super("Thread", "thread");
    }

    public static bb a(String[] arrstring) {
        return b;
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        stringBuilder.append(h2.f());
    }
}

