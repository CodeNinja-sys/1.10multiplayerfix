/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import net.minecraft.w.h;
import net.minecraft.w.n;

class e
implements cm {
    private final /* synthetic */ String a;
    private final /* synthetic */ boolean b;

    e(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    public boolean a(n n2) {
        return h.a(n2, this.a) ^ this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

