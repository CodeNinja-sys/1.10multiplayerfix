/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.bw;

public final class by
implements aw {
    private final bw[] a;

    public by(bw ... arrbw) {
        if (arrbw == null) {
            throw new NullPointerException("promises");
        }
        for (bw bw2 : arrbw) {
            if (bw2 != null) continue;
            throw new IllegalArgumentException("promises contains null ChannelPromise");
        }
        this.a = (bw[])arrbw.clone();
    }

    public void a(av av2) {
        if (av2.bo_()) {
            for (bw bw2 : this.a) {
                bw2.b();
            }
            return;
        }
        Throwable throwable = av2.bq_();
        for (bw bw3 : this.a) {
            bw3.a(throwable);
        }
    }
}

