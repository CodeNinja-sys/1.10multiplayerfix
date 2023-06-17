/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import java.io.File;
import net.minecraft.q.a.i;
import net.minecraft.q.af;
import net.minecraft.q.e;
import net.minecraft.q.f.a.d;
import net.minecraft.q.f.a.f;
import net.minecraft.q.f.a.h;
import net.minecraft.q.m;
import net.minecraft.u.a.a;

public class j
extends net.minecraft.q.a.e {
    public j(File file, String string, boolean bl2, a a2) {
        super(file, string, bl2, a2);
    }

    @Override
    public h a(e e2) {
        File file = this.a();
        if (e2 instanceof af) {
            File file2 = new File(file, "DIM-1");
            file2.mkdirs();
            return new d(file2, this.a);
        }
        if (e2 instanceof m) {
            File file3 = new File(file, "DIM1");
            file3.mkdirs();
            return new d(file3, this.a);
        }
        return new d(file, this.a);
    }

    @Override
    public void a(net.minecraft.q.a.d d2, net.minecraft.e.e e2) {
        d2.d(19133);
        super.a(d2, e2);
    }

    @Override
    public void f() {
        try {
            i.a().b();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        f.a();
    }
}

