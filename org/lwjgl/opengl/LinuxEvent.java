/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;

final class LinuxEvent {
    public static final int a = 9;
    public static final int b = 10;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 18;
    public static final int k = 19;
    public static final int l = 12;
    public static final int m = 22;
    public static final int n = 33;
    private final ByteBuffer o = LinuxEvent.createEventBuffer();

    LinuxEvent() {
    }

    private static native ByteBuffer createEventBuffer();

    public void a(LinuxEvent linuxEvent) {
        int n2 = this.o.position();
        int n3 = linuxEvent.o.position();
        this.o.put(linuxEvent.o);
        this.o.position(n2);
        linuxEvent.o.position(n3);
    }

    public static native int getPending(long var0);

    public void a(long l2, long l3, boolean bl2, long l4) {
        LinuxEvent.nSendEvent(this.o, l2, l3, bl2, l4);
    }

    private static native void nSendEvent(ByteBuffer var0, long var1, long var3, boolean var5, long var6);

    public boolean a(long l2) {
        return LinuxEvent.nFilterEvent(this.o, l2);
    }

    private static native boolean nFilterEvent(ByteBuffer var0, long var1);

    public void b(long l2) {
        LinuxEvent.nNextEvent(l2, this.o);
    }

    private static native void nNextEvent(long var0, ByteBuffer var2);

    public int a() {
        return LinuxEvent.nGetType(this.o);
    }

    private static native int nGetType(ByteBuffer var0);

    public long b() {
        return LinuxEvent.nGetWindow(this.o);
    }

    private static native long nGetWindow(ByteBuffer var0);

    public void c(long l2) {
        LinuxEvent.nSetWindow(this.o, l2);
    }

    private static native void nSetWindow(ByteBuffer var0, long var1);

    public int c() {
        return LinuxEvent.nGetFocusMode(this.o);
    }

    private static native int nGetFocusMode(ByteBuffer var0);

    public int d() {
        return LinuxEvent.nGetFocusDetail(this.o);
    }

    private static native int nGetFocusDetail(ByteBuffer var0);

    public long e() {
        return LinuxEvent.nGetClientMessageType(this.o);
    }

    private static native long nGetClientMessageType(ByteBuffer var0);

    public int a(int n2) {
        return LinuxEvent.nGetClientData(this.o, n2);
    }

    private static native int nGetClientData(ByteBuffer var0, int var1);

    public int f() {
        return LinuxEvent.nGetClientFormat(this.o);
    }

    private static native int nGetClientFormat(ByteBuffer var0);

    public long g() {
        return LinuxEvent.nGetButtonTime(this.o);
    }

    private static native long nGetButtonTime(ByteBuffer var0);

    public int h() {
        return LinuxEvent.nGetButtonState(this.o);
    }

    private static native int nGetButtonState(ByteBuffer var0);

    public int i() {
        return LinuxEvent.nGetButtonType(this.o);
    }

    private static native int nGetButtonType(ByteBuffer var0);

    public int j() {
        return LinuxEvent.nGetButtonButton(this.o);
    }

    private static native int nGetButtonButton(ByteBuffer var0);

    public long k() {
        return LinuxEvent.nGetButtonRoot(this.o);
    }

    private static native long nGetButtonRoot(ByteBuffer var0);

    public int l() {
        return LinuxEvent.nGetButtonXRoot(this.o);
    }

    private static native int nGetButtonXRoot(ByteBuffer var0);

    public int m() {
        return LinuxEvent.nGetButtonYRoot(this.o);
    }

    private static native int nGetButtonYRoot(ByteBuffer var0);

    public int n() {
        return LinuxEvent.nGetButtonX(this.o);
    }

    private static native int nGetButtonX(ByteBuffer var0);

    public int o() {
        return LinuxEvent.nGetButtonY(this.o);
    }

    private static native int nGetButtonY(ByteBuffer var0);

    public long p() {
        return LinuxEvent.nGetKeyAddress(this.o);
    }

    private static native long nGetKeyAddress(ByteBuffer var0);

    public long q() {
        return LinuxEvent.nGetKeyTime(this.o);
    }

    private static native int nGetKeyTime(ByteBuffer var0);

    public int r() {
        return LinuxEvent.nGetKeyType(this.o);
    }

    private static native int nGetKeyType(ByteBuffer var0);

    public int s() {
        return LinuxEvent.nGetKeyKeyCode(this.o);
    }

    private static native int nGetKeyKeyCode(ByteBuffer var0);

    public int t() {
        return LinuxEvent.nGetKeyState(this.o);
    }

    private static native int nGetKeyState(ByteBuffer var0);
}

