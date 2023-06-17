/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.java.games.input.DIDeviceObject;
import net.java.games.input.DataQueue;
import net.java.games.input.DummyWindow;
import net.java.games.input.IDirectInputEffect;
import net.java.games.input.aa;
import net.java.games.input.ab;
import net.java.games.input.ak;
import net.java.games.input.dj;
import net.java.games.input.l;
import net.java.games.input.m;
import net.java.games.input.n;
import net.java.games.input.o;
import net.java.games.input.x;
import net.java.games.input.z;

final class IDirectInputDevice {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    public static final int l = 12;
    public static final int m = 13;
    public static final int n = 14;
    public static final int o = 15;
    public static final int p = 16;
    public static final int q = 17;
    public static final int r = 18;
    public static final int s = 19;
    public static final int t = 20;
    public static final int u = 21;
    public static final int v = 22;
    public static final int w = 23;
    public static final int x = 17;
    public static final int y = 18;
    public static final int z = 19;
    public static final int A = 20;
    public static final int B = 21;
    public static final int C = 22;
    public static final int D = 23;
    public static final int E = 24;
    public static final int F = 25;
    public static final int G = 26;
    public static final int H = 27;
    public static final int I = 28;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 4;
    public static final int M = 8;
    public static final int N = 16;
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 8;
    public static final int U = 12;
    public static final int V = 16;
    public static final int W = 64;
    public static final int X = 128;
    public static final int Y = 0x1000000;
    public static final int Z = 0x2000000;
    public static final int aa = 0x10000000;
    public static final int ab = 0x4000000;
    public static final int ac = 0x8000000;
    public static final int ad = Integer.MIN_VALUE;
    public static final int ae = 0xFFFF00;
    public static final int af = 1;
    public static final int ag = 2;
    public static final int ah = 0;
    public static final int ai = 1;
    public static final int aj = 1;
    public static final int ak = 2;
    public static final int al = 3;
    public static final int am = 4;
    public static final int an = 8;
    public static final int ao = 11;
    public static final int ap = 12;
    public static final int aq = 1;
    public static final int ar = -2147024866;
    public static final int as = -2147024868;
    public static final int at = -2147024891;
    public static final int au = 1;
    public static final int av = 2;
    public static final int aw = 32768;
    public static final int ax = 256;
    public static final int ay = 512;
    public static final int az = 768;
    public static final int aA = 1024;
    public static final int aB = 3840;
    public static final int aC = 65536;
    public static final int aD = 0;
    public static final int aE = 1;
    public static final int aF = 2;
    public static final int aG = 3;
    public static final int aH = 4;
    public static final int aI = 5;
    public static final int aJ = 255;
    public static final int aK = 512;
    public static final int aL = 1024;
    public static final int aM = 2048;
    public static final int aN = 4096;
    public static final int aO = 8192;
    public static final int aP = 16384;
    public static final int aQ = 32768;
    public static final int aR = 1;
    public static final int aS = 2;
    public static final int aT = 16;
    public static final int aU = 32;
    public static final int aV = 64;
    public static final int aW = 1;
    public static final int aX = 2;
    public static final int aY = 4;
    public static final int aZ = 8;
    public static final int ba = 16;
    public static final int bb = 32;
    public static final int bc = 64;
    public static final int bd = 128;
    public static final int be = 256;
    public static final int bf = 512;
    public static final int bg = 511;
    public static final int bh = 1023;
    public static final int bi = 0x20000000;
    public static final int bj = 0x40000000;
    public static final int bk = Integer.MIN_VALUE;
    public static final int bl = -1;
    public static final int bm = -1;
    public static final int bn = 100;
    public static final int bo = 10000;
    public static final int bp = 1000000;
    public static final int bq = Integer.MIN_VALUE;
    public static final int br = Integer.MAX_VALUE;
    private final DummyWindow bt;
    private final long bu;
    private final int bv;
    private final int bw;
    private final String bx;
    private final String by;
    private final List bz = new ArrayList();
    private final List bA = new ArrayList();
    private final List bB = new ArrayList();
    private final int[] bC;
    private final Map bD = new HashMap();
    private final boolean bE;
    private boolean bF;
    private DataQueue bG;
    private int bH;
    private int bI;
    static Class bs;

    public IDirectInputDevice(DummyWindow dummyWindow, long l2, byte[] arrby, byte[] arrby2, int n2, int n3, String string, String string2) {
        int n4;
        this.bt = dummyWindow;
        this.bu = l2;
        this.by = string2;
        this.bx = string;
        this.bv = n2;
        this.bw = n3;
        this.m();
        try {
            this.l();
            this.h();
        }
        catch (IOException iOException) {
            net.java.games.input.ak.a("Failed to create rumblers: " + iOException.getMessage());
        }
        boolean bl2 = true;
        boolean bl3 = false;
        for (n4 = 0; n4 < this.bz.size(); ++n4) {
            DIDeviceObject dIDeviceObject = (DIDeviceObject)this.bz.get(n4);
            if (!dIDeviceObject.o()) continue;
            bl3 = true;
            if (dIDeviceObject.p()) continue;
            bl2 = false;
            break;
        }
        this.bE = bl2 && bl3;
        n4 = bl2 ? 2 : 1;
        this.f(n4);
        if (this.bB.size() > 0) {
            try {
                this.d(9);
            }
            catch (IOException iOException) {
                this.d(10);
            }
        } else {
            this.d(10);
        }
        this.c(32);
        this.j();
        this.bC = new int[this.bz.size()];
    }

    public final boolean a() {
        return this.bE;
    }

    public final dj[] b() {
        return this.bB.toArray(new dj[0]);
    }

    private final List h() {
        DIDeviceObject dIDeviceObject = this.e(1);
        if (dIDeviceObject == null) {
            return this.bB;
        }
        DIDeviceObject[] arrdIDeviceObject = new DIDeviceObject[]{dIDeviceObject};
        long[] arrl = new long[]{0L};
        for (int i2 = 0; i2 < this.bA.size(); ++i2) {
            aa aa2 = (aa)this.bA.get(i2);
            if ((aa2.d() & 0xFF) != 3 || (aa2.c() & 4) == 0) continue;
            this.bB.add(this.a(arrdIDeviceObject, arrl, aa2));
        }
        return this.bB;
    }

    private final dj a(DIDeviceObject[] arrdIDeviceObject, long[] arrl, aa aa2) {
        int[] arrn = new int[arrdIDeviceObject.length];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrn[i2] = arrdIDeviceObject[i2].d();
        }
        long l2 = IDirectInputDevice.nCreatePeriodicEffect(this.bu, aa2.a(), 17, -1, 0, 10000, -1, 0, arrn, arrl, 0, 0, 0, 0, 10000, 0, 0, 50000, 0);
        return new IDirectInputEffect(l2, aa2);
    }

    private static final native long nCreatePeriodicEffect(long var0, byte[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, long[] var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19);

    private final DIDeviceObject e(int n2) {
        for (int i2 = 0; i2 < this.bz.size(); ++i2) {
            DIDeviceObject dIDeviceObject = (DIDeviceObject)this.bz.get(i2);
            if (n2 != dIDeviceObject.a()) continue;
            return dIDeviceObject;
        }
        return null;
    }

    public final int a(DIDeviceObject dIDeviceObject) {
        return this.bC[dIDeviceObject.b()];
    }

    public final DIDeviceObject a(z z2) {
        int n2 = z2.b() / 4;
        return (DIDeviceObject)this.bz.get(n2);
    }

    public final x b(DIDeviceObject dIDeviceObject) {
        return (x)this.bD.get(dIDeviceObject);
    }

    public final void a(DIDeviceObject dIDeviceObject, x x2) {
        this.bD.put(dIDeviceObject, x2);
    }

    public final synchronized void c() {
        this.o();
        this.i();
        this.a(this.bC);
        this.bG.e();
        this.a(this.bG);
        this.bG.f();
    }

    public final synchronized boolean b(z z2) {
        z z3 = (z)this.bG.d();
        if (z3 == null) {
            return false;
        }
        z2.a(z3);
        return true;
    }

    private final void i() {
        int n2 = IDirectInputDevice.nPoll(this.bu);
        if (n2 != 0 && n2 != 1) {
            if (n2 == -2147024868) {
                this.j();
                return;
            }
            throw new IOException("Failed to poll device (" + Integer.toHexString(n2) + ")");
        }
    }

    private static final native int nPoll(long var0);

    private final void j() {
        int n2 = IDirectInputDevice.nAcquire(this.bu);
        if (n2 != 0 && n2 != -2147024891 && n2 != 1) {
            throw new IOException("Failed to acquire device (" + Integer.toHexString(n2) + ")");
        }
    }

    private static final native int nAcquire(long var0);

    private final void k() {
        int n2 = IDirectInputDevice.nUnacquire(this.bu);
        if (n2 != 0 && n2 != 1) {
            throw new IOException("Failed to unAcquire device (" + Integer.toHexString(n2) + ")");
        }
    }

    private static final native int nUnacquire(long var0);

    private final boolean a(DataQueue dataQueue) {
        int n2 = IDirectInputDevice.nGetDeviceData(this.bu, 0, dataQueue, dataQueue.i(), dataQueue.b(), dataQueue.h());
        if (n2 != 0 && n2 != 1) {
            if (n2 == -2147024868) {
                this.j();
                return false;
            }
            throw new IOException("Failed to get device data (" + Integer.toHexString(n2) + ")");
        }
        return true;
    }

    private static final native int nGetDeviceData(long var0, int var2, DataQueue var3, Object[] var4, int var5, int var6);

    private final void a(int[] arrn) {
        int n2 = IDirectInputDevice.nGetDeviceState(this.bu, arrn);
        if (n2 != 0) {
            if (n2 == -2147024868) {
                Arrays.fill(arrn, 0);
                this.j();
                return;
            }
            throw new IOException("Failed to get device state (" + Integer.toHexString(n2) + ")");
        }
    }

    private static final native int nGetDeviceState(long var0, int[] var2);

    private final void f(int n2) {
        DIDeviceObject[] arrdIDeviceObject = new DIDeviceObject[this.bz.size()];
        this.bz.toArray(arrdIDeviceObject);
        int n3 = IDirectInputDevice.nSetDataFormat(this.bu, n2, arrdIDeviceObject);
        if (n3 != 0) {
            throw new IOException("Failed to set data format (" + Integer.toHexString(n3) + ")");
        }
    }

    private static final native int nSetDataFormat(long var0, int var2, DIDeviceObject[] var3);

    public final String d() {
        return this.by;
    }

    public final int e() {
        return this.bv;
    }

    public final List f() {
        return this.bz;
    }

    private final void l() {
        int n2 = this.nEnumEffects(this.bu, 0);
        if (n2 != 0) {
            throw new IOException("Failed to enumerate effects (" + Integer.toHexString(n2) + ")");
        }
    }

    private final native int nEnumEffects(long var1, int var3);

    private final void a(byte[] arrby, int n2, int n3, int n4, int n5, String string) {
        this.bA.add(new aa(this, arrby, n2, n3, n4, n5, string));
    }

    private final void m() {
        int n2 = this.nEnumObjects(this.bu, 31);
        if (n2 != 0) {
            throw new IOException("Failed to enumerate objects (" + Integer.toHexString(n2) + ")");
        }
    }

    private final native int nEnumObjects(long var1, int var3);

    public final synchronized long[] a(int n2) {
        this.o();
        long[] arrl = new long[2];
        int n3 = IDirectInputDevice.nGetRangeProperty(this.bu, n2, arrl);
        if (n3 != 0) {
            throw new IOException("Failed to get object range (" + n3 + ")");
        }
        return arrl;
    }

    private static final native int nGetRangeProperty(long var0, int var2, long[] var3);

    public final synchronized int b(int n2) {
        this.o();
        return IDirectInputDevice.nGetDeadzoneProperty(this.bu, n2);
    }

    private static final native int nGetDeadzoneProperty(long var0, int var2);

    private final void a(byte[] arrby, int n2, int n3, int n4, int n5, int n6, String string) {
        l l2 = this.a(n2, n4, n5);
        int n7 = this.bI++;
        DIDeviceObject dIDeviceObject = new DIDeviceObject(this, l2, arrby, n2, n3, n4, n5, n6, string, n7);
        this.bz.add(dIDeviceObject);
    }

    private static final o g(int n2) {
        return net.java.games.input.ab.a(n2);
    }

    private final n n() {
        int n2 = this.bH++;
        return net.java.games.input.ab.b(n2);
    }

    private final l a(int n2, int n3, int n4) {
        switch (n2) {
            case 1: {
                return net.java.games.input.m.a;
            }
            case 2: {
                return net.java.games.input.m.b;
            }
            case 3: {
                return net.java.games.input.m.c;
            }
            case 4: {
                return net.java.games.input.m.d;
            }
            case 5: {
                return net.java.games.input.m.e;
            }
            case 6: {
                return net.java.games.input.m.f;
            }
            case 7: {
                return net.java.games.input.m.g;
            }
            case 10: {
                return net.java.games.input.m.C;
            }
            case 9: {
                return IDirectInputDevice.g(n4);
            }
            case 8: {
                return this.n();
            }
        }
        return net.java.games.input.m.D;
    }

    public final synchronized void c(int n2) {
        this.o();
        this.k();
        int n3 = IDirectInputDevice.nSetBufferSize(this.bu, n2);
        if (n3 != 0 && n3 != 1 && n3 != 2) {
            throw new IOException("Failed to set buffer size (" + Integer.toHexString(n3) + ")");
        }
        this.bG = new DataQueue(n2, bs == null ? (bs = IDirectInputDevice.a("net.java.games.input.z")) : bs);
        this.bG.b(this.bG.c());
        this.j();
    }

    private static final native int nSetBufferSize(long var0, int var2);

    public final synchronized void d(int n2) {
        this.o();
        int n3 = IDirectInputDevice.nSetCooperativeLevel(this.bu, this.bt.b(), n2);
        if (n3 != 0) {
            throw new IOException("Failed to set cooperative level (" + Integer.toHexString(n3) + ")");
        }
    }

    private static final native int nSetCooperativeLevel(long var0, long var2, int var4);

    public final synchronized void g() {
        if (!this.bF) {
            this.bF = true;
            for (int i2 = 0; i2 < this.bB.size(); ++i2) {
                IDirectInputEffect iDirectInputEffect = (IDirectInputEffect)this.bB.get(i2);
                iDirectInputEffect.c();
            }
            IDirectInputDevice.nRelease(this.bu);
        }
    }

    private static final native void nRelease(long var0);

    private final void o() {
        if (this.bF) {
            throw new IOException("Device is released");
        }
    }

    protected void finalize() {
        this.g();
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

