/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.OSXHIDDevice;

final class OSXHIDDeviceIterator {
    private final long a = OSXHIDDeviceIterator.nCreateIterator();

    private static final native long nCreateIterator();

    public final void a() {
        OSXHIDDeviceIterator.nReleaseIterator(this.a);
    }

    private static final native void nReleaseIterator(long var0);

    public final OSXHIDDevice b() {
        return OSXHIDDeviceIterator.nNext(this.a);
    }

    private static final native OSXHIDDevice nNext(long var0);
}

