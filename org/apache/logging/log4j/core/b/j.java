/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.lmax.disruptor.Sequence
 *  com.lmax.disruptor.SequenceReportingEventHandler
 */
package org.apache.logging.log4j.core.b;

import com.lmax.disruptor.Sequence;
import com.lmax.disruptor.SequenceReportingEventHandler;
import org.apache.logging.log4j.core.b.g;
import org.apache.logging.log4j.core.b.i;

class j
implements SequenceReportingEventHandler {
    private static final int a = 50;
    private Sequence b;
    private int c;

    private j() {
    }

    public void a(Sequence sequence) {
        this.b = sequence;
    }

    public void a(i i2, long l2, boolean bl2) {
        i.a(i2).b(bl2);
        i.b(i2).c(i.a(i2));
        i2.a();
        if (++this.c > 50) {
            this.b.set(l2);
            this.c = 0;
        }
    }

    /* synthetic */ j(g g2) {
        this();
    }
}

