/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.util.c.aj;
import io.netty.util.x;

public abstract class di
extends bf {
    private final aj a;
    private final boolean b;

    protected di() {
        this(true);
    }

    protected di(boolean bl2) {
        this.a = aj.a(this, di.class, "I");
        this.b = bl2;
    }

    protected di(Class class_) {
        this(class_, true);
    }

    protected di(Class class_, boolean bl2) {
        this.a = aj.a(class_);
        this.b = bl2;
    }

    public boolean a(Object object) {
        return this.a.a(object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a_(bd bd2, Object object) {
        boolean bl2 = true;
        try {
            if (this.a(object)) {
                Object object2 = object;
                this.a(bd2, object2);
            } else {
                bl2 = false;
                bd2.b(object);
            }
        }
        finally {
            if (this.b && bl2) {
                x.b(object);
            }
        }
    }

    protected abstract void a(bd var1, Object var2);
}

