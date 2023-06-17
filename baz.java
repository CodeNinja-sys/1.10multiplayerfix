/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.c.an;
import com.a.a.c.f;
import com.a.b.k;
import com.a.b.r;
import java.io.File;
import java.lang.reflect.Type;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class baz {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final k b = new r().a((Type)((Object)bom.class), (Object)new da()).a((Type)((Object)hz.class), (Object)new bgt()).a((Type)((Object)cse.class), (Object)new anv()).a(aoe.class, (Object)new clz()).a(azp.class, (Object)new cjb()).a(cfv.class, (Object)new akb()).a(bak.class, (Object)new amm()).i();
    private final an c = f.a().a(new bxk(this, null));
    private final File d;

    public baz(File file) {
        this.d = file;
        this.a();
    }

    public cse a(bpx bpx2) {
        return (cse)this.c.c(bpx2);
    }

    public void a() {
        this.c.c();
        for (bpx bpx2 : bvm.a()) {
            this.a(bpx2);
        }
    }

    static /* synthetic */ d b() {
        return a;
    }

    static /* synthetic */ File a(baz baz2) {
        return baz2.d;
    }

    static /* synthetic */ k c() {
        return b;
    }
}

