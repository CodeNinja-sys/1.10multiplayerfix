/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.c.a.c.g;
import net.minecraft.client.f.f;
import net.minecraft.client.l.r;
import net.minecraft.u.bp;

class h
implements f {
    final /* synthetic */ r a;
    private static /* synthetic */ int[] b;

    h(r r2) {
        this.a = r2;
    }

    @Override
    public void a(com.c.a.c.h h2, bp bp2, g g2) {
        switch (h.a()[h2.ordinal()]) {
            case 1: {
                this.a.a.put(com.c.a.c.h.a, bp2);
                r.a(this.a, g2.a("model"));
                if (r.a(this.a) != null) break;
                r.a(this.a, "default");
                break;
            }
            case 2: {
                this.a.a.put(com.c.a.c.h.b, bp2);
                break;
            }
            case 3: {
                this.a.a.put(com.c.a.c.h.c, bp2);
            }
        }
    }

    static /* synthetic */ int[] a() {
        if (b != null) {
            return b;
        }
        int[] arrn = new int[com.c.a.c.h.values().length];
        try {
            arrn[com.c.a.c.h.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[com.c.a.c.h.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[com.c.a.c.h.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = arrn;
        return arrn;
    }
}

