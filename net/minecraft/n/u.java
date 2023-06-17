/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import net.minecraft.w.n;

class u
implements cm {
    private final /* synthetic */ String a;
    private final /* synthetic */ boolean b;

    u(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    public boolean a(n n2) {
        return n2 == null ? false : ("".equals(this.a) ? n2.cb().isEmpty() ^ this.b : n2.cb().contains(this.a) ^ this.b);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

