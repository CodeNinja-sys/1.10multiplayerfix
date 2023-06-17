/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import e.a.p;
import e.a.u;
import net.minecraft.client.c.v;

class o
extends e.a.o {
    final /* synthetic */ v a;

    private o(v v2) {
        this.a = v2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(String string) {
        Object object = p.a;
        synchronized (object) {
            block4: {
                if (this.c != null) break block4;
                return false;
            }
            u u2 = (u)this.c.m().get(string);
            return u2 == null ? false : u2.t() || u2.v() || u2.z;
        }
    }

    /* synthetic */ o(v v2, o o2) {
        this(v2);
    }
}

