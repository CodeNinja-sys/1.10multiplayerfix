/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.java.games.input.DummyWindow;
import net.java.games.input.IDirectInputDevice;
import net.java.games.input.ak;

final class IDirectInput {
    private final List a = new ArrayList();
    private final long b;
    private final DummyWindow c;

    public IDirectInput(DummyWindow dummyWindow) {
        this.c = dummyWindow;
        this.b = IDirectInput.createIDirectInput();
        try {
            this.d();
        }
        catch (IOException iOException) {
            this.b();
            this.c();
            throw iOException;
        }
    }

    private static final native long createIDirectInput();

    public final List a() {
        return this.a;
    }

    private final void d() {
        this.nEnumDevices(this.b);
    }

    private final native void nEnumDevices(long var1);

    private final void a(long l2, byte[] arrby, byte[] arrby2, int n2, int n3, String string, String string2) {
        try {
            IDirectInputDevice iDirectInputDevice = new IDirectInputDevice(this.c, l2, arrby, arrby2, n2, n3, string, string2);
            this.a.add(iDirectInputDevice);
        }
        catch (IOException iOException) {
            ak.a("Failed to initialize device " + string2 + " because of: " + iOException);
        }
    }

    public final void b() {
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            IDirectInputDevice iDirectInputDevice = (IDirectInputDevice)this.a.get(i2);
            iDirectInputDevice.g();
        }
    }

    public final void c() {
        IDirectInput.nRelease(this.b);
    }

    private static final native void nRelease(long var0);
}

