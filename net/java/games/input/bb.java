/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import net.java.games.input.LinuxAbsInfo;
import net.java.games.input.LinuxEvent;
import net.java.games.input.LinuxEventDevice;
import net.java.games.input.ar;
import net.java.games.input.ax;
import net.java.games.input.az;
import net.java.games.input.bq;

final class bb {
    private static final LinuxEvent a = new LinuxEvent();
    private static final LinuxAbsInfo b = new LinuxAbsInfo();

    bb() {
    }

    public static final synchronized boolean a(ar ar2, LinuxEventDevice linuxEventDevice) {
        while (linuxEventDevice.a(a)) {
            ax ax2 = a.b();
            az az2 = linuxEventDevice.a(ax2);
            if (az2 == null) continue;
            float f2 = az2.a(a.a(), ax2);
            ar2.a(az2, f2, a.c());
            return true;
        }
        return false;
    }

    public static final synchronized float a(bq bq2) {
        int n2 = bq2.d().a();
        switch (n2) {
            case 1: {
                int n3 = bq2.d().b();
                float f2 = bq2.a().b(n3) ? 1.0f : 0.0f;
                return f2;
            }
            case 3: {
                bq2.a(b);
                return b.a();
            }
        }
        throw new RuntimeException("Unkown native_type: " + n2);
    }
}

