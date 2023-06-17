/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bl;
import com.a.a.d.mq;
import com.a.b.aa;
import com.a.b.u;
import com.a.b.v;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

public class ads
implements v {
    private static final bl a = new bih();
    private static final bl b = new ase();

    public bey a(w w2, Type type, u u2) {
        z z2 = w2.t();
        return new bey(this.b(z2), (agm)u2.a(z2.c("apply"), (Type)((Object)agm.class)));
    }

    private baa b(z z2) {
        if (z2.b("when")) {
            return ads.a(cwe.k(z2, "when"));
        }
        return baa.a;
    }

    static baa a(z z2) {
        Set set = z2.b();
        if (set.isEmpty()) {
            throw new aa("No elements found in selector");
        }
        if (set.size() == 1) {
            if (z2.b("OR")) {
                return new bxq(mq.a((Iterable)cwe.l(z2, "OR"), a));
            }
            if (z2.b("AND")) {
                return new bzx(mq.a((Iterable)cwe.l(z2, "AND"), a));
            }
            return ads.b((Map.Entry)set.iterator().next());
        }
        return new bzx(mq.a((Iterable)set, b));
    }

    private static cgc b(Map.Entry entry) {
        return new cgc((String)entry.getKey(), ((w)entry.getValue()).d());
    }

    @Override
    public /* synthetic */ Object b(w w2, Type type, u u2) {
        return this.a(w2, type, u2);
    }

    static /* synthetic */ cgc a(Map.Entry entry) {
        return ads.b(entry);
    }
}

