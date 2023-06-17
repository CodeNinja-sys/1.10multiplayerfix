/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.awt.event.KeyEvent;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.lwjgl.opengl.fp;

final class MacOSXNativeKeyboard
extends fp {
    private final byte[] a = new byte[256];
    private final ByteBuffer b = ByteBuffer.allocate(18);
    private ByteBuffer c;
    private boolean d;
    private long e;
    private int f;
    private byte g;
    private int h;
    private HashMap i = new HashMap();

    MacOSXNativeKeyboard(ByteBuffer byteBuffer) {
        super(18);
        this.d();
        this.c = byteBuffer;
    }

    private native void nRegisterKeyListener(ByteBuffer var1);

    private native void nUnregisterKeyListener(ByteBuffer var1);

    private void d() {
        this.i.put((short)29, 11);
        this.i.put((short)18, 2);
        this.i.put((short)19, 3);
        this.i.put((short)20, 4);
        this.i.put((short)21, 5);
        this.i.put((short)23, 6);
        this.i.put((short)22, 7);
        this.i.put((short)26, 8);
        this.i.put((short)28, 9);
        this.i.put((short)25, 10);
        this.i.put((short)0, 30);
        this.i.put((short)11, 48);
        this.i.put((short)8, 46);
        this.i.put((short)2, 32);
        this.i.put((short)14, 18);
        this.i.put((short)3, 33);
        this.i.put((short)5, 34);
        this.i.put((short)4, 35);
        this.i.put((short)34, 23);
        this.i.put((short)38, 36);
        this.i.put((short)40, 37);
        this.i.put((short)37, 38);
        this.i.put((short)46, 50);
        this.i.put((short)45, 49);
        this.i.put((short)31, 24);
        this.i.put((short)35, 25);
        this.i.put((short)12, 16);
        this.i.put((short)15, 19);
        this.i.put((short)1, 31);
        this.i.put((short)17, 20);
        this.i.put((short)32, 22);
        this.i.put((short)9, 47);
        this.i.put((short)13, 17);
        this.i.put((short)7, 45);
        this.i.put((short)16, 21);
        this.i.put((short)6, 44);
        this.i.put((short)42, 43);
        this.i.put((short)43, 51);
        this.i.put((short)24, 13);
        this.i.put((short)33, 26);
        this.i.put((short)27, 12);
        this.i.put((short)39, 40);
        this.i.put((short)30, 27);
        this.i.put((short)41, 39);
        this.i.put((short)44, 53);
        this.i.put((short)47, 52);
        this.i.put((short)50, 41);
        this.i.put((short)65, 83);
        this.i.put((short)67, 55);
        this.i.put((short)69, 78);
        this.i.put((short)71, 218);
        this.i.put((short)75, 181);
        this.i.put((short)76, 156);
        this.i.put((short)78, 74);
        this.i.put((short)81, 141);
        this.i.put((short)82, 82);
        this.i.put((short)83, 79);
        this.i.put((short)84, 80);
        this.i.put((short)85, 81);
        this.i.put((short)86, 75);
        this.i.put((short)87, 76);
        this.i.put((short)88, 77);
        this.i.put((short)89, 71);
        this.i.put((short)91, 72);
        this.i.put((short)92, 73);
        this.i.put((short)36, 28);
        this.i.put((short)48, 15);
        this.i.put((short)49, 57);
        this.i.put((short)51, 14);
        this.i.put((short)53, 1);
        this.i.put((short)54, 220);
        this.i.put((short)55, 219);
        this.i.put((short)56, 42);
        this.i.put((short)57, 58);
        this.i.put((short)58, 56);
        this.i.put((short)59, 29);
        this.i.put((short)60, 54);
        this.i.put((short)61, 184);
        this.i.put((short)62, 157);
        this.i.put((short)63, 196);
        this.i.put((short)119, 207);
        this.i.put((short)122, 59);
        this.i.put((short)120, 60);
        this.i.put((short)99, 61);
        this.i.put((short)118, 62);
        this.i.put((short)96, 63);
        this.i.put((short)97, 64);
        this.i.put((short)98, 65);
        this.i.put((short)100, 66);
        this.i.put((short)101, 67);
        this.i.put((short)109, 68);
        this.i.put((short)103, 87);
        this.i.put((short)111, 88);
        this.i.put((short)105, 100);
        this.i.put((short)107, 101);
        this.i.put((short)113, 102);
        this.i.put((short)106, 103);
        this.i.put((short)64, 104);
        this.i.put((short)79, 105);
        this.i.put((short)80, 113);
        this.i.put((short)117, 211);
        this.i.put((short)114, 210);
        this.i.put((short)115, 199);
        this.i.put((short)121, 209);
        this.i.put((short)116, 201);
        this.i.put((short)123, 203);
        this.i.put((short)124, 205);
        this.i.put((short)125, 208);
        this.i.put((short)126, 200);
        this.i.put((short)10, 167);
        this.i.put((short)110, 221);
        this.i.put((short)297, 146);
    }

    public void b() {
        this.nRegisterKeyListener(this.c);
    }

    public void c() {
        this.nUnregisterKeyListener(this.c);
    }

    public void a(int n2, byte by2, int n3, long l2, boolean bl2) {
        this.b.clear();
        this.b.putInt(n2).put(by2).putInt(n3).putLong(l2).put(bl2 ? (byte)1 : 0);
        this.b.flip();
        this.b(this.b);
    }

    public synchronized void c(ByteBuffer byteBuffer) {
        this.e();
        int n2 = byteBuffer.position();
        byteBuffer.put(this.a);
        byteBuffer.position(n2);
    }

    public synchronized void a(ByteBuffer byteBuffer) {
        this.e();
        super.a(byteBuffer);
    }

    private synchronized void a(int n2, byte by2, int n3, long l2) {
        if (n3 == 65535) {
            n3 = 0;
        }
        if (by2 == 1) {
            boolean bl2 = false;
            if (this.d) {
                if (l2 == this.e && this.f == n2) {
                    this.d = false;
                    bl2 = true;
                } else {
                    this.e();
                }
            }
            this.b(n2, by2, n3, l2, bl2);
        } else {
            this.e();
            this.d = true;
            this.e = l2;
            this.f = n2;
            this.g = by2;
            this.h = n3;
        }
    }

    private void e() {
        if (this.d) {
            this.b(this.f, this.g, this.h, this.e, false);
            this.d = false;
        }
    }

    public void b(int n2, byte by2, int n3, long l2, boolean bl2) {
        int n4 = this.a((short)n2);
        if (n4 < 0) {
            System.out.println("Unrecognized keycode: " + n2);
            return;
        }
        if (this.a[n4] == by2) {
            bl2 = true;
        }
        this.a[n4] = by2;
        int n5 = n3 & 0xFFFF;
        this.a(n4, by2, n5, l2, bl2);
    }

    private int a(short s2) {
        if (this.i.containsKey(s2)) {
            return (Integer)this.i.get(s2);
        }
        return -1;
    }

    public void a(int n2, String string, long l2) {
        char c2 = string == null || string.length() == 0 ? (char)'\u0000' : string.charAt(0);
        this.a(n2, (byte)1, c2, l2);
    }

    public void b(int n2, String string, long l2) {
        char c2 = string == null || string.length() == 0 ? (char)'\u0000' : string.charAt(0);
        this.a(n2, (byte)0, c2, l2);
    }

    public void a(KeyEvent keyEvent) {
    }
}

