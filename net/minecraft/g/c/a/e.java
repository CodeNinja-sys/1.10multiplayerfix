/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c.a;

import com.a.a.b.cm;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;

public class e
implements cm {
    private final h a;

    private e(h h2) {
        this.a = h2;
    }

    public static e a(h h2) {
        return new e(h2);
    }

    public boolean a(b b2) {
        return b2 != null && b2.d() == this.a;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((b)object);
    }
}

