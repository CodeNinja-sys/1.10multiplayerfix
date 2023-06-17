/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import io.netty.c.a.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import net.minecraft.k.i;
import net.minecraft.u.bo;
import net.minecraft.w.n;
import net.minecraft.x.a;
import net.minecraft.x.a.f;
import net.minecraft.x.a.g;
import net.minecraft.x.a.m;
import net.minecraft.x.a.q;
import org.apache.commons.c.aa;

public class o {
    private static final Map a = sz.c();
    private final n b;
    private final Map c = sz.c();
    private final ReadWriteLock d = new ReentrantReadWriteLock();
    private boolean e = true;
    private boolean f;

    public o(n n2) {
        this.b = n2;
    }

    public static g a(Class class_, m m2) {
        int n2;
        if (a.containsKey(class_)) {
            n2 = (Integer)a.get(class_) + 1;
        } else {
            int n3 = 0;
            Class class_2 = class_;
            while (class_2 != n.class) {
                if (!a.containsKey(class_2 = class_2.getSuperclass())) continue;
                n3 = (Integer)a.get(class_2) + 1;
                break;
            }
            n2 = n3;
        }
        if (n2 > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + n2 + "! (Max is " + 254 + ")");
        }
        a.put(class_, n2);
        return m2.a(n2);
    }

    public void a(g g2, Object object) {
        int n2 = g2.a();
        if (n2 > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + n2 + "! (Max is " + 254 + ")");
        }
        if (this.c.containsKey(n2)) {
            throw new IllegalArgumentException("Duplicate id value for " + n2 + "!");
        }
        if (q.b(g2.b()) < 0) {
            throw new IllegalArgumentException("Unregistered serializer " + g2.b() + " for " + n2 + "!");
        }
        this.c(g2, object);
    }

    private void c(g g2, Object object) {
        f f2 = new f(g2, object);
        this.d.writeLock().lock();
        this.c.put(g2.a(), f2);
        this.e = false;
        this.d.writeLock().unlock();
    }

    private f c(g g2) {
        f f2;
        this.d.readLock().lock();
        try {
            f2 = (f)this.c.get(g2.a());
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Getting synched entity data");
            i i2 = a2.a("Synched entity data");
            i2.a("Data ID", g2);
            throw new bo(a2);
        }
        this.d.readLock().unlock();
        return f2;
    }

    public Object a(g g2) {
        return this.c(g2).b();
    }

    public void b(g g2, Object object) {
        f f2 = this.c(g2);
        if (aa.c(object, f2.b())) {
            f2.a(object);
            this.b.a(g2);
            f2.a(true);
            this.f = true;
        }
    }

    public void b(g g2) {
        net.minecraft.x.a.f.a(this.c(g2), true);
        this.f = true;
    }

    public boolean a() {
        return this.f;
    }

    public static void a(List list, a a2) {
        if (list != null) {
            int n2 = list.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                f f2 = (f)list.get(i2);
                o.a(a2, f2);
            }
        }
        a2.B(255);
    }

    public List b() {
        ArrayList arrayList = null;
        if (this.f) {
            this.d.readLock().lock();
            for (f f2 : this.c.values()) {
                if (!f2.c()) continue;
                f2.a(false);
                if (arrayList == null) {
                    arrayList = ov.a();
                }
                arrayList.add(f2);
            }
            this.d.readLock().unlock();
        }
        this.f = false;
        return arrayList;
    }

    public void a(a a2) {
        this.d.readLock().lock();
        for (f f2 : this.c.values()) {
            o.a(a2, f2);
        }
        this.d.readLock().unlock();
        a2.B(255);
    }

    public List c() {
        ArrayList arrayList = null;
        this.d.readLock().lock();
        for (f f2 : this.c.values()) {
            if (arrayList == null) {
                arrayList = ov.a();
            }
            arrayList.add(f2);
        }
        this.d.readLock().unlock();
        return arrayList;
    }

    private static void a(a a2, f f2) {
        g g2 = f2.a();
        int n2 = q.b(g2.b());
        if (n2 < 0) {
            throw new k("Unknown serializer type " + g2.b());
        }
        a2.B(g2.a());
        a2.d(n2);
        g2.b().a(a2, f2.b());
    }

    public static List b(a a2) {
        short s2;
        ArrayList arrayList = null;
        while ((s2 = a2.F()) != 255) {
            int n2;
            m m2;
            if (arrayList == null) {
                arrayList = ov.a();
            }
            if ((m2 = q.a(n2 = a2.e())) == null) {
                throw new io.netty.c.a.g("Unknown serializer type " + n2);
            }
            arrayList.add(new f(m2.a(s2), m2.b(a2)));
        }
        return arrayList;
    }

    public void a(List list) {
        this.d.writeLock().lock();
        for (f f2 : list) {
            f f3 = (f)this.c.get(f2.a().a());
            if (f3 == null) continue;
            this.a(f3, f2);
            this.b.a(f2.a());
        }
        this.d.writeLock().unlock();
        this.f = true;
    }

    protected void a(f f2, f f3) {
        f2.a(f3.b());
    }

    public boolean d() {
        return this.e;
    }

    public void e() {
        this.f = false;
    }
}

