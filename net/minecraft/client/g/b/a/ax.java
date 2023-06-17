/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.sz;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.client.g.b.a.av;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

class ax
implements v {
    ax() {
    }

    public av a(w w2, Type type, u u2) {
        z z2 = w2.t();
        bp bp2 = new bp(bc.f(z2, "model"));
        Map map = this.a(z2);
        return new av(bp2, map);
    }

    protected Map a(z z2) {
        LinkedHashMap linkedHashMap = sz.d();
        z z3 = bc.k(z2, "predicate");
        for (Map.Entry entry : z3.b()) {
            linkedHashMap.put(new bp((String)entry.getKey()), Float.valueOf(bc.d((w)entry.getValue(), (String)entry.getKey())));
        }
        return linkedHashMap;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

