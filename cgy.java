/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class cgy
implements bzs {
    private static final d a = org.apache.logging.log4j.c.c();
    private final Map b = sz.c();
    private final Map c = sz.c();
    private final int d;

    public cgy(int n2) {
        this.d = n2;
    }

    public bvp a(bsl bsl2, bvp bvp2) {
        int n2;
        int n3 = n2 = bvp2.b("DataVersion", 99) ? bvp2.h("DataVersion") : -1;
        if (n2 >= 510) {
            return bvp2;
        }
        return this.a(bsl2, bvp2, n2);
    }

    @Override
    public bvp a(bsl bsl2, bvp bvp2, int n2) {
        if (n2 < this.d) {
            bvp2 = this.b(bsl2, bvp2, n2);
            bvp2 = this.c(bsl2, bvp2, n2);
        }
        return bvp2;
    }

    private bvp b(bsl bsl2, bvp bvp2, int n2) {
        List list = (List)this.c.get(bsl2);
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                akc akc2 = (akc)list.get(i2);
                if (akc2.a() <= n2) continue;
                bvp2 = akc2.a(bvp2);
            }
        }
        return bvp2;
    }

    private bvp c(bsl bsl2, bvp bvp2, int n2) {
        List list = (List)this.b.get(bsl2);
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                bvp2 = ((cui)list.get(i2)).a(this, bvp2, n2);
            }
        }
        return bvp2;
    }

    public void a(bst bst2, cui cui2) {
        this.a((bsl)bst2, cui2);
    }

    public void a(bsl bsl2, cui cui2) {
        this.a(this.b, bsl2).add(cui2);
    }

    public void a(bsl bsl2, akc akc2) {
        List list = this.a(this.c, bsl2);
        int n2 = akc2.a();
        if (n2 > this.d) {
            a.f("Ignored fix registered for version: {} as the DataVersion of the game is: {}", n2, this.d);
            return;
        }
        if (list.isEmpty() || ((akc)asj.a(list)).a() <= n2) {
            list.add(akc2);
        } else {
            for (int i2 = 0; i2 < list.size(); ++i2) {
                if (((akc)list.get(i2)).a() <= n2) continue;
                list.add(i2, akc2);
                break;
            }
        }
    }

    private List a(Map map, bsl bsl2) {
        List list = (List)map.get(bsl2);
        if (list == null) {
            list = ov.a();
            map.put(bsl2, list);
        }
        return list;
    }
}

