/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.e;
import net.minecraft.q.a.a.m;
import net.minecraft.u.b.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class i {
    private static final d b = org.apache.logging.log4j.c.c();
    public static final i a = new i(new e[0]);
    private final e[] c;

    public i(e[] arre) {
        this.c = arre;
    }

    public List a(Random random, m m2) {
        ArrayList arrayList = ov.a();
        if (m2.a(this)) {
            e[] arre = this.c;
            int n2 = this.c.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                e e2 = arre[i2];
                e2.b(arrayList, random, m2);
            }
            m2.b(this);
        } else {
            b.f("Detected infinite loop in loot tables");
        }
        return arrayList;
    }

    public void a(y y2, Random random, m m2) {
        List list = this.a(random, m2);
        List list2 = this.a(y2, random);
        this.a(list, list2.size(), random);
        for (cu cu2 : list) {
            if (list2.isEmpty()) {
                b.f("Tried to over-fill a container");
                return;
            }
            if (cu2 == null) {
                y2.a((int)((Integer)list2.remove(list2.size() - 1)), null);
                continue;
            }
            y2.a((int)((Integer)list2.remove(list2.size() - 1)), cu2);
        }
    }

    private void a(List list, int n2, Random random) {
        cu cu2;
        ArrayList arrayList = ov.a();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            cu2 = (cu)iterator.next();
            if (cu2.b <= 0) {
                iterator.remove();
                continue;
            }
            if (cu2.b <= 1) continue;
            arrayList.add(cu2);
            iterator.remove();
        }
        while ((n2 -= list.size()) > 0 && arrayList.size() > 0) {
            cu2 = (cu)arrayList.remove(n.a(random, 0, arrayList.size() - 1));
            int n3 = n.a(random, 1, cu2.b / 2);
            cu2.b -= n3;
            cu cu3 = cu2.j();
            cu3.b = n3;
            if (cu2.b > 1 && random.nextBoolean()) {
                arrayList.add(cu2);
            } else {
                list.add(cu2);
            }
            if (cu3.b > 1 && random.nextBoolean()) {
                arrayList.add(cu3);
                continue;
            }
            list.add(cu3);
        }
        list.addAll(arrayList);
        Collections.shuffle(list, random);
    }

    private List a(y y2, Random random) {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < y2.e(); ++i2) {
            if (y2.a(i2) != null) continue;
            arrayList.add(i2);
        }
        Collections.shuffle(arrayList, random);
        return arrayList;
    }

    static /* synthetic */ e[] a(i i2) {
        return i2.c;
    }
}

