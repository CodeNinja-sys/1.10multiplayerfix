/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cse {
    private static final d b = org.apache.logging.log4j.c.c();
    public static final cse a = new cse(new hz[0]);
    private final hz[] c;

    public cse(hz[] arrhz) {
        this.c = arrhz;
    }

    public List a(Random random, abe abe2) {
        ArrayList arrayList = ov.a();
        if (abe2.a(this)) {
            for (hz hz2 : this.c) {
                hz2.b(arrayList, random, abe2);
            }
            abe2.b(this);
        } else {
            b.f("Detected infinite loop in loot tables");
        }
        return arrayList;
    }

    public void a(tb tb2, Random random, abe abe2) {
        List list = this.a(random, abe2);
        List list2 = this.a(tb2, random);
        this.a(list, list2.size(), random);
        for (bhl bhl2 : list) {
            if (list2.isEmpty()) {
                b.f("Tried to over-fill a container");
                return;
            }
            if (bhl2 == null) {
                tb2.a((int)((Integer)list2.remove(list2.size() - 1)), null);
                continue;
            }
            tb2.a((int)((Integer)list2.remove(list2.size() - 1)), bhl2);
        }
    }

    private void a(List list, int n2, Random random) {
        ArrayList arrayList = ov.a();
        Object object = list.iterator();
        while (object.hasNext()) {
            bhl bhl2 = (bhl)object.next();
            if (bhl2.b <= 0) {
                object.remove();
                continue;
            }
            if (bhl2.b <= 1) continue;
            arrayList.add(bhl2);
            object.remove();
        }
        while ((n2 -= list.size()) > 0 && arrayList.size() > 0) {
            object = (bhl)arrayList.remove(cmk.a(random, 0, arrayList.size() - 1));
            int n3 = cmk.a(random, 1, ((bhl)object).b / 2);
            ((bhl)object).b -= n3;
            bhl bhl3 = ((bhl)object).j();
            bhl3.b = n3;
            if (((bhl)object).b > 1 && random.nextBoolean()) {
                arrayList.add(object);
            } else {
                list.add(object);
            }
            if (bhl3.b > 1 && random.nextBoolean()) {
                arrayList.add(bhl3);
                continue;
            }
            list.add(bhl3);
        }
        list.addAll(arrayList);
        Collections.shuffle(list, random);
    }

    private List a(tb tb2, Random random) {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < tb2.aI_(); ++i2) {
            if (tb2.a(i2) != null) continue;
            arrayList.add(i2);
        }
        Collections.shuffle(arrayList, random);
        return arrayList;
    }

    static /* synthetic */ hz[] a(cse cse2) {
        return cse2.c;
    }
}

