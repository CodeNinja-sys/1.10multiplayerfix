/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.net.UnknownHostException;
import net.minecraft.client.k.bw;
import net.minecraft.u.d.o;

class cu
implements Runnable {
    final /* synthetic */ bw a;

    cu(bw bw2) {
        this.a = bw2;
    }

    @Override
    public void run() {
        try {
            bw.a(this.a).h().a(bw.b(this.a));
        }
        catch (UnknownHostException unknownHostException) {
            bw.b((bw)this.a).e = -1L;
            bw.b((bw)this.a).d = (Object)((Object)o.e) + "Can't resolve hostname";
        }
        catch (Exception exception) {
            bw.b((bw)this.a).e = -1L;
        }
    }
}

