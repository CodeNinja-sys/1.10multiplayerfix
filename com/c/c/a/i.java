/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.a.j;
import com.c.c.a.k;
import com.c.c.b.u;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class i {
    public static List a(k ... arrk) {
        for (k k2 : arrk) {
            i.a(k.a(k2));
        }
        ArrayList arrayList = new ArrayList();
        for (k k3 : arrk) {
            arrayList.add(new u(k.b(k3), i.a(k.a(k3))));
        }
        Collections.sort(arrayList, new j());
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static int a(String string) {
        int n2 = 700;
        long l2 = 0L;
        Socket socket = null;
        for (int i2 = 0; i2 < 5; ++i2) {
            try {
                InetSocketAddress inetSocketAddress = new InetSocketAddress(string, 80);
                socket = new Socket();
                long l3 = i.b();
                socket.connect(inetSocketAddress, 700);
                l2 += i.b() - l3;
                i.a(socket);
                continue;
            }
            catch (Exception exception) {
                l2 += 700L;
                continue;
            }
            finally {
                i.a(socket);
            }
        }
        return (int)((double)l2 / 5.0);
    }

    private static void a(Socket socket) {
        try {
            if (socket != null) {
                socket.close();
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static long b() {
        return System.currentTimeMillis();
    }

    public static List a() {
        return i.a(k.values());
    }
}

