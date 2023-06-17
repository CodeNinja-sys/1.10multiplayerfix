/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import com.a.a.d.sz;
import java.util.HashMap;
import java.util.TimerTask;
import net.minecraft.c.a;
import net.minecraft.p.d;
import net.minecraft.u.ao;

class e
extends TimerTask {
    final /* synthetic */ d a;

    e(d d2) {
        this.a = d2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        if (d.a(this.a).aj()) {
            HashMap hashMap;
            Object object = d.b(this.a);
            synchronized (object) {
                hashMap = sz.b(d.c(this.a));
                if (d.d(this.a) == 0) {
                    hashMap.putAll(d.e(this.a));
                }
                d d2 = this.a;
                int n2 = d.d(d2);
                d.a(d2, n2 + 1);
                hashMap.put("snooper_count", n2);
                hashMap.put("snooper_token", d.f(this.a));
            }
            object = d.a(this.a) instanceof a ? (a)d.a(this.a) : null;
            ao.a(d.g(this.a), hashMap, true, object == null ? null : ((a)object).aH());
        }
    }
}

