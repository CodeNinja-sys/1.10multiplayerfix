/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.channel.cp;
import io.netty.channel.cv;
import io.netty.channel.cz;

final class cq
implements cz {
    private final int a;

    private cq(int n2) {
        this.a = n2;
    }

    @Override
    public int a(Object object) {
        if (object instanceof g) {
            return ((g)object).r();
        }
        if (object instanceof i) {
            return ((i)object).a().r();
        }
        if (object instanceof cv) {
            return 0;
        }
        return this.a;
    }

    /* synthetic */ cq(int n2, cp cp2) {
        this(n2);
    }
}

