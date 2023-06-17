/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.n.a.cg;
import java.util.List;
import java.util.concurrent.CancellationException;
import net.minecraft.client.g.e.g;
import net.minecraft.client.g.e.l;
import net.minecraft.client.g.e.m;
import net.minecraft.client.g.e.u;
import net.minecraft.client.r;
import net.minecraft.k.a;

class e
implements cg {
    final /* synthetic */ l a;
    private final /* synthetic */ g b;
    private final /* synthetic */ u c;

    e(l l2, g g2, u u2) {
        this.a = l2;
        this.b = g2;
        this.c = u2;
    }

    public void a(List list) {
        block6: {
            l.a(this.a, this.b);
            this.b.f().lock();
            try {
                if (this.b.a() == m.c) {
                    this.b.a(m.d);
                    break block6;
                }
                if (!this.b.h()) {
                    l.b().f("Chunk render task was {} when I expected it to be uploading; aborting task", new Object[]{this.b.a()});
                }
            }
            finally {
                this.b.f().unlock();
            }
            return;
        }
        this.b.b().a(this.c);
    }

    @Override
    public void a(Throwable throwable) {
        l.a(this.a, this.b);
        if (!(throwable instanceof CancellationException) && !(throwable instanceof InterruptedException)) {
            r.z().a(net.minecraft.k.a.a(throwable, "Rendering chunk"));
        }
    }

    @Override
    public /* synthetic */ void a(Object object) {
        this.a((List)object);
    }
}

