/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.cm;
import com.a.a.l.m;
import net.minecraft.client.k.cq;

class cg
implements cm {
    final /* synthetic */ cq a;

    cg(cq cq2) {
        this.a = cq2;
    }

    public boolean a(String string) {
        Float f2 = m.a(string);
        return string.isEmpty() || f2 != null && m.b(f2.floatValue()) && f2.floatValue() >= 0.0f;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((String)object);
    }
}

