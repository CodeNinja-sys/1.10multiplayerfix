/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import io.netty.c.a.g;
import io.netty.c.a.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.commons.c.aa;

public class bwm {
    private static final Map a = sz.c();
    private final cpk b;
    private final Map c = sz.c();
    private final ReadWriteLock d = new ReentrantReadWriteLock();
    private boolean e = true;
    private boolean f;

    public bwm(cpk cpk2) {
        this.b = cpk2;
    }

    public static bcz a(Class class_, ccd ccd2) {
        int n2;
        if (a.containsKey(class_)) {
            n2 = (Integer)a.get(class_) + 1;
        } else {
            int n3 = 0;
            Class class_2 = class_;
            while (class_2 != cpk.class) {
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
        return ccd2.a(n2);
    }

    public void a(bcz bcz2, Object object) {
        int n2 = bcz2.a();
        if (n2 > 254) {
            throw new IllegalArgumentException("Data value id is too big with " + n2 + "! (Max is " + 254 + ")");
        }
        if (this.c.containsKey(n2)) {
            throw new IllegalArgumentException("Duplicate id value for " + n2 + "!");
        }
        if (cbf.b(bcz2.b()) < 0) {
            throw new IllegalArgumentException("Unregistered serializer " + bcz2.b() + " for " + n2 + "!");
        }
        this.c(bcz2, object);
    }

    private void c(bcz bcz2, Object object) {
        om om2 = new om(bcz2, object);
        this.d.writeLock().lock();
        this.c.put(bcz2.a(), om2);
        this.e = false;
        this.d.writeLock().unlock();
    }

    private om c(bcz bcz2) {
        om om2;
        this.d.readLock().lock();
        try {
            om2 = (om)this.c.get(bcz2.a());
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Getting synched entity data");
            sx sx2 = cet2.a("Synched entity data");
            sx2.a("Data ID", bcz2);
            throw new oz(cet2);
        }
        this.d.readLock().unlock();
        return om2;
    }

    public Object a(bcz bcz2) {
        return this.c(bcz2).b();
    }

    public void b(bcz bcz2, Object object) {
        om om2 = this.c(bcz2);
        if (aa.c(object, om2.b())) {
            om2.a(object);
            this.b.a(bcz2);
            om2.a(true);
            this.f = true;
        }
    }

    public void b(bcz bcz2) {
        om.a(this.c(bcz2), true);
        this.f = true;
    }

    public boolean a() {
        return this.f;
    }

    public static void a(List list, si si2) {
        if (list != null) {
            int n2 = list.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                om om2 = (om)list.get(i2);
                bwm.a(si2, om2);
            }
        }
        si2.B(255);
    }

    public List b() {
        ArrayList arrayList = null;
        if (this.f) {
            this.d.readLock().lock();
            for (om om2 : this.c.values()) {
                if (!om2.c()) continue;
                om2.a(false);
                if (arrayList == null) {
                    arrayList = ov.a();
                }
                arrayList.add(om2);
            }
            this.d.readLock().unlock();
        }
        this.f = false;
        return arrayList;
    }

    public void a(si si2) {
        this.d.readLock().lock();
        for (om om2 : this.c.values()) {
            bwm.a(si2, om2);
        }
        this.d.readLock().unlock();
        si2.B(255);
    }

    public List c() {
        ArrayList arrayList = null;
        this.d.readLock().lock();
        for (om om2 : this.c.values()) {
            if (arrayList == null) {
                arrayList = ov.a();
            }
            arrayList.add(om2);
        }
        this.d.readLock().unlock();
        return arrayList;
    }

    private static void a(si si2, om om2) {
        bcz bcz2 = om2.a();
        int n2 = cbf.b(bcz2.b());
        if (n2 < 0) {
            throw new k("Unknown serializer type " + bcz2.b());
        }
        si2.B(bcz2.a());
        si2.d(n2);
        bcz2.b().a(si2, om2.b());
    }

    public static List b(si si2) {
        short s2;
        ArrayList arrayList = null;
        while ((s2 = si2.F()) != 255) {
            int n2;
            ccd ccd2;
            if (arrayList == null) {
                arrayList = ov.a();
            }
            if ((ccd2 = cbf.a(n2 = si2.e())) == null) {
                throw new g("Unknown serializer type " + n2);
            }
            arrayList.add(new om(ccd2.a(s2), ccd2.b(si2)));
        }
        return arrayList;
    }

    public void a(List list) {
        this.d.writeLock().lock();
        for (om om2 : list) {
            om om3 = (om)this.c.get(om2.a().a());
            if (om3 == null) continue;
            this.a(om3, om2);
            this.b.a(om2.a());
        }
        this.d.writeLock().unlock();
        this.f = true;
    }

    protected void a(om om2, om om3) {
        om2.a(om3.b());
    }

    public boolean d() {
        return this.e;
    }

    public void e() {
        this.f = false;
    }
}

