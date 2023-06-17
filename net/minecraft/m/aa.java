/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.b.bl;
import net.minecraft.m.cu;

class aa
implements bl {
    private final /* synthetic */ String[] a;

    aa(String[] arrstring) {
        this.a = arrstring;
    }

    public String a(cu cu2) {
        int n2 = cu2.h();
        if (n2 < 0 || n2 >= this.a.length) {
            n2 = 0;
        }
        return this.a[n2];
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((cu)object);
    }
}

