/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.c.a.e;
import java.util.List;
import net.minecraft.c.a;
import net.minecraft.c.b.d;

class i
implements com.c.a.i {
    private final /* synthetic */ a a;
    private final /* synthetic */ List b;

    i(a a2, List list) {
        this.a = a2;
        this.b = list;
    }

    @Override
    public void a(e e2) {
        this.a.aO().a(e2);
        this.b.add(e2);
    }

    @Override
    public void a(e e2, Exception exception) {
        d.a().f("Could not lookup user whitelist entry for {}", e2.b(), exception);
    }
}

