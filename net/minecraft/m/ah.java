/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.cn;
import net.minecraft.m.ar;
import net.minecraft.m.cu;

public class ah
extends ar {
    private String[] b;

    public ah(cn cn2, boolean bl2) {
        super(cn2);
        if (bl2) {
            this.e(0);
            this.a(true);
        }
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    public ah a(String[] arrstring) {
        this.b = arrstring;
        return this;
    }

    @Override
    public String d(cu cu2) {
        if (this.b == null) {
            return super.d(cu2);
        }
        int n2 = cu2.h();
        return n2 >= 0 && n2 < this.b.length ? String.valueOf(super.d(cu2)) + "." + this.b[n2] : super.d(cu2);
    }
}

