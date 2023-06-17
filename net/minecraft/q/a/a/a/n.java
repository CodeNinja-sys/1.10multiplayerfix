/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.e;
import net.minecraft.q.a.a.a.k;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class n
extends e {
    protected n() {
        super(new bp("killed_by_player"), k.class);
    }

    public void a(z z2, k k2, ad ad2) {
        z2.a("inverse", k.a(k2));
    }

    public k a(z z2, u u2) {
        return new k(bc.a(z2, "inverse", false));
    }

    @Override
    public /* synthetic */ a b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

