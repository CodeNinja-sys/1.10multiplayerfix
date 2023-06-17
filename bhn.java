/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.minecraft.c.a;

public class bhn
extends mn {
    @Override
    public String a() {
        return "clone";
    }

    @Override
    public int b() {
        return 2;
    }

    @Override
    public String a(ala ala2) {
        return "commands.clone.usage";
    }

    @Override
    public void a(a a2, ala ala2, String[] arrstring) {
        Object object;
        Object object2;
        Iterator iterator2;
        if (arrstring.length < 9) {
            throw new ben("commands.clone.usage", new Object[0]);
        }
        ala2.a(bnw.b, 0);
        cmz cmz2 = bhn.a(ala2, arrstring, 0, false);
        cmz cmz3 = bhn.a(ala2, arrstring, 3, false);
        cmz cmz4 = bhn.a(ala2, arrstring, 6, false);
        awx awx2 = new awx(cmz2, cmz3);
        awx awx3 = new awx(cmz4, cmz4.g(awx2.b()));
        int n2 = awx2.c() * awx2.d() * awx2.e();
        if (n2 > 32768) {
            throw new kx("commands.clone.tooManyBlocks", n2, 32768);
        }
        boolean bl2 = false;
        bfa bfa2 = null;
        int n3 = -1;
        if ((arrstring.length < 11 || !"force".equals(arrstring[10]) && !"move".equals(arrstring[10])) && awx2.a(awx3)) {
            throw new kx("commands.clone.noOverlap", new Object[0]);
        }
        if (arrstring.length >= 11 && "move".equals(arrstring[10])) {
            bl2 = true;
        }
        if (awx2.b < 0 || awx2.e >= 256 || awx3.b < 0 || awx3.e >= 256) {
            throw new kx("commands.clone.outOfWorld", new Object[0]);
        }
        iu iu2 = ala2.m_();
        if (!iu2.a(awx2) || !iu2.a(awx3)) {
            throw new kx("commands.clone.outOfWorld", new Object[0]);
        }
        boolean bl3 = false;
        if (arrstring.length >= 10) {
            if ("masked".equals(arrstring[9])) {
                bl3 = true;
            } else if ("filtered".equals(arrstring[9])) {
                if (arrstring.length < 12) {
                    throw new ben("commands.clone.usage", new Object[0]);
                }
                bfa2 = bhn.b(ala2, arrstring[11]);
                if (arrstring.length >= 13) {
                    n3 = bhn.a(arrstring[12], 0, 15);
                }
            }
        }
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a();
        ArrayList arrayList3 = ov.a();
        LinkedList linkedList = ov.b();
        cmz cmz5 = new cmz(awx3.a - awx2.a, awx3.b - awx2.b, awx3.c - awx2.c);
        for (int i2 = awx2.c; i2 <= awx2.f; ++i2) {
            for (int i3 = awx2.b; i3 <= awx2.e; ++i3) {
                for (int i4 = awx2.a; i4 <= awx2.d; ++i4) {
                    iterator2 = new cmz(i4, i3, i2);
                    object2 = ((cmz)((Object)iterator2)).g(cmz5);
                    object = iu2.n((cmz)((Object)iterator2));
                    if (bl3 && object.t() == blg.a || bfa2 != null && (object.t() != bfa2 || n3 >= 0 && object.t().e((dbk)object) != n3)) continue;
                    bql bql2 = iu2.q((cmz)((Object)iterator2));
                    if (bql2 != null) {
                        bvp bvp2 = bql2.b(new bvp());
                        arrayList2.add(new ta((cmz)object2, (dbk)object, bvp2));
                        linkedList.addLast(iterator2);
                        continue;
                    }
                    if (object.b() || object.h()) {
                        arrayList.add(new ta((cmz)object2, (dbk)object, null));
                        linkedList.addLast(iterator2);
                        continue;
                    }
                    arrayList3.add(new ta((cmz)object2, (dbk)object, null));
                    linkedList.addFirst(iterator2);
                }
            }
        }
        if (bl2) {
            for (cmz cmz6 : linkedList) {
                bql bql3 = iu2.q(cmz6);
                if (bql3 instanceof tb) {
                    ((tb)((Object)bql3)).g();
                }
                iu2.a(cmz6, blg.cv.s(), 2);
            }
            for (cmz cmz7 : linkedList) {
                iu2.a(cmz7, blg.a.s(), 3);
            }
        }
        ArrayList arrayList4 = ov.a();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        List list = ov.b(arrayList4);
        for (Iterator iterator2 : list) {
            object2 = iu2.q(((ta)iterator2).a);
            if (object2 instanceof tb) {
                ((tb)object2).g();
            }
            iu2.a(((ta)iterator2).a, blg.cv.s(), 2);
        }
        n2 = 0;
        for (Iterator iterator2 : arrayList4) {
            if (!iu2.a(((ta)iterator2).a, ((ta)iterator2).b, 2)) continue;
            ++n2;
        }
        for (Iterator iterator2 : arrayList2) {
            object2 = iu2.q(((ta)iterator2).a);
            if (((ta)iterator2).c != null && object2 != null) {
                ((ta)iterator2).c.a("x", ((ta)iterator2).a.a());
                ((ta)iterator2).c.a("y", ((ta)iterator2).a.b());
                ((ta)iterator2).c.a("z", ((ta)iterator2).a.c());
                ((bql)object2).a(((ta)iterator2).c);
                ((bql)object2).c_();
            }
            iu2.a(((ta)iterator2).a, ((ta)iterator2).b, 2);
        }
        for (Iterator iterator2 : list) {
            iu2.a(((ta)iterator2).a, ((ta)iterator2).b.t());
        }
        List list2 = iu2.b(awx2, false);
        if (list2 != null) {
            iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                object2 = (api)iterator2.next();
                if (!awx2.a(((api)object2).a)) continue;
                object = ((api)object2).a.g(cmz5);
                iu2.b((cmz)object, ((api)object2).a(), (int)(((api)object2).b - iu2.E().e()), ((api)object2).c);
            }
        }
        if (n2 <= 0) {
            throw new kx("commands.clone.failed", new Object[0]);
        }
        ala2.a(bnw.b, n2);
        bhn.a(ala2, (fh)this, "commands.clone.success", n2);
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        if (arrstring.length > 0 && arrstring.length <= 3) {
            return bhn.a(arrstring, 0, cmz2);
        }
        if (arrstring.length > 3 && arrstring.length <= 6) {
            return bhn.a(arrstring, 3, cmz2);
        }
        if (arrstring.length > 6 && arrstring.length <= 9) {
            return bhn.a(arrstring, 6, cmz2);
        }
        if (arrstring.length == 10) {
            return bhn.a(arrstring, "replace", "masked", "filtered");
        }
        if (arrstring.length == 11) {
            return bhn.a(arrstring, "normal", "force", "move");
        }
        if (arrstring.length == 12 && "filtered".equals(arrstring[9])) {
            return bhn.a(arrstring, bfa.v.c());
        }
        return Collections.emptyList();
    }
}

