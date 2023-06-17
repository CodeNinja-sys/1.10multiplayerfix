/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.b;

import io.netty.c.a.d.b.ac;
import io.netty.c.a.d.b.af;
import io.netty.c.a.d.b.ag;
import io.netty.c.a.d.b.ah;
import io.netty.c.a.d.b.ai;
import io.netty.c.a.d.b.d;
import io.netty.c.a.d.b.g;
import io.netty.c.a.d.b.h;
import io.netty.c.a.d.b.i;
import io.netty.c.a.d.b.j;
import io.netty.c.a.d.b.k;
import io.netty.c.a.d.bj;
import io.netty.util.c.u;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class f
implements k {
    public static final long a = 16384L;
    private final boolean b;
    private final boolean c;
    private long d;
    private final Map e = u.m();

    public f() {
        this.b = false;
        this.c = true;
        this.d = 16384L;
    }

    public f(boolean bl2) {
        this.b = bl2;
        this.c = false;
    }

    public f(long l2) {
        this.b = false;
        this.c = true;
        this.d = l2;
    }

    private List b(bj bj2) {
        ArrayList arrayList = (ArrayList)this.e.get(bj2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.e.put(bj2, arrayList);
        }
        return arrayList;
    }

    @Override
    public d a(bj bj2, String string) {
        if (this.b) {
            g g2 = new g(string);
            List list = this.b(bj2);
            list.add(g2);
            return g2;
        }
        if (this.c) {
            ah ah2 = new ah(string, this.d);
            List list = this.b(bj2);
            list.add(ah2);
            return ah2;
        }
        return new af(string);
    }

    @Override
    public d a(bj bj2, String string, String string2) {
        if (this.b) {
            d d2;
            try {
                d2 = new g(string, string2);
            }
            catch (IOException iOException) {
                d2 = new ah(string, string2, this.d);
            }
            List list = this.b(bj2);
            list.add(d2);
            return d2;
        }
        if (this.c) {
            ah ah2 = new ah(string, string2, this.d);
            List list = this.b(bj2);
            list.add(ah2);
            return ah2;
        }
        try {
            return new af(string, string2);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(iOException);
        }
    }

    @Override
    public i a(bj bj2, String string, String string2, String string3, String string4, Charset charset, long l2) {
        if (this.b) {
            h h2 = new h(string, string2, string3, string4, charset, l2);
            List list = this.b(bj2);
            list.add(h2);
            return h2;
        }
        if (this.c) {
            ai ai2 = new ai(string, string2, string3, string4, charset, l2, this.d);
            List list = this.b(bj2);
            list.add(ai2);
            return ai2;
        }
        return new ag(string, string2, string3, string4, charset, l2);
    }

    @Override
    public void a(bj bj2, ac ac2) {
        if (ac2 instanceof j) {
            List list = this.b(bj2);
            list.remove(ac2);
        }
    }

    @Override
    public void a(bj bj2) {
        List list = (List)this.e.remove(bj2);
        if (list != null) {
            for (j j2 : list) {
                j2.j();
            }
            list.clear();
        }
    }

    @Override
    public void a() {
        Iterator iterator = this.e.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            iterator.remove();
            List list = (List)entry.getValue();
            if (list == null) continue;
            for (j j2 : list) {
                j2.j();
            }
            list.clear();
        }
    }
}

