/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.c;

import net.minecraft.c.a;
import net.minecraft.c.c.c;
import net.minecraft.c.c.g;
import net.minecraft.u.d.k;
import net.minecraft.x.ak;
import net.minecraft.x.q;

public class b
implements net.minecraft.x.b.a {
    private final a a;
    private final ak b;
    private static /* synthetic */ int[] c;

    public b(a a2, ak ak2) {
        this.a = a2;
        this.b = ak2;
    }

    @Override
    public void a(net.minecraft.x.b.a.a a2) {
        switch (net.minecraft.c.c.b.a()[a2.a().ordinal()]) {
            case 4: {
                this.b.a(q.d);
                if (a2.b() > 210) {
                    k k2 = new k("Outdated server! I'm still on 1.10 Multiplayer Fix");
                    this.b.a(new net.minecraft.x.e.b.a(k2));
                    this.b.a(k2);
                    break;
                }
                if (a2.b() < 210) {
                    k k3 = new k("Outdated client! Please use 1.10 Multiplayer Fix");
                    this.b.a(new net.minecraft.x.e.b.a(k3));
                    this.b.a(k3);
                    break;
                }
                this.b.a(new c(this.a, this.b));
                break;
            }
            case 3: {
                this.b.a(q.c);
                this.b.a(new g(this.a, this.b));
                break;
            }
            default: {
                throw new UnsupportedOperationException("Invalid intention " + (Object)((Object)a2.a()));
            }
        }
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
    }

    static /* synthetic */ int[] a() {
        if (c != null) {
            return c;
        }
        int[] arrn = new int[q.values().length];
        try {
            arrn[q.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[q.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[q.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[q.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        c = arrn;
        return arrn;
    }
}

