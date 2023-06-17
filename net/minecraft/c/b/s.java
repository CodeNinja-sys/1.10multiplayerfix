/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.c.b.aa;
import net.minecraft.c.b.b;

class s
implements ae,
v {
    final /* synthetic */ b a;

    private s(b b2) {
        this.a = b2;
    }

    public w a(aa aa2, Type type, ad ad2) {
        z z2 = new z();
        aa2.a(z2);
        return z2;
    }

    public aa a(w w2, Type type, u u2) {
        if (w2.q()) {
            z z2 = w2.t();
            return this.a.a(z2);
        }
        return null;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((aa)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    /* synthetic */ s(b b2, s s2) {
        this(b2);
    }
}

