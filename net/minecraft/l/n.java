/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import java.util.ArrayList;
import net.minecraft.client.r;
import net.minecraft.l.k;

class n
extends Thread {
    public long a = 0L;
    ArrayList b = new ArrayList();
    ArrayList c = new ArrayList();
    final /* synthetic */ k d;

    public n(k k2) {
        this.d = k2;
        this.a = System.currentTimeMillis();
    }

    @Override
    public void run() {
        while (!k.f) {
            int n2 = r.I.m;
            long l2 = System.currentTimeMillis();
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            int n3 = r.I.m - n2;
            long l3 = System.currentTimeMillis() - l2;
            this.b.add(n3);
            this.c.add(l3);
            while (this.b.size() > 30) {
                this.b.remove(0);
            }
            while (this.c.size() > 30) {
                this.c.remove(0);
            }
            if (System.currentTimeMillis() - this.a <= 6000L) continue;
            if (this.a(this.b) > 22.0f) {
                k.b();
                this.d.y.a(new int[]{k.a(this.d), 1});
            }
            if (!(this.b(this.c) < 900.0f)) continue;
            k.b();
            this.d.y.a(new int[]{k.a(this.d), 1});
        }
    }

    public float a(ArrayList arrayList) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            f2 += (float)((Integer)arrayList.get(i2)).intValue();
        }
        return f2 / (float)arrayList.size();
    }

    public float b(ArrayList arrayList) {
        float f2 = 0.0f;
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            f2 += (float)((Long)arrayList.get(i2)).longValue();
        }
        return f2 / (float)arrayList.size();
    }
}

