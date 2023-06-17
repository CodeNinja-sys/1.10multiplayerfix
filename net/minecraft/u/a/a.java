/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import net.minecraft.u.a.c;
import net.minecraft.u.a.d;
import net.minecraft.u.a.e;
import net.minecraft.u.a.f;
import net.minecraft.u.a.g;
import net.minecraft.u.cb;

public class a
implements d {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private final Map b = sz.c();
    private final Map c = sz.c();
    private final int d;

    public a(int n2) {
        this.d = n2;
    }

    public net.minecraft.e.e a(f f2, net.minecraft.e.e e2) {
        int n2 = e2.b("DataVersion", 99) ? e2.h("DataVersion") : -1;
        return n2 >= 510 ? e2 : this.a(f2, e2, n2);
    }

    @Override
    public net.minecraft.e.e a(f f2, net.minecraft.e.e e2, int n2) {
        if (n2 < this.d) {
            e2 = this.b(f2, e2, n2);
            e2 = this.c(f2, e2, n2);
        }
        return e2;
    }

    private net.minecraft.e.e b(f f2, net.minecraft.e.e e2, int n2) {
        List list = (List)this.c.get(f2);
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                g g2 = (g)list.get(i2);
                if (g2.a() <= n2) continue;
                e2 = g2.a(e2);
            }
        }
        return e2;
    }

    private net.minecraft.e.e c(f f2, net.minecraft.e.e e2, int n2) {
        List list = (List)this.b.get(f2);
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                e2 = ((e)list.get(i2)).a(this, e2, n2);
            }
        }
        return e2;
    }

    public void a(c c2, e e2) {
        this.a((f)c2, e2);
    }

    public void a(f f2, e e2) {
        this.a(this.b, f2).add(e2);
    }

    public void a(f f2, g g2) {
        List list = this.a(this.c, f2);
        int n2 = g2.a();
        if (n2 > this.d) {
            a.f("Ignored fix registered for version: {} as the DataVersion of the game is: {}", n2, this.d);
        } else if (!list.isEmpty() && ((g)cb.a(list)).a() > n2) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                if (((g)list.get(i2)).a() <= n2) continue;
                list.add(i2, g2);
                break;
            }
        } else {
            list.add(g2);
        }
    }

    private List a(Map map, f f2) {
        List list = (List)map.get(f2);
        if (list == null) {
            list = ov.a();
            map.put(f2, list);
        }
        return list;
    }
}

