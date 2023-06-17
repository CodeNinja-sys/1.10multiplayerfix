/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ch;
import a.a.a.a.a.cq;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class ck
implements Callable {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ int b;
    final /* synthetic */ LinkedBlockingQueue c;
    final /* synthetic */ int[] d;
    final /* synthetic */ int[] e;

    ck(AtomicInteger atomicInteger, int n2, LinkedBlockingQueue linkedBlockingQueue, int[] arrn, int[] arrn2) {
        this.a = atomicInteger;
        this.b = n2;
        this.c = linkedBlockingQueue;
        this.d = arrn;
        this.e = arrn2;
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
            int[] arrn3 = n6 < 4 ? this.d : this.e;
            int n8 = (3 - n6 % 4) * 8;
            int n9 = n4 + n5;
            while (n9-- != n4) {
                int n10 = arrn3[n9] >>> n8 & 0xFF ^ n7;
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
                int n14 = this.e[n11];
                n12 = arrn3[n11] >>> n8 & 0xFF ^ n7;
                if (n11 < n2) {
                    while (true) {
                        int n15 = n12;
                        int n16 = arrn2[n15] - 1;
                        arrn2[n15] = n16;
                        int n17 = n16;
                        if (n16 <= n11) break;
                        n12 = arrn3[n17] >>> n8 & 0xFF ^ n7;
                        int n18 = n13;
                        int n19 = n14;
                        n13 = this.d[n17];
                        n14 = this.e[n17];
                        this.d[n17] = n18;
                        this.e[n17] = n19;
                    }
                    this.d[n11] = n13;
                    this.e[n11] = n14;
                }
                if (n6 < 7 && arrn[n12] > 1) {
                    if (arrn[n12] < 1024) {
                        ch.d(this.d, this.e, n11, n11 + arrn[n12]);
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

