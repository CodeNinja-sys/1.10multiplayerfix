/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.b;

import com.a.a.b.cc;
import com.a.a.d.aad;
import com.a.a.d.sz;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.b.c;
import net.minecraft.client.g.b.b.f;
import net.minecraft.g.cn;
import net.minecraft.u.bp;

public class b {
    private final Map a = sz.g();
    private final Set b = aad.e();

    public void a(cn cn2, f f2) {
        this.a.put(cn2, f2);
    }

    public void a(cn ... arrcn) {
        Collections.addAll(this.b, arrcn);
    }

    public Map a() {
        IdentityHashMap identityHashMap = sz.g();
        for (cn cn2 : cn.v) {
            identityHashMap.putAll(this.b(cn2));
        }
        return identityHashMap;
    }

    public Set a(cn cn2) {
        if (this.b.contains(cn2)) {
            return Collections.emptySet();
        }
        f f2 = (f)this.a.get(cn2);
        if (f2 == null) {
            return Collections.singleton((bp)cn.v.b(cn2));
        }
        HashSet hashSet = aad.a();
        for (ag ag2 : f2.a(cn2).values()) {
            hashSet.add(new bp(ag2.c(), ag2.b()));
        }
        return hashSet;
    }

    public Map b(cn cn2) {
        return this.b.contains(cn2) ? Collections.emptyMap() : ((f)cc.b((f)this.a.get(cn2), new c())).a(cn2);
    }
}

