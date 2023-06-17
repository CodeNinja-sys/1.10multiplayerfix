/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.c.a.r;
import io.netty.c.a.s;
import io.netty.c.a.t;
import io.netty.c.a.u;
import io.netty.channel.aq;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.c.aj;
import java.util.List;

public abstract class q
extends aq {
    private final u a = new r(this);
    private final t b = new s(this);
    private final aj c;
    private final aj d;

    protected q() {
        this.c = aj.a(this, q.class, "INBOUND_IN");
        this.d = aj.a(this, q.class, "OUTBOUND_IN");
    }

    protected q(Class class_, Class class_2) {
        this.c = aj.a(class_);
        this.d = aj.a(class_2);
    }

    @Override
    public void a_(bd bd2, Object object) {
        this.b.a_(bd2, object);
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        this.a.a(bd2, object, bw2);
    }

    public boolean a(Object object) {
        return this.c.a(object);
    }

    public boolean b(Object object) {
        return this.d.a(object);
    }

    protected abstract void a(bd var1, Object var2, List var3);

    protected abstract void b(bd var1, Object var2, List var3);
}

