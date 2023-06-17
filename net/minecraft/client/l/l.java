/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.l;

import com.a.a.d.ov;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.i.i;
import net.minecraft.client.l.o;

public class l {
    private final List b = ov.a();
    boolean a;

    public synchronized boolean a() {
        return this.a;
    }

    public synchronized void b() {
        this.a = false;
    }

    public synchronized List c() {
        return Collections.unmodifiableList(this.b);
    }

    public synchronized void a(String string, InetAddress inetAddress) {
        String string2 = i.a(string);
        String string3 = i.b(string);
        if (string3 != null) {
            string3 = String.valueOf(inetAddress.getHostAddress()) + ":" + string3;
            boolean bl2 = false;
            for (o o2 : this.b) {
                if (!o2.b().equals(string3)) continue;
                o2.c();
                bl2 = true;
                break;
            }
            if (!bl2) {
                this.b.add(new o(string2, string3));
                this.a = true;
            }
        }
    }
}

