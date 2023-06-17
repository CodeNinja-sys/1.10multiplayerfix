/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.dn;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.dz;
import com.sun.jna.a.d.er;
import com.sun.jna.a.d.es;
import com.sun.jna.a.d.gh;
import com.sun.jna.b.e;
import com.sun.jna.b.h;
import com.sun.jna.w;
import java.util.ArrayList;

public abstract class ad
implements er {
    public static String a() {
        char[] arrc = new char[dz.Y_ + 1];
        e e2 = new e(arrc.length);
        if (!ac.g.a(arrc, e2)) {
            throw new dy(ac.g.f());
        }
        return Native.a(arrc);
    }

    public static String a(gh gh2) {
        h h2 = new h();
        if (0 == ac.g.a(4864, null, gh2.intValue(), 0, h2, 0, null)) {
            throw new w(ac.g.f());
        }
        String string = h2.d().a(0L, !Boolean.getBoolean("w32.ascii"));
        ac.g.a(h2.d());
        return string.trim();
    }

    public static String a(int n2) {
        return ad.a(dn.g(n2));
    }

    public static String b() {
        es es2 = new es(260L);
        char[] arrc = new char[es2.intValue()];
        if (ac.g.a(es2, arrc).intValue() == 0) {
            throw new dy(ac.g.f());
        }
        return Native.a(arrc);
    }

    public static void a(String string) {
        if (!ac.g.c(string)) {
            throw new dy(ac.g.f());
        }
    }

    public static String[] c() {
        es es2 = ac.g.b(new es(0L), null);
        if (es2.intValue() <= 0) {
            throw new dy(ac.g.f());
        }
        char[] arrc = new char[es2.intValue()];
        if ((es2 = ac.g.b(es2, arrc)).intValue() <= 0) {
            throw new dy(ac.g.f());
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "";
        for (int i2 = 0; i2 < arrc.length - 1; ++i2) {
            if (arrc[i2] == '\u0000') {
                arrayList.add(string);
                string = "";
                continue;
            }
            string = string + arrc[i2];
        }
        return arrayList.toArray(new String[0]);
    }

    public static int b(String string) {
        int n2 = ac.g.d(string);
        if (n2 == -1) {
            throw new dy(ac.g.f());
        }
        return n2;
    }
}

