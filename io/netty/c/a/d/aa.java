/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.av;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bn;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.y;
import io.netty.c.a.v;
import io.netty.channel.bd;
import java.util.List;

final class aa
extends bn {
    final /* synthetic */ y c;

    aa(y y2, int n2, int n3, int n4, boolean bl2) {
        this.c = y2;
        super(n2, n3, n4, bl2);
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        if (y.a(this.c)) {
            int n2 = this.b();
            if (n2 == 0) {
                return;
            }
            list.add(g2.y(n2));
        } else {
            int n3 = list.size();
            super.a(bd2, g2, list);
            if (y.c(this.c)) {
                int n4 = list.size();
                for (int i2 = n3; i2 < n4; ++i2) {
                    this.c(list.get(i2));
                }
            }
        }
    }

    private void c(Object object) {
        if (object == null) {
            return;
        }
        if (object instanceof bs) {
            y.d(this.c).decrementAndGet();
        }
    }

    @Override
    protected boolean a(av av2) {
        int n2 = ((bm)av2).s().a();
        if (n2 == 100) {
            return true;
        }
        aw aw2 = (aw)y.b(this.c).poll();
        char c2 = aw2.a().charAt(0);
        switch (c2) {
            case 'H': {
                if (!aw.c.equals(aw2)) break;
                return true;
            }
            case 'C': {
                if (n2 != 200 || !aw.i.equals(aw2)) break;
                y.a(this.c, true);
                y.b(this.c).clear();
                return true;
            }
        }
        return super.a(av2);
    }

    @Override
    public void b(bd bd2) {
        long l2;
        super.b(bd2);
        if (y.c(this.c) && (l2 = y.d(this.c).get()) > 0L) {
            bd2.a(new v("channel gone inactive with " + l2 + " missing response(s)"));
        }
    }
}

