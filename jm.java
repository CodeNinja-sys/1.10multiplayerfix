/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.c.an;
import com.a.a.c.f;
import com.c.a.c.g;
import com.c.a.c.h;
import com.c.a.c.i;
import com.c.a.e;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class jm {
    private static final ExecutorService a = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    private final bnm b;
    private final File c;
    private final i d;
    private final an e;

    public jm(bnm bnm2, File file, i i2) {
        this.b = bnm2;
        this.c = file;
        this.d = i2;
        this.e = f.a().b(15L, TimeUnit.SECONDS).a(new jy(this));
    }

    public bpx a(g g2, h h2) {
        return this.a(g2, h2, null);
    }

    public bpx a(g g2, h h2, bbu bbu2) {
        bpx bpx2 = new bpx("skins/" + g2.b());
        dfs dfs2 = this.b.b(bpx2);
        if (dfs2 != null) {
            if (bbu2 != null) {
                bbu2.a(h2, bpx2, g2);
            }
        } else {
            File file = new File(this.c, g2.b().length() > 2 ? g2.b().substring(0, 2) : "xx");
            File file2 = new File(file, g2.b());
            bmu bmu2 = h2 == h.a ? new bmu() : null;
            bjm bjm2 = new bjm(file2, g2.a(), ccj.a(), new cfs(this, bmu2, bbu2, h2, bpx2, g2));
            this.b.a(bpx2, bjm2);
        }
        return bpx2;
    }

    public void a(e e2, bbu bbu2, boolean bl2) {
        a.submit(new cvm(this, e2, bl2, bbu2));
    }

    public Map a(e e2) {
        return (Map)this.e.c(e2);
    }

    static /* synthetic */ i a(jm jm2) {
        return jm2.d;
    }
}

