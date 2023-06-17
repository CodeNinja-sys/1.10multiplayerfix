/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a.b;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.ag;
import com.a.b.u;
import com.a.b.v;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.q.a.a.b.a;
import net.minecraft.q.a.a.b.o;
import net.minecraft.q.a.a.b.w;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class h
implements ae,
v {
    public o a(com.a.b.w w2, Type type, u u2) {
        w w3;
        z z2 = bc.f(w2, "function");
        bp bp2 = new bp(bc.f(z2, "function"));
        try {
            w3 = a.a(bp2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new ag("Unknown function '" + bp2 + "'");
        }
        return w3.b(z2, u2, (net.minecraft.q.a.a.a.a[])bc.a(z2, "conditions", new net.minecraft.q.a.a.a.a[0], u2, net.minecraft.q.a.a.a.a[].class));
    }

    public com.a.b.w a(o o2, Type type, ad ad2) {
        w w2 = a.a(o2);
        z z2 = new z();
        w2.a(z2, o2, ad2);
        z2.a("function", w2.a().toString());
        if (o2.a() != null && o2.a().length > 0) {
            z2.a("conditions", ad2.a(o2.a()));
        }
        return z2;
    }

    @Override
    public /* synthetic */ com.a.b.w a(Object object, Type type, ad ad2) {
        return this.a((o)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(com.a.b.w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

