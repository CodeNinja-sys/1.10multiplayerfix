/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.cm;
import net.minecraft.w.b.y;
import net.minecraft.w.h.ai;

public class bf
extends y {
    private final ai i;

    public bf(ai ai2, Class class_, boolean bl2, cm cm2) {
        super(ai2, class_, 10, bl2, false, cm2);
        this.i = ai2;
    }

    @Override
    public boolean e() {
        return !this.i.z() && super.e();
    }
}

