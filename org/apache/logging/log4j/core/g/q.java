/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.apache.logging.log4j.core.g.p;

class q
extends ObjectOutputStream {
    final /* synthetic */ p a;

    public q(p p2, OutputStream outputStream) {
        this.a = p2;
        super(outputStream);
    }

    @Override
    protected void writeStreamHeader() {
    }
}

