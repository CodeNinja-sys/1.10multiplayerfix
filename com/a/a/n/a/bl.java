/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.ql;
import com.a.a.n.a.bk;
import com.a.a.n.a.bq;
import com.a.a.n.a.br;
import java.util.List;
import java.util.Map;
import java.util.Set;

class bl {
    final Map a = new ql().j().e();
    final Map b = new ql().j().e();
    final String c;

    bl(String string) {
        this.c = (String)cl.a(string);
    }

    String a() {
        return this.c;
    }

    void a(bq bq2, List list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a(bq2, (bl)list.get(i2));
        }
    }

    void a(bq bq2, bl bl2) {
        cl.b(this != bl2, "Attempted to acquire multiple locks with the same rank " + bl2.a());
        if (this.a.containsKey(bl2)) {
            return;
        }
        br br2 = (br)this.b.get(bl2);
        if (br2 != null) {
            br br3 = new br(bl2, this, br2.a(), null);
            bq2.a(br3);
            return;
        }
        Set set = aad.e();
        bk bk2 = bl2.a(this, set);
        if (bk2 == null) {
            this.a.put(bl2, new bk(bl2, this));
        } else {
            br br4 = new br(bl2, this, bk2, null);
            this.b.put(bl2, br4);
            bq2.a(br4);
        }
    }

    private bk a(bl bl2, Set set) {
        if (!set.add(this)) {
            return null;
        }
        bk bk2 = (bk)this.a.get(bl2);
        if (bk2 != null) {
            return bk2;
        }
        for (Map.Entry entry : this.a.entrySet()) {
            bl bl3 = (bl)entry.getKey();
            bk2 = bl3.a(bl2, set);
            if (bk2 == null) continue;
            bk bk3 = new bk(bl3, this);
            bk3.setStackTrace(((bk)entry.getValue()).getStackTrace());
            bk3.initCause(bk2);
            return bk3;
        }
        return null;
    }
}

