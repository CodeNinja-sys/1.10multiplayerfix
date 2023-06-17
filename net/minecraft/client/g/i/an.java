/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.ap;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;
import net.minecraft.w.h.am;

public class an
extends n {
    private static final bp a = new bp("textures/entity/rabbit/brown.png");
    private static final bp b = new bp("textures/entity/rabbit/white.png");
    private static final bp k = new bp("textures/entity/rabbit/black.png");
    private static final bp l = new bp("textures/entity/rabbit/gold.png");
    private static final bp m = new bp("textures/entity/rabbit/salt.png");
    private static final bp n = new bp("textures/entity/rabbit/white_splotched.png");
    private static final bp o = new bp("textures/entity/rabbit/toast.png");
    private static final bp p = new bp("textures/entity/rabbit/caerbannog.png");

    public an(f f2, ap ap2, float f3) {
        super(f2, ap2, f3);
    }

    protected bp a(am am2) {
        String string = net.minecraft.u.d.o.a(am2.X());
        if (string != null && "Toast".equals(string)) {
            return o;
        }
        switch (am2.r()) {
            default: {
                return a;
            }
            case 1: {
                return b;
            }
            case 2: {
                return k;
            }
            case 3: {
                return n;
            }
            case 4: {
                return l;
            }
            case 5: {
                return m;
            }
            case 99: 
        }
        return p;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((am)n2);
    }
}

