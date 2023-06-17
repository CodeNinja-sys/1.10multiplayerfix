/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.u;
import com.a.b.z;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.b.f;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.w;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class b
extends w {
    protected b() {
        super(new bp("set_data"), f.class);
    }

    public void a(z z2, f f2, ad ad2) {
        z2.a("data", ad2.a(f.a(f2)));
    }

    public f a(z z2, u u2, a[] arra) {
        return new f(arra, (net.minecraft.q.a.a.f)bc.a(z2, "data", u2, net.minecraft.q.a.a.f.class));
    }

    @Override
    public /* synthetic */ o b(z z2, u u2, a[] arra) {
        return this.a(z2, u2, arra);
    }
}

