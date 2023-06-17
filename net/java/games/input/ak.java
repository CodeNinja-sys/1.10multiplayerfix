/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;
import net.java.games.a.a.a;
import net.java.games.input.DIDeviceObject;
import net.java.games.input.DummyWindow;
import net.java.games.input.IDirectInput;
import net.java.games.input.IDirectInputDevice;
import net.java.games.input.ab;
import net.java.games.input.ac;
import net.java.games.input.ad;
import net.java.games.input.al;
import net.java.games.input.am;
import net.java.games.input.an;
import net.java.games.input.ao;
import net.java.games.input.au;
import net.java.games.input.cf;
import net.java.games.input.i;
import net.java.games.input.k;
import net.java.games.input.l;
import net.java.games.input.n;
import net.java.games.input.q;
import net.java.games.input.s;
import net.java.games.input.t;
import net.java.games.input.w;
import net.java.games.input.x;

public final class ak
extends t
implements a {
    private static boolean d = false;
    private final q[] e;
    private final List f = new ArrayList();
    private final DummyWindow g;

    static void d(String string) {
        AccessController.doPrivileged(new al(string));
    }

    static String e(String string) {
        return (String)AccessController.doPrivileged(new am(string));
    }

    static String a(String string, String string2) {
        return (String)AccessController.doPrivileged(new an(string, string2));
    }

    public ak() {
        DummyWindow dummyWindow = null;
        q[] arrq = new q[]{};
        if (this.b()) {
            try {
                dummyWindow = new DummyWindow();
                try {
                    arrq = this.a(dummyWindow);
                }
                catch (IOException iOException) {
                    dummyWindow.a();
                    throw iOException;
                }
            }
            catch (IOException iOException) {
                ak.a("Failed to enumerate devices: " + iOException.getMessage());
            }
            this.g = dummyWindow;
            this.e = arrq;
            AccessController.doPrivileged(new ao(this));
        } else {
            this.g = null;
            this.e = arrq;
        }
    }

    public final q[] a() {
        return this.e;
    }

    private final k[] a(IDirectInputDevice iDirectInputDevice, boolean bl2) {
        List list = iDirectInputDevice.f();
        ArrayList<x> arrayList = new ArrayList<x>();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            DIDeviceObject dIDeviceObject = (DIDeviceObject)list.get(i2);
            l l2 = dIDeviceObject.e();
            if (l2 == null) continue;
            if (bl2 && l2 instanceof n) {
                l2 = ab.a((n)l2);
            }
            x x2 = new x(l2, dIDeviceObject);
            arrayList.add(x2);
            iDirectInputDevice.a(dIDeviceObject, x2);
        }
        k[] arrk = new k[arrayList.size()];
        arrayList.toArray(arrk);
        return arrk;
    }

    private final cf a(IDirectInputDevice iDirectInputDevice) {
        k[] arrk = this.a(iDirectInputDevice, true);
        ad ad2 = new ad(iDirectInputDevice, arrk, new q[0], iDirectInputDevice.b());
        if (ad2.k() != null && ad2.l() != null && ad2.n() != null) {
            return ad2;
        }
        return null;
    }

    private final i a(IDirectInputDevice iDirectInputDevice, s s2) {
        k[] arrk = this.a(iDirectInputDevice, false);
        w w2 = new w(iDirectInputDevice, arrk, new q[0], iDirectInputDevice.b(), s2);
        return w2;
    }

    private final au b(IDirectInputDevice iDirectInputDevice) {
        k[] arrk = this.a(iDirectInputDevice, false);
        return new ac(iDirectInputDevice, arrk, new q[0], iDirectInputDevice.b());
    }

    private final q c(IDirectInputDevice iDirectInputDevice) {
        switch (iDirectInputDevice.e()) {
            case 18: {
                return this.a(iDirectInputDevice);
            }
            case 19: {
                return this.b(iDirectInputDevice);
            }
            case 21: {
                return this.a(iDirectInputDevice, s.e);
            }
            case 22: {
                return this.a(iDirectInputDevice, s.k);
            }
            case 20: 
            case 23: 
            case 24: {
                return this.a(iDirectInputDevice, s.h);
            }
        }
        return this.a(iDirectInputDevice, s.a);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final q[] a(DummyWindow dummyWindow) {
        q[] arrq;
        ArrayList<q> arrayList = new ArrayList<q>();
        IDirectInput iDirectInput = new IDirectInput(dummyWindow);
        try {
            arrq = iDirectInput.a();
            for (int i2 = 0; i2 < arrq.size(); ++i2) {
                IDirectInputDevice iDirectInputDevice = (IDirectInputDevice)arrq.get(i2);
                q q2 = this.c(iDirectInputDevice);
                if (q2 != null) {
                    arrayList.add(q2);
                    this.f.add(iDirectInputDevice);
                    continue;
                }
                iDirectInputDevice.g();
            }
        }
        finally {
            iDirectInput.c();
        }
        arrq = new q[arrayList.size()];
        arrayList.toArray(arrq);
        return arrq;
    }

    public boolean b() {
        return d;
    }

    static boolean a(boolean bl2) {
        d = bl2;
        return d;
    }

    static List a(ak ak2) {
        return ak2.f;
    }

    static {
        String string = ak.a("os.name", "").trim();
        if (string.startsWith("Windows")) {
            d = true;
            if ("x86".equals(ak.e("os.arch"))) {
                ak.d("jinput-dx8");
            } else {
                ak.d("jinput-dx8_64");
            }
        }
    }
}

