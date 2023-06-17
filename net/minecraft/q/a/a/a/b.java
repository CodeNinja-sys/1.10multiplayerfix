/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.e;
import net.minecraft.q.a.a.a.f;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class b
extends e {
    protected b() {
        super(new bp("random_chance_with_looting"), f.class);
    }

    public void a(z z2, f f2, ad ad2) {
        z2.a("chance", Float.valueOf(f.a(f2)));
        z2.a("looting_multiplier", Float.valueOf(f.b(f2)));
    }

    public f a(z z2, u u2) {
        return new f(bc.i(z2, "chance"), bc.i(z2, "looting_multiplier"));
    }

    @Override
    public /* synthetic */ a b(z z2, u u2) {
        return this.a(z2, u2);
    }
}

