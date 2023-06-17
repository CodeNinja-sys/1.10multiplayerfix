/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.ac;
import com.sun.jna.a.d.dy;
import com.sun.jna.a.d.ik;
import com.sun.jna.a.d.il;
import com.sun.jna.a.d.im;
import com.sun.jna.b.e;

public abstract class in {
    public static il[] a() {
        e e2 = new e();
        e e3 = new e();
        ik.g.a(2, null, 1, null, 0, e2, e3);
        if (e2.d() <= 0) {
            return new il[0];
        }
        il il2 = new il(e2.d());
        if (!ik.g.a(2, null, 1, il2.g(), e2.d(), e2, e3)) {
            throw new dy(ac.g.f());
        }
        return (il[])il2.e(e3.d());
    }

    public static im[] b() {
        e e2 = new e();
        e e3 = new e();
        ik.g.a(2, null, 4, null, 0, e2, e3);
        if (e2.d() <= 0) {
            return new im[0];
        }
        im im2 = new im(e2.d());
        if (!ik.g.a(2, null, 4, im2.g(), e2.d(), e2, e3)) {
            throw new dy(ac.g.f());
        }
        return (im[])im2.e(e3.d());
    }
}

