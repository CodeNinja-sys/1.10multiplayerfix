/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.i;

import io.netty.c.a.i.c;
import java.util.Map;

class a
implements c {
    private final Map a;
    private final c b;

    a(c c2, Map map) {
        this.b = c2;
        this.a = map;
    }

    @Override
    public Class a(String string) {
        Class class_ = (Class)this.a.get(string);
        if (class_ != null) {
            return class_;
        }
        class_ = this.b.a(string);
        this.a.put(string, class_);
        return class_;
    }
}

