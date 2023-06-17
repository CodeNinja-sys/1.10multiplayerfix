/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.lmax.disruptor.EventTranslator
 */
package org.apache.logging.log4j.core.b;

import com.lmax.disruptor.EventTranslator;
import org.apache.logging.log4j.core.b.f;
import org.apache.logging.log4j.core.b.i;

class h
implements EventTranslator {
    final /* synthetic */ f a;

    h(f f2) {
        this.a = f2;
    }

    public void a(i i2, long l2) {
        i.a(i2, (org.apache.logging.log4j.core.h)f.a(this.a).get());
        i.a(i2, f.b(this.a));
    }
}

