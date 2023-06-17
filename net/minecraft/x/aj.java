/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.b.ad;
import com.a.b.ae;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import net.minecraft.u.bc;
import net.minecraft.x.aa;

public class aj
implements ae,
v {
    public aa a(w w2, Type type, u u2) {
        z z2 = bc.f(w2, "version");
        return new aa(bc.f(z2, "name"), bc.j(z2, "protocol"));
    }

    public w a(aa aa2, Type type, ad ad2) {
        z z2 = new z();
        z2.a("name", aa2.a());
        z2.a("protocol", aa2.b());
        return z2;
    }

    @Override
    public /* synthetic */ w a(Object object, Type type, ad ad2) {
        return this.a((aa)object, type, ad2);
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

