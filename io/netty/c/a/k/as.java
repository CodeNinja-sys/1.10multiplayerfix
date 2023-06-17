/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.d.av;
import io.netty.c.a.k.aq;
import io.netty.c.a.k.ay;
import io.netty.c.a.q;
import io.netty.channel.bd;
import io.netty.util.x;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class as
extends q {
    private static final Integer a = -1;
    private final Queue b = new LinkedList();

    @Override
    public boolean a(Object object) {
        return object instanceof av || object instanceof ay;
    }

    protected void a(bd bd2, av av2, List list) {
        Integer n2 = (Integer)this.b.poll();
        if (n2 != null && n2.intValue() != a.intValue() && !av2.q().d("X-SPDY-Stream-ID")) {
            aq.a(av2, n2);
        }
        list.add(x.a(av2));
    }

    @Override
    protected void b(bd bd2, Object object, List list) {
        if (object instanceof av) {
            boolean bl2 = ((av)object).q().d("X-SPDY-Stream-ID");
            if (!bl2) {
                this.b.add(a);
            } else {
                this.b.add(aq.b((av)object));
            }
        } else if (object instanceof ay) {
            this.b.remove(((ay)object).h());
        }
        list.add(x.a(object));
    }
}

