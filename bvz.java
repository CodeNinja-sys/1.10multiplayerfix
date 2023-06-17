/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.d.aad;
import com.a.a.d.sz;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class bvz {
    private final Map a = sz.g();
    private final Set b = aad.e();

    public void a(bfa bfa2, abr abr2) {
        this.a.put(bfa2, abr2);
    }

    public void a(bfa ... arrbfa) {
        Collections.addAll(this.b, arrbfa);
    }

    public Map a() {
        IdentityHashMap identityHashMap = sz.g();
        for (bfa bfa2 : bfa.v) {
            identityHashMap.putAll(this.b(bfa2));
        }
        return identityHashMap;
    }

    public Set a(bfa bfa2) {
        if (this.b.contains(bfa2)) {
            return Collections.emptySet();
        }
        abr abr2 = (abr)this.a.get(bfa2);
        if (abr2 == null) {
            return Collections.singleton(bfa.v.b(bfa2));
        }
        HashSet hashSet = aad.a();
        for (up up2 : abr2.a(bfa2).values()) {
            hashSet.add(new bpx(up2.c(), up2.b()));
        }
        return hashSet;
    }

    public Map b(bfa bfa2) {
        if (this.b.contains(bfa2)) {
            return Collections.emptyMap();
        }
        return ((abr)cc.b(this.a.get(bfa2), new aj())).a(bfa2);
    }
}

