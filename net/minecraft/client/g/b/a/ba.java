/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.b.cm;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.a.l;
import net.minecraft.u.bp;

class ba
implements cm {
    final /* synthetic */ l a;
    private final /* synthetic */ bp b;

    ba(l l2, bp bp2) {
        this.a = l2;
        this.b = bp2;
    }

    public boolean a(ag ag2) {
        return this.b.equals(ag2);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((ag)object);
    }
}

