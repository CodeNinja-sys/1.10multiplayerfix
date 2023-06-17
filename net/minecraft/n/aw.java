/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.h.y;
import net.minecraft.n.aa;
import net.minecraft.n.ac;
import net.minecraft.n.az;
import net.minecraft.n.bp;
import net.minecraft.n.br;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.q.as;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.k;

public class aw
extends aa {
    @Override
    public String a() {
        return "clone";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(az az2) {
        return "commands.clone.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(a a2, az az2, String[] arrstring) {
        Object object;
        Object object2;
        if (arrstring.length < 9) {
            throw new ac("commands.clone.usage", new Object[0]);
        }
        az2.a(br.b, 0);
        net.minecraft.u.b.b b2 = aw.a(az2, arrstring, 0, false);
        net.minecraft.u.b.b b3 = aw.a(az2, arrstring, 3, false);
        net.minecraft.u.b.b b4 = aw.a(az2, arrstring, 6, false);
        dc dc2 = new dc(b2, b3);
        dc dc3 = new dc(b4, b4.a(dc2.b()));
        int n2 = dc2.c() * dc2.d() * dc2.e();
        if (n2 > 32768) {
            throw new o("commands.clone.tooManyBlocks", n2, 32768);
        }
        boolean bl2 = false;
        cn cn2 = null;
        int n3 = -1;
        if ((arrstring.length < 11 || !"force".equals(arrstring[10]) && !"move".equals(arrstring[10])) && dc2.a(dc3)) {
            throw new o("commands.clone.noOverlap", new Object[0]);
        }
        if (arrstring.length >= 11 && "move".equals(arrstring[10])) {
            bl2 = true;
        }
        if (dc2.b < 0 || dc2.e >= 256 || dc3.b < 0 || dc3.e >= 256) throw new o("commands.clone.outOfWorld", new Object[0]);
        k k2 = az2.aE();
        if (!k2.a(dc2) || !k2.a(dc3)) throw new o("commands.clone.outOfWorld", new Object[0]);
        boolean bl3 = false;
        if (arrstring.length >= 10) {
            if ("masked".equals(arrstring[9])) {
                bl3 = true;
            } else if ("filtered".equals(arrstring[9])) {
                if (arrstring.length < 12) {
                    throw new ac("commands.clone.usage", new Object[0]);
                }
                cn2 = aw.c(az2, arrstring[11]);
                if (arrstring.length >= 13) {
                    n3 = aw.a(arrstring[12], 0, 15);
                }
            }
        }
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a();
        ArrayList arrayList3 = ov.a();
        LinkedList linkedList = ov.b();
        net.minecraft.u.b.b b5 = new net.minecraft.u.b.b(dc3.a - dc2.a, dc3.b - dc2.b, dc3.c - dc2.c);
        for (int i2 = dc2.c; i2 <= dc2.f; ++i2) {
            for (int i3 = dc2.b; i3 <= dc2.e; ++i3) {
                for (int i4 = dc2.a; i4 <= dc2.d; ++i4) {
                    Object object3 = new net.minecraft.u.b.b(i4, i3, i2);
                    object2 = ((net.minecraft.u.b.b)object3).a(b5);
                    object = k2.n((net.minecraft.u.b.b)object3);
                    if (bl3 && object.c() == p.a || cn2 != null && (object.c() != cn2 || n3 >= 0 && object.c().b((b)object) != n3)) continue;
                    ap ap2 = k2.q((net.minecraft.u.b.b)object3);
                    if (ap2 != null) {
                        e e2 = ap2.a(new e());
                        arrayList2.add(new bp((net.minecraft.u.b.b)object2, (b)object, e2));
                        linkedList.addLast(object3);
                        continue;
                    }
                    if (!object.e() && !object.k()) {
                        arrayList3.add(new bp((net.minecraft.u.b.b)object2, (b)object, null));
                        linkedList.addFirst(object3);
                        continue;
                    }
                    arrayList.add(new bp((net.minecraft.u.b.b)object2, (b)object, null));
                    linkedList.addLast(object3);
                }
            }
        }
        if (bl2) {
            for (net.minecraft.u.b.b b6 : linkedList) {
                ap ap3 = k2.q(b6);
                if (ap3 instanceof y) {
                    ((y)((Object)ap3)).j();
                }
                k2.a(b6, p.cv.v(), 2);
            }
            for (net.minecraft.u.b.b b7 : linkedList) {
                k2.a(b7, p.a.v(), 3);
            }
        }
        ArrayList arrayList4 = ov.a();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        List list = ov.b(arrayList4);
        for (bp bp2 : list) {
            object2 = k2.q(bp2.a);
            if (object2 instanceof y) {
                ((y)object2).j();
            }
            k2.a(bp2.a, p.cv.v(), 2);
        }
        n2 = 0;
        for (bp bp3 : arrayList4) {
            if (!k2.a(bp3.a, bp3.b, 2)) continue;
            ++n2;
        }
        for (bp bp4 : arrayList2) {
            object2 = k2.q(bp4.a);
            if (bp4.c != null && object2 != null) {
                bp4.c.a("x", bp4.a.cy_());
                bp4.c.a("y", bp4.a.k());
                bp4.c.a("z", bp4.a.l());
                ((ap)object2).b(bp4.c);
                ((ap)object2).C();
            }
            k2.a(bp4.a, bp4.b, 2);
        }
        for (bp bp5 : list) {
            k2.a(bp5.a, bp5.b.c());
        }
        List list2 = k2.b(dc2, false);
        if (list2 != null) {
            for (Object object3 : list2) {
                if (!dc2.a(((as)object3).a)) continue;
                object = ((as)object3).a.a(b5);
                k2.b((net.minecraft.u.b.b)object, ((as)object3).a(), (int)(((as)object3).b - k2.F().e()), ((as)object3).c);
            }
        }
        if (n2 <= 0) {
            throw new o("commands.clone.failed", new Object[0]);
        }
        az2.a(br.b, n2);
        aw.a(az2, (t)this, "commands.clone.success", n2);
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return arrstring.length > 0 && arrstring.length <= 3 ? aw.a(arrstring, 0, b2) : (arrstring.length > 3 && arrstring.length <= 6 ? aw.a(arrstring, 3, b2) : (arrstring.length > 6 && arrstring.length <= 9 ? aw.a(arrstring, 6, b2) : (arrstring.length == 10 ? aw.a(arrstring, "replace", "masked", "filtered") : (arrstring.length == 11 ? aw.a(arrstring, "normal", "force", "move") : (arrstring.length == 12 && "filtered".equals(arrstring[9]) ? aw.a(arrstring, cn.v.c()) : Collections.emptyList())))));
    }
}

