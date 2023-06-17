/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.b.bl;
import net.minecraft.g.cn;
import net.minecraft.m.aa;
import net.minecraft.m.ar;
import net.minecraft.m.cu;

public class da
extends ar {
    protected final cn b;
    protected final bl c;

    public da(cn cn2, cn cn3, bl bl2) {
        super(cn2);
        this.b = cn3;
        this.c = bl2;
        this.e(0);
        this.a(true);
    }

    public da(cn cn2, cn cn3, String[] arrstring) {
        this(cn2, cn3, new aa(arrstring));
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String d(cu cu2) {
        return String.valueOf(super.cw_()) + "." + (String)this.c.a(cu2);
    }
}

