/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.l.m;
import java.util.Comparator;
import net.minecraft.client.g.g;

class as
implements Comparator {
    final /* synthetic */ g a;
    private final /* synthetic */ float[] b;

    as(g g2, float[] arrf) {
        this.a = g2;
        this.b = arrf;
    }

    public int a(Integer n2, Integer n3) {
        return m.a(this.b[n3], this.b[n2]);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((Integer)object, (Integer)object2);
    }
}

