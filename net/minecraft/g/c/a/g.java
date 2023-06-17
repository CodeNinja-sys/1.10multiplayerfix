/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c.a;

import com.a.a.c.ab;
import net.minecraft.g.c.a;
import net.minecraft.q.k;
import net.minecraft.u.b.b;

class g
extends ab {
    private final k a;
    private final boolean b;

    public g(k k2, boolean bl2) {
        this.a = k2;
        this.b = bl2;
    }

    public a a(b b2) {
        return new a(this.a, b2, this.b);
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((b)object);
    }
}

