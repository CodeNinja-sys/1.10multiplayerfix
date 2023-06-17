/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.java.games.input.LinuxJoystickEvent;
import net.java.games.input.ar;
import net.java.games.input.as;
import net.java.games.input.bc;
import net.java.games.input.bx;
import net.java.games.input.by;
import net.java.games.input.bz;

final class LinuxJoystickDevice
implements bc {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 128;
    public static final int d = 32767;
    private final long e;
    private final String f;
    private final LinuxJoystickEvent g = new LinuxJoystickEvent();
    private final ar h = new ar();
    private final by[] i;
    private final bx[] j;
    private final Map k = new HashMap();
    private final Map l = new HashMap();
    private final byte[] m;
    private final char[] n;
    private as o;
    private boolean p;

    public LinuxJoystickDevice(String string) {
        this.e = LinuxJoystickDevice.nOpen(string);
        try {
            this.f = this.m();
            this.a(32);
            this.i = new by[this.h()];
            this.j = new bx[this.i()];
            this.m = this.j();
            this.n = this.k();
        }
        catch (IOException iOException) {
            this.a();
            throw iOException;
        }
    }

    private static final native long nOpen(String var0);

    public final synchronized void a(int n2) {
        this.o = new as(n2);
    }

    private final void a(LinuxJoystickEvent linuxJoystickEvent) {
        int n2 = linuxJoystickEvent.c();
        int n3 = linuxJoystickEvent.b() & 0xFFFFFF7F;
        switch (n3) {
            case 1: {
                by by2;
                if (n2 < this.d() && (by2 = this.i[n2]) != null) {
                    float f2 = linuxJoystickEvent.a();
                    by2.a(f2);
                    this.h.a(by2, f2, linuxJoystickEvent.d());
                    break;
                }
                return;
            }
            case 2: {
                bx bx2;
                if (n2 < this.c() && (bx2 = this.j[n2]) != null) {
                    float f3 = (float)linuxJoystickEvent.a() / 32767.0f;
                    bx2.a(f3);
                    if (this.k.containsKey(new Integer(n2))) {
                        bz bz2 = (bz)this.k.get(new Integer(n2));
                        bz2.l();
                        this.h.a(bz2, bz2.f(), linuxJoystickEvent.d());
                        break;
                    }
                    if (this.l.containsKey(new Integer(n2))) {
                        bz bz3 = (bz)this.l.get(new Integer(n2));
                        bz3.l();
                        this.h.a(bz3, bz3.f(), linuxJoystickEvent.d());
                        break;
                    }
                    this.h.a(bx2, f3, linuxJoystickEvent.d());
                    break;
                }
                return;
            }
            default: {
                return;
            }
        }
        if (!this.o.a()) {
            this.o.a(this.h);
        }
    }

    public final void a(int n2, bx bx2) {
        this.j[n2] = bx2;
    }

    public final void a(int n2, by by2) {
        this.i[n2] = by2;
    }

    public final void a(bz bz2) {
        int n2;
        int n3;
        bx bx2 = bz2.k();
        bx bx3 = bz2.j();
        for (n3 = 0; n3 < this.j.length && this.j[n3] != bx2; ++n3) {
        }
        for (n2 = 0; n2 < this.j.length && this.j[n2] != bx3; ++n2) {
        }
        this.k.put(new Integer(n3), bz2);
        this.l.put(new Integer(n2), bz2);
    }

    public final synchronized boolean a(ar ar2) {
        return this.o.b(ar2);
    }

    public final synchronized void b() {
        this.n();
        while (this.b(this.g)) {
            this.a(this.g);
        }
    }

    private final boolean b(LinuxJoystickEvent linuxJoystickEvent) {
        return LinuxJoystickDevice.nGetNextEvent(this.e, linuxJoystickEvent);
    }

    private static final native boolean nGetNextEvent(long var0, LinuxJoystickEvent var2);

    public final int c() {
        return this.j.length;
    }

    public final int d() {
        return this.i.length;
    }

    public final byte[] e() {
        return this.m;
    }

    public final char[] f() {
        return this.n;
    }

    private final int h() {
        return LinuxJoystickDevice.nGetNumButtons(this.e);
    }

    private static final native int nGetNumButtons(long var0);

    private final int i() {
        return LinuxJoystickDevice.nGetNumAxes(this.e);
    }

    private static final native int nGetNumAxes(long var0);

    private final byte[] j() {
        return LinuxJoystickDevice.nGetAxisMap(this.e);
    }

    private static final native byte[] nGetAxisMap(long var0);

    private final char[] k() {
        return LinuxJoystickDevice.nGetButtonMap(this.e);
    }

    private static final native char[] nGetButtonMap(long var0);

    private final int l() {
        return LinuxJoystickDevice.nGetVersion(this.e);
    }

    private static final native int nGetVersion(long var0);

    public final String g() {
        return this.f;
    }

    private final String m() {
        return LinuxJoystickDevice.nGetName(this.e);
    }

    private static final native String nGetName(long var0);

    public final synchronized void a() {
        if (!this.p) {
            this.p = true;
            LinuxJoystickDevice.nClose(this.e);
        }
    }

    private static final native void nClose(long var0);

    private final void n() {
        if (this.p) {
            throw new IOException("Device is closed");
        }
    }

    protected void finalize() {
        this.a();
    }
}

