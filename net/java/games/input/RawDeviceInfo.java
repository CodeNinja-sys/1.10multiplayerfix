/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.RawDevice;
import net.java.games.input.dk;
import net.java.games.input.q;

abstract class RawDeviceInfo {
    RawDeviceInfo() {
    }

    public abstract q a(RawDevice var1, dk var2);

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public final boolean equals(Object object) {
        if (!(object instanceof RawDeviceInfo)) {
            return false;
        }
        RawDeviceInfo rawDeviceInfo = (RawDeviceInfo)object;
        return rawDeviceInfo.a() == this.a() && rawDeviceInfo.b() == this.b();
    }

    public final int hashCode() {
        return this.a() ^ this.b();
    }
}

