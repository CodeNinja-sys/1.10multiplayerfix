/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f.a;

import com.a.a.d.aad;
import com.a.b.aa;
import com.a.b.u;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import net.minecraft.client.f.a.j;
import net.minecraft.client.f.a.n;
import net.minecraft.client.f.h;
import net.minecraft.u.bc;

public class i
extends n {
    public j a(w w2, Type type, u u2) {
        z z2 = w2.t();
        HashSet hashSet = aad.a();
        for (Map.Entry entry : z2.b()) {
            String string = (String)entry.getKey();
            z z3 = bc.f((w)entry.getValue(), "language");
            String string2 = bc.f(z3, "region");
            String string3 = bc.f(z3, "name");
            boolean bl2 = bc.a(z3, "bidirectional", false);
            if (string2.isEmpty()) {
                throw new aa("Invalid language->'" + string + "'->region: empty value");
            }
            if (string3.isEmpty()) {
                throw new aa("Invalid language->'" + string + "'->name: empty value");
            }
            if (hashSet.add(new h(string, string2, string3, bl2))) continue;
            throw new aa("Duplicate language->'" + string + "' defined");
        }
        return new j(hashSet);
    }

    @Override
    public String a() {
        return "language";
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

