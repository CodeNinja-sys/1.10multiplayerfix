/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.List;
import net.java.games.a.a.a;
import net.java.games.input.DummyWindow;
import net.java.games.input.WinTabContext;
import net.java.games.input.dt;
import net.java.games.input.du;
import net.java.games.input.dv;
import net.java.games.input.dw;
import net.java.games.input.q;
import net.java.games.input.t;

public class ds
extends t
implements a {
    private static boolean d = false;
    private final q[] e;
    private final List f = new ArrayList();
    private final WinTabContext g;

    static void d(String string) {
        AccessController.doPrivileged(new dt(string));
    }

    static String e(String string) {
        return (String)AccessController.doPrivileged(new du(string));
    }

    static String a(String string, String string2) {
        return (String)AccessController.doPrivileged(new dv(string, string2));
    }

    public ds() {
        if (this.b()) {
            DummyWindow dummyWindow = null;
            WinTabContext winTabContext = null;
            q[] arrq = new q[]{};
            try {
                dummyWindow = new DummyWindow();
                winTabContext = new WinTabContext(dummyWindow);
                try {
                    winTabContext.b();
                    arrq = winTabContext.a();
                }
                catch (Exception exception) {
                    dummyWindow.a();
                    throw exception;
                }
            }
            catch (Exception exception) {
                ds.a("Failed to enumerate devices: " + exception.getMessage());
                exception.printStackTrace();
            }
            this.e = arrq;
            this.g = winTabContext;
            AccessController.doPrivileged(new dw(this));
        } else {
            this.g = null;
            this.e = new q[0];
        }
    }

    public boolean b() {
        return d;
    }

    public q[] a() {
        return this.e;
    }

    static boolean a(boolean bl2) {
        d = bl2;
        return d;
    }

    static List a(ds ds2) {
        return ds2.f;
    }

    static WinTabContext b(ds ds2) {
        return ds2.g;
    }

    static {
        String string = ds.a("os.name", "").trim();
        if (string.startsWith("Windows")) {
            d = true;
            ds.d("jinput-wintab");
        }
    }
}

