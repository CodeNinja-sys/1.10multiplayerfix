/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.Set;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.a.u;
import net.minecraft.client.g.b.a.l;
import net.minecraft.u.bp;

class ab
implements u {
    final /* synthetic */ l a;
    private final /* synthetic */ Set b;

    ab(l l2, Set set) {
        this.a = l2;
        this.b = set;
    }

    @Override
    public void a(f f2) {
        for (bp bp2 : this.b) {
            d d2 = f2.a(bp2);
            l.a(this.a).put(bp2, d2);
        }
    }
}

