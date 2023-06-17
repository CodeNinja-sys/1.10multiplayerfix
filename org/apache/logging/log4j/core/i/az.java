/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public final class az
extends ac {
    private static final AtomicLong b = new AtomicLong();
    private static final az c = new az();

    private az() {
        super("Sequence Number", "sn");
    }

    public static az a(String[] arrstring) {
        return c;
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        stringBuilder.append(Long.toString(b.incrementAndGet()));
    }
}

