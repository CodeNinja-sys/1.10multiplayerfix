/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.g.cn;
import net.minecraft.k.p;

class j
implements p {
    private final /* synthetic */ int a;
    private final /* synthetic */ cn b;

    j(int n2, cn cn2) {
        this.a = n2;
        this.b = cn2;
    }

    public String a() {
        try {
            return String.format("ID #%d (%s // %s)", this.a, this.b.p(), this.b.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + this.a;
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

