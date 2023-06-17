/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class DummyWindow {
    private final long a = DummyWindow.createWindow();

    private static final native long createWindow();

    public final void a() {
        DummyWindow.nDestroy(this.a);
    }

    private static final native void nDestroy(long var0);

    public final long b() {
        return this.a;
    }
}

