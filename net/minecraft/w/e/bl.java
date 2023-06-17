/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import com.a.a.b.cm;
import net.minecraft.w.e.aw;
import net.minecraft.w.e.bi;
import net.minecraft.w.e.bj;
import net.minecraft.w.f;

class bl
implements cm {
    final /* synthetic */ bj a;

    bl(bj bj2) {
        this.a = bj2;
    }

    public boolean a(f f2) {
        return f2 != null && aw.bz_.a(f2) && !(f2 instanceof bi);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((f)object);
    }
}

