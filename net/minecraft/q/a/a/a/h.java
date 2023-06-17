/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.a;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.ag;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.a.e;
import net.minecraft.q.a.a.a.i;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class h
implements ae,
v {
    public a a(w w2, Type type, u u2) {
        e e2;
        z z2 = bc.f(w2, "condition");
        bp bp2 = new bp(bc.f(z2, "condition"));
        try {
            e2 = i.a(bp2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new ag("Unknown condition '" + bp2 + "'");
        }
        return e2.b(z2, u2);
    }

    public w a(a a2, Type type, ad ad2) {
        e e2 = i.a(a2);
        z z2 = new z();
        e2.a(z2, a2, ad2);
        z2.a("condition", e2.a().toString());
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((a)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

