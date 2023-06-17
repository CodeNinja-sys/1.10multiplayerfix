/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a.a;

import com.a.a.d.ov;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.g.b.a.a.i;
import net.minecraft.client.g.b.a.a.j;

public class d
implements v {
    public i a(w w2, Type type, u u2) {
        return new i(this.a(u2, w2.u()));
    }

    private List a(u u2, t t2) {
        ArrayList arrayList = ov.a();
        for (w w2 : t2) {
            arrayList.add((j)u2.a(w2, (Type)((Object)j.class)));
        }
        return arrayList;
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

