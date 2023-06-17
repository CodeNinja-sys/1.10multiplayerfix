/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.DIDeviceObject;
import net.java.games.input.IDirectInputDevice;
import net.java.games.input.ar;
import net.java.games.input.k;
import net.java.games.input.x;
import net.java.games.input.z;

final class y {
    private static final z a = new z();

    y() {
    }

    public static final synchronized boolean a(ar ar2, IDirectInputDevice iDirectInputDevice) {
        if (!iDirectInputDevice.b(a)) {
            return false;
        }
        DIDeviceObject dIDeviceObject = iDirectInputDevice.a(a);
        x x2 = iDirectInputDevice.b(dIDeviceObject);
        if (x2 == null) {
            return false;
        }
        int n2 = dIDeviceObject.p() ? dIDeviceObject.b(a.a()) : a.a();
        ar2.a(x2, x2.j().a((float)n2), a.c());
        return true;
    }

    public static final float a(k k2, DIDeviceObject dIDeviceObject) {
        int n2 = dIDeviceObject.c().a(dIDeviceObject);
        float f2 = dIDeviceObject.p() ? (float)dIDeviceObject.a(n2) : (float)n2;
        return dIDeviceObject.a(f2);
    }
}

