/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.i;

import com.a.a.d.ov;
import java.io.File;
import java.util.List;
import net.minecraft.client.i.a;
import net.minecraft.client.r;
import net.minecraft.e.e;
import net.minecraft.e.h;
import net.minecraft.e.q;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class j {
    private static final d a = org.apache.logging.log4j.c.c();
    private final r b;
    private final List c = ov.a();

    public j(r r2) {
        this.b = r2;
        this.a();
    }

    public void a() {
        try {
            this.c.clear();
            e e2 = h.a(new File(this.b.y, "servers.dat"));
            if (e2 == null) {
                return;
            }
            this.c.add(new a("Server 0", "000.000.000", false));
        }
        catch (Exception exception) {
            a.b("Couldn't load server list", (Throwable)exception);
        }
    }

    public void b() {
        try {
            Object object2;
            q q2 = new q();
            for (Object object2 : this.c) {
                q2.a(((a)object2).a());
            }
            object2 = new e();
            ((e)object2).a("servers", q2);
            h.a((e)object2, new File(this.b.y, "servers.dat"));
        }
        catch (Exception exception) {
            a.b("Couldn't save server list", (Throwable)exception);
        }
    }

    public a a(int n2) {
        return (a)this.c.get(n2);
    }

    public void b(int n2) {
        this.c.remove(n2);
    }

    public void a(a a2) {
        this.c.add(a2);
    }

    public int c() {
        return this.c.size();
    }

    public void a(int n2, int n3) {
        a a2 = this.a(n2);
        this.c.set(n2, this.a(n3));
        this.c.set(n3, a2);
        this.b();
    }

    public void a(int n2, a a2) {
        this.c.set(n2, a2);
    }

    public static void b(a a2) {
        j j2 = new j(r.z());
        j2.a();
        for (int i2 = 0; i2 < j2.c(); ++i2) {
            a a3 = j2.a(i2);
            if (!a3.a.equals(a2.a) || !a3.b.equals(a2.b)) continue;
            j2.a(i2, a2);
            break;
        }
        j2.b();
    }
}

