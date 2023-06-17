/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.a.i;
import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.util.c.ad;

final class d
implements i {
    private final Class a;

    d(Class class_) {
        this.a = class_;
    }

    @Override
    public an a() {
        try {
            return (an)this.a.newInstance();
        }
        catch (Throwable throwable) {
            throw new ar("Unable to create Channel from class " + this.a, throwable);
        }
    }

    public String toString() {
        return ad.a(this.a) + ".class";
    }
}

