/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.util.List;
import net.java.games.input.DummyWindow;
import net.java.games.input.RawDevice;
import net.java.games.input.RawDeviceInfo;
import net.java.games.input.cz;

final class RawInputEventQueue {
    private final Object a = new Object();
    private List b;

    RawInputEventQueue() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(List list) {
        this.b = list;
        cz cz2 = new cz(this);
        Object object = this.a;
        synchronized (object) {
            cz2.start();
            while (!cz2.a()) {
                try {
                    this.a.wait();
                }
                catch (InterruptedException interruptedException) {}
            }
        }
        if (cz2.b() != null) {
            throw cz2.b();
        }
    }

    private final RawDevice a(long l2) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            RawDevice rawDevice = (RawDevice)this.b.get(i2);
            if (rawDevice.i() != l2) continue;
            return rawDevice;
        }
        return null;
    }

    private final void a(long l2, long l3, int n2, int n3, int n4, long l4, long l5, long l6, long l7) {
        RawDevice rawDevice = this.a(l2);
        if (rawDevice == null) {
            return;
        }
        rawDevice.a(l3, n2, n3, n4, l4, l5, l6, l7);
    }

    private final void a(long l2, long l3, int n2, int n3, int n4, int n5, long l4) {
        RawDevice rawDevice = this.a(l2);
        if (rawDevice == null) {
            return;
        }
        rawDevice.a(l3, n2, n3, n4, n5, l4);
    }

    private final void a(DummyWindow dummyWindow) {
        this.nPoll(dummyWindow.b());
    }

    private final native void nPoll(long var1);

    private static final void b(DummyWindow dummyWindow, RawDeviceInfo[] arrrawDeviceInfo) {
        RawInputEventQueue.nRegisterDevices(0, dummyWindow.b(), arrrawDeviceInfo);
    }

    private static final native void nRegisterDevices(int var0, long var1, RawDeviceInfo[] var3);

    static Object a(RawInputEventQueue rawInputEventQueue) {
        return rawInputEventQueue.a;
    }

    static List b(RawInputEventQueue rawInputEventQueue) {
        return rawInputEventQueue.b;
    }

    static void a(DummyWindow dummyWindow, RawDeviceInfo[] arrrawDeviceInfo) {
        RawInputEventQueue.b(dummyWindow, arrrawDeviceInfo);
    }

    static void a(RawInputEventQueue rawInputEventQueue, DummyWindow dummyWindow) {
        rawInputEventQueue.a(dummyWindow);
    }
}

