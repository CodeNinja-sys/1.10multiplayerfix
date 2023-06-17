/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ch;
import a.a.a.a.b.cq;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class ci
implements Callable {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ int b;
    final /* synthetic */ LinkedBlockingQueue c;
    final /* synthetic */ long[] d;

    ci(AtomicInteger atomicInteger, int n2, LinkedBlockingQueue linkedBlockingQueue, long[] arrl) {
        this.a = atomicInteger;
        this.b = n2;
        this.c = linkedBlockingQueue;
        this.d = arrl;
    }

    public Void a() {
        int[] arrn = new int[256];
        int[] arrn2 = new int[256];
        while (true) {
            int n2;
            cq cq2;
            if (this.a.get() == 0) {
                int n3 = this.b;
                while (n3-- != 0) {
                    this.c.add(ch.b);
                }
            }
            if ((cq2 = (cq)this.c.take()) == ch.b) {
                return null;
            }
            int n4 = cq2.a;
            int n5 = cq2.b;
            int n6 = cq2.c;
            int n7 = n6 % 8 == 0 ? 128 : 0;
            int n8 = (7 - n6 % 8) * 8;
            int n9 = n4 + n5;
            while (n9-- != n4) {
                int n10 = (int)(this.d[n9] >>> n8 & 0xFFL ^ (long)n7);
                arrn[n10] = arrn[n10] + 1;
            }
            n9 = -1;
            int n11 = n4;
            for (n2 = 0; n2 < 256; ++n2) {
                if (arrn[n2] != 0) {
                    n9 = n2;
                }
                arrn2[n2] = n11 += arrn[n2];
            }
            n2 = n4 + n5 - arrn[n9];
            int n12 = -1;
            for (n11 = n4; n11 <= n2; n11 += arrn[n12]) {
                long l2 = this.d[n11];
                n12 = (int)(l2 >>> n8 & 0xFFL ^ (long)n7);
                if (n11 < n2) {
                    while (true) {
                        int n13 = n12;
                        int n14 = arrn2[n13] - 1;
                        arrn2[n13] = n14;
                        int n15 = n14;
                        if (n14 <= n11) break;
                        long l3 = l2;
                        l2 = this.d[n15];
                        this.d[n15] = l3;
                        n12 = (int)(l2 >>> n8 & 0xFFL ^ (long)n7);
                    }
                    this.d[n11] = l2;
                }
                if (n6 < 7 && arrn[n12] > 1) {
                    if (arrn[n12] < 1024) {
                        ch.g(this.d, n11, n11 + arrn[n12]);
                    } else {
                        this.a.incrementAndGet();
                        this.c.add(new cq(n11, arrn[n12], n6 + 1));
                    }
                }
                arrn[n12] = 0;
            }
            this.a.decrementAndGet();
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

