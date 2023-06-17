/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import com.a.a.b.cm;
import net.minecraft.f.ab;
import net.minecraft.f.r;

class v
implements cm {
    final /* synthetic */ ab a;

    v(ab ab2) {
        this.a = ab2;
    }

    public boolean a(ab ab2) {
        return ab.a(ab2) == r.c && ab.b(this.a).equals(ab.b(ab2));
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((ab)object);
    }
}

