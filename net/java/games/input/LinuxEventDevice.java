/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.java.games.input.LinuxAbsInfo;
import net.java.games.input.LinuxEvent;
import net.java.games.input.LinuxInputID;
import net.java.games.input.ax;
import net.java.games.input.az;
import net.java.games.input.bc;
import net.java.games.input.bf;
import net.java.games.input.bq;
import net.java.games.input.br;
import net.java.games.input.cc;
import net.java.games.input.ce;
import net.java.games.input.dj;
import net.java.games.input.l;
import net.java.games.input.r;
import net.java.games.input.s;

final class LinuxEventDevice
implements bc {
    private final Map c = new HashMap();
    private final dj[] d;
    private final long e;
    private final String f;
    private final LinuxInputID g;
    private final List h;
    private final s i;
    private boolean j;
    private final byte[] k = new byte[64];
    static Class a;
    static Class b;

    public LinuxEventDevice(String string) {
        long l2;
        boolean bl2 = true;
        try {
            l2 = LinuxEventDevice.nOpen(string, true);
        }
        catch (IOException iOException) {
            l2 = LinuxEventDevice.nOpen(string, false);
            bl2 = false;
        }
        this.e = l2;
        try {
            this.f = this.w();
            this.g = this.n();
            this.h = this.p();
            this.d = bl2 ? this.m() : new dj[0];
            this.i = this.j();
        }
        catch (IOException iOException) {
            this.a();
            throw iOException;
        }
    }

    private static final native long nOpen(String var0, boolean var1);

    public final s b() {
        return this.i;
    }

    private static final int a(List list, Class class_, boolean bl2) {
        int n2 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            bq bq2 = (bq)list.get(i2);
            if (!class_.isInstance(bq2.c()) || bl2 != bq2.e()) continue;
            ++n2;
        }
        return n2;
    }

    private final s j() {
        s s2 = this.k();
        if (s2 == s.a) {
            return this.l();
        }
        return s2;
    }

    private final s k() {
        byte[] arrby = this.v();
        if (LinuxEventDevice.a(arrby, 0)) {
            return s.b;
        }
        if (LinuxEventDevice.a(arrby, 3)) {
            return s.c;
        }
        if (LinuxEventDevice.a(arrby, 2)) {
            return s.e;
        }
        if (LinuxEventDevice.a(arrby, 1)) {
            return s.h;
        }
        return s.a;
    }

    private final s l() {
        List list = this.g();
        if (list.size() == 0) {
            return s.a;
        }
        int n2 = LinuxEventDevice.a(list, a == null ? (a = LinuxEventDevice.a("net.java.games.input.m")) : a, true);
        int n3 = LinuxEventDevice.a(list, a == null ? (a = LinuxEventDevice.a("net.java.games.input.m")) : a, false);
        int n4 = LinuxEventDevice.a(list, b == null ? (b = LinuxEventDevice.a("net.java.games.input.o")) : b, false);
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        if (this.f.toLowerCase().indexOf("mouse") != -1) {
            ++n5;
        }
        if (this.f.toLowerCase().indexOf("keyboard") != -1) {
            ++n6;
        }
        if (this.f.toLowerCase().indexOf("joystick") != -1) {
            ++n7;
        }
        if (this.f.toLowerCase().indexOf("gamepad") != -1) {
            ++n8;
        }
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            bq bq2 = (bq)list.get(i2);
            if (bq2.b() == s.b) {
                ++n10;
                continue;
            }
            if (bq2.b() == s.c) {
                ++n9;
                continue;
            }
            if (bq2.b() == s.e) {
                ++n12;
                continue;
            }
            if (bq2.b() != s.h) continue;
            ++n11;
        }
        if (n10 >= n9 && n10 >= n11 && n10 >= n12) {
            ++n5;
        } else if (n9 >= n10 && n9 >= n11 && n9 >= n12) {
            ++n6;
        } else if (n11 >= n9 && n11 >= n10 && n11 >= n12) {
            ++n7;
        } else if (n12 >= n9 && n12 >= n10 && n12 >= n11) {
            ++n8;
        }
        if (n2 >= 2) {
            ++n5;
        }
        if (n3 >= 2) {
            ++n7;
            ++n8;
        }
        if (n5 >= n6 && n5 >= n7 && n5 >= n8) {
            return s.b;
        }
        if (n6 >= n5 && n6 >= n7 && n6 >= n8) {
            return s.c;
        }
        if (n7 >= n5 && n7 >= n6 && n7 >= n8) {
            return s.h;
        }
        if (n8 >= n5 && n8 >= n6 && n8 >= n7) {
            return s.e;
        }
        return null;
    }

    private final dj[] m() {
        ArrayList<ce> arrayList = new ArrayList<ce>();
        try {
            int n2 = this.f();
            if (n2 <= 0) {
                return arrayList.toArray(new dj[0]);
            }
            byte[] arrby = this.q();
            if (LinuxEventDevice.a(arrby, 80) && n2 > arrayList.size()) {
                arrayList.add(new ce(this));
            }
        }
        catch (IOException iOException) {
            bf.a("Failed to enumerate rumblers: " + iOException.getMessage());
        }
        return arrayList.toArray(new dj[0]);
    }

    public final dj[] c() {
        return this.d;
    }

    public final synchronized int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.x();
        return LinuxEventDevice.nUploadRumbleEffect(this.e, n2, n4, n3, n5, n6, n7, n8, n9);
    }

    private static final native int nUploadRumbleEffect(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

    public final synchronized int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        this.x();
        return LinuxEventDevice.nUploadConstantEffect(this.e, n2, n4, n3, n5, n6, n7, n8, n9, n10, n11, n12);
    }

    private static final native int nUploadConstantEffect(long var0, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

    final void a(int n2) {
        LinuxEventDevice.nEraseEffect(this.e, n2);
    }

    private static final native void nEraseEffect(long var0, int var2);

    public final synchronized void a(int n2, int n3, int n4) {
        this.x();
        LinuxEventDevice.nWriteEvent(this.e, n2, n3, n4);
    }

    private static final native void nWriteEvent(long var0, int var2, int var3, int var4);

    public final void a(ax ax2, az az2) {
        this.c.put(ax2, az2);
    }

    public final az a(ax ax2) {
        return (az)this.c.get(ax2);
    }

    public final r d() {
        return this.g.a();
    }

    public final LinuxInputID e() {
        return this.g;
    }

    private final LinuxInputID n() {
        return LinuxEventDevice.nGetInputID(this.e);
    }

    private static final native LinuxInputID nGetInputID(long var0);

    public final int f() {
        return LinuxEventDevice.nGetNumEffects(this.e);
    }

    private static final native int nGetNumEffects(long var0);

    private final int o() {
        return LinuxEventDevice.nGetVersion(this.e);
    }

    private static final native int nGetVersion(long var0);

    public final synchronized boolean a(LinuxEvent linuxEvent) {
        this.x();
        return LinuxEventDevice.nGetNextEvent(this.e, linuxEvent);
    }

    private static final native boolean nGetNextEvent(long var0, LinuxEvent var2);

    public final synchronized void a(int n2, LinuxAbsInfo linuxAbsInfo) {
        this.x();
        LinuxEventDevice.nGetAbsInfo(this.e, n2, linuxAbsInfo);
    }

    private static final native void nGetAbsInfo(long var0, int var2, LinuxAbsInfo var3);

    private final void a(List list) {
        byte[] arrby = this.r();
        for (int i2 = 0; i2 < arrby.length * 8; ++i2) {
            if (!LinuxEventDevice.a(arrby, i2)) continue;
            l l2 = cc.e(i2);
            list.add(new bq(this, l2, false, 1, i2));
        }
    }

    private final void b(List list) {
        byte[] arrby = this.s();
        for (int i2 = 0; i2 < arrby.length * 8; ++i2) {
            if (!LinuxEventDevice.a(arrby, i2)) continue;
            l l2 = cc.d(i2);
            list.add(new bq(this, l2, false, 3, i2));
        }
    }

    private final void c(List list) {
        byte[] arrby = this.t();
        for (int i2 = 0; i2 < arrby.length * 8; ++i2) {
            if (!LinuxEventDevice.a(arrby, i2)) continue;
            l l2 = cc.c(i2);
            list.add(new bq(this, l2, true, 2, i2));
        }
    }

    public final List g() {
        return this.h;
    }

    private final List p() {
        ArrayList arrayList = new ArrayList();
        byte[] arrby = this.u();
        if (LinuxEventDevice.a(arrby, 1)) {
            this.a(arrayList);
        }
        if (LinuxEventDevice.a(arrby, 3)) {
            this.b(arrayList);
        }
        if (LinuxEventDevice.a(arrby, 2)) {
            this.c(arrayList);
        }
        return arrayList;
    }

    private final byte[] q() {
        byte[] arrby = new byte[16];
        LinuxEventDevice.nGetBits(this.e, 21, arrby);
        return arrby;
    }

    private final byte[] r() {
        byte[] arrby = new byte[64];
        LinuxEventDevice.nGetBits(this.e, 1, arrby);
        return arrby;
    }

    private final byte[] s() {
        byte[] arrby = new byte[8];
        LinuxEventDevice.nGetBits(this.e, 3, arrby);
        return arrby;
    }

    private final byte[] t() {
        byte[] arrby = new byte[2];
        LinuxEventDevice.nGetBits(this.e, 2, arrby);
        return arrby;
    }

    private final byte[] u() {
        byte[] arrby = new byte[4];
        LinuxEventDevice.nGetBits(this.e, 0, arrby);
        return arrby;
    }

    private static final native void nGetBits(long var0, int var2, byte[] var3);

    private final byte[] v() {
        byte[] arrby = new byte[2];
        if (this.o() >= 65537) {
            LinuxEventDevice.nGetDeviceUsageBits(this.e, arrby);
        }
        return arrby;
    }

    private static final native void nGetDeviceUsageBits(long var0, byte[] var2);

    public final synchronized void h() {
        LinuxEventDevice.nGetKeyStates(this.e, this.k);
    }

    private static final native void nGetKeyStates(long var0, byte[] var2);

    public final boolean b(int n2) {
        return LinuxEventDevice.a(this.k, n2);
    }

    public static final boolean a(byte[] arrby, int n2) {
        return (arrby[n2 / 8] & 1 << n2 % 8) != 0;
    }

    public final String i() {
        return this.f;
    }

    private final String w() {
        return LinuxEventDevice.nGetName(this.e);
    }

    private static final native String nGetName(long var0);

    public final synchronized void a() {
        if (this.j) {
            return;
        }
        this.j = true;
        bf.a(new br(this));
    }

    private static final native void nClose(long var0);

    private final void x() {
        if (this.j) {
            throw new IOException("Device is closed");
        }
    }

    protected void finalize() {
        this.a();
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static long a(LinuxEventDevice linuxEventDevice) {
        return linuxEventDevice.e;
    }

    static void a(long l2) {
        LinuxEventDevice.nClose(l2);
    }
}

