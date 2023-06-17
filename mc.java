/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;

class mc
implements Runnable {
    final /* synthetic */ bil a;

    mc(bil bil2) {
        this.a = bil2;
    }

    @Override
    public void run() {
        ArrayList arrayList = ov.a((Iterable)((cmt)((Object)this.a.al())).u());
        for (czt czt2 : arrayList) {
            ((cmt)((Object)this.a.al())).e(czt2);
        }
    }
}

