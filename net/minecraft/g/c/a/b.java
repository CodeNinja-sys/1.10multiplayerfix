/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c.a;

import com.a.a.b.cm;
import net.minecraft.g.cn;

public class b
implements cm {
    private final cn a;

    private b(cn cn2) {
        this.a = cn2;
    }

    public static b a(cn cn2) {
        return new b(cn2);
    }

    public boolean a(net.minecraft.g.c.b b2) {
        return b2 != null && b2.c() == this.a;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((net.minecraft.g.c.b)object);
    }
}

