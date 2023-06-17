/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.b.ac;
import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.q.a.a.f;
import net.minecraft.u.bc;

public class b
implements ae,
v {
    public f a(w w2, Type type, u u2) {
        if (bc.b(w2)) {
            return new f(bc.d(w2, "value"));
        }
        z z2 = bc.f(w2, "value");
        float f2 = bc.i(z2, "min");
        float f3 = bc.i(z2, "max");
        return new f(f2, f3);
    }

    public w a(f f2, Type type, ad ad2) {
        if (f.a(f2) == f.b(f2)) {
            return new ac(Float.valueOf(f.a(f2)));
        }
        z z2 = new z();
        z2.a("min", Float.valueOf(f.a(f2)));
        z2.a("max", Float.valueOf(f.b(f2)));
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((f)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

