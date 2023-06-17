/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import org.lwjgl.opengl.fp;
import org.lwjgl.opengl.jf;

final class WindowsKeyboard {
    private final byte[] a = new byte[256];
    private final byte[] b = new byte[256];
    private final fp c = new fp(18);
    private final ByteBuffer d = ByteBuffer.allocate(18);
    private boolean e;
    private int f;
    private byte g;
    private int h;
    private long i;
    private boolean j;

    WindowsKeyboard() {
    }

    private static native boolean isWindowsNT();

    boolean a(int n2) {
        return this.a[n2] == 1;
    }

    void a(ByteBuffer byteBuffer) {
        if (this.a(42) && !WindowsKeyboard.c(160)) {
            this.a(16, 42, false, (byte)0, 0L, false);
        }
        if (this.a(54) && !WindowsKeyboard.c(161)) {
            this.a(16, 54, false, (byte)0, 0L, false);
        }
        int n2 = byteBuffer.position();
        byteBuffer.put(this.a);
        byteBuffer.position(n2);
    }

    private static native int MapVirtualKey(int var0, int var1);

    private static native int ToUnicode(int var0, int var1, ByteBuffer var2, CharBuffer var3, int var4, int var5);

    private static native int ToAscii(int var0, int var1, ByteBuffer var2, ByteBuffer var3, int var4);

    private static native int GetKeyboardState(ByteBuffer var0);

    private static native short GetKeyState(int var0);

    private static native short GetAsyncKeyState(int var0);

    private void a(int n2, byte by2, int n3, long l2, boolean bl2) {
        this.d.clear();
        this.d.putInt(n2).put(by2).putInt(n3).putLong(l2 * 1000000L).put(bl2 ? (byte)1 : 0);
        this.d.flip();
        this.c.b(this.d);
    }

    private static int a(int n2, int n3, boolean bl2) {
        switch (n2) {
            case 16: {
                return n3 == 54 ? 161 : 160;
            }
            case 17: {
                return bl2 ? 163 : 162;
            }
            case 18: {
                return bl2 ? 165 : 164;
            }
        }
        return n2;
    }

    private void a() {
        if (this.e) {
            this.e = false;
            this.a(this.f, this.g, this.h, this.i, this.j);
        }
    }

    private static boolean b(int n2) {
        return (n2 & 1) == 1;
    }

    private static boolean c(int n2) {
        return (WindowsKeyboard.GetAsyncKeyState(n2) & 0x8000) != 0;
    }

    void a(long l2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (!WindowsKeyboard.b(this.b[i2])) continue;
            this.a(i2, 0, false, (byte)0, l2, false);
        }
    }

    void a(int n2, int n3, boolean bl2, byte by2, long l2, boolean bl3) {
        n2 = WindowsKeyboard.a(n2, n3, bl2);
        if (!bl3 && WindowsKeyboard.b(by2) == WindowsKeyboard.b(this.b[n2])) {
            return;
        }
        this.a();
        this.e = true;
        int n4 = jf.a(n2);
        if (n4 < this.a.length) {
            this.a[n4] = by2;
            bl3 &= WindowsKeyboard.b(this.b[n2]);
            this.b[n2] = by2;
        }
        this.f = n4;
        this.g = by2;
        this.i = l2;
        this.h = 0;
        this.j = bl3;
    }

    void a(int n2, long l2, boolean bl2) {
        if (this.e && this.h != 0) {
            this.a();
        }
        if (!this.e) {
            this.a(0, (byte)0, n2, l2, bl2);
        } else {
            this.h = n2;
        }
    }

    void b(ByteBuffer byteBuffer) {
        this.a();
        this.c.a(byteBuffer);
    }
}

