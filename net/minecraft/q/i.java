/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.g.cn;
import net.minecraft.k.p;
import net.minecraft.q.k;

class i
implements p {
    final /* synthetic */ k a;
    private final /* synthetic */ cn b;

    i(k k2, cn cn2) {
        this.a = k2;
        this.b = cn2;
    }

    public String a() {
        try {
            return String.format("ID #%d (%s // %s)", cn.c(this.b), this.b.p(), this.b.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + cn.c(this.b);
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

