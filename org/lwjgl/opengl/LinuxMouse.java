/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.LinuxDisplay;
import org.lwjgl.opengl.LinuxEvent;
import org.lwjgl.opengl.fp;

final class LinuxMouse {
    private static final int a = 10;
    private static final int b = 120;
    private int c;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 3;
    private static final int g = 4;
    private static final int h = 5;
    private static final int i = 6;
    private static final int j = 7;
    private static final int k = 8;
    private static final int l = 9;
    private static final int m = 4;
    private static final int n = 5;
    private final long o;
    private final long p;
    private final long q;
    private final long r;
    private final IntBuffer s = BufferUtils.d(4);
    private final ByteBuffer t = ByteBuffer.allocate(22);
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private byte[] z;
    private fp A;
    private long B;

    LinuxMouse(long l2, long l3, long l4) {
        this.o = l2;
        this.p = l3;
        this.q = l4;
        this.r = LinuxDisplay.nInternAtom(l2, "_LWJGL", false);
        this.c = LinuxMouse.nGetButtonCount(l2);
        this.z = new byte[this.c];
        this.b(false, false);
    }

    private void b(boolean bl2, boolean bl3) {
        this.A = new fp(this.t.capacity());
        this.x = 0;
        this.w = 0;
        long l2 = LinuxMouse.nQueryPointer(this.o, this.p, this.s);
        int n2 = this.s.get(0);
        int n3 = this.s.get(1);
        int n4 = this.s.get(2);
        int n5 = this.s.get(3);
        this.u = n4;
        this.v = this.a(n5);
        this.a(bl2, bl3, l2, n2, n3, n4, n5, this.B);
    }

    public void a(ByteBuffer byteBuffer) {
        this.A.a(byteBuffer);
    }

    public void a(boolean bl2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        if (bl2) {
            intBuffer.put(0, this.w);
            intBuffer.put(1, this.x);
        } else {
            intBuffer.put(0, this.u);
            intBuffer.put(1, this.v);
        }
        intBuffer.put(2, this.y);
        this.y = 0;
        this.x = 0;
        this.w = 0;
        for (int i2 = 0; i2 < this.z.length; ++i2) {
            byteBuffer.put(i2, this.z[i2]);
        }
    }

    private void a(byte by2, byte by3, int n2, int n3, int n4, long l2) {
        this.t.clear();
        this.t.put(by2).put(by3).putInt(n2).putInt(n3).putInt(n4).putLong(l2);
        this.t.flip();
        this.A.b(this.t);
        this.B = l2;
    }

    private void a(boolean bl2, int n2, int n3, long l2) {
        n3 = this.a(n3);
        int n4 = n2 - this.u;
        int n5 = n3 - this.v;
        if (n4 != 0 || n5 != 0) {
            this.w += n4;
            this.x += n5;
            this.u = n2;
            this.v = n3;
            if (bl2) {
                this.a((byte)-1, (byte)0, n4, n5, 0, l2);
            } else {
                this.a((byte)-1, (byte)0, n2, n3, 0, l2);
            }
        }
    }

    private void b(int n2, int n3) {
        LinuxMouse.nSendWarpEvent(this.o, this.q, this.r, n2, n3);
        LinuxMouse.nWarpCursor(this.o, this.p, n2, n3);
    }

    private static native void nSendWarpEvent(long var0, long var2, long var4, int var6, int var7);

    private void a(boolean bl2, boolean bl3, long l2, int n2, int n3, int n4, int n5, long l3) {
        boolean bl4;
        this.a(bl2, n4, n5, l3);
        if (!bl3) {
            return;
        }
        int n6 = LinuxMouse.nGetWindowHeight(this.o, l2);
        int n7 = LinuxMouse.nGetWindowWidth(this.o, l2);
        int n8 = LinuxMouse.nGetWindowHeight(this.o, this.p);
        int n9 = LinuxMouse.nGetWindowWidth(this.o, this.p);
        int n10 = n2 - n4;
        int n11 = n3 - n5;
        int n12 = n10 + n9;
        int n13 = n11 + n8;
        int n14 = Math.max(0, n10);
        int n15 = Math.max(0, n11);
        int n16 = Math.min(n7, n12);
        int n17 = Math.min(n6, n13);
        boolean bl5 = bl4 = n2 < n14 + 10 || n3 < n15 + 10 || n2 > n16 - 10 || n3 > n17 - 10;
        if (bl4) {
            int n18 = (n16 - n14) / 2;
            int n19 = (n17 - n15) / 2;
            this.b(n18, n19);
        }
    }

    public void a(boolean bl2, boolean bl3) {
        this.b(bl2, bl3);
    }

    public int a() {
        return this.z.length;
    }

    private int a(int n2) {
        return LinuxMouse.nGetWindowHeight(this.o, this.p) - 1 - n2;
    }

    private static native int nGetWindowHeight(long var0, long var2);

    private static native int nGetWindowWidth(long var0, long var2);

    private static native int nGetButtonCount(long var0);

    private static native long nQueryPointer(long var0, long var2, IntBuffer var4);

    public void a(int n2, int n3) {
        LinuxMouse.nWarpCursor(this.o, this.p, n2, this.a(n3));
    }

    private static native void nWarpCursor(long var0, long var2, int var4, int var5);

    private void a(boolean bl2, boolean bl3, long l2, long l3, int n2, int n3, int n4, int n5) {
        this.a(bl2, bl3, l3, n2, n3, n4, n5, l2 * 1000000L);
    }

    private void a(boolean bl2, int n2, byte by2, long l2) {
        byte by3;
        switch (n2) {
            case 1: {
                by3 = 0;
                break;
            }
            case 2: {
                by3 = 2;
                break;
            }
            case 3: {
                by3 = 1;
                break;
            }
            case 6: {
                by3 = 5;
                break;
            }
            case 7: {
                by3 = 6;
                break;
            }
            case 8: {
                by3 = 3;
                break;
            }
            case 9: {
                by3 = 4;
                break;
            }
            default: {
                if (n2 > 9 && n2 <= this.c) {
                    by3 = (byte)(n2 - 1);
                    break;
                }
                return;
            }
        }
        this.z[by3] = by2;
        this.a(bl2, by3, by2, 0, l2);
    }

    private void a(boolean bl2, byte by2, byte by3, int n2, long l2) {
        if (bl2) {
            this.a(by2, by3, 0, 0, n2, l2);
        } else {
            this.a(by2, by3, this.u, this.v, n2, l2);
        }
    }

    private void a(boolean bl2, byte by2, long l2) {
        int n2 = 0;
        switch (by2) {
            case 4: {
                n2 = 120;
                this.a(bl2, (byte)-1, (byte)0, n2, l2);
                this.y += n2;
                break;
            }
            case 5: {
                n2 = -120;
                this.a(bl2, (byte)-1, (byte)0, n2, l2);
                this.y += n2;
                break;
            }
            default: {
                this.a(bl2, (int)by2, (byte)1, l2);
            }
        }
    }

    private void a(boolean bl2, long l2, int n2, byte by2) {
        long l3 = l2 * 1000000L;
        switch (n2) {
            case 5: {
                this.a(bl2, (int)by2, (byte)0, l3);
                break;
            }
            case 4: {
                this.a(bl2, by2, l3);
                break;
            }
        }
    }

    private void c(int n2, int n3) {
        this.u = n2;
        this.v = this.a(n3);
    }

    private void d(int n2, int n3) {
        this.c(n2, n3);
    }

    public boolean a(boolean bl2, boolean bl3, LinuxEvent linuxEvent) {
        switch (linuxEvent.a()) {
            case 33: {
                if (linuxEvent.e() != this.r) break;
                this.d(linuxEvent.a(0), linuxEvent.a(1));
                return true;
            }
            case 4: 
            case 5: {
                this.a(bl2, linuxEvent.g(), linuxEvent.i(), (byte)linuxEvent.j());
                return true;
            }
            case 6: {
                this.a(bl2, bl3, linuxEvent.g(), linuxEvent.k(), linuxEvent.l(), linuxEvent.m(), linuxEvent.n(), linuxEvent.o());
                return true;
            }
        }
        return false;
    }
}

