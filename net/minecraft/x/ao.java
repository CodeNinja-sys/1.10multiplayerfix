/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.util.b.ad;
import net.minecraft.x.ak;
import net.minecraft.x.p;
import net.minecraft.x.q;

class ao
implements Runnable {
    final /* synthetic */ ak a;
    private final /* synthetic */ q b;
    private final /* synthetic */ q c;
    private final /* synthetic */ p d;
    private final /* synthetic */ ad[] e;

    ao(ak ak2, q q2, q q3, p p2, ad[] arrad) {
        this.a = ak2;
        this.b = q2;
        this.c = q3;
        this.d = p2;
        this.e = arrad;
    }

    @Override
    public void run() {
        if (this.b != this.c) {
            this.a.a(this.b);
        }
        av av2 = ak.a(this.a).b(this.d);
        if (this.e != null) {
            av2.a(this.e);
        }
        av2.a((ad)aw.i);
    }
}

