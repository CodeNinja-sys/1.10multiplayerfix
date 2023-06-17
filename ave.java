/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Iterator;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ave {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Set b = aad.c();
    private final Set c = aad.c();
    private final cfe d;
    private int e;
    private int f = 3;
    private int g;

    public ave(cfe cfe2) {
        this.d = cfe2;
    }

    public void a(int n2, ck ck2) {
        this.b.add(new bkd(this, n2, ck2));
    }

    public void a(ck ck2) {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            bkd bkd2 = (bkd)iterator.next();
            ck ck3 = bkd2.a;
            if (ck3 != ck2) continue;
            if (bkd2.c) {
                bkd2.c = false;
                bkd2.a.d();
                this.c.remove(bkd2);
            }
            iterator.remove();
            return;
        }
    }

    public void a() {
        this.d.a("goalSetup");
        if (this.e++ % this.f == 0) {
            for (bkd bkd2 : this.b) {
                if (bkd2.c) {
                    if (this.b(bkd2) && this.a(bkd2)) continue;
                    bkd2.c = false;
                    bkd2.a.d();
                    this.c.remove(bkd2);
                    continue;
                }
                if (!this.b(bkd2) || !bkd2.a.b()) continue;
                bkd2.c = true;
                bkd2.a.c();
                this.c.add(bkd2);
            }
        } else {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                bkd bkd2;
                bkd2 = (bkd)iterator.next();
                if (this.a(bkd2)) continue;
                bkd2.c = false;
                bkd2.a.d();
                iterator.remove();
            }
        }
        this.d.b();
        if (!this.c.isEmpty()) {
            this.d.a("goalTick");
            for (bkd bkd2 : this.c) {
                bkd2.a.e();
            }
            this.d.b();
        }
    }

    private boolean a(bkd bkd2) {
        return bkd2.a.a();
    }

    private boolean b(bkd bkd2) {
        if (this.c.isEmpty()) {
            return true;
        }
        if (this.a(bkd2.a.h())) {
            return false;
        }
        for (bkd bkd3 : this.c) {
            if (bkd3 == bkd2 || !(bkd2.b >= bkd3.b ? !this.a(bkd2, bkd3) : !bkd3.a.g())) continue;
            return false;
        }
        return true;
    }

    private boolean a(bkd bkd2, bkd bkd3) {
        return (bkd2.a.h() & bkd3.a.h()) == 0;
    }

    public boolean a(int n2) {
        return (this.g & n2) > 0;
    }

    public void b(int n2) {
        this.g |= n2;
    }

    public void c(int n2) {
        this.g &= ~n2;
    }

    public void a(int n2, boolean bl2) {
        if (bl2) {
            this.c(n2);
        } else {
            this.b(n2);
        }
    }
}

