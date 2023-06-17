/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.lang.management.ManagementFactory;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;

public class ax
extends ac {
    private long b = Long.MIN_VALUE;
    private final long c = ManagementFactory.getRuntimeMXBean().getStartTime();
    private String d;

    public ax() {
        super("Time", "time");
    }

    public static ax a(String[] arrstring) {
        return new ax();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        long l2 = h2.g();
        ax ax2 = this;
        synchronized (ax2) {
            if (l2 != this.b) {
                this.b = l2;
                this.d = Long.toString(l2 - this.c);
            }
        }
        stringBuilder.append(this.d);
    }
}

