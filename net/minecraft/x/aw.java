/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.u.bc;
import net.minecraft.u.d.a;
import net.minecraft.x.aa;
import net.minecraft.x.r;
import net.minecraft.x.v;

public class aw
implements ae,
com.a.b.v {
    public v a(w w2, Type type, u u2) {
        z z2 = bc.f(w2, "status");
        v v2 = new v();
        if (z2.b("description")) {
            v2.a((a)u2.a(z2.c("description"), (Type)((Object)a.class)));
        }
        if (z2.b("players")) {
            v2.a((r)u2.a(z2.c("players"), (Type)((Object)r.class)));
        }
        if (z2.b("version")) {
            v2.a((aa)u2.a(z2.c("version"), (Type)((Object)aa.class)));
        }
        if (z2.b("favicon")) {
            v2.a(bc.f(z2, "favicon"));
        }
        return v2;
    }

    public w a(v v2, Type type, ad ad2) {
        z z2 = new z();
        if (v2.a() != null) {
            z2.a("description", ad2.a(v2.a()));
        }
        if (v2.b() != null) {
            z2.a("players", ad2.a(v2.b()));
        }
        if (v2.c() != null) {
            z2.a("version", ad2.a(v2.c()));
        }
        if (v2.d() != null) {
            z2.a("favicon", v2.d());
        }
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((v)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

