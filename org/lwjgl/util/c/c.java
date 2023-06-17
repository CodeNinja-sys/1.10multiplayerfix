/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.c;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import net.java.games.input.ar;
import net.java.games.input.au;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.o;
import net.java.games.input.q;
import org.lwjgl.a.g;
import org.lwjgl.util.c.a;
import org.lwjgl.util.c.d;

final class c
extends au {
    c() {
        super("LWJGLKeyboard", c.k(), new q[0], new dj[0]);
    }

    private static k[] k() {
        Field[] arrfield;
        ArrayList<d> arrayList = new ArrayList<d>();
        for (Field field : arrfield = g.class.getFields()) {
            try {
                int n2;
                o o2;
                if (!Modifier.isStatic(field.getModifiers()) || field.getType() != Integer.TYPE || !field.getName().startsWith("KEY_") || (o2 = a.a(n2 = field.getInt(null))) == o.bu) continue;
                arrayList.add(new d(o2, n2));
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
        }
        return arrayList.toArray(new k[arrayList.size()]);
    }

    public synchronized void a() {
        if (!g.b()) {
            return;
        }
        g.d();
        for (k k2 : this.c()) {
            d d2 = (d)k2;
            d2.j();
        }
    }

    protected synchronized boolean a(ar ar2) {
        if (!g.b()) {
            return false;
        }
        if (!g.f()) {
            return false;
        }
        int n2 = g.j();
        if (n2 == 0) {
            return false;
        }
        o o2 = a.a(n2);
        if (o2 == null) {
            return false;
        }
        k k2 = this.a((l)o2);
        if (k2 == null) {
            return false;
        }
        float f2 = g.k() ? 1.0f : 0.0f;
        ar2.a(k2, f2, g.l());
        return true;
    }
}

