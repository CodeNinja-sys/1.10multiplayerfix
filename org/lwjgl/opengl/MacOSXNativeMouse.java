/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.MacOSXDisplay;
import org.lwjgl.opengl.fp;

final class MacOSXNativeMouse
extends fp {
    private static final int a = 120;
    private static final int b = 3;
    private ByteBuffer c;
    private MacOSXDisplay d;
    private boolean e;
    private float f;
    private float g;
    private int h;
    private float i;
    private float j;
    private boolean k;
    private final ByteBuffer l = ByteBuffer.allocate(22);
    private IntBuffer m = BufferUtils.d(2);
    private int n;
    private final byte[] o = new byte[3];

    MacOSXNativeMouse(MacOSXDisplay macOSXDisplay, ByteBuffer byteBuffer) {
        super(22);
        this.d = macOSXDisplay;
        this.c = byteBuffer;
    }

    private native void nSetCursorPosition(ByteBuffer var1, int var2, int var3);

    public static native void nGrabMouse(boolean var0);

    private native void nRegisterMouseListener(ByteBuffer var1);

    private native void nUnregisterMouseListener(ByteBuffer var1);

    private static native long nCreateCursor(int var0, int var1, int var2, int var3, int var4, IntBuffer var5, int var6, IntBuffer var7, int var8);

    private static native void nDestroyCursor(long var0);

    private static native void nSetCursor(long var0);

    public synchronized void b() {
        this.nRegisterMouseListener(this.c);
    }

    public static long a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer, IntBuffer intBuffer2) {
        return MacOSXNativeMouse.nCreateCursor(n2, n3, n4, n5, n6, intBuffer, intBuffer.position(), intBuffer2, intBuffer2 != null ? intBuffer2.position() : -1);
    }

    public static void a(long l2) {
        MacOSXNativeMouse.nDestroyCursor(l2);
    }

    public static void b(long l2) {
        MacOSXNativeMouse.nSetCursor(l2);
    }

    public synchronized void a(int n2, int n3) {
        this.nSetCursorPosition(this.c, n2, n3);
    }

    public synchronized void c() {
        this.nUnregisterMouseListener(this.c);
    }

    public synchronized void a(boolean bl2) {
        this.e = bl2;
        MacOSXNativeMouse.nGrabMouse(bl2);
        this.n = 1;
        this.g = 0.0f;
        this.f = 0.0f;
    }

    public synchronized boolean d() {
        return this.e;
    }

    protected void e() {
        this.a();
        this.g = 0.0f;
        this.f = 0.0f;
        if (this.d != null) {
            this.i = this.d.n() / 2;
            this.j = this.d.o() / 2;
        }
    }

    private void a(byte by2, byte by3, int n2, long l2) {
        if (this.e) {
            this.a(by2, by3, 0, 0, n2, l2);
        } else {
            this.a(by2, by3, (int)this.i, (int)this.j, n2, l2);
        }
    }

    protected void a(byte by2, byte by3, int n2, int n3, int n4, long l2) {
        this.l.clear();
        this.l.put(by2).put(by3).putInt(n2).putInt(n3).putInt(n4).putLong(l2);
        this.l.flip();
        this.b(this.l);
    }

    public synchronized void a(IntBuffer intBuffer, ByteBuffer byteBuffer) {
        if (this.e) {
            intBuffer.put(0, (int)this.f);
            intBuffer.put(1, (int)this.g);
        } else {
            intBuffer.put(0, (int)this.i);
            intBuffer.put(1, (int)this.j);
        }
        intBuffer.put(2, this.h);
        this.h = 0;
        this.f = this.g = (float)0;
        int n2 = byteBuffer.position();
        byteBuffer.put(this.o, 0, this.o.length);
        byteBuffer.position(n2);
    }

    private void a(float f2, float f3, long l2) {
        if (this.e) {
            return;
        }
        float f4 = f2 - this.i;
        float f5 = f3 - this.j;
        this.a(f4, f5);
        this.i = f2;
        this.j = f3;
        this.a((byte)-1, (byte)0, (int)f2, (int)f3, 0, l2);
    }

    protected void a(float f2, float f3) {
        this.f += f2;
        this.g += -f3;
    }

    public synchronized void a(int n2, int n3, long l2) {
        this.o[n2] = (byte)n3;
        this.a((byte)n2, (byte)n3, 0, l2);
    }

    public synchronized void a(float f2, float f3, float f4, float f5, float f6, long l2) {
        if (this.n > 0) {
            --this.n;
            if (this.n == 0) {
                this.i = f2;
                this.j = f3;
            }
            return;
        }
        if (f6 != 0.0f) {
            if (f5 == 0.0f) {
                f5 = f4;
            }
            int n2 = (int)(f5 * 120.0f);
            this.h += n2;
            this.a((byte)-1, (byte)0, n2, l2);
        } else if (this.e) {
            if (f4 != 0.0f || f5 != 0.0f) {
                this.a((byte)-1, (byte)0, (int)f4, (int)(-f5), 0, l2);
                this.a(f4, f5);
            }
        } else {
            this.a(f2, f3, l2);
        }
    }
}

