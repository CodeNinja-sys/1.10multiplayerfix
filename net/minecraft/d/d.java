/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import com.a.a.b.cm;
import net.minecraft.d.a;
import net.minecraft.d.g;
import net.minecraft.m.cu;

class d
implements cm {
    d() {
    }

    public boolean a(cu cu2) {
        for (g g2 : a.b()) {
            if (!g2.a(cu2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((cu)object);
    }
}

