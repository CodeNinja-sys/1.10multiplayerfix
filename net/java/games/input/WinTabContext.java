/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.util.ArrayList;
import net.java.games.input.DummyWindow;
import net.java.games.input.WinTabDevice;
import net.java.games.input.WinTabPacket;
import net.java.games.input.q;

public class WinTabContext {
    private DummyWindow a;
    private long b;
    private q[] c;

    public WinTabContext(DummyWindow dummyWindow) {
        this.a = dummyWindow;
    }

    public q[] a() {
        if (this.b == 0L) {
            throw new IllegalStateException("Context must be open before getting the controllers");
        }
        return this.c;
    }

    public synchronized void b() {
        this.b = WinTabContext.nOpen(this.a.b());
        ArrayList<WinTabDevice> arrayList = new ArrayList<WinTabDevice>();
        int n2 = WinTabContext.nGetNumberOfSupportedDevices();
        for (int i2 = 0; i2 < n2; ++i2) {
            WinTabDevice winTabDevice = WinTabDevice.a(this, i2);
            if (winTabDevice == null) continue;
            arrayList.add(winTabDevice);
        }
        this.c = arrayList.toArray(new q[0]);
    }

    public synchronized void c() {
        WinTabContext.nClose(this.b);
    }

    public synchronized void d() {
        WinTabPacket[] arrwinTabPacket = WinTabContext.nGetPackets(this.b);
        for (int i2 = 0; i2 < arrwinTabPacket.length; ++i2) {
            ((WinTabDevice)this.a()[0]).a(arrwinTabPacket[i2]);
        }
    }

    private static final native int nGetNumberOfSupportedDevices();

    private static final native long nOpen(long var0);

    private static final native void nClose(long var0);

    private static final native WinTabPacket[] nGetPackets(long var0);
}

