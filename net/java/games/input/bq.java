/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxAbsInfo;
import net.java.games.input.LinuxEventDevice;
import net.java.games.input.ax;
import net.java.games.input.cc;
import net.java.games.input.l;
import net.java.games.input.m;
import net.java.games.input.s;

final class bq {
    private final LinuxEventDevice c;
    private final l d;
    private final s e;
    private final boolean f;
    private final ax g;
    private final int h;
    private final int i;
    private final int j;
    static final boolean a = !(b == null ? (b = bq.a("net.java.games.input.bq")) : b).desiredAssertionStatus();
    static Class b;

    public bq(LinuxEventDevice linuxEventDevice, l l2, boolean bl2, int n2, int n3) {
        this.c = linuxEventDevice;
        this.d = l2;
        this.e = n2 == 1 ? cc.a(n3) : s.a;
        this.f = bl2;
        this.g = new ax();
        this.g.a(n2, n3);
        if (n2 == 3) {
            LinuxAbsInfo linuxAbsInfo = new LinuxAbsInfo();
            this.a(linuxAbsInfo);
            this.h = linuxAbsInfo.c();
            this.i = linuxAbsInfo.b();
            this.j = linuxAbsInfo.d();
        } else {
            this.h = Integer.MIN_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = 0;
        }
    }

    public final LinuxEventDevice a() {
        return this.c;
    }

    public final void a(LinuxAbsInfo linuxAbsInfo) {
        if (!a && this.g.a() != 3) {
            throw new AssertionError();
        }
        this.c.a(this.g.b(), linuxAbsInfo);
    }

    public final s b() {
        return this.e;
    }

    public final l c() {
        return this.d;
    }

    public final ax d() {
        return this.g;
    }

    public final boolean e() {
        return this.f;
    }

    public final boolean f() {
        return this.d instanceof m && this.d != m.C;
    }

    final float a(float f2) {
        if (this.d instanceof m && !this.f) {
            if (this.h == this.i) {
                return 0.0f;
            }
            if (f2 > (float)this.i) {
                f2 = this.i;
            } else if (f2 < (float)this.h) {
                f2 = this.h;
            }
            return 2.0f * (f2 - (float)this.h) / (float)(this.i - this.h) - 1.0f;
        }
        return f2;
    }

    final float g() {
        return (float)this.j / (2.0f * (float)(this.i - this.h));
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

