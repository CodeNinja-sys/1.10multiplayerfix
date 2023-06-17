/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.client.g.a.a;
import net.minecraft.client.g.bm;
import net.minecraft.client.g.ce;
import net.minecraft.client.r;
import net.minecraft.f.l;
import net.minecraft.u.bp;

public class cj {
    private final Map a = sz.d();
    private final bp b;
    private final String c;
    private final String d;

    public cj(String string, bp bp2, String string2) {
        this.d = string;
        this.b = bp2;
        this.c = string2;
    }

    public bp a(String string, List list, List list2) {
        if (string.isEmpty()) {
            return null;
        }
        string = String.valueOf(this.d) + string;
        ce ce2 = (ce)this.a.get(string);
        if (ce2 == null) {
            if (this.a.size() >= 256 && !this.a()) {
                return bm.d;
            }
            ArrayList arrayList = ov.a();
            for (l l2 : list) {
                arrayList.add(String.valueOf(this.c) + l2.a() + ".png");
            }
            ce2 = new ce(null);
            ce2.b = new bp(string);
            r.z().N().a(ce2.b, new a(this.b, arrayList, list2));
            this.a.put(string, ce2);
        }
        ce2.a = System.currentTimeMillis();
        return ce2.b;
    }

    private boolean a() {
        long l2 = System.currentTimeMillis();
        Iterator iterator = this.a.keySet().iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            ce ce2 = (ce)this.a.get(string);
            if (l2 - ce2.a <= 5000L) continue;
            r.z().N().c(ce2.b);
            iterator.remove();
            return true;
        }
        return this.a.size() < 256;
    }
}

