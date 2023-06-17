/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.bk;
import io.netty.c.a.d.bo;
import io.netty.channel.bz;

public final class bq
extends bz {
    public bq() {
        this(4096, 8192, 8192);
    }

    public bq(int n2, int n3, int n4) {
        super(new bk(n2, n3, n4), new bo());
    }

    public bq(int n2, int n3, int n4, boolean bl2) {
        super(new bk(n2, n3, n4, bl2), new bo());
    }
}

