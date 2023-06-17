/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.util.HashSet;
import net.java.games.input.DummyWindow;
import net.java.games.input.RawDevice;
import net.java.games.input.RawDeviceInfo;
import net.java.games.input.RawInputEventQueue;

final class cz
extends Thread {
    private boolean a;
    private DummyWindow b;
    private IOException c;
    private final RawInputEventQueue d;

    public cz(RawInputEventQueue rawInputEventQueue) {
        this.d = rawInputEventQueue;
        this.setDaemon(true);
    }

    public final boolean a() {
        return this.a;
    }

    public final IOException b() {
        return this.c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        try {
            this.b = new DummyWindow();
        }
        catch (IOException iOException) {
            this.c = iOException;
        }
        this.a = true;
        HashSet<RawDeviceInfo> hashSet = RawInputEventQueue.a(this.d);
        synchronized (hashSet) {
            RawInputEventQueue.a(this.d).notify();
        }
        if (this.c != null) {
            return;
        }
        hashSet = new HashSet<RawDeviceInfo>();
        try {
            for (int i2 = 0; i2 < RawInputEventQueue.b(this.d).size(); ++i2) {
                RawDevice rawDevice = (RawDevice)RawInputEventQueue.b(this.d).get(i2);
                hashSet.add(rawDevice.k());
            }
            RawDeviceInfo[] arrrawDeviceInfo = new RawDeviceInfo[hashSet.size()];
            hashSet.toArray(arrrawDeviceInfo);
            try {
                RawInputEventQueue.a(this.b, arrrawDeviceInfo);
                while (!this.isInterrupted()) {
                    RawInputEventQueue.a(this.d, this.b);
                }
            }
            finally {
                this.b.a();
            }
        }
        catch (IOException iOException) {
            this.c = iOException;
        }
    }
}

