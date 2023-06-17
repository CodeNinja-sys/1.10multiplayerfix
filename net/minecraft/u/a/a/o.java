/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import com.a.b.aa;
import com.a.b.t;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import java.lang.reflect.Type;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;

class o
implements v {
    o() {
    }

    public a a(w w2, Type type, u u2) {
        if (w2.r()) {
            return new k(w2.d());
        }
        if (w2.p()) {
            t t2 = w2.u();
            a a2 = null;
            for (w w3 : t2) {
                a a3 = this.a(w3, w3.getClass(), u2);
                if (a2 == null) {
                    a2 = a3;
                    continue;
                }
                a2.a(a3);
            }
            return a2;
        }
        throw new aa("Don't know how to turn " + w2 + " into a Component");
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }
}

