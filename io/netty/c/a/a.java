/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.b.g;
import io.netty.c.a.b;
import io.netty.c.a.c;
import io.netty.c.a.d;
import io.netty.c.a.p;
import io.netty.channel.aq;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.c.aj;
import java.util.List;

public abstract class a
extends aq {
    private final aj a;
    private final p b;
    private final d c = new b(this);

    protected a() {
        this(true);
    }

    protected a(Class class_) {
        this(class_, true);
    }

    protected a(boolean bl2) {
        this.a = aj.a(this, a.class, "I");
        this.b = new c(this, bl2);
    }

    protected a(Class class_, boolean bl2) {
        this.a();
        this.a = aj.a(class_);
        this.b = new c(this, bl2);
    }

    private void a() {
        if (this.k()) {
            throw new IllegalStateException("@Sharable annotation is not allowed");
        }
    }

    public boolean a(Object object) {
        return this.a.a(object);
    }

    @Override
    public void a_(bd bd2, Object object) {
        this.c.a_(bd2, object);
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        this.b.a(bd2, object, bw2);
    }

    protected abstract void a(bd var1, Object var2, g var3);

    protected abstract void a(bd var1, g var2, List var3);

    protected void b(bd bd2, g g2, List list) {
        this.a(bd2, g2, list);
    }
}

