/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f.a;

import com.a.a.d.ov;
import com.a.b.aa;
import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.t;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import net.minecraft.client.f.a.e;
import net.minecraft.client.f.a.k;
import net.minecraft.client.f.a.n;
import net.minecraft.u.bc;
import org.apache.commons.c.ao;

public class o
extends n
implements ae {
    public k a(w w2, Type type, u u2) {
        int n2;
        ArrayList arrayList = ov.a();
        z z2 = bc.f(w2, "metadata section");
        int n3 = bc.a(z2, "frametime", 1);
        if (n3 != 1) {
            ao.a(1L, Integer.MAX_VALUE, n3, "Invalid default frame time");
        }
        if (z2.b("frames")) {
            try {
                t t2 = bc.l(z2, "frames");
                for (n2 = 0; n2 < t2.b(); ++n2) {
                    w w3 = t2.a(n2);
                    e e2 = this.a(n2, w3);
                    if (e2 == null) continue;
                    arrayList.add(e2);
                }
            }
            catch (ClassCastException classCastException) {
                throw new aa("Invalid animation->frames: expected array, was " + z2.c("frames"), classCastException);
            }
        }
        int n4 = bc.a(z2, "width", -1);
        n2 = bc.a(z2, "height", -1);
        if (n4 != -1) {
            ao.a(1L, Integer.MAX_VALUE, n4, "Invalid width");
        }
        if (n2 != -1) {
            ao.a(1L, Integer.MAX_VALUE, n2, "Invalid height");
        }
        boolean bl2 = bc.a(z2, "interpolate", false);
        return new k(arrayList, n4, n2, n3, bl2);
    }

    private e a(int n2, w w2) {
        if (w2.r()) {
            return new e(bc.e(w2, "frames[" + n2 + "]"));
        }
        if (w2.q()) {
            z z2 = bc.f(w2, "frames[" + n2 + "]");
            int n3 = bc.a(z2, "time", -1);
            if (z2.b("time")) {
                ao.a(1L, Integer.MAX_VALUE, n3, "Invalid frame time");
            }
            int n4 = bc.j(z2, "index");
            ao.a(0L, Integer.MAX_VALUE, n4, "Invalid frame index");
            return new e(n4, n3);
        }
        return null;
    }

    public w a(k k2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("frametime", k2.d());
        if (k2.b() != -1) {
            z2.a("width", k2.b());
        }
        if (k2.a() != -1) {
            z2.a("height", k2.a());
        }
        if (k2.c() > 0) {
            t t2 = new t();
            for (int i2 = 0; i2 < k2.c(); ++i2) {
                if (k2.b(i2)) {
                    z z3 = new z();
                    z3.a("index", k2.c(i2));
                    z3.a("time", k2.a(i2));
                    t2.a(z3);
                    continue;
                }
                t2.a(new ac(k2.c(i2)));
            }
            z2.a("frames", t2);
        }
        return z2;
    }

    @Override
    public String a() {
        return "animation";
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((k)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

