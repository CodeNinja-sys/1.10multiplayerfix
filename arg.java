/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.c.g;
import com.c.a.c.h;
import java.util.Map;

class arg
implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ cvm b;

    arg(cvm cvm2, Map map) {
        this.b = cvm2;
        this.a = map;
    }

    @Override
    public void run() {
        if (this.a.containsKey((Object)h.a)) {
            this.b.d.a((g)this.a.get((Object)h.a), h.a, this.b.c);
        }
        if (this.a.containsKey((Object)h.b)) {
            this.b.d.a((g)this.a.get((Object)h.b), h.b, this.b.c);
        }
    }
}

