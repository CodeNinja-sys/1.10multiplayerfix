/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.n.a.cg;
import com.a.a.n.a.fo;
import java.io.File;
import org.apache.commons.b.o;

class ccr
implements cg {
    final /* synthetic */ String a;
    final /* synthetic */ File b;
    final /* synthetic */ fo c;
    final /* synthetic */ hh d;

    ccr(hh hh2, String string, File file, fo fo2) {
        this.d = hh2;
        this.a = string;
        this.b = file;
        this.c = fo2;
    }

    @Override
    public void a(Object object) {
        if (hh.a(this.d, this.a, this.b)) {
            this.d.a(this.b);
            this.c.a((Object)null);
        } else {
            hh.i().f("Deleting file {}", this.b);
            o.e(this.b);
        }
    }

    @Override
    public void a(Throwable throwable) {
        o.e(this.b);
        this.c.a(throwable);
    }
}

