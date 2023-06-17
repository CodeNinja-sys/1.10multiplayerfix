/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.sz;
import com.a.b.aa;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.g.b.a.a.i;
import net.minecraft.client.g.b.a.ai;
import net.minecraft.client.g.b.a.al;
import net.minecraft.u.bc;

public class s
implements v {
    public ai a(w w2, Type type, u u2) {
        z z2 = w2.t();
        Map map = this.a(u2, z2);
        i i2 = this.b(u2, z2);
        if (!map.isEmpty() || i2 != null && !i2.b().isEmpty()) {
            return new ai(map, i2);
        }
        throw new aa("Neither 'variants' nor 'multipart' found");
    }

    protected Map a(u u2, z z2) {
        HashMap hashMap = sz.c();
        if (z2.b("variants")) {
            z z3 = bc.k(z2, "variants");
            for (Map.Entry entry : z3.b()) {
                hashMap.put((String)entry.getKey(), (al)u2.a((w)entry.getValue(), (Type)((Object)al.class)));
            }
        }
        return hashMap;
    }

    protected i b(u u2, z z2) {
        if (!z2.b("multipart")) {
            return null;
        }
        t t2 = bc.l(z2, "multipart");
        return (i)u2.a(t2, (Type)((Object)i.class));
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

