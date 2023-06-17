/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class aj
extends ac {
    private static final aj b = new aj();

    private aj() {
        super("NDC", "ndc");
    }

    public static aj a(String[] arrstring) {
        return b;
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        stringBuilder.append(h2.j());
    }
}

