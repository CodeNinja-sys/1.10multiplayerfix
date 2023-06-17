/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.b.cm;
import com.a.a.b.cn;
import net.minecraft.j.b;
import net.minecraft.j.i;
import net.minecraft.u.s;
import net.minecraft.u.t;
import net.minecraft.u.u;
import net.minecraft.u.v;
import net.minecraft.u.w;
import net.minecraft.u.x;
import net.minecraft.u.y;
import net.minecraft.u.z;
import net.minecraft.w.n;

public final class r {
    public static final cm a = new s();
    public static final cm b = new t();
    public static final cm c = new u();
    public static final cm d = new v();
    public static final cm e = new w();
    public static final cm f = new x();

    public static cm a(double d2, double d3, double d4, double d5) {
        double d6 = d5 * d5;
        return new y(d2, d3, d4, d6);
    }

    public static cm a(n n2) {
        i i2 = n2.aA();
        b b2 = i2 == null ? net.minecraft.j.b.a : i2.j();
        cm cm2 = b2 == net.minecraft.j.b.b ? cn.b() : cn.a(e, (cm)new z(n2, i2, b2));
        return cm2;
    }
}

