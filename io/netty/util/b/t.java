/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.b;

import io.netty.util.b.ab;
import io.netty.util.b.ad;
import io.netty.util.b.l;
import java.util.ArrayDeque;

final class t
extends ArrayDeque
implements Runnable {
    private static final long b = -687137418080392244L;
    final /* synthetic */ l a;

    t(l l2) {
        this.a = l2;
        super(2);
    }

    @Override
    public void run() {
        if (l.a(this.a) == null) {
            ad ad2;
            while ((ad2 = (ad)this.poll()) != null) {
                l.a((ab)this.a, ad2);
            }
        } else {
            l.a(this.a.bu_(), (Runnable)this);
        }
    }
}

