/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ch;
import a.a.a.a.a.cq;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class ci
implements Callable {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ int b;
    final /* synthetic */ LinkedBlockingQueue c;
    final /* synthetic */ int[] d;

    ci(AtomicInteger atomicInteger, int n2, LinkedBlockingQueue linkedBlockingQueue, int[] arrn) {
        this.a = atomicInteger;
        this.b = n2;
        this.c = linkedBlockingQueue;
        this.d = arrn;
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
            int n7 = n6 % 4 == 0 ? 128 : 0;
            int n8 = (3 - n6 % 4) * 8;
            int n9 = n4 + n5;
            while (n9-- != n4) {
                int n10 = this.d[n9] >>> n8 & 0xFF ^ n7;
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
                int n13 = this.d[n11];
                n12 = n13 >>> n8 & 0xFF ^ n7;
                if (n11 < n2) {
                    while (true) {
                        int n14 = n12;
                        int n15 = arrn2[n14] - 1;
                        arrn2[n14] = n15;
                        int n16 = n15;
                        if (n15 <= n11) break;
                        int n17 = n13;
                        n13 = this.d[n16];
                        this.d[n16] = n17;
                        n12 = n13 >>> n8 & 0xFF ^ n7;
                    }
                    this.d[n11] = n13;
                }
                if (n6 < 3 && arrn[n12] > 1) {
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

