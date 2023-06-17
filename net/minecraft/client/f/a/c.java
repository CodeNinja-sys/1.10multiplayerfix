/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f.a;

import com.a.b.aa;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.client.f.a.g;
import net.minecraft.client.f.a.n;
import net.minecraft.u.bc;
import net.minecraft.u.d.a;

public class c
extends n
implements ae {
    public g a(w w2, Type type, u u2) {
        z z2 = w2.t();
        a a2 = (a)u2.a(z2.c("description"), (Type)((Object)a.class));
        if (a2 == null) {
            throw new aa("Invalid/missing description!");
        }
        int n2 = bc.j(z2, "pack_format");
        return new g(a2, n2);
    }

    public w a(g g2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("pack_format", g2.b());
        z2.a("description", ad2.a(g2.a()));
        return z2;
    }

    @Override
    public String a() {
        return "pack";
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((g)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

