/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import net.minecraft.n.ao;
import net.minecraft.n.az;
import net.minecraft.n.ba;
import net.minecraft.u.d.a;
import net.minecraft.u.d.c;
import net.minecraft.u.d.i;
import net.minecraft.u.d.j;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;
import net.minecraft.w.a.b;

public class n {
    public static a a(az az2, a a2, net.minecraft.w.n n2) {
        Object object;
        Object object2;
        a a3 = null;
        if (a2 instanceof i) {
            object2 = (i)a2;
            String string = ((i)object2).g();
            if (ao.b(string)) {
                object = ao.b(az2, string, net.minecraft.w.n.class);
                if (object.size() != 1) {
                    throw new ba();
                }
                net.minecraft.w.n n3 = (net.minecraft.w.n)object.get(0);
                string = n3 instanceof b ? n3.X() : n3.cN();
            }
            a3 = n2 != null && string.equals("*") ? new i(n2.X(), ((i)object2).h()) : new i(string, ((i)object2).h());
            ((i)a3).a(az2);
        } else if (a2 instanceof j) {
            object2 = ((j)a2).g();
            a3 = ao.b(az2, (String)object2);
            if (a3 == null) {
                a3 = new k("");
            }
        } else if (a2 instanceof k) {
            a3 = new k(((k)a2).g());
        } else {
            if (!(a2 instanceof l)) {
                return a2;
            }
            object2 = ((l)a2).j();
            for (int i2 = 0; i2 < ((Object[])object2).length; ++i2) {
                object = object2[i2];
                if (!(object instanceof a)) continue;
                object2[i2] = n.a(az2, (a)object, n2);
            }
            a3 = new l(((l)a2).i(), (Object[])object2);
        }
        object2 = a2.a();
        if (object2 != null) {
            a3.a(((c)object2).l());
        }
        for (a a4 : a2.e()) {
            a3.a(n.a(az2, a4, n2));
        }
        return a3;
    }
}

