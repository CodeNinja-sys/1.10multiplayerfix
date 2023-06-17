/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import java.util.Comparator;
import net.minecraft.m.a.g;
import net.minecraft.m.a.p;
import net.minecraft.m.a.s;
import net.minecraft.m.a.u;

class m
implements Comparator {
    final /* synthetic */ g a;

    m(g g2) {
        this.a = g2;
    }

    public int a(u u2, u u3) {
        return u2 instanceof s && u3 instanceof p ? 1 : (u3 instanceof s && u2 instanceof p ? -1 : (u3.a() < u2.a() ? -1 : (u3.a() > u2.a() ? 1 : 0)));
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((u)object, (u)object2);
    }
}

