/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.f;
import com.c.c.a.m;
import com.c.c.b.z;
import com.c.c.c.b;
import com.c.c.c.c;
import com.c.c.d.a.bh;
import com.c.c.d.a.bj;
import com.c.c.e.u;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import net.minecraft.s.n;
import net.minecraft.s.q;

class bi
extends Thread {
    final /* synthetic */ bh a;

    bi(bh bh2) {
        this.a = bh2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        File file = null;
        m m2 = m.a();
        long l2 = bh.a(this.a);
        try {
            if (!bh.b().tryLock(1L, TimeUnit.SECONDS)) {
                return;
            }
            bh.a(this.a, n.f("mco.upload.preparing"));
            z z2 = null;
            for (int i2 = 0; i2 < 20; ++i2) {
                block39: {
                    try {
                        if (!bh.b(this.a)) break block39;
                        bh.a(this.a, l2);
                        return;
                    }
                    catch (c c2) {
                        Thread.sleep(c2.f * 1000);
                        continue;
                    }
                }
                z2 = m2.h(l2, u.a(l2));
                break;
            }
            if (z2 == null) {
                bh.a(this.a, n.f("mco.upload.close.failure"));
                return;
            }
            u.a(l2, z2.a());
            if (!z2.c()) {
                bh.a(this.a, n.f("mco.upload.close.failure"));
                return;
            }
            if (bh.b(this.a)) {
                bh.a(this.a, l2);
                return;
            }
            File file2 = new File(net.minecraft.s.b.i(), "saves");
            file = bh.a(this.a, new File(file2, bh.c(this.a).b()));
            if (bh.b(this.a)) {
                bh.a(this.a, l2);
                return;
            }
            if (!bh.b(this.a, file)) {
                long l3 = file.length();
                bj bj2 = bh.b(l3);
                bj bj3 = bh.b(0x40000000L);
                if (bh.b(l3, bj2).equals(bh.b(0x40000000L, bj3)) && bj2 != bj.a) {
                    bj bj4 = bj.values()[bj2.ordinal() - 1];
                    bh.b(this.a, n.a("mco.upload.size.failure.line1", bh.c(this.a).f()) + "\\n" + n.a("mco.upload.size.failure.line2", bh.b(l3, bj4), bh.b(0x40000000L, bj4)));
                    return;
                }
                bh.b(this.a, n.a("mco.upload.size.failure.line1", bh.c(this.a).f()) + "\\n" + n.a("mco.upload.size.failure.line2", bh.b(l3, bj2), bh.b(0x40000000L, bj3)));
                return;
            }
            bh.a(this.a, n.a("mco.upload.uploading", bh.c(this.a).f()));
            f f2 = new f();
            f2.a(file, bh.a(this.a), bh.d(this.a), z2, net.minecraft.s.b.f(), net.minecraft.s.b.h(), q.c, bh.e(this.a));
            while (!f2.b()) {
                if (bh.b(this.a)) {
                    f2.a();
                    bh.a(this.a, l2);
                    return;
                }
                try {
                    Thread.sleep(500L);
                }
                catch (InterruptedException interruptedException) {
                    bh.c().b("Failed to check Realms file upload status");
                }
            }
            if (f2.c() >= 200 && f2.c() < 300) {
                bh.a(this.a, true);
                bh.a(this.a, n.f("mco.upload.done"));
                bh.f(this.a).a(n.f("gui.done"));
                u.b(l2);
            } else if (f2.c() == 400 && f2.d() != null) {
                bh.b(this.a, n.a("mco.upload.failed", f2.d()));
            } else {
                bh.b(this.a, n.a("mco.upload.failed", f2.c()));
            }
        }
        catch (IOException iOException) {
            bh.b(this.a, n.a("mco.upload.failed", iOException.getMessage()));
        }
        catch (b b2) {
            bh.b(this.a, n.a("mco.upload.failed", b2.toString()));
        }
        catch (InterruptedException interruptedException) {
            bh.c().b("Could not acquire upload lock");
        }
        finally {
            bh.a(this.a, true);
            if (!bh.b().isHeldByCurrentThread()) {
                return;
            }
            bh.b().unlock();
            bh.b(this.a, false);
            this.a.u();
            this.a.b(bh.f(this.a));
            if (file != null) {
                bh.c().a("Deleting file " + file.getAbsolutePath());
                file.delete();
            }
        }
    }
}

