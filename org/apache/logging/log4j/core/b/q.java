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
import org.apache.logging.log4j.core.b.n;

public class q
implements SequenceReportingEventHandler {
    private static final int a = 50;
    private Sequence b;
    private int c;

    public void a(Sequence sequence) {
        this.b = sequence;
    }

    public void a(n n2, long l2, boolean bl2) {
        n2.c(bl2);
        n2.n();
        if (++this.c > 50) {
            this.b.set(l2);
            this.c = 0;
        }
    }
}

