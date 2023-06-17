/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.cm;
import net.minecraft.client.k.z;
import net.minecraft.j.p;

class bs
implements cm {
    final /* synthetic */ z a;

    bs(z z2) {
        this.a = z2;
    }

    public boolean a(p p2) {
        return p2.d() != null && !p2.d().startsWith("#");
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((p)object);
    }
}

