/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import com.c.a.c.c;
import com.c.a.e;
import java.util.HashMap;

class cvm
implements Runnable {
    final /* synthetic */ e a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bbu c;
    final /* synthetic */ jm d;

    cvm(jm jm2, e e2, boolean bl2, bbu bbu2) {
        this.d = jm2;
        this.a = e2;
        this.b = bl2;
        this.c = bbu2;
    }

    @Override
    public void run() {
        HashMap hashMap = sz.c();
        try {
            hashMap.putAll(jm.a(this.d).a(this.a, this.b));
        }
        catch (c c2) {
            // empty catch block
        }
        if (hashMap.isEmpty() && this.a.a().equals(bxy.B().M().e().a())) {
            this.a.c().h();
            this.a.c().a(bxy.B().N());
            hashMap.putAll(jm.a(this.d).a(this.a, false));
        }
        bxy.B().a(new arg(this, hashMap));
    }
}

