/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.lwjgl.BufferUtils;
import org.lwjgl.d;
import org.lwjgl.opengl.LinuxEvent;
import org.lwjgl.opengl.fp;
import org.lwjgl.opengl.gx;

final class LinuxKeyboard {
    private static final int a = 1;
    private static final long b = 0L;
    private static final long c = 1L;
    private static final long d = 2L;
    private static final int e = 2;
    private static final int f = 4;
    private static final int g = 50;
    private final long h;
    private final long i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final ByteBuffer n;
    private final byte[] o = new byte[256];
    private final fp p = new fp(18);
    private final ByteBuffer q = ByteBuffer.allocate(18);
    private final int[] r = new int[50];
    private final ByteBuffer s = BufferUtils.a(50);
    private final CharsetDecoder t = Charset.forName("UTF-8").newDecoder();
    private final CharBuffer u = CharBuffer.allocate(50);
    private boolean v;
    private int w;
    private int x;
    private long y;
    private byte z;

    LinuxKeyboard(long l2, long l3) {
        long l4 = LinuxKeyboard.getModifierMapping(l2);
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        if (l4 != 0L) {
            int n6 = LinuxKeyboard.getMaxKeyPerMod(l4);
            for (int i2 = 0; i2 < 8; ++i2) {
                block7: for (int i3 = 0; i3 < n6; ++i3) {
                    int n7 = LinuxKeyboard.lookupModifierMap(l4, i2 * n6 + i3);
                    int n8 = (int)LinuxKeyboard.keycodeToKeySym(l2, n7);
                    int n9 = 1 << i2;
                    switch (n8) {
                        case 65407: {
                            n2 |= n9;
                            continue block7;
                        }
                        case 65406: {
                            n3 |= n9;
                            continue block7;
                        }
                        case 65509: {
                            if (i2 != 1) continue block7;
                            n4 = n9;
                            n5 = 0;
                            continue block7;
                        }
                        case 65510: {
                            if (i2 != 1 || n4 != 0) continue block7;
                            n5 = n9;
                            continue block7;
                        }
                    }
                }
            }
            LinuxKeyboard.freeModifierMapping(l4);
        }
        this.j = n2;
        this.k = n3;
        this.l = n4;
        this.m = n5;
        LinuxKeyboard.a(l2, true);
        this.h = LinuxKeyboard.openIM(l2);
        if (this.h != 0L) {
            this.i = LinuxKeyboard.createIC(this.h, l3);
            if (this.i != 0L) {
                LinuxKeyboard.setupIMEventMask(l2, l3, this.i);
            } else {
                this.a(l2);
            }
        } else {
            this.i = 0L;
        }
        this.n = LinuxKeyboard.allocateComposeStatus();
    }

    private static native long getModifierMapping(long var0);

    private static native void freeModifierMapping(long var0);

    private static native int getMaxKeyPerMod(long var0);

    private static native int lookupModifierMap(long var0, int var2);

    private static native long keycodeToKeySym(long var0, int var2);

    private static native long openIM(long var0);

    private static native long createIC(long var0, long var2);

    private static native void setupIMEventMask(long var0, long var2, long var4);

    private static native ByteBuffer allocateComposeStatus();

    private static void a(long l2, boolean bl2) {
        boolean bl3 = LinuxKeyboard.nSetDetectableKeyRepeat(l2, bl2);
        if (!bl3) {
            org.lwjgl.d.a((CharSequence)("Failed to set detectable key repeat to " + bl2));
        }
    }

    private static native boolean nSetDetectableKeyRepeat(long var0, boolean var2);

    public void a(long l2) {
        if (this.i != 0L) {
            LinuxKeyboard.destroyIC(this.i);
        }
        if (this.h != 0L) {
            LinuxKeyboard.closeIM(this.h);
        }
        LinuxKeyboard.a(l2, false);
    }

    private static native void destroyIC(long var0);

    private static native void closeIM(long var0);

    public void a(ByteBuffer byteBuffer) {
        this.b();
        this.p.a(byteBuffer);
    }

    public void b(ByteBuffer byteBuffer) {
        this.b();
        int n2 = byteBuffer.position();
        byteBuffer.put(this.o);
        byteBuffer.position(n2);
    }

    private void a(int n2, byte by2, int n3, long l2, boolean bl2) {
        this.q.clear();
        this.q.putInt(n2).put(by2).putInt(n3).putLong(l2).put(bl2 ? (byte)1 : 0);
        this.q.flip();
        this.p.b(this.q);
    }

    private int a(long l2, int[] arrn) {
        int n2 = LinuxKeyboard.lookupString(l2, this.s, this.n);
        for (int i2 = 0; i2 < n2; ++i2) {
            arrn[i2] = this.s.get(i2) & 0xFF;
        }
        return n2;
    }

    private static native int lookupString(long var0, ByteBuffer var2, ByteBuffer var3);

    private int b(long l2, int[] arrn) {
        int n2 = LinuxKeyboard.utf8LookupString(this.i, l2, this.s, this.s.position(), this.s.remaining());
        if (n2 != 2 && n2 != 4) {
            return 0;
        }
        this.s.flip();
        this.t.decode(this.s, this.u, true);
        this.s.compact();
        this.u.flip();
        int n3 = 0;
        while (this.u.hasRemaining() && n3 < arrn.length) {
            arrn[n3++] = this.u.get();
        }
        this.u.compact();
        return n3;
    }

    private static native int utf8LookupString(long var0, long var2, ByteBuffer var4, int var5, int var6);

    private int c(long l2, int[] arrn) {
        if (this.i != 0L) {
            return this.b(l2, arrn);
        }
        return this.a(l2, arrn);
    }

    private void a(long l2, int n2, byte by2, long l3, boolean bl2) {
        int n3 = this.c(l2, this.r);
        if (n3 > 0) {
            int n4 = this.r[0];
            this.a(n2, by2, n4, l3, bl2);
            for (int i2 = 1; i2 < n3; ++i2) {
                n4 = this.r[i2];
                this.a(0, (byte)0, n4, l3, bl2);
            }
        } else {
            this.a(n2, by2, 0, l3, bl2);
        }
    }

    private static boolean b(long l2) {
        return 65408L <= l2 && l2 <= 65469L || 0x11000000L <= l2 && l2 <= 0x1100FFFFL;
    }

    private static boolean c(long l2) {
        return l2 == 0L || (l2 & 0x10000000L) != 0L;
    }

    private static long a(long l2, int n2, int n3) {
        long l3 = LinuxKeyboard.lookupKeysym(l2, n2 * 2 + n3);
        if (LinuxKeyboard.c(l3) && n3 == 1) {
            l3 = LinuxKeyboard.lookupKeysym(l2, n2 * 2 + 0);
        }
        if (LinuxKeyboard.c(l3) && n2 == 1) {
            l3 = LinuxKeyboard.a(l2, 0, n3);
        }
        return l3;
    }

    private static native long lookupKeysym(long var0, int var2);

    private static native long toUpper(long var0);

    private long a(long l2, int n2) {
        long l3;
        int n3 = (n2 & this.k) != 0 ? 1 : 0;
        if ((n2 & this.j) != 0 && LinuxKeyboard.b(l3 = LinuxKeyboard.a(l2, n3, 1))) {
            if (((long)n2 & (1L | (long)this.m)) != 0L) {
                return LinuxKeyboard.a(l2, n3, 0);
            }
            return l3;
        }
        if (((long)n2 & 3L) == 0L) {
            return LinuxKeyboard.a(l2, n3, 0);
        }
        if (((long)n2 & 1L) == 0L) {
            l3 = LinuxKeyboard.a(l2, n3, 0);
            if ((n2 & this.l) != 0) {
                l3 = LinuxKeyboard.toUpper(l3);
            }
            return l3;
        }
        l3 = LinuxKeyboard.a(l2, n3, 1);
        if ((n2 & this.l) != 0) {
            l3 = LinuxKeyboard.toUpper(l3);
        }
        return l3;
    }

    private int b(long l2, int n2) {
        long l3 = this.a(l2, n2);
        int n3 = gx.a(l3);
        if (n3 == 0) {
            l3 = LinuxKeyboard.lookupKeysym(l2, 0);
            n3 = gx.a(l3);
        }
        return n3;
    }

    private static byte a(int n2) {
        switch (n2) {
            case 2: {
                return 1;
            }
            case 3: {
                return 0;
            }
        }
        throw new IllegalArgumentException("Unknown event_type: " + n2);
    }

    void a() {
        for (int i2 = 0; i2 < this.o.length; ++i2) {
            if (this.o[i2] == 0) continue;
            this.o[i2] = 0;
            this.a(i2, (byte)0, 0, 0L, false);
        }
    }

    private void a(long l2, long l3, int n2, int n3, int n4) {
        boolean bl2;
        int n5 = this.b(l2, n4);
        byte by2 = LinuxKeyboard.a(n2);
        boolean bl3 = bl2 = by2 == this.o[n5];
        if (bl2 && n2 == 3) {
            return;
        }
        this.o[n5] = by2;
        long l4 = l3 * 1000000L;
        if (n2 == 2) {
            if (this.v) {
                if (l4 == this.y && n3 == this.x) {
                    this.v = false;
                    bl2 = true;
                } else {
                    this.b();
                }
            }
            this.a(l2, n5, by2, l4, bl2);
        } else {
            this.b();
            this.v = true;
            this.w = n5;
            this.x = n3;
            this.y = l4;
            this.z = by2;
        }
    }

    private void b() {
        if (this.v) {
            this.a(this.w, this.z, 0, this.y, false);
            this.v = false;
        }
    }

    public boolean a(LinuxEvent linuxEvent) {
        switch (linuxEvent.a()) {
            case 2: 
            case 3: {
                this.a(linuxEvent.p(), linuxEvent.q(), linuxEvent.r(), linuxEvent.s(), linuxEvent.t());
                return true;
            }
        }
        return false;
    }
}

