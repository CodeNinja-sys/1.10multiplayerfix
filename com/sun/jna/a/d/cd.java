/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.Native;
import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.cb;
import com.sun.jna.a.d.ce;
import com.sun.jna.a.d.cv;
import com.sun.jna.a.d.dd;
import com.sun.jna.a.d.dy;
import com.sun.jna.b.e;
import java.util.ArrayList;

public abstract class cd {
    public static String a(int n2) {
        char[] arrc = new char[128];
        e e2 = new e(arrc.length);
        boolean bl2 = cb.g.a(n2, arrc, e2);
        if (!bl2) {
            int n3 = ac.g.f();
            switch (n3) {
                case 234: {
                    arrc = new char[e2.d() + 1];
                    break;
                }
                default: {
                    throw new dy(Native.a());
                }
            }
            bl2 = cb.g.a(n2, arrc, e2);
        }
        if (!bl2) {
            throw new dy(Native.a());
        }
        return Native.a(arrc);
    }

    public static ce[] a() {
        e e2 = new e();
        cv cv2 = new cv();
        int n2 = cb.g.a(e2, cv2);
        if (0 != n2) {
            throw new dy(n2);
        }
        dd[] arrdd = cv2.f(e2.d());
        ArrayList<ce> arrayList = new ArrayList<ce>(e2.d());
        for (dd dd2 : arrdd) {
            ce ce2 = new ce();
            ce2.a = dd2.G.toString();
            ce2.b = dd2.H.toString();
            arrayList.add(ce2);
        }
        n2 = cb.g.a(cv2.a.g());
        if (0 != n2) {
            throw new dy(n2);
        }
        return arrayList.toArray(new ce[0]);
    }
}

