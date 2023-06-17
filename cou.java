/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class cou {
    private final Map a = sz.d();
    private final bpx b;
    private final String c;
    private final String d;

    public cou(String string, bpx bpx2, String string2) {
        this.d = string;
        this.b = bpx2;
        this.c = string2;
    }

    public bpx a(String string, List list, List list2) {
        if (string.isEmpty()) {
            return null;
        }
        string = this.d + string;
        dfl dfl2 = (dfl)this.a.get(string);
        if (dfl2 == null) {
            if (this.a.size() >= 256 && !this.a()) {
                return amb.d;
            }
            ArrayList arrayList = ov.a();
            for (auv auv2 : list) {
                arrayList.add(this.c + auv2.a() + ".png");
            }
            dfl2 = new dfl(null);
            dfl2.b = new bpx(string);
            bxy.B().P().a(dfl2.b, new iw(this.b, arrayList, list2));
            this.a.put(string, dfl2);
        }
        dfl2.a = System.currentTimeMillis();
        return dfl2.b;
    }

    private boolean a() {
        long l2 = System.currentTimeMillis();
        Iterator iterator = this.a.keySet().iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            dfl dfl2 = (dfl)this.a.get(string);
            if (l2 - dfl2.a <= 5000L) continue;
            bxy.B().P().c(dfl2.b);
            iterator.remove();
            return true;
        }
        return this.a.size() < 256;
    }
}

