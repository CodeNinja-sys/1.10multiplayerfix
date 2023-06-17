/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.q.a.a.e;
import net.minecraft.q.a.a.i;
import net.minecraft.u.bc;

public class d
implements ae,
v {
    public i a(w w2, Type type, u u2) {
        z z2 = bc.f(w2, "loot table");
        e[] arre = (e[])bc.a(z2, "pools", new e[0], u2, e[].class);
        return new i(arre);
    }

    public w a(i i2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("pools", ad2.a(i.a(i2)));
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((i)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

