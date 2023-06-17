/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import com.c.a.e;
import java.lang.reflect.Type;
import java.util.UUID;
import net.minecraft.u.bc;
import net.minecraft.x.r;

public class x
implements ae,
v {
    public r a(w w2, Type type, u u2) {
        t t2;
        z z2 = bc.f(w2, "players");
        r r2 = new r(bc.j(z2, "max"), bc.j(z2, "online"));
        if (bc.c(z2, "sample") && (t2 = bc.l(z2, "sample")).b() > 0) {
            e[] arre = new e[t2.b()];
            for (int i2 = 0; i2 < arre.length; ++i2) {
                z z3 = bc.f(t2.a(i2), "player[" + i2 + "]");
                String string = bc.f(z3, "id");
                arre[i2] = new e(UUID.fromString(string), bc.f(z3, "name"));
            }
            r2.a(arre);
        }
        return r2;
    }

    public w a(r r2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("max", r2.a());
        z2.a("online", r2.b());
        if (r2.c() != null && r2.c().length > 0) {
            t t2 = new t();
            for (int i2 = 0; i2 < r2.c().length; ++i2) {
                z z3 = new z();
                UUID uUID = r2.c()[i2].a();
                z3.a("id", uUID == null ? "" : uUID.toString());
                z3.a("name", r2.c()[i2].b());
                t2.a(z3);
            }
            z2.a("sample", t2);
        }
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((r)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

