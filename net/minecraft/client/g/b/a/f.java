/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.g.b.a.ak;
import net.minecraft.client.g.b.a.av;
import net.minecraft.client.g.b.a.q;
import net.minecraft.client.g.b.a.r;
import net.minecraft.u.bc;
import net.minecraft.u.bp;

public class f
implements v {
    public r a(w w2, Type type, u u2) {
        Object object;
        z z2 = w2.t();
        List list = this.b(u2, z2);
        String string = this.c(z2);
        Map map = this.b(z2);
        boolean bl2 = this.a(z2);
        q q2 = q.a;
        if (z2.b("display")) {
            object = bc.k(z2, "display");
            q2 = (q)u2.a((w)object, (Type)((Object)q.class));
        }
        object = this.a(u2, z2);
        bp bp2 = string.isEmpty() ? null : new bp(string);
        return new r(bp2, list, map, bl2, true, q2, (List)object);
    }

    protected List a(u u2, z z2) {
        ArrayList arrayList = ov.a();
        if (z2.b("overrides")) {
            for (w w2 : bc.l(z2, "overrides")) {
                arrayList.add((av)u2.a(w2, (Type)((Object)av.class)));
            }
        }
        return arrayList;
    }

    private Map b(z z2) {
        HashMap hashMap = sz.c();
        if (z2.b("textures")) {
            z z3 = z2.f("textures");
            for (Map.Entry entry : z3.b()) {
                hashMap.put((String)entry.getKey(), ((w)entry.getValue()).d());
            }
        }
        return hashMap;
    }

    private String c(z z2) {
        return bc.a(z2, "parent", "");
    }

    protected boolean a(z z2) {
        return bc.a(z2, "ambientocclusion", true);
    }

    protected List b(u u2, z z2) {
        ArrayList arrayList = ov.a();
        if (z2.b("elements")) {
            for (w w2 : bc.l(z2, "elements")) {
                arrayList.add((ak)u2.a(w2, (Type)((Object)ak.class)));
            }
        }
        return arrayList;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

