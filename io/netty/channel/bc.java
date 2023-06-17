/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.ba;
import io.netty.channel.bb;
import io.netty.channel.bd;
import io.netty.util.c.f;
import java.util.Map;

public abstract class bc
implements ba {
    boolean g;

    public boolean k() {
        Class<?> class_ = this.getClass();
        Map map = f.b().p();
        Boolean bl2 = (Boolean)map.get(class_);
        if (bl2 == null) {
            bl2 = class_.isAnnotationPresent(bb.class);
            map.put(class_, bl2);
        }
        return bl2;
    }

    @Override
    public void e(bd bd2) {
    }

    @Override
    public void f(bd bd2) {
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        bd2.a(throwable);
    }
}

