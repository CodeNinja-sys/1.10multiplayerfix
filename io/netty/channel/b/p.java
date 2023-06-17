/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.b.b;
import io.netty.channel.b.o;
import io.netty.channel.b.q;
import java.util.ArrayList;
import java.util.Collection;

class p
implements aw {
    static final /* synthetic */ boolean a;
    final /* synthetic */ o b;

    p(o o2) {
        this.b = o2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(av av2) {
        boolean bl2;
        boolean bl3 = av2.bo_();
        Iterable iterable = this.b;
        synchronized (iterable) {
            if (bl3) {
                o.a(this.b);
            } else {
                o.b(this.b);
            }
            boolean bl4 = bl2 = o.c(this.b) + o.d(this.b) == o.e(this.b).size();
            if (!a && o.c(this.b) + o.d(this.b) > o.e(this.b).size()) {
                throw new AssertionError();
            }
        }
        if (bl2) {
            if (o.d(this.b) > 0) {
                iterable = new ArrayList(o.d(this.b));
                for (av av3 : o.e(this.b).values()) {
                    if (av3.bo_()) continue;
                    iterable.add(new q(av3.e(), av3.bq_()));
                }
                o.a(this.b, new b((Collection)iterable));
            } else {
                o.f(this.b);
            }
        }
    }

    static {
        a = !o.class.desiredAssertionStatus();
    }
}

