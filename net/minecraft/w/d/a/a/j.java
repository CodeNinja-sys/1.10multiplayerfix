/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import net.minecraft.w.d.a.a.a;
import net.minecraft.w.d.a.a.b;
import net.minecraft.w.d.a.a.c;
import net.minecraft.w.d.a.a.d;
import net.minecraft.w.d.a.a.e;
import net.minecraft.w.d.a.a.f;
import net.minecraft.w.d.a.a.g;
import net.minecraft.w.d.a.a.h;
import net.minecraft.w.d.a.a.l;
import net.minecraft.w.d.a.a.n;
import net.minecraft.w.d.a.a.o;
import net.minecraft.w.d.a.a.p;

public class j {
    private static j[] l = new j[0];
    public static final j a = net.minecraft.w.d.a.a.j.a(l.class, "HoldingPattern");
    public static final j b = net.minecraft.w.d.a.a.j.a(h.class, "StrafePlayer");
    public static final j c = net.minecraft.w.d.a.a.j.a(f.class, "LandingApproach");
    public static final j d = net.minecraft.w.d.a.a.j.a(a.class, "Landing");
    public static final j e = net.minecraft.w.d.a.a.j.a(b.class, "Takeoff");
    public static final j f = net.minecraft.w.d.a.a.j.a(g.class, "SittingFlaming");
    public static final j g = net.minecraft.w.d.a.a.j.a(c.class, "SittingScanning");
    public static final j h = net.minecraft.w.d.a.a.j.a(d.class, "SittingAttacking");
    public static final j i = net.minecraft.w.d.a.a.j.a(o.class, "ChargingPlayer");
    public static final j j = net.minecraft.w.d.a.a.j.a(n.class, "Dying");
    public static final j k = net.minecraft.w.d.a.a.j.a(p.class, "Hover");
    private final Class m;
    private final int n;
    private final String o;

    private j(int n2, Class class_, String string) {
        this.n = n2;
        this.m = class_;
        this.o = string;
    }

    public e a(net.minecraft.w.d.a a2) {
        try {
            Constructor constructor = this.a();
            return (e)constructor.newInstance(a2);
        }
        catch (Exception exception) {
            throw new Error(exception);
        }
    }

    protected Constructor a() {
        return this.m.getConstructor(net.minecraft.w.d.a.class);
    }

    public int b() {
        return this.n;
    }

    public String toString() {
        return String.valueOf(this.o) + " (#" + this.n + ")";
    }

    public static j a(int n2) {
        return n2 >= 0 && n2 < l.length ? l[n2] : a;
    }

    public static int c() {
        return l.length;
    }

    private static j a(Class class_, String string) {
        j j2 = new j(l.length, class_, string);
        l = Arrays.copyOf(l, l.length + 1);
        net.minecraft.w.d.a.a.j.l[j2.b()] = j2;
        return j2;
    }
}

