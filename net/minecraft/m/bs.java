/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.b.bl;
import net.minecraft.m.cu;

class bs
implements bl {
    bs() {
    }

    public String a(cu cu2) {
        return (cu2.h() & 1) == 1 ? "wet" : "dry";
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((cu)object);
    }
}

