/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.n.a.cg;
import java.util.List;
import java.util.concurrent.CancellationException;

class aqj
implements cg {
    final /* synthetic */ chn a;
    final /* synthetic */ ajc b;
    final /* synthetic */ age c;

    aqj(age age2, chn chn2, ajc ajc2) {
        this.c = age2;
        this.a = chn2;
        this.b = ajc2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(List list) {
        age.a(this.c, this.a);
        this.a.f().lock();
        try {
            if (this.a.a() != czd.c) {
                if (!this.a.h()) {
                    age.b().f("Chunk render task was {} when I expected it to be uploading; aborting task", new Object[]{this.a.a()});
                }
                return;
            }
            this.a.a(czd.d);
        }
        finally {
            this.a.f().unlock();
        }
        this.a.b().a(this.b);
    }

    @Override
    public void a(Throwable throwable) {
        age.a(this.c, this.a);
        if (!(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
            bxy.B().a(cet.a(throwable, "Rendering chunk"));
        }
    }

    @Override
    public /* synthetic */ void a(Object object) {
        this.a((List)object);
    }
}

