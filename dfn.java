/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.HashMap;
import java.util.TimerTask;
import net.minecraft.c.a;

class dfn
extends TimerTask {
    final /* synthetic */ et a;

    dfn(et et2) {
        this.a = et2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        HashMap hashMap;
        if (!et.a(this.a).a()) {
            return;
        }
        Object object = et.b(this.a);
        synchronized (object) {
            hashMap = sz.b(et.c(this.a));
            if (et.d(this.a) == 0) {
                hashMap.putAll(et.e(this.a));
            }
            hashMap.put("snooper_count", et.f(this.a));
            hashMap.put("snooper_token", et.g(this.a));
        }
        object = et.a(this.a) instanceof a ? (a)((Object)et.a(this.a)) : null;
        aix.a(et.h(this.a), hashMap, true, object == null ? null : object.au());
    }
}

