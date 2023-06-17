/*
 * Decompiled with CFR 0.150.
 */
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.util.b.ad;

class aqy
implements Runnable {
    final /* synthetic */ dfj a;
    final /* synthetic */ dfj b;
    final /* synthetic */ ds c;
    final /* synthetic */ ad[] d;
    final /* synthetic */ sz e;

    aqy(sz sz2, dfj dfj2, dfj dfj3, ds ds2, ad[] arrad) {
        this.e = sz2;
        this.a = dfj2;
        this.b = dfj3;
        this.c = ds2;
        this.d = arrad;
    }

    @Override
    public void run() {
        if (this.a != this.b) {
            this.e.a(this.a);
        }
        av av2 = sz.a(this.e).b(this.c);
        if (this.d != null) {
            av2.a(this.d);
        }
        av2.a((ad)aw.i);
    }
}

