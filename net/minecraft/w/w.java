/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Set;
import net.minecraft.k.i;
import net.minecraft.q.v;
import net.minecraft.u.ax;
import net.minecraft.u.bo;
import net.minecraft.w.a.g;
import net.minecraft.w.ab;
import net.minecraft.w.c.a;
import net.minecraft.w.c.d;
import net.minecraft.w.c.f;
import net.minecraft.w.c.j;
import net.minecraft.w.c.k;
import net.minecraft.w.c.m;
import net.minecraft.w.c.q;
import net.minecraft.w.c.r;
import net.minecraft.w.f.ad;
import net.minecraft.w.f.ae;
import net.minecraft.w.f.af;
import net.minecraft.w.f.e;
import net.minecraft.w.f.h;
import net.minecraft.w.f.p;
import net.minecraft.w.h.ac;
import net.minecraft.w.h.aj;
import net.minecraft.w.n;
import net.minecraft.w.y;
import net.minecraft.x.d.b.cc;
import org.apache.logging.log4j.c;

public class w {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private final v b;
    private final Set c = aad.a();
    private final ax d = new ax();
    private int e;

    public w(v v2) {
        this.b = v2;
        this.e = v2.l().av().d();
    }

    public static long a(double d2) {
        return net.minecraft.u.b.n.d(d2 * 4096.0);
    }

    public static void a(n n2, double d2, double d3, double d4) {
        n2.bK = w.a(d2);
        n2.bL = w.a(d3);
        n2.bM = w.a(d4);
    }

    public void a(n n2) {
        if (n2 instanceof g) {
            this.a(n2, 512, 2);
            g g2 = (g)n2;
            for (ab ab2 : this.c) {
                if (ab2.b() == g2) continue;
                ab2.b(g2);
            }
        } else if (n2 instanceof a) {
            this.a(n2, 64, 5, true);
        } else if (n2 instanceof f) {
            this.a(n2, 64, 20, false);
        } else if (n2 instanceof d) {
            this.a(n2, 64, 10, false);
        } else if (n2 instanceof q) {
            this.a(n2, 64, 10, false);
        } else if (n2 instanceof r) {
            this.a(n2, 64, 10, true);
        } else if (n2 instanceof net.minecraft.w.f.k) {
            this.a(n2, 64, 10, true);
        } else if (n2 instanceof net.minecraft.w.f.a) {
            this.a(n2, 64, 4, true);
        } else if (n2 instanceof m) {
            this.a(n2, 64, 10, true);
        } else if (n2 instanceof k) {
            this.a(n2, 64, 10, true);
        } else if (n2 instanceof p) {
            this.a(n2, 64, 10, true);
        } else if (n2 instanceof h) {
            this.a(n2, 64, 10, true);
        } else if (n2 instanceof ae) {
            this.a(n2, 64, 20, true);
        } else if (n2 instanceof net.minecraft.w.f.f) {
            this.a(n2, 80, 3, true);
        } else if (n2 instanceof net.minecraft.w.f.ab) {
            this.a(n2, 80, 3, true);
        } else if (n2 instanceof ac) {
            this.a(n2, 64, 3, true);
        } else if (n2 instanceof net.minecraft.w.d.e) {
            this.a(n2, 80, 3, false);
        } else if (n2 instanceof j) {
            this.a(n2, 80, 3, true);
        } else if (n2 instanceof aj) {
            this.a(n2, 80, 3, false);
        } else if (n2 instanceof net.minecraft.w.d.a) {
            this.a(n2, 160, 3, true);
        } else if (n2 instanceof net.minecraft.w.h.a) {
            this.a(n2, 80, 3, true);
        } else if (n2 instanceof af) {
            this.a(n2, 160, 10, true);
        } else if (n2 instanceof net.minecraft.w.f.n) {
            this.a(n2, 160, 20, true);
        } else if (n2 instanceof net.minecraft.w.j) {
            this.a(n2, 160, Integer.MAX_VALUE, false);
        } else if (n2 instanceof net.minecraft.w.f.j) {
            this.a(n2, 160, 3, true);
        } else if (n2 instanceof e) {
            this.a(n2, 160, 20, true);
        } else if (n2 instanceof net.minecraft.w.a) {
            this.a(n2, 160, Integer.MAX_VALUE, true);
        } else if (n2 instanceof ad) {
            this.a(n2, 256, Integer.MAX_VALUE, false);
        }
    }

    public void a(n n2, int n3, int n4) {
        this.a(n2, n3, n4, false);
    }

    public void a(n n2, int n3, int n4, boolean bl2) {
        try {
            if (this.d.b(n2.ca())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            ab ab2 = new ab(n2, n3, this.e, n4, bl2);
            this.c.add(ab2);
            this.d.a(n2.ca(), ab2);
            ab2.b(this.b.g);
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Adding entity to track");
            i i2 = a2.a("Entity To Track");
            i2.a("Tracking range", String.valueOf(n3) + " blocks");
            i2.a("Update interval", new y(this, n4));
            n2.a(i2);
            ((ab)this.d.a(n2.ca())).b().a(a2.a("Entity That Is Already Tracked"));
            try {
                throw new bo(a2);
            }
            catch (bo bo2) {
                a.b("\"Silently\" catching entity tracking error.", (Throwable)bo2);
            }
        }
    }

    public void b(n n2) {
        Object object;
        if (n2 instanceof g) {
            object = (g)n2;
            for (ab ab2 : this.c) {
                ab2.a((g)object);
            }
        }
        if ((object = (ab)this.d.d(n2.ca())) != null) {
            this.c.remove(object);
            ((ab)object).a();
        }
    }

    public void a() {
        ArrayList arrayList = ov.a();
        for (ab ab2 : this.c) {
            Object object;
            ab2.a(this.b.g);
            if (!ab2.b || !((object = ab2.b()) instanceof g)) continue;
            arrayList.add((g)object);
        }
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            g g2 = (g)arrayList.get(i2);
            for (Object object : this.c) {
                if (((ab)object).b() == g2) continue;
                ((ab)object).b(g2);
            }
        }
    }

    public void a(g g2) {
        for (ab ab2 : this.c) {
            if (ab2.b() == g2) {
                ab2.b(this.b.g);
                continue;
            }
            ab2.b(g2);
        }
    }

    public void a(n n2, net.minecraft.x.p p2) {
        ab ab2 = (ab)this.d.a(n2.ca());
        if (ab2 != null) {
            ab2.a(p2);
        }
    }

    public void b(n n2, net.minecraft.x.p p2) {
        ab ab2 = (ab)this.d.a(n2.ca());
        if (ab2 != null) {
            ab2.b(p2);
        }
    }

    public void b(g g2) {
        for (ab ab2 : this.c) {
            ab2.d(g2);
        }
    }

    public void a(g g2, net.minecraft.q.f.k k2) {
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a();
        for (Object object : this.c) {
            n n2 = ((ab)object).b();
            if (n2 == g2 || n2.bH != k2.b || n2.bJ != k2.c) continue;
            ((ab)object).b(g2);
            if (n2 instanceof net.minecraft.w.f && ((net.minecraft.w.f)n2).aQ() != null) {
                arrayList.add(n2);
            }
            if (n2.db().isEmpty()) continue;
            arrayList2.add(n2);
        }
        if (!arrayList.isEmpty()) {
            for (Object object : arrayList) {
                g2.a.a(new cc((n)object, ((net.minecraft.w.f)object).aQ()));
            }
        }
        if (!arrayList2.isEmpty()) {
            for (Object object : arrayList2) {
                g2.a.a(new net.minecraft.x.d.b.bo((n)object));
            }
        }
    }

    public void a(int n2) {
        this.e = (n2 - 1) * 16;
        for (ab ab2 : this.c) {
            ab2.a(this.e);
        }
    }
}

