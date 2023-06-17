/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.n.a.cg;
import com.a.a.n.a.fo;
import java.io.File;
import net.minecraft.client.f.g;
import org.apache.commons.b.o;

class ao
implements cg {
    final /* synthetic */ g a;
    private final /* synthetic */ String b;
    private final /* synthetic */ File c;
    private final /* synthetic */ fo d;

    ao(g g2, String string, File file, fo fo2) {
        this.a = g2;
        this.b = string;
        this.c = file;
        this.d = fo2;
    }

    @Override
    public void a(Object object) {
        if (g.a(this.a, this.b, this.c)) {
            this.a.a(this.c);
            this.d.a((Object)null);
        } else {
            g.i().f("Deleting file {}", this.c);
            o.e(this.c);
        }
    }

    @Override
    public void a(Throwable throwable) {
        o.e(this.c);
        this.d.a(throwable);
    }
}

