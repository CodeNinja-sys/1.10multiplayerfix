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
import net.minecraft.q.a.a.a.a;
import net.minecraft.q.a.a.e;
import net.minecraft.q.a.a.f;
import net.minecraft.q.a.a.s;
import net.minecraft.u.bc;
import org.apache.commons.c.c;

public class t
implements ae,
v {
    public e a(w w2, Type type, u u2) {
        z z2 = bc.f(w2, "loot pool");
        s[] arrs = (s[])bc.a(z2, "entries", u2, s[].class);
        a[] arra = (a[])bc.a(z2, "conditions", new a[0], u2, a[].class);
        f f2 = (f)bc.a(z2, "rolls", u2, f.class);
        f f3 = (f)bc.a(z2, "bonus_rolls", new f(0.0f, 0.0f), u2, f.class);
        return new e(arrs, arra, f2, f3);
    }

    public w a(e e2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("entries", ad2.a(e.a(e2)));
        z2.a("rolls", ad2.a(e.b(e2)));
        if (e.c(e2).a() != 0.0f && e.c(e2).b() != 0.0f) {
            z2.a("bonus_rolls", ad2.a(e.c(e2)));
        }
        if (!c.f(e.d(e2))) {
            z2.a("conditions", ad2.a(e.d(e2)));
        }
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((e)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

