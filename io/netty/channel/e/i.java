/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.e;

import io.netty.channel.do;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class i
extends do {
    public i() {
        this(0);
    }

    public i(int n2) {
        this(n2, Executors.defaultThreadFactory());
    }

    public i(int n2, ThreadFactory threadFactory) {
        super(n2, threadFactory, new Object[0]);
    }
}

