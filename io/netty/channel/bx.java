/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import java.util.LinkedHashSet;
import java.util.Set;

public final class bx
implements aw {
    private final bw a;
    private Set b;

    public bx(bw bw2) {
        if (bw2 == null) {
            throw new NullPointerException("aggregatePromise");
        }
        this.a = bw2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public bx a(bw ... arrbw) {
        if (arrbw == null) {
            throw new NullPointerException("promises");
        }
        if (arrbw.length == 0) {
            return this;
        }
        bx bx2 = this;
        synchronized (bx2) {
            if (this.b == null) {
                int n2 = arrbw.length > 1 ? arrbw.length : 2;
                this.b = new LinkedHashSet(n2);
            }
            for (bw bw2 : arrbw) {
                if (bw2 == null) continue;
                this.b.add(bw2);
                bw2.g((ad)this);
            }
        }
        return this;
    }

    public synchronized void a(av av2) {
        if (this.b == null) {
            this.a.b();
        } else {
            this.b.remove(av2);
            if (!av2.bo_()) {
                this.a.a(av2.bq_());
                for (bw bw2 : this.b) {
                    bw2.a(av2.bq_());
                }
            } else if (this.b.isEmpty()) {
                this.a.b();
            }
        }
    }
}

