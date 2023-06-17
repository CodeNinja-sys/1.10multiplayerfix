/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.ac;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.dn;
import net.minecraft.g.fn;

class cp
extends g {
    final /* synthetic */ ac a;
    private static /* synthetic */ int[] c;

    cp(ac ac2) {
        this.a = ac2;
    }

    @Override
    protected ag a(b b2) {
        fn fn2 = (fn)((Object)b2.a(dn.a));
        switch (cp.a()[fn2.ordinal()]) {
            default: {
                return new ag("quartz_block", "normal");
            }
            case 2: {
                return new ag("chiseled_quartz_block", "normal");
            }
            case 3: {
                return new ag("quartz_column", "axis=y");
            }
            case 4: {
                return new ag("quartz_column", "axis=x");
            }
            case 5: 
        }
        return new ag("quartz_column", "axis=z");
    }

    static /* synthetic */ int[] a() {
        if (c != null) {
            return c;
        }
        int[] arrn = new int[fn.values().length];
        try {
            arrn[fn.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fn.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fn.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fn.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[fn.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        c = arrn;
        return arrn;
    }
}

