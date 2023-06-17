/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.IOException;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;
import net.java.games.a.a.a;
import net.java.games.input.RawDevice;
import net.java.games.input.RawDeviceInfo;
import net.java.games.input.RawInputEventQueue;
import net.java.games.input.cw;
import net.java.games.input.cx;
import net.java.games.input.cy;
import net.java.games.input.dk;
import net.java.games.input.q;
import net.java.games.input.t;

public final class RawInputEnvironmentPlugin
extends t
implements a {
    private static boolean d = false;
    private final q[] e;

    static void d(String string) {
        AccessController.doPrivileged(new cw(string));
    }

    static String e(String string) {
        return (String)AccessController.doPrivileged(new cx(string));
    }

    static String a(String string, String string2) {
        return (String)AccessController.doPrivileged(new cy(string, string2));
    }

    public RawInputEnvironmentPlugin() {
        q[] arrq = new q[]{};
        if (this.b()) {
            try {
                RawInputEventQueue rawInputEventQueue = new RawInputEventQueue();
                arrq = this.a(rawInputEventQueue);
            }
            catch (IOException iOException) {
                RawInputEnvironmentPlugin.a("Failed to enumerate devices: " + iOException.getMessage());
            }
        }
        this.e = arrq;
    }

    public final q[] a() {
        return this.e;
    }

    private static final dk a(String string, List list) {
        string = string.replaceAll("#", "\\\\").toUpperCase();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            dk dk2 = (dk)list.get(i2);
            if (string.indexOf(dk2.b().toUpperCase()) == -1) continue;
            return dk2;
        }
        return null;
    }

    private static final void a(RawInputEventQueue rawInputEventQueue, List list, List list2, List list3) {
        ArrayList<RawDevice> arrayList = new ArrayList<RawDevice>();
        for (int i2 = 0; i2 < list2.size(); ++i2) {
            RawDeviceInfo rawDeviceInfo;
            q q2;
            RawDevice rawDevice = (RawDevice)list2.get(i2);
            dk dk2 = RawInputEnvironmentPlugin.a(rawDevice.j(), list3);
            if (dk2 == null || (q2 = (rawDeviceInfo = rawDevice.k()).a(rawDevice, dk2)) == null) continue;
            list.add(q2);
            arrayList.add(rawDevice);
        }
        rawInputEventQueue.a(arrayList);
    }

    private static final native void enumerateDevices(RawInputEventQueue var0, List var1);

    private final q[] a(RawInputEventQueue rawInputEventQueue) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        RawInputEnvironmentPlugin.enumerateDevices(rawInputEventQueue, arrayList2);
        List list = RawInputEnvironmentPlugin.d();
        RawInputEnvironmentPlugin.a(rawInputEventQueue, arrayList, arrayList2, list);
        q[] arrq = new q[arrayList.size()];
        arrayList.toArray(arrq);
        return arrq;
    }

    public boolean b() {
        return d;
    }

    private static final List d() {
        ArrayList arrayList = new ArrayList();
        RawInputEnvironmentPlugin.nEnumSetupAPIDevices(RawInputEnvironmentPlugin.getKeyboardClassGUID(), arrayList);
        RawInputEnvironmentPlugin.nEnumSetupAPIDevices(RawInputEnvironmentPlugin.getMouseClassGUID(), arrayList);
        return arrayList;
    }

    private static final native void nEnumSetupAPIDevices(byte[] var0, List var1);

    private static final native byte[] getKeyboardClassGUID();

    private static final native byte[] getMouseClassGUID();

    static boolean a(boolean bl2) {
        d = bl2;
        return d;
    }

    static {
        String string = RawInputEnvironmentPlugin.a("os.name", "").trim();
        if (string.startsWith("Windows")) {
            d = true;
            if ("x86".equals(RawInputEnvironmentPlugin.e("os.arch"))) {
                RawInputEnvironmentPlugin.d("jinput-raw");
            } else {
                RawInputEnvironmentPlugin.d("jinput-raw_64");
            }
        }
    }
}

