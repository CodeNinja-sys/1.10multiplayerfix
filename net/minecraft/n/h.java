/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.cm;
import net.minecraft.j.i;
import net.minecraft.w.l;
import net.minecraft.w.n;

class h
implements cm {
    private final /* synthetic */ String a;
    private final /* synthetic */ boolean b;

    h(String string, boolean bl2) {
        this.a = string;
        this.b = bl2;
    }

    public boolean a(n n2) {
        if (!(n2 instanceof l)) {
            return false;
        }
        l l2 = (l)n2;
        i i2 = l2.aA();
        String string = i2 == null ? "" : i2.a();
        return string.equals(this.a) ^ this.b;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

